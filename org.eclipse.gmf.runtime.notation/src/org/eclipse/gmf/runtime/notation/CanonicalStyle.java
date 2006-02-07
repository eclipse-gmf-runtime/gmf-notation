/******************************************************************************
 * Copyright (c) 2004 IBM Corporation and others.
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
 * A representation of the model object '<em><b>Canonical Style</b></em>'.
 * <p>
 * Canonical style is a style to be installed on views that need to be synchronized with business model
 * (i.e. notation model would be in synch with business model). Definition of 'in synch' is user-defined.
 * </p>
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.CanonicalStyle#isCanonical <em>Canonical</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getCanonicalStyle()
 * @model 
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public interface CanonicalStyle extends Style {
    /**
     * Returns the value of the '<em><b>Canonical</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Canonical</em>' attribute.
     * @see #setCanonical(boolean)
     * @see org.eclipse.gmf.runtime.notation.NotationPackage#getCanonicalStyle_Canonical()
     * @model default="true"
     * @generated
     */
	boolean isCanonical();

    /**
     * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.CanonicalStyle#isCanonical <em>Canonical</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Canonical</em>' attribute.
     * @see #isCanonical()
     * @generated
     */
	void setCanonical(boolean value);

} // CanonicalStyle
