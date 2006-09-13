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
import org.eclipse.emf.ecore.impl.FlatEObjectImpl;
import org.eclipse.gmf.runtime.notation.DrawerStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drawer Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.DrawerStyleImpl#isCollapsed <em>Collapsed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
/*
 * @canBeSeenBy org.eclipse.gmf.runtime.notation.*
 */
public class DrawerStyleImpl extends FlatEObjectImpl implements DrawerStyle {
    /**
     * The default value of the '{@link #isCollapsed() <em>Collapsed</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isCollapsed()
     * @generated
     * @ordered
     */
	protected static final boolean COLLAPSED_EDEFAULT = false;

    /**
     * The flag representing the value of the '{@link #isCollapsed() <em>Collapsed</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isCollapsed()
     * @generated
     * @ordered
     */
	protected static final int COLLAPSED_EFLAG = 1 << 8;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected DrawerStyleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected EClass eStaticClass() {
        return NotationPackage.Literals.DRAWER_STYLE;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isCollapsed() {
        return (eFlags & COLLAPSED_EFLAG) != 0;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCollapsed(boolean newCollapsed) {
        boolean oldCollapsed = (eFlags & COLLAPSED_EFLAG) != 0;
        if (newCollapsed) eFlags |= COLLAPSED_EFLAG; else eFlags &= ~COLLAPSED_EFLAG;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.DRAWER_STYLE__COLLAPSED, oldCollapsed, newCollapsed));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case NotationPackage.DRAWER_STYLE__COLLAPSED:
                return isCollapsed() ? Boolean.TRUE : Boolean.FALSE;
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
            case NotationPackage.DRAWER_STYLE__COLLAPSED:
                setCollapsed(((Boolean)newValue).booleanValue());
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
            case NotationPackage.DRAWER_STYLE__COLLAPSED:
                setCollapsed(COLLAPSED_EDEFAULT);
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
            case NotationPackage.DRAWER_STYLE__COLLAPSED:
                return ((eFlags & COLLAPSED_EFLAG) != 0) != COLLAPSED_EDEFAULT;
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
        result.append(" (collapsed: "); //$NON-NLS-1$
        result.append((eFlags & COLLAPSED_EFLAG) != 0);
        result.append(')');
        return result.toString();
    }

} //DrawerStyleImpl
