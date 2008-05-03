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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
public class GuideStyleImpl extends NotationObjectImpl implements GuideStyle {
    /**
	 * The cached value of the '{@link #getHorizontalGuides() <em>Horizontal Guides</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalGuides()
	 * @generated
	 * @ordered
	 */
	protected EList horizontalGuides;

    /**
	 * The cached value of the '{@link #getVerticalGuides() <em>Vertical Guides</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalGuides()
	 * @generated
	 * @ordered
	 */
	protected EList verticalGuides;

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
		return NotationPackage.Literals.GUIDE_STYLE;
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NotationPackage.GUIDE_STYLE__HORIZONTAL_GUIDES:
				return ((InternalEList)getHorizontalGuides()).basicRemove(otherEnd, msgs);
			case NotationPackage.GUIDE_STYLE__VERTICAL_GUIDES:
				return ((InternalEList)getVerticalGuides()).basicRemove(otherEnd, msgs);
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
			case NotationPackage.GUIDE_STYLE__UUID:
				return getUUID();
			case NotationPackage.GUIDE_STYLE__HORIZONTAL_GUIDES:
				return getHorizontalGuides();
			case NotationPackage.GUIDE_STYLE__VERTICAL_GUIDES:
				return getVerticalGuides();
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
			case NotationPackage.GUIDE_STYLE__UUID:
				setUUID((byte[])newValue);
				return;
			case NotationPackage.GUIDE_STYLE__HORIZONTAL_GUIDES:
				getHorizontalGuides().clear();
				getHorizontalGuides().addAll((Collection)newValue);
				return;
			case NotationPackage.GUIDE_STYLE__VERTICAL_GUIDES:
				getVerticalGuides().clear();
				getVerticalGuides().addAll((Collection)newValue);
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
			case NotationPackage.GUIDE_STYLE__UUID:
				setUUID(UUID_EDEFAULT);
				return;
			case NotationPackage.GUIDE_STYLE__HORIZONTAL_GUIDES:
				getHorizontalGuides().clear();
				return;
			case NotationPackage.GUIDE_STYLE__VERTICAL_GUIDES:
				getVerticalGuides().clear();
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
			case NotationPackage.GUIDE_STYLE__UUID:
				return UUID_EDEFAULT == null ? uUID != null : !UUID_EDEFAULT.equals(uUID);
			case NotationPackage.GUIDE_STYLE__HORIZONTAL_GUIDES:
				return horizontalGuides != null && !horizontalGuides.isEmpty();
			case NotationPackage.GUIDE_STYLE__VERTICAL_GUIDES:
				return verticalGuides != null && !verticalGuides.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //GuideStyleImpl
