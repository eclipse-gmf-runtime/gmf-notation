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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmf.runtime.notation.JumpLinkStatus;
import org.eclipse.gmf.runtime.notation.JumpLinkType;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.RoutingStyle;
import org.eclipse.gmf.runtime.notation.Smoothness;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Routing Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.RoutingStyleImpl#getRouting <em>Routing</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.RoutingStyleImpl#getSmoothness <em>Smoothness</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.RoutingStyleImpl#isAvoidObstructions <em>Avoid Obstructions</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.RoutingStyleImpl#isClosestDistance <em>Closest Distance</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.RoutingStyleImpl#getJumpLinkStatus <em>Jump Link Status</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.RoutingStyleImpl#getJumpLinkType <em>Jump Link Type</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.RoutingStyleImpl#isJumpLinksReverse <em>Jump Links Reverse</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
/*
 * @canBeSeenBy org.eclipse.gmf.runtime.notation.*
 */
public class RoutingStyleImpl extends NotationObjectImpl implements RoutingStyle {
    /**
	 * The default value of the '{@link #getRouting() <em>Routing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouting()
	 * @generated
	 * @ordered
	 */
	protected static final Routing ROUTING_EDEFAULT = Routing.MANUAL_LITERAL;

    /**
	 * The cached value of the '{@link #getRouting() <em>Routing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouting()
	 * @generated
	 * @ordered
	 */
	protected Routing routing = ROUTING_EDEFAULT;

    /**
	 * The default value of the '{@link #getSmoothness() <em>Smoothness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmoothness()
	 * @generated
	 * @ordered
	 */
	protected static final Smoothness SMOOTHNESS_EDEFAULT = Smoothness.NONE_LITERAL;

    /**
	 * The cached value of the '{@link #getSmoothness() <em>Smoothness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmoothness()
	 * @generated
	 * @ordered
	 */
	protected Smoothness smoothness = SMOOTHNESS_EDEFAULT;

    /**
	 * The default value of the '{@link #isAvoidObstructions() <em>Avoid Obstructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvoidObstructions()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AVOID_OBSTRUCTIONS_EDEFAULT = false;

    /**
	 * The flag representing the value of the '{@link #isAvoidObstructions() <em>Avoid Obstructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvoidObstructions()
	 * @generated
	 * @ordered
	 */
	protected static final int AVOID_OBSTRUCTIONS_EFLAG = 1 << 8;

    /**
	 * The default value of the '{@link #isClosestDistance() <em>Closest Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClosestDistance()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLOSEST_DISTANCE_EDEFAULT = false;

    /**
	 * The flag representing the value of the '{@link #isClosestDistance() <em>Closest Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClosestDistance()
	 * @generated
	 * @ordered
	 */
	protected static final int CLOSEST_DISTANCE_EFLAG = 1 << 9;

    /**
	 * The default value of the '{@link #getJumpLinkStatus() <em>Jump Link Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJumpLinkStatus()
	 * @generated
	 * @ordered
	 */
	protected static final JumpLinkStatus JUMP_LINK_STATUS_EDEFAULT = JumpLinkStatus.NONE_LITERAL;

    /**
	 * The cached value of the '{@link #getJumpLinkStatus() <em>Jump Link Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJumpLinkStatus()
	 * @generated
	 * @ordered
	 */
	protected JumpLinkStatus jumpLinkStatus = JUMP_LINK_STATUS_EDEFAULT;

    /**
	 * The default value of the '{@link #getJumpLinkType() <em>Jump Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJumpLinkType()
	 * @generated
	 * @ordered
	 */
	protected static final JumpLinkType JUMP_LINK_TYPE_EDEFAULT = JumpLinkType.SEMICIRCLE_LITERAL;

    /**
	 * The cached value of the '{@link #getJumpLinkType() <em>Jump Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJumpLinkType()
	 * @generated
	 * @ordered
	 */
	protected JumpLinkType jumpLinkType = JUMP_LINK_TYPE_EDEFAULT;

