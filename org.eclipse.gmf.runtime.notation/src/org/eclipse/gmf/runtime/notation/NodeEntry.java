/**
 * <copyright>
 * </copyright>
 *
 * $Id: NodeEntry.java,v 1.1 2007/05/17 16:26:50 aboyko Exp $
 */
package org.eclipse.gmf.runtime.notation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.NodeEntry#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.NodeEntry#getKey <em>Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getNodeEntry()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML MapEntry='null'"
 * @generated
 */
public interface NodeEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"Center"</code>.
	 * The literals are from the enumeration {@link org.eclipse.gmf.runtime.notation.Alignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.gmf.runtime.notation.Alignment
	 * @see #setValue(Alignment)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getNodeEntry_Value()
	 * @model default="Center" required="true" ordered="false"
	 * @generated
	 */
	Alignment getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.NodeEntry#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.gmf.runtime.notation.Alignment
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Alignment value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' reference.
	 * @see #setKey(Node)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getNodeEntry_Key()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Node getKey();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.NodeEntry#getKey <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Node value);

} // NodeEntry
