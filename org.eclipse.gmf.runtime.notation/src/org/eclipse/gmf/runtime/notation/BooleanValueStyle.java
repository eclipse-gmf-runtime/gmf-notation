/**
 * <copyright>
 * </copyright>
 *
 * $Id: BooleanValueStyle.java,v 1.1 2007/05/17 16:26:51 aboyko Exp $
 */
package org.eclipse.gmf.runtime.notation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Value Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.BooleanValueStyle#isBooleanValue <em>Boolean Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getBooleanValueStyle()
 * @model
 * @generated
 */
public interface BooleanValueStyle extends NamedStyle {
	/**
	 * Returns the value of the '<em><b>Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Value</em>' attribute.
	 * @see #setBooleanValue(boolean)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getBooleanValueStyle_BooleanValue()
	 * @model
	 * @generated
	 */
	boolean isBooleanValue();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.BooleanValueStyle#isBooleanValue <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Value</em>' attribute.
	 * @see #isBooleanValue()
	 * @generated
	 */
	void setBooleanValue(boolean value);

} // BooleanValueStyle
