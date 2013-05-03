/******************************************************************************
 * Copyright (c) 2010, 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.tests.runtime.notation;

import java.io.IOException;
import java.util.Collections;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.ShapeStyle;
import org.eclipse.gmf.runtime.notation.Style;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

/**
 * A minimal smoke test to verify that the GMF Notation build works.
 * 
 * @author Anthony Hunter
 */
public class NotationTest extends TestCase {

	private static final String PROJECT_NAME = "tests"; //$NON-NLS-1$
	private static final String NOTATION_RESOURCE_NAME = "/" + PROJECT_NAME + "/tests.notation"; //$NON-NLS-1$//$NON-NLS-2$
	private static final String WELCOME = "org.eclipse.ui.internal.introview"; //$NON-NLS-1$
	private static final String DEFAULT_TEXT_EDITOR_ID = "org.eclipse.ui.DefaultTextEditor"; //$NON-NLS-1$

	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	public static Test suite() {
		return new TestSuite(NotationTest.class);
	}

	public NotationTest(String name) {
		super(name);
	}

	/**
	 * A minimal smoke test to verify that the GMF Notation build works. Create
	 * a simple notation model and open it in a text editor.
	 * 
	 * @throws Exception
	 */
	public void test_notation() throws Exception {
		// Close the annoying "Welcome to Eclipse" view.
		IWorkbenchPage[] pages = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getPages();
		for (int i = 0; i < pages.length; i++) {
			IViewReference[] viewRefs = pages[i].getViewReferences();
			for (int j = 0; j < viewRefs.length; j++) {
				if (WELCOME.equals(viewRefs[j].getId()))
					pages[i].hideView(viewRefs[j]);
			}
		}

		// Create the test project.
		IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(PROJECT_NAME);
		if (!project.exists()) {
			project.create(null);
		}
		project.open(null);

		// Create the test notation model.
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IFile file = workspaceRoot.getFile(new Path(NOTATION_RESOURCE_NAME));
		String fullPath = file.getFullPath().toOSString();

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI
				.createPlatformResourceURI(fullPath, true));

		// Create the diagram in the test notation model.
		Diagram diagram = NotationFactory.eINSTANCE.createDiagram();
		diagram.setName(getName());
		resource.getContents().add(diagram);

		// Add a style to the test notation model.
		ShapeStyle style = NotationFactory.eINSTANCE.createShapeStyle();
		@SuppressWarnings("unchecked")
		EList<Style> styles = diagram.getStyles();
		styles.add(style);

		// Save the test notation model.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		// Refresh the new file in the workspace.
		ResourcesPlugin
				.getWorkspace()
				.getRoot()
				.refreshLocal(IResource.DEPTH_INFINITE,
						new NullProgressMonitor());

		// Open the new file in a text editor.
		IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();
		assertNotNull("Workbench page is null", page);
		assertNotNull("Workspace file is null", file);
		IEditorDescriptor defaultEditor = PlatformUI.getWorkbench()
				.getEditorRegistry().findEditor(DEFAULT_TEXT_EDITOR_ID);
		assertNotNull("Default editor is null", defaultEditor);
		page.openEditor(new FileEditorInput(file), defaultEditor.getId());
	}
}
