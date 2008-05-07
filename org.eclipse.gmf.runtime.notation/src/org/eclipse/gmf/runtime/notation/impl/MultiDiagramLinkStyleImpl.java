/******************************************************************************
 * Copyright (c) 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/
package org.eclipse.gmf.runtime.notation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.MultiDiagramLinkStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Diagram Link Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.MultiDiagramLinkStyleImpl#getDiagramLinks <em>Diagram Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiDiagramLinkStyleImpl extends NotationEObjectImpl implements MultiDiagramLinkStyle {
	/**
	 * The cached value of the '{@link #getDiagramLinks() <em>Diagram Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramLinks()
	 * @generated
	 * @ordered
	 */
	protected EList diagramLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiDiagramLinkStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.MULTI_DIAGRAM_LINK_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDiagramLinks() {
		if (diagramLinks == null) {
			diagramLinks = new EObjectEList(Diagram.class, this, NotationPackage.MULTI_DIAGRAM_LINK_STYLE__DIAGRAM_LINKS);
		}
		return diagramLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.MULTI_DIAGRAM_LINK_STYLE__DIAGRAM_LINKS:
				return getDiagramLinks();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NotationPackage.MULTI_DIAGRAM_LINK_STYLE__DIAGRAM_LINKS:
				getDiagramLinks().clear();
				getDiagramLinks().addAll((Collection)newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case NotationPackage.MULTI_DIAGRAM_LINK_STYLE__DIAGRAM_LINKS:
				getDiagramLinks().clear();
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NotationPackage.MULTI_DIAGRAM_LINK_STYLE__DIAGRAM_LINKS:
				return diagramLinks != null && !diagramLinks.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //MultiDiagramLinkStyleImpl
