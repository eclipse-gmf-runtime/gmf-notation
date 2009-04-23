/******************************************************************************
 * Copyright (c) 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/
package org.eclipse.gmf.runtime.notation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Type Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.LineTypeStyle#getLineType <em>Line Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getLineTypeStyle()
 * @model
 * @generated
 */
public interface LineTypeStyle extends Style {
	/**
	 * Returns the value of the '<em><b>Line Type</b></em>' attribute.
	 * The default value is <code>"Solid"</code>.
	 * The literals are from the enumeration {@link org.eclipse.gmf.runtime.notation.LineType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Type</em>' attribute.
	 * @see org.eclipse.gmf.runtime.notation.LineType
	 * @see #setLineType(LineType)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getLineTypeStyle_LineType()
	 * @model default="Solid"
	 * @generated
	 */
	LineType getLineType();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.LineTypeStyle#getLineType <em>Line Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Type</em>' attribute.
	 * @see org.eclipse.gmf.runtime.notation.LineType
	 * @see #getLineType()
	 * @generated
	 */
	void setLineType(LineType value);

} // LineTypeStyle
