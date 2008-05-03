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

import org.eclipse.gmf.runtime.notation.ByteArrayValueStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Byte Array Value Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ByteArrayValueStyleImpl#getByteArrayValue <em>Byte Array Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ByteArrayValueStyleImpl extends NamedStyleImpl implements ByteArrayValueStyle {
	/**
	 * The default value of the '{@link #getByteArrayValue() <em>Byte Array Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteArrayValue()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] BYTE_ARRAY_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getByteArrayValue() <em>Byte Array Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteArrayValue()
	 * @generated
	 * @ordered
	 */
	protected byte[] byteArrayValue = BYTE_ARRAY_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ByteArrayValueStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.BYTE_ARRAY_VALUE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getByteArrayValue() {
		return byteArrayValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByteArrayValue(byte[] newByteArrayValue) {
		byte[] oldByteArrayValue = byteArrayValue;
		byteArrayValue = newByteArrayValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.BYTE_ARRAY_VALUE_STYLE__BYTE_ARRAY_VALUE, oldByteArrayValue, byteArrayValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.BYTE_ARRAY_VALUE_STYLE__UUID:
				return getUUID();
			case NotationPackage.BYTE_ARRAY_VALUE_STYLE__NAME:
				return getName();
			case NotationPackage.BYTE_ARRAY_VALUE_STYLE__BYTE_ARRAY_VALUE:
				return getByteArrayValue();
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
			case NotationPackage.BYTE_ARRAY_VALUE_STYLE__UUID:
				setUUID((byte[])newValue);
				return;
			case NotationPackage.BYTE_ARRAY_VALUE_STYLE__NAME:
				setName((String)newValue);
				return;
			case NotationPackage.BYTE_ARRAY_VALUE_STYLE__BYTE_ARRAY_VALUE:
				setByteArrayValue((byte[])newValue);
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
			case NotationPackage.BYTE_ARRAY_VALUE_STYLE__UUID:
				setUUID(UUID_EDEFAULT);
				return;
			case NotationPackage.BYTE_ARRAY_VALUE_STYLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NotationPackage.BYTE_ARRAY_VALUE_STYLE__BYTE_ARRAY_VALUE:
				setByteArrayValue(BYTE_ARRAY_VALUE_EDEFAULT);
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
			case NotationPackage.BYTE_ARRAY_VALUE_STYLE__UUID:
				return UUID_EDEFAULT == null ? uUID != null : !UUID_EDEFAULT.equals(uUID);
			case NotationPackage.BYTE_ARRAY_VALUE_STYLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NotationPackage.BYTE_ARRAY_VALUE_STYLE__BYTE_ARRAY_VALUE:
				return BYTE_ARRAY_VALUE_EDEFAULT == null ? byteArrayValue != null : !BYTE_ARRAY_VALUE_EDEFAULT.equals(byteArrayValue);
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
		result.append(" (byteArrayValue: "); //$NON-NLS-1$
		result.append(byteArrayValue);
		result.append(')');
		return result.toString();
	}

} //ByteArrayValueStyleImpl
