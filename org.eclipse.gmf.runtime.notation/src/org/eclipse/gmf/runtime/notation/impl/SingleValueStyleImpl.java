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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.SingleValueStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Value Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.SingleValueStyleImpl#getRawValue <em>Raw Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SingleValueStyleImpl extends DataTypeStyleImpl implements SingleValueStyle {
	/**
	 * The default value of the '{@link #getRawValue() <em>Raw Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRawValue()
	 * @generated
	 * @ordered
	 */
	protected static final String RAW_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRawValue() <em>Raw Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRawValue()
	 * @generated
	 * @ordered
	 */
	protected String rawValue = RAW_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleValueStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.SINGLE_VALUE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRawValue() {
		return rawValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setRawValue(String newRawValue) {
		if (getInstanceType() != null) {
			try {
				getObjectFromString(newRawValue);
			} catch (Exception e) {
				throw new IllegalArgumentException("Value <" + newRawValue//$NON-NLS-1$
						+ "> cannot be associated with Data type <"//$NON-NLS-1$
						+ getInstanceType().toString() + ">: " + e.getMessage());//$NON-NLS-1$
			}
		}
		String oldRawValue = rawValue;
		rawValue = newRawValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.SINGLE_VALUE_STYLE__RAW_VALUE, oldRawValue, rawValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Object getValue() {
		return getObjectFromString(getRawValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setValue(Object newValue) {
		setRawValue(getStringFromObject(newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.SINGLE_VALUE_STYLE__NAME:
				return getName();
			case NotationPackage.SINGLE_VALUE_STYLE__INSTANCE_TYPE:
				if (resolve) return getInstanceType();
				return basicGetInstanceType();
			case NotationPackage.SINGLE_VALUE_STYLE__RAW_VALUE:
				return getRawValue();
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
			case NotationPackage.SINGLE_VALUE_STYLE__NAME:
				setName((String)newValue);
				return;
			case NotationPackage.SINGLE_VALUE_STYLE__INSTANCE_TYPE:
				setInstanceType((EDataType)newValue);
				return;
			case NotationPackage.SINGLE_VALUE_STYLE__RAW_VALUE:
				setRawValue((String)newValue);
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
			case NotationPackage.SINGLE_VALUE_STYLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NotationPackage.SINGLE_VALUE_STYLE__INSTANCE_TYPE:
				setInstanceType((EDataType)null);
				return;
			case NotationPackage.SINGLE_VALUE_STYLE__RAW_VALUE:
				setRawValue(RAW_VALUE_EDEFAULT);
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
			case NotationPackage.SINGLE_VALUE_STYLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NotationPackage.SINGLE_VALUE_STYLE__INSTANCE_TYPE:
				return instanceType != null;
			case NotationPackage.SINGLE_VALUE_STYLE__RAW_VALUE:
				return RAW_VALUE_EDEFAULT == null ? rawValue != null : !RAW_VALUE_EDEFAULT.equals(rawValue);
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
		result.append(" (rawValue: "); //$NON-NLS-1$
		result.append(rawValue);
		result.append(')');
		return result.toString();
	}

} //SingleValueStyleImpl
