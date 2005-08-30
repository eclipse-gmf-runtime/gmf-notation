/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2004.  All Rights Reserved.                    |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package org.eclipse.gmf.runtime.notation;


import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <p>
 * A node is a view that can composed and laid out in a container view.
 * </p>
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.Node#getLayoutConstraint <em>Layout Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getNode()
 * @model 
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public interface Node extends View{
	/**
	 * Returns the value of the '<em><b>Layout Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Layout constraints are used by layout managers to properly set the bounds of the node's visuals
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Constraint</em>' containment reference.
	 * @see #setLayoutConstraint(LayoutConstraint)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getNode_LayoutConstraint()
	 * @model containment="true"
	 * @generated
	 */
	LayoutConstraint getLayoutConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.Node#getLayoutConstraint <em>Layout Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Layout constraints are used by layout managers to properly set the bounds of the node's visuals
	 * </p>
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Constraint</em>' containment reference.
	 * @see #getLayoutConstraint()
	 * @generated
	 */
	void setLayoutConstraint(LayoutConstraint value);

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * A utility method to create a <code>LayoutConstraint</code> object from the given <code>EClass</code>
	 * and then sets the node's <em>LayoutConstraint</em> property to the new object.
	 * </p>
	 * 
	 * @param eClass the <code>EClass</code> to be used in creating the <code>LayoutConstraint</code> object
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	LayoutConstraint createLayoutConstraint(EClass eClass);

} // Node
