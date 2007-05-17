/**
 * <copyright>
 * </copyright>
 *
 * $Id: DataTypeStyle.java,v 1.1 2007/05/17 16:26:50 aboyko Exp $
 */
package org.eclipse.gmf.runtime.notation;

import org.eclipse.emf.ecore.EDataType;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.DataTypeStyle#getInstanceType <em>Instance Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getDataTypeStyle()
 * @model
 * @generated
 */
public interface DataTypeStyle extends NamedStyle, StringObjectConverter {

	/**
	 * Returns the value of the '<em><b>Instance Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Type</em>' reference.
	 * @see #setInstanceType(EDataType)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getDataTypeStyle_InstanceType()
	 * @model
	 * @generated
	 */
	EDataType getInstanceType();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.DataTypeStyle#getInstanceType <em>Instance Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Type</em>' reference.
	 * @see #getInstanceType()
	 * @generated
	 */
	void setInstanceType(EDataType value);
} // DataTypeStyle
