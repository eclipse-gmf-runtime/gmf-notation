/******************************************************************************
 * Copyright (c) 2004, 2009 IBM Corporation and others.
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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.gmf.runtime.notation.FillStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.datatype.GradientData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fill Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.FillStyleImpl#getFillColor <em>Fill Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.FillStyleImpl#getTransparency <em>Transparency</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.FillStyleImpl#getGradient <em>Gradient</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public class FillStyleImpl extends MinimalEObjectImpl.Container implements FillStyle {
    /**
	 * The default value of the '{@link #getFillColor() <em>Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillColor()
	 * @generated
	 * @ordered
	 */
	protected static final int FILL_COLOR_EDEFAULT = 16777215;

    /**
	 * The cached value of the '{@link #getFillColor() <em>Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillColor()
	 * @generated
	 * @ordered
	 */
	protected int fillColor = FILL_COLOR_EDEFAULT;

    /**
	 * The default value of the '{@link #getTransparency() <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransparency()
	 * @generated
	 * @ordered
	 */
	protected static final int TRANSPARENCY_EDEFAULT = -1;

				/**
	 * The cached value of the '{@link #getTransparency() <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransparency()
	 * @generated
	 * @ordered
	 */
	protected int transparency = TRANSPARENCY_EDEFAULT;

				/**
	 * The default value of the '{@link #getGradient() <em>Gradient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradient()
	 * @generated
	 * @ordered
	 */
	protected static final GradientData GRADIENT_EDEFAULT = null;

				/**
	 * The cached value of the '{@link #getGradient() <em>Gradient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradient()
	 * @generated
	 * @ordered
	 */
	protected GradientData gradient = GRADIENT_EDEFAULT;

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FillStyleImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.FILL_STYLE;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFillColor() {
		return fillColor;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillColor(int newFillColor) {
		int oldFillColor = fillColor;
		fillColor = newFillColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.FILL_STYLE__FILL_COLOR, oldFillColor, fillColor));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTransparency() {
		return transparency;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransparency(int newTransparency) {
		int oldTransparency = transparency;
		transparency = newTransparency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.FILL_STYLE__TRANSPARENCY, oldTransparency, transparency));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradientData getGradient() {
		return gradient;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGradient(GradientData newGradient) {
		GradientData oldGradient = gradient;
		gradient = newGradient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.FILL_STYLE__GRADIENT, oldGradient, gradient));
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.FILL_STYLE__FILL_COLOR:
				return new Integer(getFillColor());
			case NotationPackage.FILL_STYLE__TRANSPARENCY:
				return new Integer(getTransparency());
			case NotationPackage.FILL_STYLE__GRADIENT:
				return getGradient();
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
			case NotationPackage.FILL_STYLE__FILL_COLOR:
				setFillColor(((Integer)newValue).intValue());
				return;
			case NotationPackage.FILL_STYLE__TRANSPARENCY:
				setTransparency(((Integer)newValue).intValue());
				return;
			case NotationPackage.FILL_STYLE__GRADIENT:
				setGradient((GradientData)newValue);
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
			case NotationPackage.FILL_STYLE__FILL_COLOR:
				setFillColor(FILL_COLOR_EDEFAULT);
				return;
			case NotationPackage.FILL_STYLE__TRANSPARENCY:
				setTransparency(TRANSPARENCY_EDEFAULT);
				return;
			case NotationPackage.FILL_STYLE__GRADIENT:
				setGradient(GRADIENT_EDEFAULT);
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
			case NotationPackage.FILL_STYLE__FILL_COLOR:
				return fillColor != FILL_COLOR_EDEFAULT;
			case NotationPackage.FILL_STYLE__TRANSPARENCY:
				return transparency != TRANSPARENCY_EDEFAULT;
			case NotationPackage.FILL_STYLE__GRADIENT:
				return GRADIENT_EDEFAULT == null ? gradient != null : !GRADIENT_EDEFAULT.equals(gradient);
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
		result.append(" (fillColor: "); //$NON-NLS-1$
		result.append(fillColor);
		result.append(", transparency: "); //$NON-NLS-1$
		result.append(transparency);
		result.append(", gradient: "); //$NON-NLS-1$
		result.append(gradient);
		result.append(')');
		return result.toString();
	}

} //FillStyleImpl
