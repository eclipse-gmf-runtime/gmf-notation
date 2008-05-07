/******************************************************************************
 * Copyright (c) 2004, 2008 IBM Corporation and others.
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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmf.runtime.notation.ConnectorStyle;
import org.eclipse.gmf.runtime.notation.JumpLinkStatus;
import org.eclipse.gmf.runtime.notation.JumpLinkType;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.NotationObject;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.RoutingStyle;
import org.eclipse.gmf.runtime.notation.Smoothness;
import org.eclipse.gmf.runtime.notation.Style;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ConnectorStyleImpl#getRouting <em>Routing</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ConnectorStyleImpl#getSmoothness <em>Smoothness</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ConnectorStyleImpl#isAvoidObstructions <em>Avoid Obstructions</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ConnectorStyleImpl#isClosestDistance <em>Closest Distance</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ConnectorStyleImpl#getJumpLinkStatus <em>Jump Link Status</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ConnectorStyleImpl#getJumpLinkType <em>Jump Link Type</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ConnectorStyleImpl#isJumpLinksReverse <em>Jump Links Reverse</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ConnectorStyleImpl#getLineColor <em>Line Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ConnectorStyleImpl#getLineWidth <em>Line Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public class ConnectorStyleImpl extends EObjectImpl implements ConnectorStyle {
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
	 * The offset of the flags representing the value of the '{@link #getRouting() <em>Routing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int ROUTING_EFLAG_OFFSET = 8;

				/**
	 * The flags representing the default value of the '{@link #getRouting() <em>Routing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int ROUTING_EFLAG_DEFAULT = Routing.VALUES.indexOf(ROUTING_EDEFAULT) << ROUTING_EFLAG_OFFSET;

				/**
	 * The array of enumeration values for '{@link Routing Routing}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	private static final Routing[] ROUTING_EFLAG_VALUES = (Routing[])Routing.VALUES.toArray(new Routing[Routing.VALUES.size()]);

				/**
	 * The flags representing the value of the '{@link #getRouting() <em>Routing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouting()
	 * @generated
	 * @ordered
	 */
	protected static final int ROUTING_EFLAG = 0x3 << ROUTING_EFLAG_OFFSET;

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
	 * The offset of the flags representing the value of the '{@link #getSmoothness() <em>Smoothness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int SMOOTHNESS_EFLAG_OFFSET = 10;

	/**
	 * The flags representing the default value of the '{@link #getSmoothness() <em>Smoothness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int SMOOTHNESS_EFLAG_DEFAULT = Smoothness.VALUES.indexOf(SMOOTHNESS_EDEFAULT) << SMOOTHNESS_EFLAG_OFFSET;

	/**
	 * The array of enumeration values for '{@link Smoothness Smoothness}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	private static final Smoothness[] SMOOTHNESS_EFLAG_VALUES = (Smoothness[])Smoothness.VALUES.toArray(new Smoothness[Smoothness.VALUES.size()]);

	/**
	 * The flags representing the value of the '{@link #getSmoothness() <em>Smoothness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmoothness()
	 * @generated
	 * @ordered
	 */
	protected static final int SMOOTHNESS_EFLAG = 0x3 << SMOOTHNESS_EFLAG_OFFSET;

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
	protected static final int AVOID_OBSTRUCTIONS_EFLAG = 1 << 12;

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
	protected static final int CLOSEST_DISTANCE_EFLAG = 1 << 13;

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
	 * The offset of the flags representing the value of the '{@link #getJumpLinkStatus() <em>Jump Link Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int JUMP_LINK_STATUS_EFLAG_OFFSET = 14;

	/**
	 * The flags representing the default value of the '{@link #getJumpLinkStatus() <em>Jump Link Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int JUMP_LINK_STATUS_EFLAG_DEFAULT = JumpLinkStatus.VALUES.indexOf(JUMP_LINK_STATUS_EDEFAULT) << JUMP_LINK_STATUS_EFLAG_OFFSET;

	/**
	 * The array of enumeration values for '{@link JumpLinkStatus Jump Link Status}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	private static final JumpLinkStatus[] JUMP_LINK_STATUS_EFLAG_VALUES = (JumpLinkStatus[])JumpLinkStatus.VALUES.toArray(new JumpLinkStatus[JumpLinkStatus.VALUES.size()]);

	/**
	 * The flags representing the value of the '{@link #getJumpLinkStatus() <em>Jump Link Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJumpLinkStatus()
	 * @generated
	 * @ordered
	 */
	protected static final int JUMP_LINK_STATUS_EFLAG = 0x3 << JUMP_LINK_STATUS_EFLAG_OFFSET;

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
	 * The offset of the flags representing the value of the '{@link #getJumpLinkType() <em>Jump Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int JUMP_LINK_TYPE_EFLAG_OFFSET = 16;

	/**
	 * The flags representing the default value of the '{@link #getJumpLinkType() <em>Jump Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int JUMP_LINK_TYPE_EFLAG_DEFAULT = JumpLinkType.VALUES.indexOf(JUMP_LINK_TYPE_EDEFAULT) << JUMP_LINK_TYPE_EFLAG_OFFSET;

	/**
	 * The array of enumeration values for '{@link JumpLinkType Jump Link Type}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	private static final JumpLinkType[] JUMP_LINK_TYPE_EFLAG_VALUES = (JumpLinkType[])JumpLinkType.VALUES.toArray(new JumpLinkType[JumpLinkType.VALUES.size()]);

	/**
	 * The flags representing the value of the '{@link #getJumpLinkType() <em>Jump Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJumpLinkType()
	 * @generated
	 * @ordered
	 */
	protected static final int JUMP_LINK_TYPE_EFLAG = 0x3 << JUMP_LINK_TYPE_EFLAG_OFFSET;

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
	protected static final int JUMP_LINKS_REVERSE_EFLAG = 1 << 18;

				/**
	 * The default value of the '{@link #getLineColor() <em>Line Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineColor()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_COLOR_EDEFAULT = 11579568;

    /**
	 * The cached value of the '{@link #getLineColor() <em>Line Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineColor()
	 * @generated
	 * @ordered
	 */
	protected int lineColor = LINE_COLOR_EDEFAULT;

    /**
	 * The default value of the '{@link #getLineWidth() <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_WIDTH_EDEFAULT = -1;

				/**
	 * The cached value of the '{@link #getLineWidth() <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineWidth()
	 * @generated
	 * @ordered
	 */
	protected int lineWidth = LINE_WIDTH_EDEFAULT;

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorStyleImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.CONNECTOR_STYLE;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Routing getRouting() {
		return ROUTING_EFLAG_VALUES[(eFlags & ROUTING_EFLAG) >>> ROUTING_EFLAG_OFFSET];
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouting(Routing newRouting) {
		Routing oldRouting = ROUTING_EFLAG_VALUES[(eFlags & ROUTING_EFLAG) >>> ROUTING_EFLAG_OFFSET];
		if (newRouting == null) newRouting = ROUTING_EDEFAULT;
		eFlags = eFlags & ~ROUTING_EFLAG | Routing.VALUES.indexOf(newRouting) << ROUTING_EFLAG_OFFSET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.CONNECTOR_STYLE__ROUTING, oldRouting, newRouting));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Smoothness getSmoothness() {
		return SMOOTHNESS_EFLAG_VALUES[(eFlags & SMOOTHNESS_EFLAG) >>> SMOOTHNESS_EFLAG_OFFSET];
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmoothness(Smoothness newSmoothness) {
		Smoothness oldSmoothness = SMOOTHNESS_EFLAG_VALUES[(eFlags & SMOOTHNESS_EFLAG) >>> SMOOTHNESS_EFLAG_OFFSET];
		if (newSmoothness == null) newSmoothness = SMOOTHNESS_EDEFAULT;
		eFlags = eFlags & ~SMOOTHNESS_EFLAG | Smoothness.VALUES.indexOf(newSmoothness) << SMOOTHNESS_EFLAG_OFFSET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.CONNECTOR_STYLE__SMOOTHNESS, oldSmoothness, newSmoothness));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.CONNECTOR_STYLE__AVOID_OBSTRUCTIONS, oldAvoidObstructions, newAvoidObstructions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.CONNECTOR_STYLE__CLOSEST_DISTANCE, oldClosestDistance, newClosestDistance));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JumpLinkStatus getJumpLinkStatus() {
		return JUMP_LINK_STATUS_EFLAG_VALUES[(eFlags & JUMP_LINK_STATUS_EFLAG) >>> JUMP_LINK_STATUS_EFLAG_OFFSET];
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJumpLinkStatus(JumpLinkStatus newJumpLinkStatus) {
		JumpLinkStatus oldJumpLinkStatus = JUMP_LINK_STATUS_EFLAG_VALUES[(eFlags & JUMP_LINK_STATUS_EFLAG) >>> JUMP_LINK_STATUS_EFLAG_OFFSET];
		if (newJumpLinkStatus == null) newJumpLinkStatus = JUMP_LINK_STATUS_EDEFAULT;
		eFlags = eFlags & ~JUMP_LINK_STATUS_EFLAG | JumpLinkStatus.VALUES.indexOf(newJumpLinkStatus) << JUMP_LINK_STATUS_EFLAG_OFFSET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.CONNECTOR_STYLE__JUMP_LINK_STATUS, oldJumpLinkStatus, newJumpLinkStatus));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JumpLinkType getJumpLinkType() {
		return JUMP_LINK_TYPE_EFLAG_VALUES[(eFlags & JUMP_LINK_TYPE_EFLAG) >>> JUMP_LINK_TYPE_EFLAG_OFFSET];
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJumpLinkType(JumpLinkType newJumpLinkType) {
		JumpLinkType oldJumpLinkType = JUMP_LINK_TYPE_EFLAG_VALUES[(eFlags & JUMP_LINK_TYPE_EFLAG) >>> JUMP_LINK_TYPE_EFLAG_OFFSET];
		if (newJumpLinkType == null) newJumpLinkType = JUMP_LINK_TYPE_EDEFAULT;
		eFlags = eFlags & ~JUMP_LINK_TYPE_EFLAG | JumpLinkType.VALUES.indexOf(newJumpLinkType) << JUMP_LINK_TYPE_EFLAG_OFFSET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.CONNECTOR_STYLE__JUMP_LINK_TYPE, oldJumpLinkType, newJumpLinkType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.CONNECTOR_STYLE__JUMP_LINKS_REVERSE, oldJumpLinksReverse, newJumpLinksReverse));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineColor() {
		return lineColor;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineColor(int newLineColor) {
		int oldLineColor = lineColor;
		lineColor = newLineColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.CONNECTOR_STYLE__LINE_COLOR, oldLineColor, lineColor));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineWidth() {
		return lineWidth;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineWidth(int newLineWidth) {
		int oldLineWidth = lineWidth;
		lineWidth = newLineWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.CONNECTOR_STYLE__LINE_WIDTH, oldLineWidth, lineWidth));
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.CONNECTOR_STYLE__ROUTING:
				return getRouting();
			case NotationPackage.CONNECTOR_STYLE__SMOOTHNESS:
				return getSmoothness();
			case NotationPackage.CONNECTOR_STYLE__AVOID_OBSTRUCTIONS:
				return isAvoidObstructions() ? Boolean.TRUE : Boolean.FALSE;
			case NotationPackage.CONNECTOR_STYLE__CLOSEST_DISTANCE:
				return isClosestDistance() ? Boolean.TRUE : Boolean.FALSE;
			case NotationPackage.CONNECTOR_STYLE__JUMP_LINK_STATUS:
				return getJumpLinkStatus();
			case NotationPackage.CONNECTOR_STYLE__JUMP_LINK_TYPE:
				return getJumpLinkType();
			case NotationPackage.CONNECTOR_STYLE__JUMP_LINKS_REVERSE:
				return isJumpLinksReverse() ? Boolean.TRUE : Boolean.FALSE;
			case NotationPackage.CONNECTOR_STYLE__LINE_COLOR:
				return new Integer(getLineColor());
			case NotationPackage.CONNECTOR_STYLE__LINE_WIDTH:
				return new Integer(getLineWidth());
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
			case NotationPackage.CONNECTOR_STYLE__ROUTING:
				setRouting((Routing)newValue);
				return;
			case NotationPackage.CONNECTOR_STYLE__SMOOTHNESS:
				setSmoothness((Smoothness)newValue);
				return;
			case NotationPackage.CONNECTOR_STYLE__AVOID_OBSTRUCTIONS:
				setAvoidObstructions(((Boolean)newValue).booleanValue());
				return;
			case NotationPackage.CONNECTOR_STYLE__CLOSEST_DISTANCE:
				setClosestDistance(((Boolean)newValue).booleanValue());
				return;
			case NotationPackage.CONNECTOR_STYLE__JUMP_LINK_STATUS:
				setJumpLinkStatus((JumpLinkStatus)newValue);
				return;
			case NotationPackage.CONNECTOR_STYLE__JUMP_LINK_TYPE:
				setJumpLinkType((JumpLinkType)newValue);
				return;
			case NotationPackage.CONNECTOR_STYLE__JUMP_LINKS_REVERSE:
				setJumpLinksReverse(((Boolean)newValue).booleanValue());
				return;
			case NotationPackage.CONNECTOR_STYLE__LINE_COLOR:
				setLineColor(((Integer)newValue).intValue());
				return;
			case NotationPackage.CONNECTOR_STYLE__LINE_WIDTH:
				setLineWidth(((Integer)newValue).intValue());
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
			case NotationPackage.CONNECTOR_STYLE__ROUTING:
				setRouting(ROUTING_EDEFAULT);
				return;
			case NotationPackage.CONNECTOR_STYLE__SMOOTHNESS:
				setSmoothness(SMOOTHNESS_EDEFAULT);
				return;
			case NotationPackage.CONNECTOR_STYLE__AVOID_OBSTRUCTIONS:
				setAvoidObstructions(AVOID_OBSTRUCTIONS_EDEFAULT);
				return;
			case NotationPackage.CONNECTOR_STYLE__CLOSEST_DISTANCE:
				setClosestDistance(CLOSEST_DISTANCE_EDEFAULT);
				return;
			case NotationPackage.CONNECTOR_STYLE__JUMP_LINK_STATUS:
				setJumpLinkStatus(JUMP_LINK_STATUS_EDEFAULT);
				return;
			case NotationPackage.CONNECTOR_STYLE__JUMP_LINK_TYPE:
				setJumpLinkType(JUMP_LINK_TYPE_EDEFAULT);
				return;
			case NotationPackage.CONNECTOR_STYLE__JUMP_LINKS_REVERSE:
				setJumpLinksReverse(JUMP_LINKS_REVERSE_EDEFAULT);
				return;
			case NotationPackage.CONNECTOR_STYLE__LINE_COLOR:
				setLineColor(LINE_COLOR_EDEFAULT);
				return;
			case NotationPackage.CONNECTOR_STYLE__LINE_WIDTH:
				setLineWidth(LINE_WIDTH_EDEFAULT);
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
			case NotationPackage.CONNECTOR_STYLE__ROUTING:
				return (eFlags & ROUTING_EFLAG) != ROUTING_EFLAG_DEFAULT;
			case NotationPackage.CONNECTOR_STYLE__SMOOTHNESS:
				return (eFlags & SMOOTHNESS_EFLAG) != SMOOTHNESS_EFLAG_DEFAULT;
			case NotationPackage.CONNECTOR_STYLE__AVOID_OBSTRUCTIONS:
				return ((eFlags & AVOID_OBSTRUCTIONS_EFLAG) != 0) != AVOID_OBSTRUCTIONS_EDEFAULT;
			case NotationPackage.CONNECTOR_STYLE__CLOSEST_DISTANCE:
				return ((eFlags & CLOSEST_DISTANCE_EFLAG) != 0) != CLOSEST_DISTANCE_EDEFAULT;
			case NotationPackage.CONNECTOR_STYLE__JUMP_LINK_STATUS:
				return (eFlags & JUMP_LINK_STATUS_EFLAG) != JUMP_LINK_STATUS_EFLAG_DEFAULT;
			case NotationPackage.CONNECTOR_STYLE__JUMP_LINK_TYPE:
				return (eFlags & JUMP_LINK_TYPE_EFLAG) != JUMP_LINK_TYPE_EFLAG_DEFAULT;
			case NotationPackage.CONNECTOR_STYLE__JUMP_LINKS_REVERSE:
				return ((eFlags & JUMP_LINKS_REVERSE_EFLAG) != 0) != JUMP_LINKS_REVERSE_EDEFAULT;
			case NotationPackage.CONNECTOR_STYLE__LINE_COLOR:
				return lineColor != LINE_COLOR_EDEFAULT;
			case NotationPackage.CONNECTOR_STYLE__LINE_WIDTH:
				return lineWidth != LINE_WIDTH_EDEFAULT;
		}
		return eDynamicIsSet(featureID);
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
		if (baseClass == RoutingStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.CONNECTOR_STYLE__ROUTING: return NotationPackage.ROUTING_STYLE__ROUTING;
				case NotationPackage.CONNECTOR_STYLE__SMOOTHNESS: return NotationPackage.ROUTING_STYLE__SMOOTHNESS;
				case NotationPackage.CONNECTOR_STYLE__AVOID_OBSTRUCTIONS: return NotationPackage.ROUTING_STYLE__AVOID_OBSTRUCTIONS;
				case NotationPackage.CONNECTOR_STYLE__CLOSEST_DISTANCE: return NotationPackage.ROUTING_STYLE__CLOSEST_DISTANCE;
				case NotationPackage.CONNECTOR_STYLE__JUMP_LINK_STATUS: return NotationPackage.ROUTING_STYLE__JUMP_LINK_STATUS;
				case NotationPackage.CONNECTOR_STYLE__JUMP_LINK_TYPE: return NotationPackage.ROUTING_STYLE__JUMP_LINK_TYPE;
				case NotationPackage.CONNECTOR_STYLE__JUMP_LINKS_REVERSE: return NotationPackage.ROUTING_STYLE__JUMP_LINKS_REVERSE;
				default: return -1;
			}
		}
		if (baseClass == LineStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.CONNECTOR_STYLE__LINE_COLOR: return NotationPackage.LINE_STYLE__LINE_COLOR;
				case NotationPackage.CONNECTOR_STYLE__LINE_WIDTH: return NotationPackage.LINE_STYLE__LINE_WIDTH;
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
		if (baseClass == RoutingStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.ROUTING_STYLE__ROUTING: return NotationPackage.CONNECTOR_STYLE__ROUTING;
				case NotationPackage.ROUTING_STYLE__SMOOTHNESS: return NotationPackage.CONNECTOR_STYLE__SMOOTHNESS;
				case NotationPackage.ROUTING_STYLE__AVOID_OBSTRUCTIONS: return NotationPackage.CONNECTOR_STYLE__AVOID_OBSTRUCTIONS;
				case NotationPackage.ROUTING_STYLE__CLOSEST_DISTANCE: return NotationPackage.CONNECTOR_STYLE__CLOSEST_DISTANCE;
				case NotationPackage.ROUTING_STYLE__JUMP_LINK_STATUS: return NotationPackage.CONNECTOR_STYLE__JUMP_LINK_STATUS;
				case NotationPackage.ROUTING_STYLE__JUMP_LINK_TYPE: return NotationPackage.CONNECTOR_STYLE__JUMP_LINK_TYPE;
				case NotationPackage.ROUTING_STYLE__JUMP_LINKS_REVERSE: return NotationPackage.CONNECTOR_STYLE__JUMP_LINKS_REVERSE;
				default: return -1;
			}
		}
		if (baseClass == LineStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.LINE_STYLE__LINE_COLOR: return NotationPackage.CONNECTOR_STYLE__LINE_COLOR;
				case NotationPackage.LINE_STYLE__LINE_WIDTH: return NotationPackage.CONNECTOR_STYLE__LINE_WIDTH;
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
		result.append(" (routing: "); //$NON-NLS-1$
		result.append(ROUTING_EFLAG_VALUES[(eFlags & ROUTING_EFLAG) >>> ROUTING_EFLAG_OFFSET]);
		result.append(", smoothness: "); //$NON-NLS-1$
		result.append(SMOOTHNESS_EFLAG_VALUES[(eFlags & SMOOTHNESS_EFLAG) >>> SMOOTHNESS_EFLAG_OFFSET]);
		result.append(", avoidObstructions: "); //$NON-NLS-1$
		result.append((eFlags & AVOID_OBSTRUCTIONS_EFLAG) != 0);
		result.append(", closestDistance: "); //$NON-NLS-1$
		result.append((eFlags & CLOSEST_DISTANCE_EFLAG) != 0);
		result.append(", jumpLinkStatus: "); //$NON-NLS-1$
		result.append(JUMP_LINK_STATUS_EFLAG_VALUES[(eFlags & JUMP_LINK_STATUS_EFLAG) >>> JUMP_LINK_STATUS_EFLAG_OFFSET]);
		result.append(", jumpLinkType: "); //$NON-NLS-1$
		result.append(JUMP_LINK_TYPE_EFLAG_VALUES[(eFlags & JUMP_LINK_TYPE_EFLAG) >>> JUMP_LINK_TYPE_EFLAG_OFFSET]);
		result.append(", jumpLinksReverse: "); //$NON-NLS-1$
		result.append((eFlags & JUMP_LINKS_REVERSE_EFLAG) != 0);
		result.append(", lineColor: "); //$NON-NLS-1$
		result.append(lineColor);
		result.append(", lineWidth: "); //$NON-NLS-1$
		result.append(lineWidth);
		result.append(')');
		return result.toString();
	}

} //ConnectorStyleImpl
