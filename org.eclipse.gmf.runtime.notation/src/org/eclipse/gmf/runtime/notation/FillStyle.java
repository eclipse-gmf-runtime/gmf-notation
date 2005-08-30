/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2004.  All Rights Reserved.                    |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package org.eclipse.gmf.runtime.notation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fill Style</b></em>'.
 * <p>
 * The fill style is a style to specify the fill properties of a node
 * </p>
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.FillStyle#getFillColor <em>Fill Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getFillStyle()
 * @model 
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public interface FillStyle extends Style{
	/**
	 * Returns the value of the '<em><b>Fill Color</b></em>' attribute.
	 * The default value is <code>"16777215"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The fill color is the color used in painting the background of node visuals
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Color</em>' attribute.
	 * @see #setFillColor(int)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getFillStyle_FillColor()
	 * @model default="16777215"
	 * @generated
	 */
	int getFillColor();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.FillStyle#getFillColor <em>Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The fill color is the color used in painting the background of node visuals
	 * </p>
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Color</em>' attribute.
	 * @see #getFillColor()
	 * @generated
	 */
	void setFillColor(int value);

} // FillStyle
