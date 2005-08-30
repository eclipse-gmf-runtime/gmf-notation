/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2004.  All Rights Reserved.                    |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package org.eclipse.gmf.runtime.notation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.TitleStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Title Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.TitleStyleImpl#isShowTitle <em>Show Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public class TitleStyleImpl extends EObjectImpl implements TitleStyle {
	/**
	 * The default value of the '{@link #isShowTitle() <em>Show Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowTitle()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_TITLE_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isShowTitle() <em>Show Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowTitle()
	 * @generated
	 * @ordered
	 */
	protected static final int SHOW_TITLE_EFLAG = 1 << 8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TitleStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.eINSTANCE.getTitleStyle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowTitle() {
		return (eFlags & SHOW_TITLE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowTitle(boolean newShowTitle) {
		boolean oldShowTitle = (eFlags & SHOW_TITLE_EFLAG) != 0;
		if (newShowTitle) eFlags |= SHOW_TITLE_EFLAG; else eFlags &= ~SHOW_TITLE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.TITLE_STYLE__SHOW_TITLE, oldShowTitle, newShowTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case NotationPackage.TITLE_STYLE__SHOW_TITLE:
				return isShowTitle() ? Boolean.TRUE : Boolean.FALSE;
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case NotationPackage.TITLE_STYLE__SHOW_TITLE:
				setShowTitle(((Boolean)newValue).booleanValue());
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case NotationPackage.TITLE_STYLE__SHOW_TITLE:
				setShowTitle(SHOW_TITLE_EDEFAULT);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case NotationPackage.TITLE_STYLE__SHOW_TITLE:
				return ((eFlags & SHOW_TITLE_EFLAG) != 0) != SHOW_TITLE_EDEFAULT;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (showTitle: "); //$NON-NLS-1$
		result.append((eFlags & SHOW_TITLE_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

} //TitleStyleImpl
