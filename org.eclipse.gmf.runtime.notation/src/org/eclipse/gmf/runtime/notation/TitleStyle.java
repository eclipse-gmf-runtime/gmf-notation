/******************************************************************************
 * Copyright (c) 2004, 2006 IBM Corporation and others.
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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Title
 * Style</b></em>'.
 * <p>
 * The title style is a style to be installed on views that have a title
 * </p>
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.gmf.runtime.notation.TitleStyle#isShowTitle <em>Show
 * Title</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getTitleStyle()
 * @model
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public interface TitleStyle extends Style {
	/**
	 * Returns the value of the '<em><b>Show Title</b></em>' attribute. The default
	 * value is <code>"false"</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Show Title</em>' attribute.
	 * @see #setShowTitle(boolean)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getTitleStyle_ShowTitle()
	 * @model default="false"
	 * @generated
	 */
	boolean isShowTitle();

	/**
	 * Sets the value of the
	 * '{@link org.eclipse.gmf.runtime.notation.TitleStyle#isShowTitle <em>Show
	 * Title</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Show Title</em>' attribute.
	 * @see #isShowTitle()
	 * @generated
	 */
	void setShowTitle(boolean value);

} // TitleStyle
