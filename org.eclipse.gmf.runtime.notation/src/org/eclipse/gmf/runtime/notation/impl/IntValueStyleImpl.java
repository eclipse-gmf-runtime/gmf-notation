/**
 * <copyright>
 * </copyright>
 *
 * $Id: IntValueStyleImpl.java,v 1.1 2007/05/17 16:26:49 aboyko Exp $
 */
package org.eclipse.gmf.runtime.notation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gmf.runtime.notation.IntValueStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Int Value Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.IntValueStyleImpl#getIntValue <em>Int Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntValueStyleImpl extends NamedStyleImpl implements IntValueStyle {
	/**
	 * The default value of the '{@link #getIntValue() <em>Int Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntValue()
	 * @generated
	 * @ordered
	 */
	protected static final int INT_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIntValue() <em>Int Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntValue()
	 * @generated
	 * @ordered
	 */
	protected int intValue = INT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntValueStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.INT_VALUE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIntValue() {
		return intValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntValue(int newIntValue) {
		int oldIntValue = intValue;
		intValue = newIntValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.INT_VALUE_STYLE__INT_VALUE, oldIntValue, intValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.INT_VALUE_STYLE__NAME:
				return getName();
			case NotationPackage.INT_VALUE_STYLE__INT_VALUE:
				return new Integer(getIntValue());
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
			case NotationPackage.INT_VALUE_STYLE__NAME:
				setName((String)newValue);
				return;
			case NotationPackage.INT_VALUE_STYLE__INT_VALUE:
				setIntValue(((Integer)newValue).intValue());
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
			case NotationPackage.INT_VALUE_STYLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NotationPackage.INT_VALUE_STYLE__INT_VALUE:
				setIntValue(INT_VALUE_EDEFAULT);
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
			case NotationPackage.INT_VALUE_STYLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NotationPackage.INT_VALUE_STYLE__INT_VALUE:
				return intValue != INT_VALUE_EDEFAULT;
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
		result.append(" (intValue: "); //$NON-NLS-1$
		result.append(intValue);
		result.append(')');
		return result.toString();
	}

} //IntValueStyleImpl
