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

package org.eclipse.gmf.runtime.notation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Routing Style</b></em>'.
 * <p>
 * The routing style is a style to be installed on edges to guide their routing
 * </p>
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.RoutingStyle#getRouting <em>Routing</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.RoutingStyle#getSmoothness <em>Smoothness</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.RoutingStyle#isAvoidObstructions <em>Avoid Obstructions</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.RoutingStyle#isClosestDistance <em>Closest Distance</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.RoutingStyle#getJumpLinkStatus <em>Jump Link Status</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.RoutingStyle#getJumpLinkType <em>Jump Link Type</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.RoutingStyle#isJumpLinksReverse <em>Jump Links Reverse</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getRoutingStyle()
 * @model 
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public interface RoutingStyle extends Style {

    /**
     * Returns the value of the '<em><b>Routing</b></em>' attribute.
     * The default value is <code>"Manual"</code>.
     * The literals are from the enumeration {@link org.eclipse.gmf.runtime.notation.Routing}.
     * <!-- begin-user-doc -->
	 * <p>
	 * The property specifies the desired routing algorithm
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Routing</em>' attribute.
     * @see org.eclipse.gmf.runtime.notation.Routing
     * @see #setRouting(Routing)
     * @see org.eclipse.gmf.runtime.notation.NotationPackage#getRoutingStyle_Routing()
     * @model default="Manual"
     * @generated
     */
	Routing getRouting();

    /**
     * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.RoutingStyle#getRouting <em>Routing</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * The property specifies the desired routing algorithm
	 * </p>
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Routing</em>' attribute.
     * @see org.eclipse.gmf.runtime.notation.Routing
     * @see #getRouting()
     * @generated
     */
	void setRouting(Routing value);

    /**
     * Returns the value of the '<em><b>Smoothness</b></em>' attribute.
     * The default value is <code>"None"</code>.
     * The literals are from the enumeration {@link org.eclipse.gmf.runtime.notation.Smoothness}.
     * <!-- begin-user-doc -->
	 * <p>
	 * The property specifies the desired smoothing for the edge'e line
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Smoothness</em>' attribute.
     * @see org.eclipse.gmf.runtime.notation.Smoothness
     * @see #setSmoothness(Smoothness)
     * @see org.eclipse.gmf.runtime.notation.NotationPackage#getRoutingStyle_Smoothness()
     * @model default="None"
     * @generated
     */
	Smoothness getSmoothness();

    /**
     * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.RoutingStyle#getSmoothness <em>Smoothness</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * The property specifies the desired smoothing for the edge'e line
	 * </p>
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Smoothness</em>' attribute.
     * @see org.eclipse.gmf.runtime.notation.Smoothness
     * @see #getSmoothness()
     * @generated
     */
	void setSmoothness(Smoothness value);

    /**
     * Returns the value of the '<em><b>Avoid Obstructions</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * The property specifies whether the edge's router should avoid obstructions
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Avoid Obstructions</em>' attribute.
     * @see #setAvoidObstructions(boolean)
     * @see org.eclipse.gmf.runtime.notation.NotationPackage#getRoutingStyle_AvoidObstructions()
     * @model default="false"
     * @generated
     */
	boolean isAvoidObstructions();

    /**
     * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.RoutingStyle#isAvoidObstructions <em>Avoid Obstructions</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * The property specifies whether the edge's router should avoid obstructions
	 * </p>
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Avoid Obstructions</em>' attribute.
     * @see #isAvoidObstructions()
     * @generated
     */
	void setAvoidObstructions(boolean value);

    /**
     * Returns the value of the '<em><b>Closest Distance</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * The property specifies whether the edge's router should should choose closest distances
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Closest Distance</em>' attribute.
     * @see #setClosestDistance(boolean)
     * @see org.eclipse.gmf.runtime.notation.NotationPackage#getRoutingStyle_ClosestDistance()
     * @model default="false"
     * @generated
     */
	boolean isClosestDistance();

    /**
     * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.RoutingStyle#isClosestDistance <em>Closest Distance</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * The property specifies whether the edge's router should should choose closest distances
	 * </p>
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Closest Distance</em>' attribute.
     * @see #isClosestDistance()
     * @generated
     */
	void setClosestDistance(boolean value);

    /**
     * Returns the value of the '<em><b>Jump Link Status</b></em>' attribute.
     * The default value is <code>"None"</code>.
     * The literals are from the enumeration {@link org.eclipse.gmf.runtime.notation.JumpLinkStatus}.
     * <!-- begin-user-doc -->
	 * <p>
	 * The property specifies the status of the jump links used in the routing algorithm
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Jump Link Status</em>' attribute.
     * @see org.eclipse.gmf.runtime.notation.JumpLinkStatus
     * @see #setJumpLinkStatus(JumpLinkStatus)
     * @see org.eclipse.gmf.runtime.notation.NotationPackage#getRoutingStyle_JumpLinkStatus()
     * @model default="None"
     * @generated
     */
	JumpLinkStatus getJumpLinkStatus();

    /**
     * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.RoutingStyle#getJumpLinkStatus <em>Jump Link Status</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * The property specifies the status of the jump links used in the routing algorithm
	 * </p>
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Jump Link Status</em>' attribute.
     * @see org.eclipse.gmf.runtime.notation.JumpLinkStatus
     * @see #getJumpLinkStatus()
     * @generated
     */
	void setJumpLinkStatus(JumpLinkStatus value);

    /**
     * Returns the value of the '<em><b>Jump Link Type</b></em>' attribute.
     * The default value is <code>"Semicircle"</code>.
     * The literals are from the enumeration {@link org.eclipse.gmf.runtime.notation.JumpLinkType}.
     * <!-- begin-user-doc -->
	 * <p>
	 * The property specifies the type of the jump links used in the routing algorithm
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Jump Link Type</em>' attribute.
     * @see org.eclipse.gmf.runtime.notation.JumpLinkType
     * @see #setJumpLinkType(JumpLinkType)
     * @see org.eclipse.gmf.runtime.notation.NotationPackage#getRoutingStyle_JumpLinkType()
     * @model default="Semicircle"
     * @generated
     */
	JumpLinkType getJumpLinkType();

    /**
     * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.RoutingStyle#getJumpLinkType <em>Jump Link Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * The property specifies the type of the jump links used in the routing algorithm
	 * </p>
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Jump Link Type</em>' attribute.
     * @see org.eclipse.gmf.runtime.notation.JumpLinkType
     * @see #getJumpLinkType()
     * @generated
     */
	void setJumpLinkType(JumpLinkType value);

    /**
     * Returns the value of the '<em><b>Jump Links Reverse</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * The property specifies whether the jump links used in the routing algorithm should be reveresed
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Jump Links Reverse</em>' attribute.
     * @see #setJumpLinksReverse(boolean)
     * @see org.eclipse.gmf.runtime.notation.NotationPackage#getRoutingStyle_JumpLinksReverse()
     * @model default="false"
     * @generated
     */
	boolean isJumpLinksReverse();

    /**
     * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.RoutingStyle#isJumpLinksReverse <em>Jump Links Reverse</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * The property specifies whether the jump links used in the routing algorithm should be reveresed
	 * </p>
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Jump Links Reverse</em>' attribute.
     * @see #isJumpLinksReverse()
     * @generated
     */
	void setJumpLinksReverse(boolean value);

} // RoutingStyle
