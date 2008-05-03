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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.gmf.runtime.notation.ListValueStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Value Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ListValueStyleImpl#getRawValuesList <em>Raw Values List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListValueStyleImpl extends DataTypeStyleImpl implements ListValueStyle {
	/**
	 * The cached value of the '{@link #getRawValuesList() <em>Raw Values List</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRawValuesList()
	 * @generated
	 * @ordered
	 */
	protected EList rawValuesList;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListValueStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.LIST_VALUE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getRawValuesList() {
		if (rawValuesList == null) {
			rawValuesList = new EDataTypeEList(String.class, this, NotationPackage.LIST_VALUE_STYLE__RAW_VALUES_LIST) {
				
				private static final long serialVersionUID = -7769354624338385073L;
				
				protected Object validate(int index, Object object) {
					Object validated = super.validate(index, object);
					if (validated != null && !isInstance(validated))
						throw new ArrayStoreException();
					try {
						getObjectFromString((String)validated);
					} catch (Exception e) {
						throw new IllegalArgumentException("Value <" + validated//$NON-NLS-1$
								+ "> cannot be associated with Data type <"//$NON-NLS-1$
								+ getInstanceType().toString() + ">: " + e.getMessage());//$NON-NLS-1$
					}
					return validated;
				}
			};
		}
		return rawValuesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.LIST_VALUE_STYLE__UUID:
				return getUUID();
			case NotationPackage.LIST_VALUE_STYLE__NAME:
				return getName();
			case NotationPackage.LIST_VALUE_STYLE__INSTANCE_TYPE:
				if (resolve) return getInstanceType();
				return basicGetInstanceType();
			case NotationPackage.LIST_VALUE_STYLE__RAW_VALUES_LIST:
				return getRawValuesList();
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
			case NotationPackage.LIST_VALUE_STYLE__UUID:
				setUUID((byte[])newValue);
				return;
			case NotationPackage.LIST_VALUE_STYLE__NAME:
				setName((String)newValue);
				return;
			case NotationPackage.LIST_VALUE_STYLE__INSTANCE_TYPE:
				setInstanceType((EDataType)newValue);
				return;
			case NotationPackage.LIST_VALUE_STYLE__RAW_VALUES_LIST:
				getRawValuesList().clear();
				getRawValuesList().addAll((Collection)newValue);
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
			case NotationPackage.LIST_VALUE_STYLE__UUID:
				setUUID(UUID_EDEFAULT);
				return;
			case NotationPackage.LIST_VALUE_STYLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NotationPackage.LIST_VALUE_STYLE__INSTANCE_TYPE:
				setInstanceType((EDataType)null);
				return;
			case NotationPackage.LIST_VALUE_STYLE__RAW_VALUES_LIST:
				getRawValuesList().clear();
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
			case NotationPackage.LIST_VALUE_STYLE__UUID:
				return UUID_EDEFAULT == null ? uUID != null : !UUID_EDEFAULT.equals(uUID);
			case NotationPackage.LIST_VALUE_STYLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NotationPackage.LIST_VALUE_STYLE__INSTANCE_TYPE:
				return instanceType != null;
			case NotationPackage.LIST_VALUE_STYLE__RAW_VALUES_LIST:
				return rawValuesList != null && !rawValuesList.isEmpty();
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
		result.append(" (rawValuesList: "); //$NON-NLS-1$
		result.append(rawValuesList);
		result.append(')');
		return result.toString();
	}
	
} //ListValueStyleImpl
