/******************************************************************************
 * Copyright (c) 2010, 2013 IBM Corporation and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.tests.runtime.notation;

import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.ListValueStyle;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.ShapeStyle;
import org.eclipse.gmf.runtime.notation.Style;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * A minimal smoke test to verify that the GMF Notation build works.
 * 
 * @author Anthony Hunter
 */
public class NotationTest extends TestCase {

	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	public static Test suite() {
		return new TestSuite(NotationTest.class);
	}

	public NotationTest(String name) {
		super(name);
	}

	
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();

		// Close the annoying "Welcome to Eclipse" view.
		IWorkbenchPage[] pages = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPages();
		for (int i = 0; i < pages.length; i++) {
			IViewReference[] viewRefs = pages[i].getViewReferences();
			for (int j = 0; j < viewRefs.length; j++) {
				if ("org.eclipse.ui.internal.introview".equals(viewRefs[j].getId()))
					pages[i].hideView(viewRefs[j]);
			}
		}
	}

	private IProject getTestProject() throws CoreException {
		String projectName = getName();
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		if (!project.exists()) {
			project.create(null);
		}
		if (!project.isOpen()) {
			project.open(null);
		}
		return project;
	}
	
	private String getTestProjectName() throws CoreException {
		IProject project = getTestProject();
		return project.getName();
	}
	
	/**
	 * A minimal smoke test to verify that the GMF Notation build works. Create a
	 * simple notation model and open it in a text editor.
	 * 
	 * @throws Exception
	 */
	public void test_notation() throws Exception {
		IProject project = getTestProject();

		// Create the test notation model.
		IFile file = project.getFile("tests.notation");
		String fullPath = file.getFullPath().toOSString();

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createPlatformResourceURI(fullPath, true));

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
		file.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());

		// Open the new file in a text editor.
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		assertNotNull("Workbench page is null", page);
		assertNotNull("Workspace file is null", file);
		IEditorDescriptor defaultEditor = PlatformUI.getWorkbench().getEditorRegistry()
				.findEditor("org.eclipse.ui.DefaultTextEditor");
		assertNotNull("Default Editor is null", defaultEditor);
		page.openEditor(new FileEditorInput(file), defaultEditor.getId());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void test_ListValueStyleImpl_getRawValuesList() throws Exception {
		ListValueStyle listValueStyle = NotationFactory.eINSTANCE.createListValueStyle();
		listValueStyle.setName(getName());
		
		EList rawValuesList = listValueStyle.getRawValuesList();
	
		// ======================================================
		// Verify element validation with NO instance type set...
		// ======================================================
		
		rawValuesList.add(null); // Valid element.
		rawValuesList.add("valid element");
	
		try {
			rawValuesList.add(new Object());
			fail("ArrayStoreException expected");
		} catch (ArrayStoreException expected) {
			// Success.
		}
	
		assertEquals(2, rawValuesList.size());
		rawValuesList.clear();
	
		// ==============================================================
		// Verify element validation with instance type set to EDOUBLE...
		// ==============================================================
	
		listValueStyle.setInstanceType(EcorePackage.Literals.EDOUBLE);
	
		rawValuesList.add(null); // Valid element. Questionable because instance type is primitive!
		rawValuesList.add("4711.0815d"); // Valid element.
	
		try {
			rawValuesList.add("invalid element");
			fail("IllegalArgumentException expected");
		} catch (IllegalArgumentException expected) {
			// Success.
		}
	
		try {
			rawValuesList.add(4711.0815d); // Invalid element.
			fail("ArrayStoreException expected");
		} catch (ArrayStoreException expected) {
			// Success.
		}
	
		try {
			rawValuesList.add(new Object());
			fail("ArrayStoreException expected");
		} catch (ArrayStoreException expected) {
			// Success.
		}
	
		assertEquals(2, rawValuesList.size());
		rawValuesList.clear();
	
		// =======================================================
		// Verify that no duplicate notifications are delivered...
		// =======================================================
	
		final int[] notifications = { 0 };
		listValueStyle.eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				++notifications[0];
			}
		});
	
		rawValuesList.add("4711.0815d"); // Produce 1 notification.
		assertEquals(1, notifications[0]);
	
		// =======================================================
		// Verify that the exact same list instance is returned...
		// =======================================================
	
		EList rawValuesList2 = listValueStyle.getRawValuesList();
		assertSame(rawValuesList, rawValuesList2);
	}

	@SuppressWarnings("unchecked")
	public void test_ViewImpl_getElement() throws Exception {
		String fullPath1 = "/" + getTestProjectName() + "/test1.notation";
		String fullPath2 = "/" + getTestProjectName() + "/test2.ecore";
		
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource1 = resourceSet.createResource(URI.createPlatformResourceURI(fullPath1, true));
		Resource resource2 = resourceSet.createResource(URI.createPlatformResourceURI(fullPath2, true));

		// ===========================================
		// Save a diagram with a controlled element...
		// ===========================================
		
		Diagram diagram = NotationFactory.eINSTANCE.createDiagram();
		diagram.setName(getName());
		resource1.getContents().add(diagram);

		Node node = NotationFactory.eINSTANCE.createNode();
		diagram.getPersistedChildren().add(node);

		EClass diagramElement = EcoreFactory.eINSTANCE.createEClass();
		diagramElement.setName("DiagramElement");
		diagram.setElement(diagramElement);
		resource2.getContents().add(diagramElement);
		
		try {
			resource1.save(Collections.EMPTY_MAP);
			resource2.save(Collections.EMPTY_MAP);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		// ===========================================================================================
		// Load the diagram into a new resource set and verify that the element proxy gets resolved...
		// ===========================================================================================
		
		resourceSet = new ResourceSetImpl();
		resource1 = resourceSet.getResource(URI.createPlatformResourceURI(fullPath1, true), true);
		diagram = (Diagram) resource1.getContents().get(0);
		assumeTrue(((DiagramImpl)diagram).basicGetElement().eIsProxy());
		
		node = (Node) diagram.getChildren().get(0);
		EObject element = node.getElement();
		assumeFalse(element.eIsProxy());
	}
}
