/******************************************************************************
 * Copyright (c) 2008 IBM Corporation and others.
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

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.FlatEObjectImpl;

import org.eclipse.gmf.runtime.notation.ArrowStyle;
import org.eclipse.gmf.runtime.notation.ArrowType;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arrow Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ArrowStyleImpl#getArrowSource <em>Arrow Source</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ArrowStyleImpl#getArrowTarget <em>Arrow Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrowStyleImpl extends NotationObjectImpl implements ArrowStyle {
	/**
	 * The default value of the '{@link #getArrowSource() <em>Arrow Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrowSource()
	 * @generated
	 * @ordered
	 */
	protected static final ArrowType ARROW_SOURCE_EDEFAULT = ArrowType.NONE_LITERAL;

	/**
	 * The cached value of the '{@link #getArrowSource() <em>Arrow Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrowSource()
	 * @generated
	 * @ordered
	 */
	protected ArrowType arrowSource = ARROW_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getArrowTarget() <em>Arrow Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrowTarget()
	 * @generated
	 * @ordered
	 */
	protected static final ArrowType ARROW_TARGET_EDEFAULT = ArrowType.NONE_LITERAL;

	/**
	 * The cached value of the '{@link #getArrowTarget() <em>Arrow Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrowTarget()
	 * @generated
	 * @ordered
	 */
	protected ArrowType arrowTarget = ARROW_TARGET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrowStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.ARROW_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrowType getArrowSource() {
		return arrowSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrowSource(ArrowType newArrowSource) {
		ArrowType oldArrowSource = arrowSource;
		arrowSource = newArrowSource == null ? ARROW_SOURCE_EDEFAULT : newArrowSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.ARROW_STYLE__ARROW_SOURCE, oldArrowSource, arrowSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrowType getArrowTarget() {
		return arrowTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrowTarget(ArrowType newArrowTarget) {
		ArrowType oldArrowTarget = arrowTarget;
		arrowTarget = newArrowTarget == null ? ARROW_TARGET_EDEFAULT : newArrowTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.ARROW_STYLE__ARROW_TARGET, oldArrowTarget, arrowTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.ARROW_STYLE__UUID:
				return getUUID();
			case NotationPackage.ARROW_STYLE__ARROW_SOURCE:
				return getArrowSource();
			case NotationPackage.ARROW_STYLE__ARROW_TARGET:
				return getArrowTarget();
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
			case NotationPackage.ARROW_STYLE__UUID:
				setUUID((byte[])newValue);
				return;
			case NotationPackage.ARROW_STYLE__ARROW_SOURCE:
				setArrowSource((ArrowType)newValue);
				return;
			case NotationPackage.ARROW_STYLE__ARROW_TARGET:
				setArrowTarget((ArrowType)newValue);
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
			case NotationPackage.ARROW_STYLE__UUID:
				setUUID(UUID_EDEFAULT);
				return;
			case NotationPackage.ARROW_STYLE__ARROW_SOURCE:
				setArrowSource(ARROW_SOURCE_EDEFAULT);
				return;
			case NotationPackage.ARROW_STYLE__ARROW_TARGET:
				setArrowTarget(ARROW_TARGET_EDEFAULT);
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
			case NotationPackage.ARROW_STYLE__UUID:
				return UUID_EDEFAULT == null ? uUID != null : !UUID_EDEFAULT.equals(uUID);
			case NotationPackage.ARROW_STYLE__ARROW_SOURCE:
				return arrowSource != ARROW_SOURCE_EDEFAULT;
			case NotationPackage.ARROW_STYLE__ARROW_TARGET:
				return arrowTarget != ARROW_TARGET_EDEFAULT;
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
		result.append(" (arrowSource: "); //$NON-NLS-1$
		result.append(arrowSource);
		result.append(", arrowTarget: "); //$NON-NLS-1$
		result.append(arrowTarget);
		result.append(')');
		return result.toString();
	}

} //ArrowStyleImpl
