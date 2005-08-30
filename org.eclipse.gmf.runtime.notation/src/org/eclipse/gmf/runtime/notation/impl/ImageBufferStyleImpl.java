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

import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Image;
import org.eclipse.gmf.runtime.notation.ImageBufferStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Buffer Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ImageBufferStyleImpl#getImageBuffer <em>Image Buffer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
/*
 * @canBeSeenBy org.eclipse.gmf.runtime.notation.*
 */
public class ImageBufferStyleImpl extends ImageStyleImpl implements ImageBufferStyle {
	/**
	 * The cached value of the '{@link #getImageBuffer() <em>Image Buffer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageBuffer()
	 * @generated
	 * @ordered
	 */
	protected Image imageBuffer = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageBufferStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.eINSTANCE.getImageBufferStyle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image getImageBuffer() {
		return imageBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageBuffer(Image newImageBuffer, NotificationChain msgs) {
		Image oldImageBuffer = imageBuffer;
		imageBuffer = newImageBuffer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NotationPackage.IMAGE_BUFFER_STYLE__IMAGE_BUFFER, oldImageBuffer, newImageBuffer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageBuffer(Image newImageBuffer) {
		if (newImageBuffer != imageBuffer) {
			NotificationChain msgs = null;
			if (imageBuffer != null)
				msgs = ((InternalEObject)imageBuffer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NotationPackage.IMAGE_BUFFER_STYLE__IMAGE_BUFFER, null, msgs);
			if (newImageBuffer != null)
				msgs = ((InternalEObject)newImageBuffer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NotationPackage.IMAGE_BUFFER_STYLE__IMAGE_BUFFER, null, msgs);
			msgs = basicSetImageBuffer(newImageBuffer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.IMAGE_BUFFER_STYLE__IMAGE_BUFFER, newImageBuffer, newImageBuffer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case NotationPackage.IMAGE_BUFFER_STYLE__CROP_BOUND:
					return basicSetCropBound(null, msgs);
				case NotationPackage.IMAGE_BUFFER_STYLE__IMAGE_BUFFER:
					return basicSetImageBuffer(null, msgs);
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
			case NotationPackage.IMAGE_BUFFER_STYLE__ANTI_ALIAS:
				return getAntiAlias();
			case NotationPackage.IMAGE_BUFFER_STYLE__MAINTAIN_ASPECT_RATIO:
				return getMaintainAspectRatio();
			case NotationPackage.IMAGE_BUFFER_STYLE__CROP_BOUND:
				return getCropBound();
			case NotationPackage.IMAGE_BUFFER_STYLE__IMAGE_BUFFER:
				return getImageBuffer();
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
			case NotationPackage.IMAGE_BUFFER_STYLE__ANTI_ALIAS:
				setAntiAlias((Boolean)newValue);
				return;
			case NotationPackage.IMAGE_BUFFER_STYLE__MAINTAIN_ASPECT_RATIO:
				setMaintainAspectRatio((Boolean)newValue);
				return;
			case NotationPackage.IMAGE_BUFFER_STYLE__CROP_BOUND:
				setCropBound((Bounds)newValue);
				return;
			case NotationPackage.IMAGE_BUFFER_STYLE__IMAGE_BUFFER:
				setImageBuffer((Image)newValue);
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
			case NotationPackage.IMAGE_BUFFER_STYLE__ANTI_ALIAS:
				setAntiAlias(ANTI_ALIAS_EDEFAULT);
				return;
			case NotationPackage.IMAGE_BUFFER_STYLE__MAINTAIN_ASPECT_RATIO:
				setMaintainAspectRatio(MAINTAIN_ASPECT_RATIO_EDEFAULT);
				return;
			case NotationPackage.IMAGE_BUFFER_STYLE__CROP_BOUND:
				setCropBound((Bounds)null);
				return;
			case NotationPackage.IMAGE_BUFFER_STYLE__IMAGE_BUFFER:
				setImageBuffer((Image)null);
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
			case NotationPackage.IMAGE_BUFFER_STYLE__ANTI_ALIAS:
				return ANTI_ALIAS_EDEFAULT == null ? antiAlias != null : !ANTI_ALIAS_EDEFAULT.equals(antiAlias);
			case NotationPackage.IMAGE_BUFFER_STYLE__MAINTAIN_ASPECT_RATIO:
				return MAINTAIN_ASPECT_RATIO_EDEFAULT == null ? maintainAspectRatio != null : !MAINTAIN_ASPECT_RATIO_EDEFAULT.equals(maintainAspectRatio);
			case NotationPackage.IMAGE_BUFFER_STYLE__CROP_BOUND:
				return cropBound != null;
			case NotationPackage.IMAGE_BUFFER_STYLE__IMAGE_BUFFER:
				return imageBuffer != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //ImageBufferStyleImpl
