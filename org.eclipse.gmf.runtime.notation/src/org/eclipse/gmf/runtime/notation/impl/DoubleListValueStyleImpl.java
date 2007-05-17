/**
 * <copyright>
 * </copyright>
 *
 * $Id: DoubleListValueStyleImpl.java,v 1.1 2007/05/17 16:26:49 aboyko Exp $
 */
package org.eclipse.gmf.runtime.notation.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.gmf.runtime.notation.DoubleListValueStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Double List Value Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.DoubleListValueStyleImpl#getDoubleListValue <em>Double List Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DoubleListValueStyleImpl extends NamedStyleImpl implements DoubleListValueStyle {
	/**
	 * The cached value of the '{@link #getDoubleListValue() <em>Double List Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoubleListValue()
	 * @generated
	 * @ordered
	 */
	protected EList doubleListValue;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoubleListValueStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.DOUBLE_LIST_VALUE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDoubleListValue() {
		if (doubleListValue == null) {
			doubleListValue = new EDataTypeEList(Double.class, this, NotationPackage.DOUBLE_LIST_VALUE_STYLE__DOUBLE_LIST_VALUE);
		}
		return doubleListValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.DOUBLE_LIST_VALUE_STYLE__NAME:
				return getName();
			case NotationPackage.DOUBLE_LIST_VALUE_STYLE__DOUBLE_LIST_VALUE:
				return getDoubleListValue();
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
			case NotationPackage.DOUBLE_LIST_VALUE_STYLE__NAME:
				setName((String)newValue);
				return;
			case NotationPackage.DOUBLE_LIST_VALUE_STYLE__DOUBLE_LIST_VALUE:
				getDoubleListValue().clear();
				getDoubleListValue().addAll((Collection)newValue);
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
			case NotationPackage.DOUBLE_LIST_VALUE_STYLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NotationPackage.DOUBLE_LIST_VALUE_STYLE__DOUBLE_LIST_VALUE:
				getDoubleListValue().clear();
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
			case NotationPackage.DOUBLE_LIST_VALUE_STYLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NotationPackage.DOUBLE_LIST_VALUE_STYLE__DOUBLE_LIST_VALUE:
				return doubleListValue != null && !doubleListValue.isEmpty();
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
		result.append(" (doubleListValue: "); //$NON-NLS-1$
		result.append(doubleListValue);
		result.append(')');
		return result.toString();
	}

} //DoubleListValueStyleImpl
