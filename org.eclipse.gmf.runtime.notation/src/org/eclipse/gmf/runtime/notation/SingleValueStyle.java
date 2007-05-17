/**
 * <copyright>
 * </copyright>
 *
 * $Id: SingleValueStyle.java,v 1.1 2007/05/17 16:26:50 aboyko Exp $
 */
package org.eclipse.gmf.runtime.notation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Value Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.SingleValueStyle#getRawValue <em>Raw Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getSingleValueStyle()
 * @model
 * @generated
 */
public interface SingleValueStyle extends DataTypeStyle {
	/**
	 * Returns the value of the '<em><b>Raw Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raw Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raw Value</em>' attribute.
	 * @see #setRawValue(String)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getSingleValueStyle_RawValue()
	 * @model
	 * @generated
	 */
	String getRawValue();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.SingleValueStyle#getRawValue <em>Raw Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raw Value</em>' attribute.
	 * @see #getRawValue()
	 * @generated
	 */
	void setRawValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Object getValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setValue(Object newValue);

} // SingleValueStyle
