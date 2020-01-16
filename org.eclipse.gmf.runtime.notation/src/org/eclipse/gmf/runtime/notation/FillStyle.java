/******************************************************************************
 * Copyright (c) 2004, 2009 IBM Corporation and others.
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

import org.eclipse.gmf.runtime.notation.datatype.GradientData;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Fill
 * Style</b></em>'.
 * <p>
 * The fill style is a style to specify the fill properties of a node
 * </p>
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.gmf.runtime.notation.FillStyle#getFillColor <em>Fill
 * Color</em>}</li>
 * <li>{@link org.eclipse.gmf.runtime.notation.FillStyle#getTransparency
 * <em>Transparency</em>}</li>
 * <li>{@link org.eclipse.gmf.runtime.notation.FillStyle#getGradient
 * <em>Gradient</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getFillStyle()
 * @model
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public interface FillStyle extends Style {
	/**
	 * Returns the value of the '<em><b>Fill Color</b></em>' attribute. The default
	 * value is <code>"16777215"</code>. <!-- begin-user-doc -->
	 * <p>
	 * The fill color is the color used in painting the background of node visuals
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Fill Color</em>' attribute.
	 * @see #setFillColor(int)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getFillStyle_FillColor()
	 * @model default="16777215"
	 * @generated
	 */
	int getFillColor();

	/**
	 * Sets the value of the
	 * '{@link org.eclipse.gmf.runtime.notation.FillStyle#getFillColor <em>Fill
	 * Color</em>}' attribute. <!-- begin-user-doc -->
	 * <p>
	 * The fill color is the color used in painting the background of node visuals
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Fill Color</em>' attribute.
	 * @see #getFillColor()
	 * @generated
	 */
	void setFillColor(int value);

	/**
	 * Returns the value of the '<em><b>Transparency</b></em>' attribute. The
	 * default value is <code>"-1"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transparency</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Transparency</em>' attribute.
	 * @see #setTransparency(int)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getFillStyle_Transparency()
	 * @model default="-1"
	 * @generated
	 */
	int getTransparency();

	/**
	 * Sets the value of the
	 * '{@link org.eclipse.gmf.runtime.notation.FillStyle#getTransparency
	 * <em>Transparency</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Transparency</em>' attribute.
	 * @see #getTransparency()
	 * @generated
	 */
	void setTransparency(int value);

	/**
	 * Returns the value of the '<em><b>Gradient</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gradient</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Gradient</em>' attribute.
	 * @see #setGradient(GradientData)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getFillStyle_Gradient()
	 * @model dataType="org.eclipse.gmf.runtime.notation.GradientData"
	 * @generated
	 */
	GradientData getGradient();

	/**
	 * Sets the value of the
	 * '{@link org.eclipse.gmf.runtime.notation.FillStyle#getGradient
	 * <em>Gradient</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Gradient</em>' attribute.
	 * @see #getGradient()
	 * @generated
	 */
	void setGradient(GradientData value);

} // FillStyle
