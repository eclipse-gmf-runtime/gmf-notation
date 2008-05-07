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
public class ArrowStyleImpl extends NotationEObjectImpl implements ArrowStyle {
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
	 * The offset of the flags representing the value of the '{@link #getArrowSource() <em>Arrow Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int ARROW_SOURCE_EFLAG_OFFSET = 8;

	/**
	 * The flags representing the default value of the '{@link #getArrowSource() <em>Arrow Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int ARROW_SOURCE_EFLAG_DEFAULT = ArrowType.VALUES.indexOf(ARROW_SOURCE_EDEFAULT) << ARROW_SOURCE_EFLAG_OFFSET;

	/**
	 * The array of enumeration values for '{@link ArrowType Arrow Type}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	private static final ArrowType[] ARROW_SOURCE_EFLAG_VALUES = (ArrowType[])ArrowType.VALUES.toArray(new ArrowType[ArrowType.VALUES.size()]);

	/**
	 * The flags representing the value of the '{@link #getArrowSource() <em>Arrow Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrowSource()
	 * @generated
	 * @ordered
	 */
	protected static final int ARROW_SOURCE_EFLAG = 0x3 << ARROW_SOURCE_EFLAG_OFFSET;

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
	 * The offset of the flags representing the value of the '{@link #getArrowTarget() <em>Arrow Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int ARROW_TARGET_EFLAG_OFFSET = 10;

	/**
	 * The flags representing the default value of the '{@link #getArrowTarget() <em>Arrow Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int ARROW_TARGET_EFLAG_DEFAULT = ArrowType.VALUES.indexOf(ARROW_TARGET_EDEFAULT) << ARROW_TARGET_EFLAG_OFFSET;

	/**
	 * The array of enumeration values for '{@link ArrowType Arrow Type}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	private static final ArrowType[] ARROW_TARGET_EFLAG_VALUES = (ArrowType[])ArrowType.VALUES.toArray(new ArrowType[ArrowType.VALUES.size()]);

	/**
	 * The flags representing the value of the '{@link #getArrowTarget() <em>Arrow Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrowTarget()
	 * @generated
	 * @ordered
	 */
	protected static final int ARROW_TARGET_EFLAG = 0x3 << ARROW_TARGET_EFLAG_OFFSET;

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
		return ARROW_SOURCE_EFLAG_VALUES[(eFlags & ARROW_SOURCE_EFLAG) >>> ARROW_SOURCE_EFLAG_OFFSET];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrowSource(ArrowType newArrowSource) {
		ArrowType oldArrowSource = ARROW_SOURCE_EFLAG_VALUES[(eFlags & ARROW_SOURCE_EFLAG) >>> ARROW_SOURCE_EFLAG_OFFSET];
		if (newArrowSource == null) newArrowSource = ARROW_SOURCE_EDEFAULT;
		eFlags = eFlags & ~ARROW_SOURCE_EFLAG | ArrowType.VALUES.indexOf(newArrowSource) << ARROW_SOURCE_EFLAG_OFFSET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.ARROW_STYLE__ARROW_SOURCE, oldArrowSource, newArrowSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrowType getArrowTarget() {
		return ARROW_TARGET_EFLAG_VALUES[(eFlags & ARROW_TARGET_EFLAG) >>> ARROW_TARGET_EFLAG_OFFSET];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrowTarget(ArrowType newArrowTarget) {
		ArrowType oldArrowTarget = ARROW_TARGET_EFLAG_VALUES[(eFlags & ARROW_TARGET_EFLAG) >>> ARROW_TARGET_EFLAG_OFFSET];
		if (newArrowTarget == null) newArrowTarget = ARROW_TARGET_EDEFAULT;
		eFlags = eFlags & ~ARROW_TARGET_EFLAG | ArrowType.VALUES.indexOf(newArrowTarget) << ARROW_TARGET_EFLAG_OFFSET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.ARROW_STYLE__ARROW_TARGET, oldArrowTarget, newArrowTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
			case NotationPackage.ARROW_STYLE__ARROW_SOURCE:
				return (eFlags & ARROW_SOURCE_EFLAG) != ARROW_SOURCE_EFLAG_DEFAULT;
			case NotationPackage.ARROW_STYLE__ARROW_TARGET:
				return (eFlags & ARROW_TARGET_EFLAG) != ARROW_TARGET_EFLAG_DEFAULT;
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
		result.append(ARROW_SOURCE_EFLAG_VALUES[(eFlags & ARROW_SOURCE_EFLAG) >>> ARROW_SOURCE_EFLAG_OFFSET]);
		result.append(", arrowTarget: "); //$NON-NLS-1$
		result.append(ARROW_TARGET_EFLAG_VALUES[(eFlags & ARROW_TARGET_EFLAG) >>> ARROW_TARGET_EFLAG_OFFSET]);
		result.append(')');
		return result.toString();
	}

} //ArrowStyleImpl
