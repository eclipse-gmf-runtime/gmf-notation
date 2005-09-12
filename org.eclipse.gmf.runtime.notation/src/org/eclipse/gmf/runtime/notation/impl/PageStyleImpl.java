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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.PageStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.PageStyleImpl#getPageX <em>Page X</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.PageStyleImpl#getPageY <em>Page Y</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.PageStyleImpl#getPageWidth <em>Page Width</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.PageStyleImpl#getPageHeight <em>Page Height</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
/*
 * @canBeSeenBy org.eclipse.gmf.runtime.notation.*
 */
public class PageStyleImpl extends EObjectImpl implements PageStyle {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.eINSTANCE.getPageStyle();
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
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.PAGE_STYLE__PAGE_X, oldPageX, pageX));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.PAGE_STYLE__PAGE_Y, oldPageY, pageY));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.PAGE_STYLE__PAGE_WIDTH, oldPageWidth, pageWidth));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.PAGE_STYLE__PAGE_HEIGHT, oldPageHeight, pageHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case NotationPackage.PAGE_STYLE__PAGE_X:
				return new Integer(getPageX());
			case NotationPackage.PAGE_STYLE__PAGE_Y:
				return new Integer(getPageY());
			case NotationPackage.PAGE_STYLE__PAGE_WIDTH:
				return new Integer(getPageWidth());
			case NotationPackage.PAGE_STYLE__PAGE_HEIGHT:
				return new Integer(getPageHeight());
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
			case NotationPackage.PAGE_STYLE__PAGE_X:
				setPageX(((Integer)newValue).intValue());
				return;
			case NotationPackage.PAGE_STYLE__PAGE_Y:
				setPageY(((Integer)newValue).intValue());
				return;
			case NotationPackage.PAGE_STYLE__PAGE_WIDTH:
				setPageWidth(((Integer)newValue).intValue());
				return;
			case NotationPackage.PAGE_STYLE__PAGE_HEIGHT:
				setPageHeight(((Integer)newValue).intValue());
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
			case NotationPackage.PAGE_STYLE__PAGE_X:
				setPageX(PAGE_X_EDEFAULT);
				return;
			case NotationPackage.PAGE_STYLE__PAGE_Y:
				setPageY(PAGE_Y_EDEFAULT);
				return;
			case NotationPackage.PAGE_STYLE__PAGE_WIDTH:
				setPageWidth(PAGE_WIDTH_EDEFAULT);
				return;
			case NotationPackage.PAGE_STYLE__PAGE_HEIGHT:
				setPageHeight(PAGE_HEIGHT_EDEFAULT);
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
			case NotationPackage.PAGE_STYLE__PAGE_X:
				return pageX != PAGE_X_EDEFAULT;
			case NotationPackage.PAGE_STYLE__PAGE_Y:
				return pageY != PAGE_Y_EDEFAULT;
			case NotationPackage.PAGE_STYLE__PAGE_WIDTH:
				return pageWidth != PAGE_WIDTH_EDEFAULT;
			case NotationPackage.PAGE_STYLE__PAGE_HEIGHT:
				return pageHeight != PAGE_HEIGHT_EDEFAULT;
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
		result.append(" (pageX: "); //$NON-NLS-1$
		result.append(pageX);
		result.append(", pageY: "); //$NON-NLS-1$
		result.append(pageY);
		result.append(", pageWidth: "); //$NON-NLS-1$
		result.append(pageWidth);
		result.append(", pageHeight: "); //$NON-NLS-1$
		result.append(pageHeight);
		result.append(')');
		return result.toString();
	}

} //PageStyleImpl
