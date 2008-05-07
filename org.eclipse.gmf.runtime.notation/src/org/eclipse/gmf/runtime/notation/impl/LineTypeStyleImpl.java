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
public class LineTypeStyleImpl extends NotationEObjectImpl implements LineTypeStyle {
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
	 * The offset of the flags representing the value of the '{@link #getLineType() <em>Line Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_TYPE_EFLAG_OFFSET = 8;

	/**
	 * The flags representing the default value of the '{@link #getLineType() <em>Line Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_TYPE_EFLAG_DEFAULT = LineType.VALUES.indexOf(LINE_TYPE_EDEFAULT) << LINE_TYPE_EFLAG_OFFSET;

	/**
	 * The array of enumeration values for '{@link LineType Line Type}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	private static final LineType[] LINE_TYPE_EFLAG_VALUES = (LineType[])LineType.VALUES.toArray(new LineType[LineType.VALUES.size()]);

	/**
	 * The flags representing the value of the '{@link #getLineType() <em>Line Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineType()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_TYPE_EFLAG = 0x7 << LINE_TYPE_EFLAG_OFFSET;

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
		return LINE_TYPE_EFLAG_VALUES[(eFlags & LINE_TYPE_EFLAG) >>> LINE_TYPE_EFLAG_OFFSET];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineType(LineType newLineType) {
		LineType oldLineType = LINE_TYPE_EFLAG_VALUES[(eFlags & LINE_TYPE_EFLAG) >>> LINE_TYPE_EFLAG_OFFSET];
		if (newLineType == null) newLineType = LINE_TYPE_EDEFAULT;
		eFlags = eFlags & ~LINE_TYPE_EFLAG | LineType.VALUES.indexOf(newLineType) << LINE_TYPE_EFLAG_OFFSET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.LINE_TYPE_STYLE__LINE_TYPE, oldLineType, newLineType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
			case NotationPackage.LINE_TYPE_STYLE__LINE_TYPE:
				return (eFlags & LINE_TYPE_EFLAG) != LINE_TYPE_EFLAG_DEFAULT;
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
		result.append(LINE_TYPE_EFLAG_VALUES[(eFlags & LINE_TYPE_EFLAG) >>> LINE_TYPE_EFLAG_OFFSET]);
		result.append(')');
		return result.toString();
	}

} //LineTypeStyleImpl
