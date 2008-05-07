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
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.StringListValueStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String List Value Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.StringListValueStyleImpl#getStringListValue <em>String List Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringListValueStyleImpl extends NamedStyleImpl implements StringListValueStyle {
	/**
	 * The cached value of the '{@link #getStringListValue() <em>String List Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringListValue()
	 * @generated
	 * @ordered
	 */
	protected EList stringListValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringListValueStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.STRING_LIST_VALUE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getStringListValue() {
		if (stringListValue == null) {
			stringListValue = new EDataTypeEList(String.class, this, NotationPackage.STRING_LIST_VALUE_STYLE__STRING_LIST_VALUE);
		}
		return stringListValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.STRING_LIST_VALUE_STYLE__NAME:
				return getName();
			case NotationPackage.STRING_LIST_VALUE_STYLE__STRING_LIST_VALUE:
				return getStringListValue();
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
			case NotationPackage.STRING_LIST_VALUE_STYLE__NAME:
				setName((String)newValue);
				return;
			case NotationPackage.STRING_LIST_VALUE_STYLE__STRING_LIST_VALUE:
				getStringListValue().clear();
				getStringListValue().addAll((Collection)newValue);
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
			case NotationPackage.STRING_LIST_VALUE_STYLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NotationPackage.STRING_LIST_VALUE_STYLE__STRING_LIST_VALUE:
				getStringListValue().clear();
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
			case NotationPackage.STRING_LIST_VALUE_STYLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NotationPackage.STRING_LIST_VALUE_STYLE__STRING_LIST_VALUE:
				return stringListValue != null && !stringListValue.isEmpty();
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
		result.append(" (stringListValue: "); //$NON-NLS-1$
		result.append(stringListValue);
		result.append(')');
		return result.toString();
	}

} //StringListValueStyleImpl
