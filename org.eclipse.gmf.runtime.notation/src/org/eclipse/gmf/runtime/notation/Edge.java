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

package org.eclipse.gmf.runtime.notation;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <p>
 * An edge is a view that represents a connection between two other views
 * </p>
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.Edge#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.Edge#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.Edge#getBendpoints <em>Bendpoints</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.Edge#getSourceAnchor <em>Source Anchor</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.Edge#getTargetAnchor <em>Target Anchor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getEdge()
 * @model 
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public interface Edge extends View{
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.runtime.notation.View#getSourceEdges <em>Source Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The edge's source is the view at the source of the edge
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(View)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getEdge_Source()
	 * @see org.eclipse.gmf.runtime.notation.View#getSourceEdges
	 * @model opposite="sourceEdges" resolveProxies="false" required="true"
	 * @generated
	 */
	View getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.Edge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The edge's source is the view at the source of the edge
	 * </p>
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(View value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.runtime.notation.View#getTargetEdges <em>Target Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The edge's taregt is the view at the target of the edge
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(View)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getEdge_Target()
	 * @see org.eclipse.gmf.runtime.notation.View#getTargetEdges
	 * @model opposite="targetEdges" resolveProxies="false" required="true"
	 * @generated
	 */
	View getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.Edge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The edge's taregt is the view at the target of the edge
	 * </p>
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(View value);

	/**
	 * Returns the value of the '<em><b>Bendpoints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * A bendpoint is a routing constraint installed on edges to suggest that their 
	 * routing pass through a specific collection of points.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bendpoints</em>' containment reference.
	 * @see #setBendpoints(Bendpoints)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getEdge_Bendpoints()
	 * @model containment="true"
	 * @generated
	 */
	Bendpoints getBendpoints();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.Edge#getBendpoints <em>Bendpoints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * A bendpoint is a routing constraint installed on edges to suggest that their 
	 * routing pass through a specific collection of points.
	 * </p>
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bendpoints</em>' containment reference.
	 * @see #getBendpoints()
	 * @generated
	 */
	void setBendpoints(Bendpoints value);

	/**
	 * Returns the value of the '<em><b>Source Anchor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * A source anchor is a routing constraint installed on edges to identify where the source
	 * view should anchor that edge.	 
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Anchor</em>' containment reference.
	 * @see #setSourceAnchor(Anchor)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getEdge_SourceAnchor()
	 * @model containment="true"
	 * @generated
	 */
	Anchor getSourceAnchor();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.Edge#getSourceAnchor <em>Source Anchor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * A source anchor is a routing constraint installed on edges to identify where the source
	 * view should anchor that edge.	 
	 * </p>
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Anchor</em>' containment reference.
	 * @see #getSourceAnchor()
	 * @generated
	 */
	void setSourceAnchor(Anchor value);

	/**
	 * Returns the value of the '<em><b>Target Anchor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * A target anchor is a routing constraint installed on edges to identify where the target
	 * view should anchor that edge.	 
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Anchor</em>' containment reference.
	 * @see #setTargetAnchor(Anchor)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getEdge_TargetAnchor()
	 * @model containment="true"
	 * @generated
	 */
	Anchor getTargetAnchor();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.Edge#getTargetAnchor <em>Target Anchor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * A target anchor is a routing constraint installed on edges to identify where the target
	 * view should anchor that edge.	 
	 * </p>
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Anchor</em>' containment reference.
	 * @see #getTargetAnchor()
	 * @generated
	 */
	void setTargetAnchor(Anchor value);

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * A utility method to create a <code>Bendpoints</code> object from the given <code>EClass</code>
	 * and then sets the edge's <em>Bendpoints</em> property to the new object.
	 * </p>
	 * 
	 * @param eClass the <code>EClass</code> to be used in creating the <code>Bendpoints</code> object
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Bendpoints createBendpoints(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * A utility method to create an <code>Anchor</code> object from the given <code>EClass</code>
	 * and then sets the edge's <em>SourceAnchor</em> property to the new object.
	 * </p>
	 * 
	 * @param eClass the <code>EClass</code> to be used in creating the <code>Anchor</code> object
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Anchor createSourceAnchor(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * A utility method to create an <code>Anchor</code> object from the given <code>EClass</code>
	 * and then sets the edge's <em>TargetAnchor</em> property to the new object.
	 * </p>
	 * 
	 * @param eClass the <code>EClass</code> to be used in creating the <code>Anchor</code> object
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Anchor createTargetAnchor(EClass eClass);

} // Edge
