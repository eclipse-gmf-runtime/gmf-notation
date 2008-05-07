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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.PropertyValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.PropertyValueImpl#getRawValue <em>Raw Value</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.PropertyValueImpl#getInstanceType <em>Instance Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyValueImpl extends NotationEObjectImpl implements PropertyValue {
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
	 * The cached value of the '{@link #getInstanceType() <em>Instance Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceType()
	 * @generated
	 * @ordered
	 */
	protected EDataType instanceType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.PROPERTY_VALUE;
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
						+ getInstanceType().toString() + ">: " + e.getMessage()); //$NON-NLS-1$
			}
		}
		String oldRawValue = rawValue;
		rawValue = newRawValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.PROPERTY_VALUE__RAW_VALUE, oldRawValue, rawValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInstanceType() {
		if (instanceType != null && instanceType.eIsProxy()) {
			InternalEObject oldInstanceType = (InternalEObject)instanceType;
			instanceType = (EDataType)eResolveProxy(oldInstanceType);
			if (instanceType != oldInstanceType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NotationPackage.PROPERTY_VALUE__INSTANCE_TYPE, oldInstanceType, instanceType));
			}
		}
		return instanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType basicGetInstanceType() {
		return instanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceType(EDataType newInstanceType) {
		EDataType oldInstanceType = instanceType;
		instanceType = newInstanceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.PROPERTY_VALUE__INSTANCE_TYPE, oldInstanceType, instanceType));
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
	 * @generated NOT
	 */
	public String getStringFromObject(Object objectValue) {
		if (getInstanceType() == null && objectValue instanceof String)
			return (String)objectValue;
		return EcoreUtil.convertToString(getInstanceType(), objectValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Object getObjectFromString(String stringValue) {
		if (getInstanceType() == null)
			return stringValue;
		return EcoreUtil.createFromString(getInstanceType(), stringValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.PROPERTY_VALUE__RAW_VALUE:
				return getRawValue();
			case NotationPackage.PROPERTY_VALUE__INSTANCE_TYPE:
				if (resolve) return getInstanceType();
				return basicGetInstanceType();
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
			case NotationPackage.PROPERTY_VALUE__RAW_VALUE:
				setRawValue((String)newValue);
				return;
			case NotationPackage.PROPERTY_VALUE__INSTANCE_TYPE:
				setInstanceType((EDataType)newValue);
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
			case NotationPackage.PROPERTY_VALUE__RAW_VALUE:
				setRawValue(RAW_VALUE_EDEFAULT);
				return;
			case NotationPackage.PROPERTY_VALUE__INSTANCE_TYPE:
				setInstanceType((EDataType)null);
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
			case NotationPackage.PROPERTY_VALUE__RAW_VALUE:
				return RAW_VALUE_EDEFAULT == null ? rawValue != null : !RAW_VALUE_EDEFAULT.equals(rawValue);
			case NotationPackage.PROPERTY_VALUE__INSTANCE_TYPE:
				return instanceType != null;
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

} //PropertyValueImpl