    /**
	 * The default value of the '{@link #isJumpLinksReverse() <em>Jump Links Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isJumpLinksReverse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean JUMP_LINKS_REVERSE_EDEFAULT = false;

    /**
	 * The flag representing the value of the '{@link #isJumpLinksReverse() <em>Jump Links Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isJumpLinksReverse()
	 * @generated
	 * @ordered
	 */
	protected static final int JUMP_LINKS_REVERSE_EFLAG = 1 << 10;

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoutingStyleImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.ROUTING_STYLE;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Routing getRouting() {
		return routing;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouting(Routing newRouting) {
		Routing oldRouting = routing;
		routing = newRouting == null ? ROUTING_EDEFAULT : newRouting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.ROUTING_STYLE__ROUTING, oldRouting, routing));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Smoothness getSmoothness() {
		return smoothness;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmoothness(Smoothness newSmoothness) {
		Smoothness oldSmoothness = smoothness;
		smoothness = newSmoothness == null ? SMOOTHNESS_EDEFAULT : newSmoothness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.ROUTING_STYLE__SMOOTHNESS, oldSmoothness, smoothness));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAvoidObstructions() {
		return (eFlags & AVOID_OBSTRUCTIONS_EFLAG) != 0;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvoidObstructions(boolean newAvoidObstructions) {
		boolean oldAvoidObstructions = (eFlags & AVOID_OBSTRUCTIONS_EFLAG) != 0;
		if (newAvoidObstructions) eFlags |= AVOID_OBSTRUCTIONS_EFLAG; else eFlags &= ~AVOID_OBSTRUCTIONS_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.ROUTING_STYLE__AVOID_OBSTRUCTIONS, oldAvoidObstructions, newAvoidObstructions));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClosestDistance() {
		return (eFlags & CLOSEST_DISTANCE_EFLAG) != 0;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosestDistance(boolean newClosestDistance) {
		boolean oldClosestDistance = (eFlags & CLOSEST_DISTANCE_EFLAG) != 0;
		if (newClosestDistance) eFlags |= CLOSEST_DISTANCE_EFLAG; else eFlags &= ~CLOSEST_DISTANCE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.ROUTING_STYLE__CLOSEST_DISTANCE, oldClosestDistance, newClosestDistance));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JumpLinkStatus getJumpLinkStatus() {
		return jumpLinkStatus;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJumpLinkStatus(JumpLinkStatus newJumpLinkStatus) {
		JumpLinkStatus oldJumpLinkStatus = jumpLinkStatus;
		jumpLinkStatus = newJumpLinkStatus == null ? JUMP_LINK_STATUS_EDEFAULT : newJumpLinkStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.ROUTING_STYLE__JUMP_LINK_STATUS, oldJumpLinkStatus, jumpLinkStatus));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JumpLinkType getJumpLinkType() {
		return jumpLinkType;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJumpLinkType(JumpLinkType newJumpLinkType) {
		JumpLinkType oldJumpLinkType = jumpLinkType;
		jumpLinkType = newJumpLinkType == null ? JUMP_LINK_TYPE_EDEFAULT : newJumpLinkType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.ROUTING_STYLE__JUMP_LINK_TYPE, oldJumpLinkType, jumpLinkType));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isJumpLinksReverse() {
		return (eFlags & JUMP_LINKS_REVERSE_EFLAG) != 0;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJumpLinksReverse(boolean newJumpLinksReverse) {
		boolean oldJumpLinksReverse = (eFlags & JUMP_LINKS_REVERSE_EFLAG) != 0;
		if (newJumpLinksReverse) eFlags |= JUMP_LINKS_REVERSE_EFLAG; else eFlags &= ~JUMP_LINKS_REVERSE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.ROUTING_STYLE__JUMP_LINKS_REVERSE, oldJumpLinksReverse, newJumpLinksReverse));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.ROUTING_STYLE__UUID:
				return getUUID();
			case NotationPackage.ROUTING_STYLE__ROUTING:
				return getRouting();
			case NotationPackage.ROUTING_STYLE__SMOOTHNESS:
				return getSmoothness();
			case NotationPackage.ROUTING_STYLE__AVOID_OBSTRUCTIONS:
				return isAvoidObstructions() ? Boolean.TRUE : Boolean.FALSE;
			case NotationPackage.ROUTING_STYLE__CLOSEST_DISTANCE:
				return isClosestDistance() ? Boolean.TRUE : Boolean.FALSE;
			case NotationPackage.ROUTING_STYLE__JUMP_LINK_STATUS:
				return getJumpLinkStatus();
			case NotationPackage.ROUTING_STYLE__JUMP_LINK_TYPE:
				return getJumpLinkType();
			case NotationPackage.ROUTING_STYLE__JUMP_LINKS_REVERSE:
				return isJumpLinksReverse() ? Boolean.TRUE : Boolean.FALSE;
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
			case NotationPackage.ROUTING_STYLE__UUID:
				setUUID((byte[])newValue);
				return;
			case NotationPackage.ROUTING_STYLE__ROUTING:
				setRouting((Routing)newValue);
				return;
			case NotationPackage.ROUTING_STYLE__SMOOTHNESS:
				setSmoothness((Smoothness)newValue);
				return;
			case NotationPackage.ROUTING_STYLE__AVOID_OBSTRUCTIONS:
				setAvoidObstructions(((Boolean)newValue).booleanValue());
				return;
			case NotationPackage.ROUTING_STYLE__CLOSEST_DISTANCE:
				setClosestDistance(((Boolean)newValue).booleanValue());
				return;
			case NotationPackage.ROUTING_STYLE__JUMP_LINK_STATUS:
				setJumpLinkStatus((JumpLinkStatus)newValue);
				return;
			case NotationPackage.ROUTING_STYLE__JUMP_LINK_TYPE:
				setJumpLinkType((JumpLinkType)newValue);
				return;
			case NotationPackage.ROUTING_STYLE__JUMP_LINKS_REVERSE:
				setJumpLinksReverse(((Boolean)newValue).booleanValue());
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
			case NotationPackage.ROUTING_STYLE__UUID:
				setUUID(UUID_EDEFAULT);
				return;
			case NotationPackage.ROUTING_STYLE__ROUTING:
				setRouting(ROUTING_EDEFAULT);
				return;
			case NotationPackage.ROUTING_STYLE__SMOOTHNESS:
				setSmoothness(SMOOTHNESS_EDEFAULT);
				return;
			case NotationPackage.ROUTING_STYLE__AVOID_OBSTRUCTIONS:
				setAvoidObstructions(AVOID_OBSTRUCTIONS_EDEFAULT);
				return;
			case NotationPackage.ROUTING_STYLE__CLOSEST_DISTANCE:
				setClosestDistance(CLOSEST_DISTANCE_EDEFAULT);
				return;
			case NotationPackage.ROUTING_STYLE__JUMP_LINK_STATUS:
				setJumpLinkStatus(JUMP_LINK_STATUS_EDEFAULT);
				return;
			case NotationPackage.ROUTING_STYLE__JUMP_LINK_TYPE:
				setJumpLinkType(JUMP_LINK_TYPE_EDEFAULT);
				return;
			case NotationPackage.ROUTING_STYLE__JUMP_LINKS_REVERSE:
				setJumpLinksReverse(JUMP_LINKS_REVERSE_EDEFAULT);
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
			case NotationPackage.ROUTING_STYLE__UUID:
				return UUID_EDEFAULT == null ? uUID != null : !UUID_EDEFAULT.equals(uUID);
			case NotationPackage.ROUTING_STYLE__ROUTING:
				return routing != ROUTING_EDEFAULT;
			case NotationPackage.ROUTING_STYLE__SMOOTHNESS:
				return smoothness != SMOOTHNESS_EDEFAULT;
			case NotationPackage.ROUTING_STYLE__AVOID_OBSTRUCTIONS:
				return ((eFlags & AVOID_OBSTRUCTIONS_EFLAG) != 0) != AVOID_OBSTRUCTIONS_EDEFAULT;
			case NotationPackage.ROUTING_STYLE__CLOSEST_DISTANCE:
				return ((eFlags & CLOSEST_DISTANCE_EFLAG) != 0) != CLOSEST_DISTANCE_EDEFAULT;
			case NotationPackage.ROUTING_STYLE__JUMP_LINK_STATUS:
				return jumpLinkStatus != JUMP_LINK_STATUS_EDEFAULT;
			case NotationPackage.ROUTING_STYLE__JUMP_LINK_TYPE:
				return jumpLinkType != JUMP_LINK_TYPE_EDEFAULT;
			case NotationPackage.ROUTING_STYLE__JUMP_LINKS_REVERSE:
				return ((eFlags & JUMP_LINKS_REVERSE_EFLAG) != 0) != JUMP_LINKS_REVERSE_EDEFAULT;
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
		result.append(" (routing: "); //$NON-NLS-1$
		result.append(routing);
		result.append(", smoothness: "); //$NON-NLS-1$
		result.append(smoothness);
		result.append(", avoidObstructions: "); //$NON-NLS-1$
		result.append((eFlags & AVOID_OBSTRUCTIONS_EFLAG) != 0);
		result.append(", closestDistance: "); //$NON-NLS-1$
		result.append((eFlags & CLOSEST_DISTANCE_EFLAG) != 0);
		result.append(", jumpLinkStatus: "); //$NON-NLS-1$
		result.append(jumpLinkStatus);
		result.append(", jumpLinkType: "); //$NON-NLS-1$
		result.append(jumpLinkType);
		result.append(", jumpLinksReverse: "); //$NON-NLS-1$
		result.append((eFlags & JUMP_LINKS_REVERSE_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

} //RoutingStyleImpl
