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
 * A representation of the model object '<em><b>Ratio</b></em>'.
 * <p>
 * The ratio constraint specifies the size ratio of a node in its container
 * </p>
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.Ratio#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getRatio()
 * @model
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public interface Ratio extends LayoutConstraint {
    /**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The value is the ratio of the view to its container
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getRatio_Value()
	 * @model default="-1"
	 * @generated
	 */
	double getValue();

    /**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.Ratio#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * The value is the ratio of the view to its container
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // Ratio
