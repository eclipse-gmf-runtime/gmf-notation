/**
 * <copyright>
 * </copyright>
 *
 * $Id: EObjectValueStyleImpl.java,v 1.1 2007/05/17 16:26:50 aboyko Exp $
 */
package org.eclipse.gmf.runtime.notation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gmf.runtime.notation.EObjectValueStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EObject Value Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.EObjectValueStyleImpl#getEObjectValue <em>EObject Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EObjectValueStyleImpl extends NamedStyleImpl implements EObjectValueStyle {
	/**
	 * The cached value of the '{@link #getEObjectValue() <em>EObject Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEObjectValue()
	 * @generated
	 * @ordered
	 */
	protected EObject eObjectValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EObjectValueStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.EOBJECT_VALUE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getEObjectValue() {
		if (eObjectValue != null && eObjectValue.eIsProxy()) {
			InternalEObject oldEObjectValue = (InternalEObject)eObjectValue;
			eObjectValue = eResolveProxy(oldEObjectValue);
			if (eObjectValue != oldEObjectValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NotationPackage.EOBJECT_VALUE_STYLE__EOBJECT_VALUE, oldEObjectValue, eObjectValue));
			}
		}
		return eObjectValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetEObjectValue() {
		return eObjectValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEObjectValue(EObject newEObjectValue) {
		EObject oldEObjectValue = eObjectValue;
		eObjectValue = newEObjectValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.EOBJECT_VALUE_STYLE__EOBJECT_VALUE, oldEObjectValue, eObjectValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.EOBJECT_VALUE_STYLE__NAME:
				return getName();
			case NotationPackage.EOBJECT_VALUE_STYLE__EOBJECT_VALUE:
				if (resolve) return getEObjectValue();
				return basicGetEObjectValue();
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
			case NotationPackage.EOBJECT_VALUE_STYLE__NAME:
				setName((String)newValue);
				return;
			case NotationPackage.EOBJECT_VALUE_STYLE__EOBJECT_VALUE:
				setEObjectValue((EObject)newValue);
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
			case NotationPackage.EOBJECT_VALUE_STYLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NotationPackage.EOBJECT_VALUE_STYLE__EOBJECT_VALUE:
				setEObjectValue((EObject)null);
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
			case NotationPackage.EOBJECT_VALUE_STYLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NotationPackage.EOBJECT_VALUE_STYLE__EOBJECT_VALUE:
				return eObjectValue != null;
		}
		return eDynamicIsSet(featureID);
	}

} //EObjectValueStyleImpl
