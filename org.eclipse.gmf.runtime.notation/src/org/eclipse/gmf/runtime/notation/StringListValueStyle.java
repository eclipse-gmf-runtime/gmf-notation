/**
 * <copyright>
 * </copyright>
 *
 * $Id: StringListValueStyle.java,v 1.1 2007/05/17 16:26:50 aboyko Exp $
 */
package org.eclipse.gmf.runtime.notation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String List Value Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.StringListValueStyle#getStringListValue <em>String List Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getStringListValueStyle()
 * @model
 * @generated
 */
public interface StringListValueStyle extends NamedStyle {
	/**
	 * Returns the value of the '<em><b>String List Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String List Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String List Value</em>' attribute list.
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getStringListValueStyle_StringListValue()
	 * @model type="java.lang.String" unique="false"
	 * @generated
	 */
	EList getStringListValue();

} // StringListValueStyle
