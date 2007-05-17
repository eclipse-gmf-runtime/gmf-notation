/**
 * <copyright>
 * </copyright>
 *
 * $Id: BooleanValueStyleImpl.java,v 1.1 2007/05/17 16:26:50 aboyko Exp $
 */
package org.eclipse.gmf.runtime.notation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gmf.runtime.notation.BooleanValueStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Value Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.BooleanValueStyleImpl#isBooleanValue <em>Boolean Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanValueStyleImpl extends NamedStyleImpl implements BooleanValueStyle {
	/**
	 * The default value of the '{@link #isBooleanValue() <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBooleanValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOOLEAN_VALUE_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isBooleanValue() <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBooleanValue()
	 * @generated
	 * @ordered
	 */
	protected static final int BOOLEAN_VALUE_EFLAG = 1 << 8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanValueStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.BOOLEAN_VALUE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBooleanValue() {
		return (eFlags & BOOLEAN_VALUE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanValue(boolean newBooleanValue) {
		boolean oldBooleanValue = (eFlags & BOOLEAN_VALUE_EFLAG) != 0;
		if (newBooleanValue) eFlags |= BOOLEAN_VALUE_EFLAG; else eFlags &= ~BOOLEAN_VALUE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.BOOLEAN_VALUE_STYLE__BOOLEAN_VALUE, oldBooleanValue, newBooleanValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.BOOLEAN_VALUE_STYLE__NAME:
				return getName();
			case NotationPackage.BOOLEAN_VALUE_STYLE__BOOLEAN_VALUE:
				return isBooleanValue() ? Boolean.TRUE : Boolean.FALSE;
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
			case NotationPackage.BOOLEAN_VALUE_STYLE__NAME:
				setName((String)newValue);
				return;
			case NotationPackage.BOOLEAN_VALUE_STYLE__BOOLEAN_VALUE:
				setBooleanValue(((Boolean)newValue).booleanValue());
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
			case NotationPackage.BOOLEAN_VALUE_STYLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NotationPackage.BOOLEAN_VALUE_STYLE__BOOLEAN_VALUE:
				setBooleanValue(BOOLEAN_VALUE_EDEFAULT);
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
			case NotationPackage.BOOLEAN_VALUE_STYLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NotationPackage.BOOLEAN_VALUE_STYLE__BOOLEAN_VALUE:
				return ((eFlags & BOOLEAN_VALUE_EFLAG) != 0) != BOOLEAN_VALUE_EDEFAULT;
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
		result.append(" (booleanValue: "); //$NON-NLS-1$
		result.append((eFlags & BOOLEAN_VALUE_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

} //BooleanValueStyleImpl
