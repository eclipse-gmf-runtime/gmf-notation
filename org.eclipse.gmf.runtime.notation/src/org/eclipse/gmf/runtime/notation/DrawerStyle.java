/******************************************************************************
 * Copyright (c) 2004, 2006 IBM Corporation and others.
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
 * A representation of the model object '<em><b>Drawer Style</b></em>'.
 * <p>
 * a style to be installed on nodes that can be collapsed like a drawer (eg. compartments)
 * </p>
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.DrawerStyle#isCollapsed <em>Collapsed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getDrawerStyle()
 * @model
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public interface DrawerStyle extends NotationObject, Style {
    /**
	 * Returns the value of the '<em><b>Collapsed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collapsed</em>' attribute.
	 * @see #setCollapsed(boolean)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getDrawerStyle_Collapsed()
	 * @model default="false"
	 * @generated
	 */
	boolean isCollapsed();

    /**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.DrawerStyle#isCollapsed <em>Collapsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collapsed</em>' attribute.
	 * @see #isCollapsed()
	 * @generated
	 */
	void setCollapsed(boolean value);

} // DrawerStyle
