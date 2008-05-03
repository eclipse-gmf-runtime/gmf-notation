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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.HintedDiagramLinkStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hinted Diagram Link Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.HintedDiagramLinkStyleImpl#getHint <em>Hint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HintedDiagramLinkStyleImpl extends DiagramLinkStyleImpl implements HintedDiagramLinkStyle {
	/**
	 * The default value of the '{@link #getHint() <em>Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHint()
	 * @generated
	 * @ordered
	 */
	protected static final String HINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHint() <em>Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHint()
	 * @generated
	 * @ordered
	 */
	protected String hint = HINT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HintedDiagramLinkStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.HINTED_DIAGRAM_LINK_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHint() {
		return hint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHint(String newHint) {
		String oldHint = hint;
		hint = newHint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.HINTED_DIAGRAM_LINK_STYLE__HINT, oldHint, hint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.HINTED_DIAGRAM_LINK_STYLE__UUID:
				return getUUID();
			case NotationPackage.HINTED_DIAGRAM_LINK_STYLE__DIAGRAM_LINK:
				return getDiagramLink();
			case NotationPackage.HINTED_DIAGRAM_LINK_STYLE__HINT:
				return getHint();
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
			case NotationPackage.HINTED_DIAGRAM_LINK_STYLE__UUID:
				setUUID((byte[])newValue);
				return;
			case NotationPackage.HINTED_DIAGRAM_LINK_STYLE__DIAGRAM_LINK:
				setDiagramLink((Diagram)newValue);
				return;
			case NotationPackage.HINTED_DIAGRAM_LINK_STYLE__HINT:
				setHint((String)newValue);
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
			case NotationPackage.HINTED_DIAGRAM_LINK_STYLE__UUID:
				setUUID(UUID_EDEFAULT);
				return;
			case NotationPackage.HINTED_DIAGRAM_LINK_STYLE__DIAGRAM_LINK:
				setDiagramLink((Diagram)null);
				return;
			case NotationPackage.HINTED_DIAGRAM_LINK_STYLE__HINT:
				setHint(HINT_EDEFAULT);
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
			case NotationPackage.HINTED_DIAGRAM_LINK_STYLE__UUID:
				return UUID_EDEFAULT == null ? uUID != null : !UUID_EDEFAULT.equals(uUID);
			case NotationPackage.HINTED_DIAGRAM_LINK_STYLE__DIAGRAM_LINK:
				return diagramLink != null;
			case NotationPackage.HINTED_DIAGRAM_LINK_STYLE__HINT:
				return HINT_EDEFAULT == null ? hint != null : !HINT_EDEFAULT.equals(hint);
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (hint: "); //$NON-NLS-1$
		result.append(hint);
		result.append(')');
		return result.toString();
	}

} //HintedDiagramLinkStyleImpl
