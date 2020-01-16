/******************************************************************************
 * Copyright (c) 2010 IBM Corporation and others.
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
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RoundedCornersStyle;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Rounded
 * Corners Style</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.gmf.runtime.notation.impl.RoundedCornersStyleImpl#getRoundedBendpointsRadius
 * <em>Rounded Bendpoints Radius</em>}</li>
 * </ul>
 *
 * @generated
 * @since 1.4
 */
public class RoundedCornersStyleImpl extends MinimalEObjectImpl.Container implements RoundedCornersStyle {
	/**
	 * The default value of the '{@link #getRoundedBendpointsRadius() <em>Rounded
	 * Bendpoints Radius</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getRoundedBendpointsRadius()
	 * @generated
	 * @ordered
	 */
	protected static final int ROUNDED_BENDPOINTS_RADIUS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRoundedBendpointsRadius() <em>Rounded
	 * Bendpoints Radius</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getRoundedBendpointsRadius()
	 * @generated
	 * @ordered
	 */
	protected int roundedBendpointsRadius = ROUNDED_BENDPOINTS_RADIUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RoundedCornersStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.ROUNDED_CORNERS_STYLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getRoundedBendpointsRadius() {
		return roundedBendpointsRadius;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRoundedBendpointsRadius(int newRoundedBendpointsRadius) {
		int oldRoundedBendpointsRadius = roundedBendpointsRadius;
		roundedBendpointsRadius = newRoundedBendpointsRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NotationPackage.ROUNDED_CORNERS_STYLE__ROUNDED_BENDPOINTS_RADIUS, oldRoundedBendpointsRadius,
					roundedBendpointsRadius));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NotationPackage.ROUNDED_CORNERS_STYLE__ROUNDED_BENDPOINTS_RADIUS:
			return new Integer(getRoundedBendpointsRadius());
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
		case NotationPackage.ROUNDED_CORNERS_STYLE__ROUNDED_BENDPOINTS_RADIUS:
			setRoundedBendpointsRadius(((Integer) newValue).intValue());
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
		case NotationPackage.ROUNDED_CORNERS_STYLE__ROUNDED_BENDPOINTS_RADIUS:
			setRoundedBendpointsRadius(ROUNDED_BENDPOINTS_RADIUS_EDEFAULT);
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
		case NotationPackage.ROUNDED_CORNERS_STYLE__ROUNDED_BENDPOINTS_RADIUS:
			return roundedBendpointsRadius != ROUNDED_BENDPOINTS_RADIUS_EDEFAULT;
		}
		return eDynamicIsSet(featureID);
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
		result.append(" (roundedBendpointsRadius: "); //$NON-NLS-1$
		result.append(roundedBendpointsRadius);
		result.append(')');
		return result.toString();
	}

} // RoundedCornersStyleImpl
