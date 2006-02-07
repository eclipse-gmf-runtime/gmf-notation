/******************************************************************************
 * Copyright (c) 2004 IBM Corporation and others.
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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.NodeImpl#getLayoutConstraint <em>Layout Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public class NodeImpl extends ViewImpl implements Node {
    /**
     * The cached value of the '{@link #getLayoutConstraint() <em>Layout Constraint</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLayoutConstraint()
     * @generated
     * @ordered
     */
	protected LayoutConstraint layoutConstraint = null;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected NodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected EClass eStaticClass() {
        return NotationPackage.Literals.NODE;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public LayoutConstraint getLayoutConstraint() {
        return layoutConstraint;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetLayoutConstraint(LayoutConstraint newLayoutConstraint, NotificationChain msgs) {
        LayoutConstraint oldLayoutConstraint = layoutConstraint;
        layoutConstraint = newLayoutConstraint;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NotationPackage.NODE__LAYOUT_CONSTRAINT, oldLayoutConstraint, newLayoutConstraint);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLayoutConstraint(LayoutConstraint newLayoutConstraint) {
        if (newLayoutConstraint != layoutConstraint) {
            NotificationChain msgs = null;
            if (layoutConstraint != null)
                msgs = ((InternalEObject)layoutConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NotationPackage.NODE__LAYOUT_CONSTRAINT, null, msgs);
            if (newLayoutConstraint != null)
                msgs = ((InternalEObject)newLayoutConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NotationPackage.NODE__LAYOUT_CONSTRAINT, null, msgs);
            msgs = basicSetLayoutConstraint(newLayoutConstraint, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.NODE__LAYOUT_CONSTRAINT, newLayoutConstraint, newLayoutConstraint));
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public LayoutConstraint createLayoutConstraint(EClass eClass) {
		LayoutConstraint newLayoutConstraint = (LayoutConstraint) eClass.getEPackage().getEFactoryInstance().create(eClass);
		setLayoutConstraint(newLayoutConstraint);
		return newLayoutConstraint;
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case NotationPackage.NODE__LAYOUT_CONSTRAINT:
                return basicSetLayoutConstraint(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case NotationPackage.NODE__LAYOUT_CONSTRAINT:
                return getLayoutConstraint();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case NotationPackage.NODE__LAYOUT_CONSTRAINT:
                setLayoutConstraint((LayoutConstraint)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eUnset(int featureID) {
        switch (featureID) {
            case NotationPackage.NODE__LAYOUT_CONSTRAINT:
                setLayoutConstraint((LayoutConstraint)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case NotationPackage.NODE__LAYOUT_CONSTRAINT:
                return layoutConstraint != null;
        }
        return super.eIsSet(featureID);
    }

} //NodeImpl
