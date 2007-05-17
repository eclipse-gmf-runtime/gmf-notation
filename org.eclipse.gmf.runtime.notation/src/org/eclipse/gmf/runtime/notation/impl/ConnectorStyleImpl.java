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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmf.runtime.notation.ConnectorStyle;
import org.eclipse.gmf.runtime.notation.JumpLinkStatus;
import org.eclipse.gmf.runtime.notation.JumpLinkType;
import org.eclipse.gmf.runtime.notation.LineStyle;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.CONNECTOR_STYLE__ROUTING, oldRouting, routing));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.CONNECTOR_STYLE__SMOOTHNESS, oldSmoothness, smoothness));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.CONNECTOR_STYLE__JUMP_LINK_STATUS, oldJumpLinkStatus, jumpLinkStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.CONNECTOR_STYLE__JUMP_LINK_TYPE, oldJumpLinkType, jumpLinkType));
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
				return routing != ROUTING_EDEFAULT;
			case NotationPackage.CONNECTOR_STYLE__SMOOTHNESS:
				return smoothness != SMOOTHNESS_EDEFAULT;
			case NotationPackage.CONNECTOR_STYLE__AVOID_OBSTRUCTIONS:
				return ((eFlags & AVOID_OBSTRUCTIONS_EFLAG) != 0) != AVOID_OBSTRUCTIONS_EDEFAULT;
			case NotationPackage.CONNECTOR_STYLE__CLOSEST_DISTANCE:
				return ((eFlags & CLOSEST_DISTANCE_EFLAG) != 0) != CLOSEST_DISTANCE_EDEFAULT;
			case NotationPackage.CONNECTOR_STYLE__JUMP_LINK_STATUS:
				return jumpLinkStatus != JUMP_LINK_STATUS_EDEFAULT;
			case NotationPackage.CONNECTOR_STYLE__JUMP_LINK_TYPE:
				return jumpLinkType != JUMP_LINK_TYPE_EDEFAULT;
			case NotationPackage.CONNECTOR_STYLE__JUMP_LINKS_REVERSE:
				return ((eFlags & JUMP_LINKS_REVERSE_EFLAG) != 0) != JUMP_LINKS_REVERSE_EDEFAULT;
			case NotationPackage.CONNECTOR_STYLE__LINE_COLOR:
				return lineColor != LINE_COLOR_EDEFAULT;
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
		result.append(", lineColor: "); //$NON-NLS-1$
		result.append(lineColor);
		result.append(')');
		return result.toString();
	}

} //ConnectorStyleImpl
