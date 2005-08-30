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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gmf.runtime.notation.Guide;
import org.eclipse.gmf.runtime.notation.GuideStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guide Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.GuideStyleImpl#getHorizontalGuides <em>Horizontal Guides</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.GuideStyleImpl#getVerticalGuides <em>Vertical Guides</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
/*
 * @canBeSeenBy org.eclipse.gmf.runtime.notation.*
 */
public class GuideStyleImpl extends EObjectImpl implements GuideStyle {
	/**
	 * The cached value of the '{@link #getHorizontalGuides() <em>Horizontal Guides</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalGuides()
	 * @generated
	 * @ordered
	 */
	protected EList horizontalGuides = null;

	/**
	 * The cached value of the '{@link #getVerticalGuides() <em>Vertical Guides</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalGuides()
	 * @generated
	 * @ordered
	 */
	protected EList verticalGuides = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuideStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.eINSTANCE.getGuideStyle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getHorizontalGuides() {
		if (horizontalGuides == null) {
			horizontalGuides = new EObjectContainmentEList(Guide.class, this, NotationPackage.GUIDE_STYLE__HORIZONTAL_GUIDES);
		}
		return horizontalGuides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getVerticalGuides() {
		if (verticalGuides == null) {
			verticalGuides = new EObjectContainmentEList(Guide.class, this, NotationPackage.GUIDE_STYLE__VERTICAL_GUIDES);
		}
		return verticalGuides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case NotationPackage.GUIDE_STYLE__HORIZONTAL_GUIDES:
					return ((InternalEList)getHorizontalGuides()).basicRemove(otherEnd, msgs);
				case NotationPackage.GUIDE_STYLE__VERTICAL_GUIDES:
					return ((InternalEList)getVerticalGuides()).basicRemove(otherEnd, msgs);
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
			case NotationPackage.GUIDE_STYLE__HORIZONTAL_GUIDES:
				return getHorizontalGuides();
			case NotationPackage.GUIDE_STYLE__VERTICAL_GUIDES:
				return getVerticalGuides();
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
			case NotationPackage.GUIDE_STYLE__HORIZONTAL_GUIDES:
				getHorizontalGuides().clear();
				getHorizontalGuides().addAll((Collection)newValue);
				return;
			case NotationPackage.GUIDE_STYLE__VERTICAL_GUIDES:
				getVerticalGuides().clear();
				getVerticalGuides().addAll((Collection)newValue);
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
			case NotationPackage.GUIDE_STYLE__HORIZONTAL_GUIDES:
				getHorizontalGuides().clear();
				return;
			case NotationPackage.GUIDE_STYLE__VERTICAL_GUIDES:
				getVerticalGuides().clear();
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
			case NotationPackage.GUIDE_STYLE__HORIZONTAL_GUIDES:
				return horizontalGuides != null && !horizontalGuides.isEmpty();
			case NotationPackage.GUIDE_STYLE__VERTICAL_GUIDES:
				return verticalGuides != null && !verticalGuides.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //GuideStyleImpl
