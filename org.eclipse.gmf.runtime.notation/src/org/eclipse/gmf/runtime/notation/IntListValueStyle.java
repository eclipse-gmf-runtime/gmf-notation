/**
 * <copyright>
 * </copyright>
 *
 * $Id: IntListValueStyle.java,v 1.1 2007/05/17 16:26:51 aboyko Exp $
 */
package org.eclipse.gmf.runtime.notation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int List Value Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.IntListValueStyle#getIntListValue <em>Int List Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getIntListValueStyle()
 * @model
 * @generated
 */
public interface IntListValueStyle extends NamedStyle {
	/**
	 * Returns the value of the '<em><b>Int List Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int List Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int List Value</em>' attribute list.
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getIntListValueStyle_IntListValue()
	 * @model type="int" unique="false"
	 * @generated
	 */
	EList getIntListValue();

} // IntListValueStyle
