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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

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
public class ImageStyleImpl extends EObjectImpl implements ImageStyle {
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
		return NotationPackage.eINSTANCE.getImageStyle();
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case NotationPackage.IMAGE_STYLE__CROP_BOUND:
					return basicSetCropBound(null, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case NotationPackage.IMAGE_STYLE__ANTI_ALIAS:
				return getAntiAlias();
			case NotationPackage.IMAGE_STYLE__MAINTAIN_ASPECT_RATIO:
				return getMaintainAspectRatio();
			case NotationPackage.IMAGE_STYLE__CROP_BOUND:
				return getCropBound();
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
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case NotationPackage.IMAGE_STYLE__ANTI_ALIAS:
				return ANTI_ALIAS_EDEFAULT == null ? antiAlias != null : !ANTI_ALIAS_EDEFAULT.equals(antiAlias);
			case NotationPackage.IMAGE_STYLE__MAINTAIN_ASPECT_RATIO:
				return MAINTAIN_ASPECT_RATIO_EDEFAULT == null ? maintainAspectRatio != null : !MAINTAIN_ASPECT_RATIO_EDEFAULT.equals(maintainAspectRatio);
			case NotationPackage.IMAGE_STYLE__CROP_BOUND:
				return cropBound != null;
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
		result.append(" (antiAlias: "); //$NON-NLS-1$
		result.append(antiAlias);
		result.append(", maintainAspectRatio: "); //$NON-NLS-1$
		result.append(maintainAspectRatio);
		result.append(')');
		return result.toString();
	}

} //ImageStyleImpl
