/******************************************************************************
 * Copyright (c) 2008 IBM Corporation and others.
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
import org.eclipse.emf.ecore.impl.FlatEObjectImpl;

import org.eclipse.gmf.runtime.notation.LineType;
import org.eclipse.gmf.runtime.notation.LineTypeStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Type Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.LineTypeStyleImpl#getLineType <em>Line Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LineTypeStyleImpl extends NotationObjectImpl implements LineTypeStyle {
	/**
	 * The default value of the '{@link #getLineType() <em>Line Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineType()
	 * @generated
	 * @ordered
	 */
	protected static final LineType LINE_TYPE_EDEFAULT = LineType.SOLID_LITERAL;

	/**
	 * The cached value of the '{@link #getLineType() <em>Line Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineType()
	 * @generated
	 * @ordered
	 */
	protected LineType lineType = LINE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineTypeStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.LINE_TYPE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineType getLineType() {
		return lineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineType(LineType newLineType) {
		LineType oldLineType = lineType;
		lineType = newLineType == null ? LINE_TYPE_EDEFAULT : newLineType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.LINE_TYPE_STYLE__LINE_TYPE, oldLineType, lineType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.LINE_TYPE_STYLE__UUID:
				return getUUID();
			case NotationPackage.LINE_TYPE_STYLE__LINE_TYPE:
				return getLineType();
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
			case NotationPackage.LINE_TYPE_STYLE__UUID:
				setUUID((byte[])newValue);
				return;
			case NotationPackage.LINE_TYPE_STYLE__LINE_TYPE:
				setLineType((LineType)newValue);
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
			case NotationPackage.LINE_TYPE_STYLE__UUID:
				setUUID(UUID_EDEFAULT);
				return;
			case NotationPackage.LINE_TYPE_STYLE__LINE_TYPE:
				setLineType(LINE_TYPE_EDEFAULT);
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
			case NotationPackage.LINE_TYPE_STYLE__UUID:
				return UUID_EDEFAULT == null ? uUID != null : !UUID_EDEFAULT.equals(uUID);
			case NotationPackage.LINE_TYPE_STYLE__LINE_TYPE:
				return lineType != LINE_TYPE_EDEFAULT;
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
		result.append(" (lineType: "); //$NON-NLS-1$
		result.append(lineType);
		result.append(')');
		return result.toString();
	}

} //LineTypeStyleImpl
