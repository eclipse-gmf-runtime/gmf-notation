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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.FlatEObjectImpl;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.ImageStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ImageStyleImpl#getAntiAlias <em>Anti Alias</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ImageStyleImpl#getMaintainAspectRatio <em>Maintain Aspect Ratio</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ImageStyleImpl#getCropBound <em>Crop Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
/*
 * @canBeSeenBy org.eclipse.gmf.runtime.notation.*
 */
public class ImageStyleImpl extends FlatEObjectImpl implements ImageStyle {
    /**
     * The default value of the '{@link #getAntiAlias() <em>Anti Alias</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAntiAlias()
     * @generated
     * @ordered
     */
	protected static final Boolean ANTI_ALIAS_EDEFAULT = Boolean.TRUE;

    /**
     * The cached value of the '{@link #getAntiAlias() <em>Anti Alias</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAntiAlias()
     * @generated
     * @ordered
     */
	protected Boolean antiAlias = ANTI_ALIAS_EDEFAULT;

    /**
     * The default value of the '{@link #getMaintainAspectRatio() <em>Maintain Aspect Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaintainAspectRatio()
     * @generated
     * @ordered
     */
	protected static final Boolean MAINTAIN_ASPECT_RATIO_EDEFAULT = Boolean.TRUE;

    /**
     * The cached value of the '{@link #getMaintainAspectRatio() <em>Maintain Aspect Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaintainAspectRatio()
     * @generated
     * @ordered
     */
	protected Boolean maintainAspectRatio = MAINTAIN_ASPECT_RATIO_EDEFAULT;

    /**
     * The cached value of the '{@link #getCropBound() <em>Crop Bound</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCropBound()
     * @generated
     * @ordered
     */
	protected Bounds cropBound = null;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ImageStyleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected EClass eStaticClass() {
        return NotationPackage.Literals.IMAGE_STYLE;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Boolean getAntiAlias() {
        return antiAlias;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAntiAlias(Boolean newAntiAlias) {
        Boolean oldAntiAlias = antiAlias;
        antiAlias = newAntiAlias;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.IMAGE_STYLE__ANTI_ALIAS, oldAntiAlias, antiAlias));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Boolean getMaintainAspectRatio() {
        return maintainAspectRatio;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMaintainAspectRatio(Boolean newMaintainAspectRatio) {
        Boolean oldMaintainAspectRatio = maintainAspectRatio;
        maintainAspectRatio = newMaintainAspectRatio;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.IMAGE_STYLE__MAINTAIN_ASPECT_RATIO, oldMaintainAspectRatio, maintainAspectRatio));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Bounds getCropBound() {
        return cropBound;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetCropBound(Bounds newCropBound, NotificationChain msgs) {
        Bounds oldCropBound = cropBound;
        cropBound = newCropBound;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NotationPackage.IMAGE_STYLE__CROP_BOUND, oldCropBound, newCropBound);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCropBound(Bounds newCropBound) {
        if (newCropBound != cropBound) {
            NotificationChain msgs = null;
            if (cropBound != null)
                msgs = ((InternalEObject)cropBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NotationPackage.IMAGE_STYLE__CROP_BOUND, null, msgs);
            if (newCropBound != null)
                msgs = ((InternalEObject)newCropBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NotationPackage.IMAGE_STYLE__CROP_BOUND, null, msgs);
            msgs = basicSetCropBound(newCropBound, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.IMAGE_STYLE__CROP_BOUND, newCropBound, newCropBound));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case NotationPackage.IMAGE_STYLE__CROP_BOUND:
                return basicSetCropBound(null, msgs);
        }
        return eDynamicInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case NotationPackage.IMAGE_STYLE__ANTI_ALIAS:
                return getAntiAlias();
            case NotationPackage.IMAGE_STYLE__MAINTAIN_ASPECT_RATIO:
                return getMaintainAspectRatio();
            case NotationPackage.IMAGE_STYLE__CROP_BOUND:
                return getCropBound();
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
            case NotationPackage.IMAGE_STYLE__ANTI_ALIAS:
                setAntiAlias((Boolean)newValue);
                return;
            case NotationPackage.IMAGE_STYLE__MAINTAIN_ASPECT_RATIO:
                setMaintainAspectRatio((Boolean)newValue);
                return;
            case NotationPackage.IMAGE_STYLE__CROP_BOUND:
                setCropBound((Bounds)newValue);
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
            case NotationPackage.IMAGE_STYLE__ANTI_ALIAS:
                setAntiAlias(ANTI_ALIAS_EDEFAULT);
                return;
            case NotationPackage.IMAGE_STYLE__MAINTAIN_ASPECT_RATIO:
                setMaintainAspectRatio(MAINTAIN_ASPECT_RATIO_EDEFAULT);
                return;
            case NotationPackage.IMAGE_STYLE__CROP_BOUND:
                setCropBound((Bounds)null);
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
            case NotationPackage.IMAGE_STYLE__ANTI_ALIAS:
                return ANTI_ALIAS_EDEFAULT == null ? antiAlias != null : !ANTI_ALIAS_EDEFAULT.equals(antiAlias);
            case NotationPackage.IMAGE_STYLE__MAINTAIN_ASPECT_RATIO:
                return MAINTAIN_ASPECT_RATIO_EDEFAULT == null ? maintainAspectRatio != null : !MAINTAIN_ASPECT_RATIO_EDEFAULT.equals(maintainAspectRatio);
            case NotationPackage.IMAGE_STYLE__CROP_BOUND:
                return cropBound != null;
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
        result.append(" (antiAlias: "); //$NON-NLS-1$
        result.append(antiAlias);
        result.append(", maintainAspectRatio: "); //$NON-NLS-1$
        result.append(maintainAspectRatio);
        result.append(')');
        return result.toString();
    }

} //ImageStyleImpl
