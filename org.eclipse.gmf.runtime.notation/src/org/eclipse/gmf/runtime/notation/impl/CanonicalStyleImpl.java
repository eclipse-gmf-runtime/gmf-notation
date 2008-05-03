/******************************************************************************
 * Copyright (c) 2004, 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.runtime.notation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmf.runtime.notation.CanonicalStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Canonical Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.CanonicalStyleImpl#isCanonical <em>Canonical</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
/*
 * @canBeSeenBy org.eclipse.gmf.runtime.notation.*
 */
public class CanonicalStyleImpl extends NotationObjectImpl implements CanonicalStyle {
    /**
	 * The default value of the '{@link #isCanonical() <em>Canonical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanonical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CANONICAL_EDEFAULT = true;

    /**
	 * The flag representing the value of the '{@link #isCanonical() <em>Canonical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanonical()
	 * @generated
	 * @ordered
	 */
	protected static final int CANONICAL_EFLAG = 1 << 8;

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CanonicalStyleImpl() {
		super();
		eFlags |= CANONICAL_EFLAG;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.CANONICAL_STYLE;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanonical() {
		return (eFlags & CANONICAL_EFLAG) != 0;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanonical(boolean newCanonical) {
		boolean oldCanonical = (eFlags & CANONICAL_EFLAG) != 0;
		if (newCanonical) eFlags |= CANONICAL_EFLAG; else eFlags &= ~CANONICAL_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.CANONICAL_STYLE__CANONICAL, oldCanonical, newCanonical));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.CANONICAL_STYLE__UUID:
				return getUUID();
			case NotationPackage.CANONICAL_STYLE__CANONICAL:
				return isCanonical() ? Boolean.TRUE : Boolean.FALSE;
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
			case NotationPackage.CANONICAL_STYLE__UUID:
				setUUID((byte[])newValue);
				return;
			case NotationPackage.CANONICAL_STYLE__CANONICAL:
				setCanonical(((Boolean)newValue).booleanValue());
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
			case NotationPackage.CANONICAL_STYLE__UUID:
				setUUID(UUID_EDEFAULT);
				return;
			case NotationPackage.CANONICAL_STYLE__CANONICAL:
				setCanonical(CANONICAL_EDEFAULT);
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
			case NotationPackage.CANONICAL_STYLE__UUID:
				return UUID_EDEFAULT == null ? uUID != null : !UUID_EDEFAULT.equals(uUID);
			case NotationPackage.CANONICAL_STYLE__CANONICAL:
				return ((eFlags & CANONICAL_EFLAG) != 0) != CANONICAL_EDEFAULT;
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
		result.append(" (canonical: "); //$NON-NLS-1$
		result.append((eFlags & CANONICAL_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

} //CanonicalStyleImpl
