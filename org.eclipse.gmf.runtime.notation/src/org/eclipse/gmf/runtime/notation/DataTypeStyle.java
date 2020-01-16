/******************************************************************************
 * Copyright (c) 2007 IBM Corporation and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/
package org.eclipse.gmf.runtime.notation;

import org.eclipse.emf.ecore.EDataType;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Data
 * Type Style</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.gmf.runtime.notation.DataTypeStyle#getInstanceType
 * <em>Instance Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getDataTypeStyle()
 * @model
 * @generated
 */
public interface DataTypeStyle extends NamedStyle, StringObjectConverter {

	/**
	 * Returns the value of the '<em><b>Instance Type</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Type</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Instance Type</em>' reference.
	 * @see #setInstanceType(EDataType)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getDataTypeStyle_InstanceType()
	 * @model
	 * @generated
	 */
	EDataType getInstanceType();

	/**
	 * Sets the value of the
	 * '{@link org.eclipse.gmf.runtime.notation.DataTypeStyle#getInstanceType
	 * <em>Instance Type</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Instance Type</em>' reference.
	 * @see #getInstanceType()
	 * @generated
	 */
	void setInstanceType(EDataType value);
} // DataTypeStyle
