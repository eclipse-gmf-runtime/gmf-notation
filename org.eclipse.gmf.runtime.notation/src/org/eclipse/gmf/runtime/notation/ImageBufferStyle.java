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
 * A representation of the model object '<em><b>Image Buffer Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.ImageBufferStyle#getImageBuffer <em>Image Buffer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getImageBufferStyle()
 * @model 
 * @generated
 */
/*
 * @canBeSeenBy org.eclipse.gmf.runtime.notation.*
 */
public interface ImageBufferStyle extends ImageStyle {
	/**
	 * Returns the value of the '<em><b>Image Buffer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Buffer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Buffer</em>' containment reference.
	 * @see #setImageBuffer(Image)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getImageBufferStyle_ImageBuffer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Image getImageBuffer();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.ImageBufferStyle#getImageBuffer <em>Image Buffer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Buffer</em>' containment reference.
	 * @see #getImageBuffer()
	 * @generated
	 */
	void setImageBuffer(Image value);

} // ImageBufferStyle
