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
 * A representation of the model object '<em><b>Arrow Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.ArrowStyle#getArrowSource <em>Arrow Source</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.ArrowStyle#getArrowTarget <em>Arrow Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getArrowStyle()
 * @model
 * @generated
 */
public interface ArrowStyle extends NotationObject, Style {
	/**
	 * Returns the value of the '<em><b>Arrow Source</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link org.eclipse.gmf.runtime.notation.ArrowType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrow Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrow Source</em>' attribute.
	 * @see org.eclipse.gmf.runtime.notation.ArrowType
	 * @see #setArrowSource(ArrowType)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getArrowStyle_ArrowSource()
	 * @model default="None"
	 * @generated
	 */
	ArrowType getArrowSource();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.ArrowStyle#getArrowSource <em>Arrow Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrow Source</em>' attribute.
	 * @see org.eclipse.gmf.runtime.notation.ArrowType
	 * @see #getArrowSource()
	 * @generated
	 */
	void setArrowSource(ArrowType value);

	/**
	 * Returns the value of the '<em><b>Arrow Target</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link org.eclipse.gmf.runtime.notation.ArrowType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrow Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrow Target</em>' attribute.
	 * @see org.eclipse.gmf.runtime.notation.ArrowType
	 * @see #setArrowTarget(ArrowType)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getArrowStyle_ArrowTarget()
	 * @model default="None"
	 * @generated
	 */
	ArrowType getArrowTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.ArrowStyle#getArrowTarget <em>Arrow Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrow Target</em>' attribute.
	 * @see org.eclipse.gmf.runtime.notation.ArrowType
	 * @see #getArrowTarget()
	 * @generated
	 */
	void setArrowTarget(ArrowType value);

} // ArrowStyle
