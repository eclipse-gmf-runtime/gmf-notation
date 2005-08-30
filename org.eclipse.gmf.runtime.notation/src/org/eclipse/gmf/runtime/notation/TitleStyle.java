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
 * A representation of the model object '<em><b>Title Style</b></em>'.
 * <p>
 * The title style is a style to be installed on views that have a title
 * </p>
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.TitleStyle#isShowTitle <em>Show Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getTitleStyle()
 * @model 
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public interface TitleStyle extends Style{
	/**
	 * Returns the value of the '<em><b>Show Title</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Title</em>' attribute.
	 * @see #setShowTitle(boolean)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getTitleStyle_ShowTitle()
	 * @model default="false"
	 * @generated
	 */
	boolean isShowTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.TitleStyle#isShowTitle <em>Show Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Title</em>' attribute.
	 * @see #isShowTitle()
	 * @generated
	 */
	void setShowTitle(boolean value);

} // TitleStyle
