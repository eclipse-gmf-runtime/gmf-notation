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
 * A representation of the model object '<em><b>Location</b></em>'.
 * <p>
 * The location constraint specifies the position of a node
 * </p>
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.Location#getX <em>X</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.Location#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getLocation()
 * @model 
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public interface Location extends LayoutConstraint {
    /**
     * Returns the value of the '<em><b>X</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>X</em>' attribute.
     * @see #setX(int)
     * @see org.eclipse.gmf.runtime.notation.NotationPackage#getLocation_X()
     * @model default="0"
     * @generated
     */
	int getX();

    /**
     * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.Location#getX <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>X</em>' attribute.
     * @see #getX()
     * @generated
     */
	void setX(int value);

    /**
     * Returns the value of the '<em><b>Y</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Y</em>' attribute.
     * @see #setY(int)
     * @see org.eclipse.gmf.runtime.notation.NotationPackage#getLocation_Y()
     * @model default="0"
     * @generated
     */
	int getY();

    /**
     * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.Location#getY <em>Y</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Y</em>' attribute.
     * @see #getY()
     * @generated
     */
	void setY(int value);

} // Location
