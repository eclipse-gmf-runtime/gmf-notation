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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gmf.runtime.notation.DescriptionStyle;
import org.eclipse.gmf.runtime.notation.DiagramStyle;
import org.eclipse.gmf.runtime.notation.Guide;
import org.eclipse.gmf.runtime.notation.GuideStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.PageStyle;
import org.eclipse.gmf.runtime.notation.Style;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.DiagramStyleImpl#getPageX <em>Page X</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.DiagramStyleImpl#getPageY <em>Page Y</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.DiagramStyleImpl#getPageWidth <em>Page Width</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.DiagramStyleImpl#getPageHeight <em>Page Height</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.DiagramStyleImpl#getHorizontalGuides <em>Horizontal Guides</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.DiagramStyleImpl#getVerticalGuides <em>Vertical Guides</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.DiagramStyleImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public class DiagramStyleImpl extends EObjectImpl implements DiagramStyle {
	/**
	 * The default value of the '{@link #getPageX() <em>Page X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageX()
	 * @generated
	 * @ordered
	 */
	protected static final int PAGE_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPageX() <em>Page X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageX()
	 * @generated
	 * @ordered
	 */
	protected int pageX = PAGE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getPageY() <em>Page Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageY()
	 * @generated
	 * @ordered
	 */
	protected static final int PAGE_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPageY() <em>Page Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageY()
	 * @generated
	 * @ordered
	 */
	protected int pageY = PAGE_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getPageWidth() <em>Page Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int PAGE_WIDTH_EDEFAULT = 100;

	/**
	 * The cached value of the '{@link #getPageWidth() <em>Page Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageWidth()
	 * @generated
	 * @ordered
	 */
	protected int pageWidth = PAGE_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPageHeight() <em>Page Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int PAGE_HEIGHT_EDEFAULT = 100;

	/**
	 * The cached value of the '{@link #getPageHeight() <em>Page Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageHeight()
	 * @generated
	 * @ordered
	 */
	protected int pageHeight = PAGE_HEIGHT_EDEFAULT;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.eINSTANCE.getDiagramStyle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPageX() {
		return pageX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageX(int newPageX) {
		int oldPageX = pageX;
		pageX = newPageX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.DIAGRAM_STYLE__PAGE_X, oldPageX, pageX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPageY() {
		return pageY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageY(int newPageY) {
		int oldPageY = pageY;
		pageY = newPageY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.DIAGRAM_STYLE__PAGE_Y, oldPageY, pageY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPageWidth() {
		return pageWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageWidth(int newPageWidth) {
		int oldPageWidth = pageWidth;
		pageWidth = newPageWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.DIAGRAM_STYLE__PAGE_WIDTH, oldPageWidth, pageWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPageHeight() {
		return pageHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageHeight(int newPageHeight) {
		int oldPageHeight = pageHeight;
		pageHeight = newPageHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.DIAGRAM_STYLE__PAGE_HEIGHT, oldPageHeight, pageHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getHorizontalGuides() {
		if (horizontalGuides == null) {
			horizontalGuides = new EObjectContainmentEList(Guide.class, this, NotationPackage.DIAGRAM_STYLE__HORIZONTAL_GUIDES);
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
			verticalGuides = new EObjectContainmentEList(Guide.class, this, NotationPackage.DIAGRAM_STYLE__VERTICAL_GUIDES);
		}
		return verticalGuides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.DIAGRAM_STYLE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case NotationPackage.DIAGRAM_STYLE__HORIZONTAL_GUIDES:
					return ((InternalEList)getHorizontalGuides()).basicRemove(otherEnd, msgs);
				case NotationPackage.DIAGRAM_STYLE__VERTICAL_GUIDES:
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
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case NotationPackage.DIAGRAM_STYLE__PAGE_X:
				setPageX(((Integer)newValue).intValue());
				return;
			case NotationPackage.DIAGRAM_STYLE__PAGE_Y:
				setPageY(((Integer)newValue).intValue());
				return;
			case NotationPackage.DIAGRAM_STYLE__PAGE_WIDTH:
				setPageWidth(((Integer)newValue).intValue());
				return;
			case NotationPackage.DIAGRAM_STYLE__PAGE_HEIGHT:
				setPageHeight(((Integer)newValue).intValue());
				return;
			case NotationPackage.DIAGRAM_STYLE__HORIZONTAL_GUIDES:
				getHorizontalGuides().clear();
				getHorizontalGuides().addAll((Collection)newValue);
				return;
			case NotationPackage.DIAGRAM_STYLE__VERTICAL_GUIDES:
				getVerticalGuides().clear();
				getVerticalGuides().addAll((Collection)newValue);
				return;
			case NotationPackage.DIAGRAM_STYLE__DESCRIPTION:
				setDescription((String)newValue);
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
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
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
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == Style.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PageStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.DIAGRAM_STYLE__PAGE_X: return NotationPackage.PAGE_STYLE__PAGE_X;
				case NotationPackage.DIAGRAM_STYLE__PAGE_Y: return NotationPackage.PAGE_STYLE__PAGE_Y;
				case NotationPackage.DIAGRAM_STYLE__PAGE_WIDTH: return NotationPackage.PAGE_STYLE__PAGE_WIDTH;
				case NotationPackage.DIAGRAM_STYLE__PAGE_HEIGHT: return NotationPackage.PAGE_STYLE__PAGE_HEIGHT;
				default: return -1;
			}
		}
		if (baseClass == GuideStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.DIAGRAM_STYLE__HORIZONTAL_GUIDES: return NotationPackage.GUIDE_STYLE__HORIZONTAL_GUIDES;
				case NotationPackage.DIAGRAM_STYLE__VERTICAL_GUIDES: return NotationPackage.GUIDE_STYLE__VERTICAL_GUIDES;
				default: return -1;
			}
		}
		if (baseClass == DescriptionStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.DIAGRAM_STYLE__DESCRIPTION: return NotationPackage.DESCRIPTION_STYLE__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == Style.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PageStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.PAGE_STYLE__PAGE_X: return NotationPackage.DIAGRAM_STYLE__PAGE_X;
				case NotationPackage.PAGE_STYLE__PAGE_Y: return NotationPackage.DIAGRAM_STYLE__PAGE_Y;
				case NotationPackage.PAGE_STYLE__PAGE_WIDTH: return NotationPackage.DIAGRAM_STYLE__PAGE_WIDTH;
				case NotationPackage.PAGE_STYLE__PAGE_HEIGHT: return NotationPackage.DIAGRAM_STYLE__PAGE_HEIGHT;
				default: return -1;
			}
		}
		if (baseClass == GuideStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.GUIDE_STYLE__HORIZONTAL_GUIDES: return NotationPackage.DIAGRAM_STYLE__HORIZONTAL_GUIDES;
				case NotationPackage.GUIDE_STYLE__VERTICAL_GUIDES: return NotationPackage.DIAGRAM_STYLE__VERTICAL_GUIDES;
				default: return -1;
			}
		}
		if (baseClass == DescriptionStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.DESCRIPTION_STYLE__DESCRIPTION: return NotationPackage.DIAGRAM_STYLE__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (pageX: "); //$NON-NLS-1$
		result.append(pageX);
		result.append(", pageY: "); //$NON-NLS-1$
		result.append(pageY);
		result.append(", pageWidth: "); //$NON-NLS-1$
		result.append(pageWidth);
		result.append(", pageHeight: "); //$NON-NLS-1$
		result.append(pageHeight);
		result.append(", description: "); //$NON-NLS-1$
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //DiagramStyleImpl
