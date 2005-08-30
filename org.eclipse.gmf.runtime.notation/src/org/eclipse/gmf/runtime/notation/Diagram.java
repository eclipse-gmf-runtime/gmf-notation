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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 *<p>
 * A diagram is a view that represents the top level containment of views
 * </p>
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.Diagram#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.Diagram#getPersistedEdges <em>Persisted Edges</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.Diagram#getTransientEdges <em>Transient Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getDiagram()
 * @model 
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public interface Diagram extends View{
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getDiagram_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.Diagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' list.
	 * The list contents are of type {@link org.eclipse.gmf.runtime.notation.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' list.
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getDiagram_Edges()
	 */
	EList getEdges();

	/**
	 * Returns the value of the '<em><b>Persisted Edges</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.runtime.notation.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persisted Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persisted Edges</em>' containment reference list.
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getDiagram_PersistedEdges()
	 * @model type="org.eclipse.gmf.runtime.notation.Edge" containment="true"
	 * @generated
	 */
	EList getPersistedEdges();

	/**
	 * Returns the value of the '<em><b>Transient Edges</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.runtime.notation.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient Edges</em>' containment reference list.
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getDiagram_TransientEdges()
	 * @model type="org.eclipse.gmf.runtime.notation.Edge" containment="true" transient="true"
	 * @generated
	 */
	 EList getTransientEdges();

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * A utililty method to create a new <code>Edge</code> from the given <code>eClass</code> paramter
	 * and then inserts the object in the diagrams's </em>Edges</em> collection
	 * </p>
	 * 
	 * @param eClass the <code>EClass</code> to be used in creating the <code>Edge</code> object
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Edge createEdge(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * A utililty method to insert a persisted edge
	 * </p>
	 * @param edge the '<em>Edge</em>' to insert.
	 * <!-- end-user-doc -->
	 */
	void insertEdge(Edge edge);
	
	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * A utililty method to insert a persisted edge at a specific index
	 * </p>
	 * @param edge the '<em>Edge</em>' to insert.
	 * @param the index of the child
	 * <!-- end-user-doc -->
	 */
	void insertEdgeAt(Edge edge, int index);
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * A utililty method to insert a persisted or transient edge
	 * </p>
	 * @param edge the '<em>Edge</em>' to insert.
	 * @param persisted, indicate if the Edge will be persisted or not
	 * <!-- end-user-doc -->
	 */
	void insertEdge(Edge edge,boolean persisted);
	
	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * A utililty method to persist all diagram's edges
	 * </p>
	 * <!-- end-user-doc -->
	 */
	 void persistEdges();
	 
	 /**
	  * <!-- begin-user-doc -->
	  * <p>
	  * A utililty method to remove an edge form a diagram
	  * </p>
	  * @param edge the '<em>Edge</em>' to remove
	  * <!-- end-user-doc -->
	  */
 	  void removeEdge(Edge edge);

} // Diagram
