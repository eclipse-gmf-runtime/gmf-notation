/******************************************************************************
 * Copyright (c) 2006, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.runtime.notation.util;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.gmf.runtime.notation.NotationPackage;


/**
 * A special NotationExtendedMetaData class that will allow one to load
 *  resources that came from previous versions of the notation metamodel.
 */
public class NotationExtendedMetaData
	extends BasicExtendedMetaData {

	private static final Set notationNSURIs = new HashSet();
	static {
		notationNSURIs.add("http://www.ibm.com/xtools/1.5.0/Notation"); //$NON-NLS-1$
		notationNSURIs.add("http://www.eclipse.org/gmf/1.5.0/Notation"); //$NON-NLS-1$
		notationNSURIs.add("http://www.eclipse.org/gmf/1.5.1/Notation"); //$NON-NLS-1$
		notationNSURIs.add("http://www.ibm.com/xtools/1.5.1/Notation"); //$NON-NLS-1$
	}
	
	public EPackage getPackage(String namespace) {
		if (notationNSURIs.contains(namespace)) {
			return NotationPackage.eINSTANCE;
		}
		
		return super.getPackage(namespace);
	}
}
