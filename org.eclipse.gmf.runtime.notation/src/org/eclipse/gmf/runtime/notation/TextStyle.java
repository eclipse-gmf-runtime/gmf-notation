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
 * A representation of the model object '<em><b>Text Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.TextStyle#getTextAlignment <em>Text Alignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getTextStyle()
 * @model
 * @generated
 */
public interface TextStyle extends Style {
	/**
	 * Returns the value of the '<em><b>Text Alignment</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmf.runtime.notation.TextAlignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Alignment</em>' attribute.
	 * @see org.eclipse.gmf.runtime.notation.TextAlignment
	 * @see #setTextAlignment(TextAlignment)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getTextStyle_TextAlignment()
	 * @model
	 * @generated
	 */
	TextAlignment getTextAlignment();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.TextStyle#getTextAlignment <em>Text Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Alignment</em>' attribute.
	 * @see org.eclipse.gmf.runtime.notation.TextAlignment
	 * @see #getTextAlignment()
	 * @generated
	 */
	void setTextAlignment(TextAlignment value);

} // TextStyle
