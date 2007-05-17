/**
 * <copyright>
 * </copyright>
 *
 * $Id: IntListValueStyleImpl.java,v 1.1 2007/05/17 16:26:50 aboyko Exp $
 */
package org.eclipse.gmf.runtime.notation.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.gmf.runtime.notation.IntListValueStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Int List Value Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.IntListValueStyleImpl#getIntListValue <em>Int List Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntListValueStyleImpl extends NamedStyleImpl implements IntListValueStyle {
	/**
	 * The cached value of the '{@link #getIntListValue() <em>Int List Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntListValue()
	 * @generated
	 * @ordered
	 */
	protected EList intListValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntListValueStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.INT_LIST_VALUE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getIntListValue() {
		if (intListValue == null) {
			intListValue = new EDataTypeEList(Integer.class, this, NotationPackage.INT_LIST_VALUE_STYLE__INT_LIST_VALUE);
		}
		return intListValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.INT_LIST_VALUE_STYLE__NAME:
				return getName();
			case NotationPackage.INT_LIST_VALUE_STYLE__INT_LIST_VALUE:
				return getIntListValue();
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
			case NotationPackage.INT_LIST_VALUE_STYLE__NAME:
				setName((String)newValue);
				return;
			case NotationPackage.INT_LIST_VALUE_STYLE__INT_LIST_VALUE:
				getIntListValue().clear();
				getIntListValue().addAll((Collection)newValue);
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
			case NotationPackage.INT_LIST_VALUE_STYLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NotationPackage.INT_LIST_VALUE_STYLE__INT_LIST_VALUE:
				getIntListValue().clear();
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
			case NotationPackage.INT_LIST_VALUE_STYLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NotationPackage.INT_LIST_VALUE_STYLE__INT_LIST_VALUE:
				return intListValue != null && !intListValue.isEmpty();
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
		result.append(" (intListValue: "); //$NON-NLS-1$
		result.append(intListValue);
		result.append(')');
		return result.toString();
	}

} //IntListValueStyleImpl
