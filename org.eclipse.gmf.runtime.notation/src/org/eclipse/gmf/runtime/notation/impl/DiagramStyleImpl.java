/******************************************************************************
 * Copyright (c) 2004, 2008 IBM Corporation and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
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
import org.eclipse.gmf.runtime.notation.DescriptionStyle;
import org.eclipse.gmf.runtime.notation.DiagramStyle;
import org.eclipse.gmf.runtime.notation.Guide;
import org.eclipse.gmf.runtime.notation.GuideStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Diagram
 * Style</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.gmf.runtime.notation.impl.DiagramStyleImpl#getHorizontalGuides
 * <em>Horizontal Guides</em>}</li>
 * <li>{@link org.eclipse.gmf.runtime.notation.impl.DiagramStyleImpl#getVerticalGuides
 * <em>Vertical Guides</em>}</li>
 * <li>{@link org.eclipse.gmf.runtime.notation.impl.DiagramStyleImpl#getDescription
 * <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public class DiagramStyleImpl extends PageStyleImpl implements DiagramStyle {

	/**
	 * The cached value of the '{@link #getHorizontalGuides() <em>Horizontal
	 * Guides</em>}' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getHorizontalGuides()
	 * @generated
	 * @ordered
	 */
	protected EList horizontalGuides;

	/**
	 * The cached value of the '{@link #getVerticalGuides() <em>Vertical
	 * Guides</em>}' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getVerticalGuides()
	 * @generated
	 * @ordered
	 */
	protected EList verticalGuides;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DiagramStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.DIAGRAM_STYLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList getHorizontalGuides() {
		if (horizontalGuides == null) {
			horizontalGuides = new EObjectContainmentEList(Guide.class, this,
					NotationPackage.DIAGRAM_STYLE__HORIZONTAL_GUIDES);
		}
		return horizontalGuides;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList getVerticalGuides() {
		if (verticalGuides == null) {
			verticalGuides = new EObjectContainmentEList(Guide.class, this,
					NotationPackage.DIAGRAM_STYLE__VERTICAL_GUIDES);
		}
		return verticalGuides;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.DIAGRAM_STYLE__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case NotationPackage.DIAGRAM_STYLE__HORIZONTAL_GUIDES:
			return ((InternalEList) getHorizontalGuides()).basicRemove(otherEnd, msgs);
		case NotationPackage.DIAGRAM_STYLE__VERTICAL_GUIDES:
			return ((InternalEList) getVerticalGuides()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NotationPackage.DIAGRAM_STYLE__PAGE_X:
			return new Integer(getPageX());
		case NotationPackage.DIAGRAM_STYLE__PAGE_Y:
			return new Integer(getPageY());
		case NotationPackage.DIAGRAM_STYLE__PAGE_WIDTH:
			return new Integer(getPageWidth());
		case NotationPackage.DIAGRAM_STYLE__PAGE_HEIGHT:
			return new Integer(getPageHeight());
		case NotationPackage.DIAGRAM_STYLE__HORIZONTAL_GUIDES:
			return getHorizontalGuides();
		case NotationPackage.DIAGRAM_STYLE__VERTICAL_GUIDES:
			return getVerticalGuides();
		case NotationPackage.DIAGRAM_STYLE__DESCRIPTION:
			return getDescription();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case NotationPackage.DIAGRAM_STYLE__PAGE_X:
			setPageX(((Integer) newValue).intValue());
			return;
		case NotationPackage.DIAGRAM_STYLE__PAGE_Y:
			setPageY(((Integer) newValue).intValue());
			return;
		case NotationPackage.DIAGRAM_STYLE__PAGE_WIDTH:
			setPageWidth(((Integer) newValue).intValue());
			return;
		case NotationPackage.DIAGRAM_STYLE__PAGE_HEIGHT:
			setPageHeight(((Integer) newValue).intValue());
			return;
		case NotationPackage.DIAGRAM_STYLE__HORIZONTAL_GUIDES:
			getHorizontalGuides().clear();
			getHorizontalGuides().addAll((Collection) newValue);
			return;
		case NotationPackage.DIAGRAM_STYLE__VERTICAL_GUIDES:
			getVerticalGuides().clear();
			getVerticalGuides().addAll((Collection) newValue);
			return;
		case NotationPackage.DIAGRAM_STYLE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
		case NotationPackage.DIAGRAM_STYLE__PAGE_X:
			setPageX(PAGE_X_EDEFAULT);
			return;
		case NotationPackage.DIAGRAM_STYLE__PAGE_Y:
			setPageY(PAGE_Y_EDEFAULT);
			return;
		case NotationPackage.DIAGRAM_STYLE__PAGE_WIDTH:
			setPageWidth(PAGE_WIDTH_EDEFAULT);
			return;
		case NotationPackage.DIAGRAM_STYLE__PAGE_HEIGHT:
			setPageHeight(PAGE_HEIGHT_EDEFAULT);
			return;
		case NotationPackage.DIAGRAM_STYLE__HORIZONTAL_GUIDES:
			getHorizontalGuides().clear();
			return;
		case NotationPackage.DIAGRAM_STYLE__VERTICAL_GUIDES:
			getVerticalGuides().clear();
			return;
		case NotationPackage.DIAGRAM_STYLE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case NotationPackage.DIAGRAM_STYLE__PAGE_X:
			return pageX != PAGE_X_EDEFAULT;
		case NotationPackage.DIAGRAM_STYLE__PAGE_Y:
			return pageY != PAGE_Y_EDEFAULT;
		case NotationPackage.DIAGRAM_STYLE__PAGE_WIDTH:
			return pageWidth != PAGE_WIDTH_EDEFAULT;
		case NotationPackage.DIAGRAM_STYLE__PAGE_HEIGHT:
			return pageHeight != PAGE_HEIGHT_EDEFAULT;
		case NotationPackage.DIAGRAM_STYLE__HORIZONTAL_GUIDES:
			return horizontalGuides != null && !horizontalGuides.isEmpty();
		case NotationPackage.DIAGRAM_STYLE__VERTICAL_GUIDES:
			return verticalGuides != null && !verticalGuides.isEmpty();
		case NotationPackage.DIAGRAM_STYLE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == GuideStyle.class) {
			switch (derivedFeatureID) {
			case NotationPackage.DIAGRAM_STYLE__HORIZONTAL_GUIDES:
				return NotationPackage.GUIDE_STYLE__HORIZONTAL_GUIDES;
			case NotationPackage.DIAGRAM_STYLE__VERTICAL_GUIDES:
				return NotationPackage.GUIDE_STYLE__VERTICAL_GUIDES;
			default:
				return -1;
			}
		}
		if (baseClass == DescriptionStyle.class) {
			switch (derivedFeatureID) {
			case NotationPackage.DIAGRAM_STYLE__DESCRIPTION:
				return NotationPackage.DESCRIPTION_STYLE__DESCRIPTION;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == GuideStyle.class) {
			switch (baseFeatureID) {
			case NotationPackage.GUIDE_STYLE__HORIZONTAL_GUIDES:
				return NotationPackage.DIAGRAM_STYLE__HORIZONTAL_GUIDES;
			case NotationPackage.GUIDE_STYLE__VERTICAL_GUIDES:
				return NotationPackage.DIAGRAM_STYLE__VERTICAL_GUIDES;
			default:
				return -1;
			}
		}
		if (baseClass == DescriptionStyle.class) {
			switch (baseFeatureID) {
			case NotationPackage.DESCRIPTION_STYLE__DESCRIPTION:
				return NotationPackage.DIAGRAM_STYLE__DESCRIPTION;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: "); //$NON-NLS-1$
		result.append(description);
		result.append(')');
		return result.toString();
	}

} // DiagramStyleImpl
