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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.gmf.runtime.notation.BooleanListValueStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean List Value Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.BooleanListValueStyleImpl#getBooleanListValue <em>Boolean List Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanListValueStyleImpl extends NamedStyleImpl implements BooleanListValueStyle {
	/**
	 * The cached value of the '{@link #getBooleanListValue() <em>Boolean List Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanListValue()
	 * @generated
	 * @ordered
	 */
	protected EList booleanListValue;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanListValueStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.BOOLEAN_LIST_VALUE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBooleanListValue() {
		if (booleanListValue == null) {
			booleanListValue = new EDataTypeEList(Boolean.class, this, NotationPackage.BOOLEAN_LIST_VALUE_STYLE__BOOLEAN_LIST_VALUE);
		}
		return booleanListValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.BOOLEAN_LIST_VALUE_STYLE__UUID:
				return getUUID();
			case NotationPackage.BOOLEAN_LIST_VALUE_STYLE__NAME:
				return getName();
			case NotationPackage.BOOLEAN_LIST_VALUE_STYLE__BOOLEAN_LIST_VALUE:
				return getBooleanListValue();
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
			case NotationPackage.BOOLEAN_LIST_VALUE_STYLE__UUID:
				setUUID((byte[])newValue);
				return;
			case NotationPackage.BOOLEAN_LIST_VALUE_STYLE__NAME:
				setName((String)newValue);
				return;
			case NotationPackage.BOOLEAN_LIST_VALUE_STYLE__BOOLEAN_LIST_VALUE:
				getBooleanListValue().clear();
				getBooleanListValue().addAll((Collection)newValue);
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
			case NotationPackage.BOOLEAN_LIST_VALUE_STYLE__UUID:
				setUUID(UUID_EDEFAULT);
				return;
			case NotationPackage.BOOLEAN_LIST_VALUE_STYLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NotationPackage.BOOLEAN_LIST_VALUE_STYLE__BOOLEAN_LIST_VALUE:
				getBooleanListValue().clear();
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
			case NotationPackage.BOOLEAN_LIST_VALUE_STYLE__UUID:
				return UUID_EDEFAULT == null ? uUID != null : !UUID_EDEFAULT.equals(uUID);
			case NotationPackage.BOOLEAN_LIST_VALUE_STYLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NotationPackage.BOOLEAN_LIST_VALUE_STYLE__BOOLEAN_LIST_VALUE:
				return booleanListValue != null && !booleanListValue.isEmpty();
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
		result.append(" (booleanListValue: "); //$NON-NLS-1$
		result.append(booleanListValue);
		result.append(')');
		return result.toString();
	}

} //BooleanListValueStyleImpl
