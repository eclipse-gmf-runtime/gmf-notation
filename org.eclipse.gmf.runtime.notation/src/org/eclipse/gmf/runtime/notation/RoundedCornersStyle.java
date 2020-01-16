/******************************************************************************
 * Copyright (c) 2010 IBM Corporation and others.
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

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Rounded
 * Corners Style</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.gmf.runtime.notation.RoundedCornersStyle#getRoundedBendpointsRadius
 * <em>Rounded Bendpoints Radius</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getRoundedCornersStyle()
 * @model
 * @generated
 * @since 1.4
 */
public interface RoundedCornersStyle extends Style {
	/**
	 * Returns the value of the '<em><b>Rounded Bendpoints Radius</b></em>'
	 * attribute. The default value is <code>"0"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rounded Bendpoints Radius</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Rounded Bendpoints Radius</em>' attribute.
	 * @see #setRoundedBendpointsRadius(int)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getRoundedCornersStyle_RoundedBendpointsRadius()
	 * @model default="0"
	 * @generated
	 */
	int getRoundedBendpointsRadius();

	/**
	 * Sets the value of the
	 * '{@link org.eclipse.gmf.runtime.notation.RoundedCornersStyle#getRoundedBendpointsRadius
	 * <em>Rounded Bendpoints Radius</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Rounded Bendpoints Radius</em>'
	 *              attribute.
	 * @see #getRoundedBendpointsRadius()
	 * @generated
	 */
	void setRoundedBendpointsRadius(int value);

} // RoundedCornersStyle
