/******************************************************************************
 * Copyright (c) 2009 IBM Corporation and others.
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gmf.runtime.notation.Anchor;
import org.eclipse.gmf.runtime.notation.Bendpoints;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.ConnectorStyle;
import org.eclipse.gmf.runtime.notation.JumpLinkStatus;
import org.eclipse.gmf.runtime.notation.JumpLinkType;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.RoutingStyle;
import org.eclipse.gmf.runtime.notation.Smoothness;
import org.eclipse.gmf.runtime.notation.Style;
import org.eclipse.gmf.runtime.notation.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ConnectorImpl#getRouting <em>Routing</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ConnectorImpl#getSmoothness <em>Smoothness</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ConnectorImpl#isAvoidObstructions <em>Avoid Obstructions</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ConnectorImpl#isClosestDistance <em>Closest Distance</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ConnectorImpl#getJumpLinkStatus <em>Jump Link Status</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ConnectorImpl#getJumpLinkType <em>Jump Link Type</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ConnectorImpl#isJumpLinksReverse <em>Jump Links Reverse</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ConnectorImpl#getRoundedBendpointsRadius <em>Rounded Bendpoints Radius</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ConnectorImpl#getLineColor <em>Line Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ConnectorImpl#getLineWidth <em>Line Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorImpl extends EdgeImpl implements Connector {
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
	protected static final int ROUTING_EFLAG_OFFSET = 11;

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
	protected static final int SMOOTHNESS_EFLAG_OFFSET = 13;

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
	protected static final int AVOID_OBSTRUCTIONS_EFLAG = 1 << 15;

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
	protected static final int CLOSEST_DISTANCE_EFLAG = 1 << 16;

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
	protected static final int JUMP_LINK_STATUS_EFLAG_OFFSET = 17;

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
	protected static final int JUMP_LINK_TYPE_EFLAG_OFFSET = 19;

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
	protected static final int JUMP_LINKS_REVERSE_EFLAG = 1 << 21;

	/**
	 * The default value of the '{@link #getRoundedBendpointsRadius() <em>Rounded Bendpoints Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundedBendpointsRadius()
	 * @generated
	 * @ordered
	 */
	protected static final int ROUNDED_BENDPOINTS_RADIUS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRoundedBendpointsRadius() <em>Rounded Bendpoints Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundedBendpointsRadius()
	 * @generated
	 * @ordered
	 */
	protected int roundedBendpointsRadius = ROUNDED_BENDPOINTS_RADIUS_EDEFAULT;

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
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.CONNECTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.CONNECTOR__ROUTING, oldRouting, newRouting));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.CONNECTOR__SMOOTHNESS, oldSmoothness, newSmoothness));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.CONNECTOR__AVOID_OBSTRUCTIONS, oldAvoidObstructions, newAvoidObstructions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.CONNECTOR__CLOSEST_DISTANCE, oldClosestDistance, newClosestDistance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.CONNECTOR__JUMP_LINK_STATUS, oldJumpLinkStatus, newJumpLinkStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.CONNECTOR__JUMP_LINK_TYPE, oldJumpLinkType, newJumpLinkType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.CONNECTOR__JUMP_LINKS_REVERSE, oldJumpLinksReverse, newJumpLinksReverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoundedBendpointsRadius() {
		return roundedBendpointsRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoundedBendpointsRadius(int newRoundedBendpointsRadius) {
		int oldRoundedBendpointsRadius = roundedBendpointsRadius;
		roundedBendpointsRadius = newRoundedBendpointsRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.CONNECTOR__ROUNDED_BENDPOINTS_RADIUS, oldRoundedBendpointsRadius, roundedBendpointsRadius));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.CONNECTOR__LINE_COLOR, oldLineColor, lineColor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.CONNECTOR__LINE_WIDTH, oldLineWidth, lineWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.CONNECTOR__EANNOTATIONS:
				return getEAnnotations();
			case NotationPackage.CONNECTOR__VISIBLE:
				return isVisible() ? Boolean.TRUE : Boolean.FALSE;
			case NotationPackage.CONNECTOR__TYPE:
				return getType();
			case NotationPackage.CONNECTOR__MUTABLE:
				return isMutable() ? Boolean.TRUE : Boolean.FALSE;
			case NotationPackage.CONNECTOR__SOURCE_EDGES:
				return getSourceEdges();
			case NotationPackage.CONNECTOR__TARGET_EDGES:
				return getTargetEdges();
			case NotationPackage.CONNECTOR__PERSISTED_CHILDREN:
				return getPersistedChildren();
			case NotationPackage.CONNECTOR__STYLES:
				return getStyles();
			case NotationPackage.CONNECTOR__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
			case NotationPackage.CONNECTOR__DIAGRAM:
				if (resolve) return getDiagram();
				return basicGetDiagram();
			case NotationPackage.CONNECTOR__TRANSIENT_CHILDREN:
				return getTransientChildren();
			case NotationPackage.CONNECTOR__SOURCE:
				return getSource();
			case NotationPackage.CONNECTOR__TARGET:
				return getTarget();
			case NotationPackage.CONNECTOR__BENDPOINTS:
				return getBendpoints();
			case NotationPackage.CONNECTOR__SOURCE_ANCHOR:
				return getSourceAnchor();
			case NotationPackage.CONNECTOR__TARGET_ANCHOR:
				return getTargetAnchor();
			case NotationPackage.CONNECTOR__ROUTING:
				return getRouting();
			case NotationPackage.CONNECTOR__SMOOTHNESS:
				return getSmoothness();
			case NotationPackage.CONNECTOR__AVOID_OBSTRUCTIONS:
				return isAvoidObstructions() ? Boolean.TRUE : Boolean.FALSE;
			case NotationPackage.CONNECTOR__CLOSEST_DISTANCE:
				return isClosestDistance() ? Boolean.TRUE : Boolean.FALSE;
			case NotationPackage.CONNECTOR__JUMP_LINK_STATUS:
				return getJumpLinkStatus();
			case NotationPackage.CONNECTOR__JUMP_LINK_TYPE:
				return getJumpLinkType();
			case NotationPackage.CONNECTOR__JUMP_LINKS_REVERSE:
				return isJumpLinksReverse() ? Boolean.TRUE : Boolean.FALSE;
			case NotationPackage.CONNECTOR__ROUNDED_BENDPOINTS_RADIUS:
				return new Integer(getRoundedBendpointsRadius());
			case NotationPackage.CONNECTOR__LINE_COLOR:
				return new Integer(getLineColor());
			case NotationPackage.CONNECTOR__LINE_WIDTH:
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
			case NotationPackage.CONNECTOR__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case NotationPackage.CONNECTOR__VISIBLE:
				setVisible(((Boolean)newValue).booleanValue());
				return;
			case NotationPackage.CONNECTOR__TYPE:
				setType((String)newValue);
				return;
			case NotationPackage.CONNECTOR__MUTABLE:
				setMutable(((Boolean)newValue).booleanValue());
				return;
			case NotationPackage.CONNECTOR__SOURCE_EDGES:
				getSourceEdges().clear();
				getSourceEdges().addAll((Collection)newValue);
				return;
			case NotationPackage.CONNECTOR__TARGET_EDGES:
				getTargetEdges().clear();
				getTargetEdges().addAll((Collection)newValue);
				return;
			case NotationPackage.CONNECTOR__PERSISTED_CHILDREN:
				getPersistedChildren().clear();
				getPersistedChildren().addAll((Collection)newValue);
				return;
			case NotationPackage.CONNECTOR__STYLES:
				getStyles().clear();
				getStyles().addAll((Collection)newValue);
				return;
			case NotationPackage.CONNECTOR__ELEMENT:
				setElement((EObject)newValue);
				return;
			case NotationPackage.CONNECTOR__TRANSIENT_CHILDREN:
				getTransientChildren().clear();
				getTransientChildren().addAll((Collection)newValue);
				return;
			case NotationPackage.CONNECTOR__SOURCE:
				setSource((View)newValue);
				return;
			case NotationPackage.CONNECTOR__TARGET:
				setTarget((View)newValue);
				return;
			case NotationPackage.CONNECTOR__BENDPOINTS:
				setBendpoints((Bendpoints)newValue);
				return;
			case NotationPackage.CONNECTOR__SOURCE_ANCHOR:
				setSourceAnchor((Anchor)newValue);
				return;
			case NotationPackage.CONNECTOR__TARGET_ANCHOR:
				setTargetAnchor((Anchor)newValue);
				return;
			case NotationPackage.CONNECTOR__ROUTING:
				setRouting((Routing)newValue);
				return;
			case NotationPackage.CONNECTOR__SMOOTHNESS:
				setSmoothness((Smoothness)newValue);
				return;
			case NotationPackage.CONNECTOR__AVOID_OBSTRUCTIONS:
				setAvoidObstructions(((Boolean)newValue).booleanValue());
				return;
			case NotationPackage.CONNECTOR__CLOSEST_DISTANCE:
				setClosestDistance(((Boolean)newValue).booleanValue());
				return;
			case NotationPackage.CONNECTOR__JUMP_LINK_STATUS:
				setJumpLinkStatus((JumpLinkStatus)newValue);
				return;
			case NotationPackage.CONNECTOR__JUMP_LINK_TYPE:
				setJumpLinkType((JumpLinkType)newValue);
				return;
			case NotationPackage.CONNECTOR__JUMP_LINKS_REVERSE:
				setJumpLinksReverse(((Boolean)newValue).booleanValue());
				return;
			case NotationPackage.CONNECTOR__ROUNDED_BENDPOINTS_RADIUS:
				setRoundedBendpointsRadius(((Integer)newValue).intValue());
				return;
			case NotationPackage.CONNECTOR__LINE_COLOR:
				setLineColor(((Integer)newValue).intValue());
				return;
			case NotationPackage.CONNECTOR__LINE_WIDTH:
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
			case NotationPackage.CONNECTOR__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case NotationPackage.CONNECTOR__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case NotationPackage.CONNECTOR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case NotationPackage.CONNECTOR__MUTABLE:
				setMutable(MUTABLE_EDEFAULT);
				return;
			case NotationPackage.CONNECTOR__SOURCE_EDGES:
				getSourceEdges().clear();
				return;
			case NotationPackage.CONNECTOR__TARGET_EDGES:
				getTargetEdges().clear();
				return;
			case NotationPackage.CONNECTOR__PERSISTED_CHILDREN:
				getPersistedChildren().clear();
				return;
			case NotationPackage.CONNECTOR__STYLES:
				getStyles().clear();
				return;
			case NotationPackage.CONNECTOR__ELEMENT:
				unsetElement();
				return;
			case NotationPackage.CONNECTOR__TRANSIENT_CHILDREN:
				getTransientChildren().clear();
				return;
			case NotationPackage.CONNECTOR__SOURCE:
				setSource((View)null);
				return;
			case NotationPackage.CONNECTOR__TARGET:
				setTarget((View)null);
				return;
			case NotationPackage.CONNECTOR__BENDPOINTS:
				setBendpoints((Bendpoints)null);
				return;
			case NotationPackage.CONNECTOR__SOURCE_ANCHOR:
				setSourceAnchor((Anchor)null);
				return;
			case NotationPackage.CONNECTOR__TARGET_ANCHOR:
				setTargetAnchor((Anchor)null);
				return;
			case NotationPackage.CONNECTOR__ROUTING:
				setRouting(ROUTING_EDEFAULT);
				return;
			case NotationPackage.CONNECTOR__SMOOTHNESS:
				setSmoothness(SMOOTHNESS_EDEFAULT);
				return;
			case NotationPackage.CONNECTOR__AVOID_OBSTRUCTIONS:
				setAvoidObstructions(AVOID_OBSTRUCTIONS_EDEFAULT);
				return;
			case NotationPackage.CONNECTOR__CLOSEST_DISTANCE:
				setClosestDistance(CLOSEST_DISTANCE_EDEFAULT);
				return;
			case NotationPackage.CONNECTOR__JUMP_LINK_STATUS:
				setJumpLinkStatus(JUMP_LINK_STATUS_EDEFAULT);
				return;
			case NotationPackage.CONNECTOR__JUMP_LINK_TYPE:
				setJumpLinkType(JUMP_LINK_TYPE_EDEFAULT);
				return;
			case NotationPackage.CONNECTOR__JUMP_LINKS_REVERSE:
				setJumpLinksReverse(JUMP_LINKS_REVERSE_EDEFAULT);
				return;
			case NotationPackage.CONNECTOR__ROUNDED_BENDPOINTS_RADIUS:
				setRoundedBendpointsRadius(ROUNDED_BENDPOINTS_RADIUS_EDEFAULT);
				return;
			case NotationPackage.CONNECTOR__LINE_COLOR:
				setLineColor(LINE_COLOR_EDEFAULT);
				return;
			case NotationPackage.CONNECTOR__LINE_WIDTH:
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
			case NotationPackage.CONNECTOR__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case NotationPackage.CONNECTOR__VISIBLE:
				return ((eFlags & VISIBLE_EFLAG) != 0) != VISIBLE_EDEFAULT;
			case NotationPackage.CONNECTOR__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case NotationPackage.CONNECTOR__MUTABLE:
				return ((eFlags & MUTABLE_EFLAG) != 0) != MUTABLE_EDEFAULT;
			case NotationPackage.CONNECTOR__SOURCE_EDGES:
				return sourceEdges != null && !sourceEdges.isEmpty();
			case NotationPackage.CONNECTOR__TARGET_EDGES:
				return targetEdges != null && !targetEdges.isEmpty();
			case NotationPackage.CONNECTOR__PERSISTED_CHILDREN:
				return persistedChildren != null && !persistedChildren.isEmpty();
			case NotationPackage.CONNECTOR__STYLES:
				return styles != null && !styles.isEmpty();
			case NotationPackage.CONNECTOR__ELEMENT:
				return isSetElement();
			case NotationPackage.CONNECTOR__DIAGRAM:
				return basicGetDiagram() != null;
			case NotationPackage.CONNECTOR__TRANSIENT_CHILDREN:
				return transientChildren != null && !transientChildren.isEmpty();
			case NotationPackage.CONNECTOR__SOURCE:
				return source != null;
			case NotationPackage.CONNECTOR__TARGET:
				return target != null;
			case NotationPackage.CONNECTOR__BENDPOINTS:
				return bendpoints != null;
			case NotationPackage.CONNECTOR__SOURCE_ANCHOR:
				return sourceAnchor != null;
			case NotationPackage.CONNECTOR__TARGET_ANCHOR:
				return targetAnchor != null;
			case NotationPackage.CONNECTOR__ROUTING:
				return (eFlags & ROUTING_EFLAG) != ROUTING_EFLAG_DEFAULT;
			case NotationPackage.CONNECTOR__SMOOTHNESS:
				return (eFlags & SMOOTHNESS_EFLAG) != SMOOTHNESS_EFLAG_DEFAULT;
			case NotationPackage.CONNECTOR__AVOID_OBSTRUCTIONS:
				return ((eFlags & AVOID_OBSTRUCTIONS_EFLAG) != 0) != AVOID_OBSTRUCTIONS_EDEFAULT;
			case NotationPackage.CONNECTOR__CLOSEST_DISTANCE:
				return ((eFlags & CLOSEST_DISTANCE_EFLAG) != 0) != CLOSEST_DISTANCE_EDEFAULT;
			case NotationPackage.CONNECTOR__JUMP_LINK_STATUS:
				return (eFlags & JUMP_LINK_STATUS_EFLAG) != JUMP_LINK_STATUS_EFLAG_DEFAULT;
			case NotationPackage.CONNECTOR__JUMP_LINK_TYPE:
				return (eFlags & JUMP_LINK_TYPE_EFLAG) != JUMP_LINK_TYPE_EFLAG_DEFAULT;
			case NotationPackage.CONNECTOR__JUMP_LINKS_REVERSE:
				return ((eFlags & JUMP_LINKS_REVERSE_EFLAG) != 0) != JUMP_LINKS_REVERSE_EDEFAULT;
			case NotationPackage.CONNECTOR__ROUNDED_BENDPOINTS_RADIUS:
				return roundedBendpointsRadius != ROUNDED_BENDPOINTS_RADIUS_EDEFAULT;
			case NotationPackage.CONNECTOR__LINE_COLOR:
				return lineColor != LINE_COLOR_EDEFAULT;
			case NotationPackage.CONNECTOR__LINE_WIDTH:
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
				case NotationPackage.CONNECTOR__ROUTING: return NotationPackage.ROUTING_STYLE__ROUTING;
				case NotationPackage.CONNECTOR__SMOOTHNESS: return NotationPackage.ROUTING_STYLE__SMOOTHNESS;
				case NotationPackage.CONNECTOR__AVOID_OBSTRUCTIONS: return NotationPackage.ROUTING_STYLE__AVOID_OBSTRUCTIONS;
				case NotationPackage.CONNECTOR__CLOSEST_DISTANCE: return NotationPackage.ROUTING_STYLE__CLOSEST_DISTANCE;
				case NotationPackage.CONNECTOR__JUMP_LINK_STATUS: return NotationPackage.ROUTING_STYLE__JUMP_LINK_STATUS;
				case NotationPackage.CONNECTOR__JUMP_LINK_TYPE: return NotationPackage.ROUTING_STYLE__JUMP_LINK_TYPE;
				case NotationPackage.CONNECTOR__JUMP_LINKS_REVERSE: return NotationPackage.ROUTING_STYLE__JUMP_LINKS_REVERSE;
				case NotationPackage.CONNECTOR__ROUNDED_BENDPOINTS_RADIUS: return NotationPackage.ROUTING_STYLE__ROUNDED_BENDPOINTS_RADIUS;
				default: return -1;
			}
		}
		if (baseClass == LineStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.CONNECTOR__LINE_COLOR: return NotationPackage.LINE_STYLE__LINE_COLOR;
				case NotationPackage.CONNECTOR__LINE_WIDTH: return NotationPackage.LINE_STYLE__LINE_WIDTH;
				default: return -1;
			}
		}
		if (baseClass == ConnectorStyle.class) {
			switch (derivedFeatureID) {
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
				case NotationPackage.ROUTING_STYLE__ROUTING: return NotationPackage.CONNECTOR__ROUTING;
				case NotationPackage.ROUTING_STYLE__SMOOTHNESS: return NotationPackage.CONNECTOR__SMOOTHNESS;
				case NotationPackage.ROUTING_STYLE__AVOID_OBSTRUCTIONS: return NotationPackage.CONNECTOR__AVOID_OBSTRUCTIONS;
				case NotationPackage.ROUTING_STYLE__CLOSEST_DISTANCE: return NotationPackage.CONNECTOR__CLOSEST_DISTANCE;
				case NotationPackage.ROUTING_STYLE__JUMP_LINK_STATUS: return NotationPackage.CONNECTOR__JUMP_LINK_STATUS;
				case NotationPackage.ROUTING_STYLE__JUMP_LINK_TYPE: return NotationPackage.CONNECTOR__JUMP_LINK_TYPE;
				case NotationPackage.ROUTING_STYLE__JUMP_LINKS_REVERSE: return NotationPackage.CONNECTOR__JUMP_LINKS_REVERSE;
				case NotationPackage.ROUTING_STYLE__ROUNDED_BENDPOINTS_RADIUS: return NotationPackage.CONNECTOR__ROUNDED_BENDPOINTS_RADIUS;
				default: return -1;
			}
		}
		if (baseClass == LineStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.LINE_STYLE__LINE_COLOR: return NotationPackage.CONNECTOR__LINE_COLOR;
				case NotationPackage.LINE_STYLE__LINE_WIDTH: return NotationPackage.CONNECTOR__LINE_WIDTH;
				default: return -1;
			}
		}
		if (baseClass == ConnectorStyle.class) {
			switch (baseFeatureID) {
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
		result.append(", roundedBendpointsRadius: "); //$NON-NLS-1$
		result.append(roundedBendpointsRadius);
		result.append(", lineColor: "); //$NON-NLS-1$
		result.append(lineColor);
		result.append(", lineWidth: "); //$NON-NLS-1$
		result.append(lineWidth);
		result.append(')');
		return result.toString();
	}

} //ConnectorImpl
