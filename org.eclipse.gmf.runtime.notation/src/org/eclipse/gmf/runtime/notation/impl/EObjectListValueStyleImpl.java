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
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.gmf.runtime.notation.EObjectListValueStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EObject List Value Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.EObjectListValueStyleImpl#getEObjectListValue <em>EObject List Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EObjectListValueStyleImpl extends NamedStyleImpl implements EObjectListValueStyle {
	/**
	 * The cached value of the '{@link #getEObjectListValue() <em>EObject List Value</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEObjectListValue()
	 * @generated
	 * @ordered
	 */
	protected EList eObjectListValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EObjectListValueStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.EOBJECT_LIST_VALUE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEObjectListValue() {
		if (eObjectListValue == null) {
			eObjectListValue = new EObjectResolvingEList(EObject.class, this, NotationPackage.EOBJECT_LIST_VALUE_STYLE__EOBJECT_LIST_VALUE);
		}
		return eObjectListValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.EOBJECT_LIST_VALUE_STYLE__NAME:
				return getName();
			case NotationPackage.EOBJECT_LIST_VALUE_STYLE__EOBJECT_LIST_VALUE:
				return getEObjectListValue();
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
			case NotationPackage.EOBJECT_LIST_VALUE_STYLE__NAME:
				setName((String)newValue);
				return;
			case NotationPackage.EOBJECT_LIST_VALUE_STYLE__EOBJECT_LIST_VALUE:
				getEObjectListValue().clear();
				getEObjectListValue().addAll((Collection)newValue);
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
			case NotationPackage.EOBJECT_LIST_VALUE_STYLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NotationPackage.EOBJECT_LIST_VALUE_STYLE__EOBJECT_LIST_VALUE:
				getEObjectListValue().clear();
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
			case NotationPackage.EOBJECT_LIST_VALUE_STYLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NotationPackage.EOBJECT_LIST_VALUE_STYLE__EOBJECT_LIST_VALUE:
				return eObjectListValue != null && !eObjectListValue.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //EObjectListValueStyleImpl
