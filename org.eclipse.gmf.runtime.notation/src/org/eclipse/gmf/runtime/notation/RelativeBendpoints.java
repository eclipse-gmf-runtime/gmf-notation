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

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Bendpoints</b></em>'.
 * <p>
 * A type of bendpoints representing a collection of points with relative distances 
 * along the x- and y-axis to the source and target views of an edge.
 * </p>
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.RelativeBendpoints#getPoints <em>Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getRelativeBendpoints()
 * @model 
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public interface RelativeBendpoints extends Bendpoints{
	/**
	 * Returns the value of the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The value is a non-modifiable list of <code>org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint</code> objects
	 * Any attempt to change the returned list will result in <code>UnsupportedOperationException</code> thrown;
	 * instead use <code>setPoints</code> to change the list
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' attribute.
	 * @see #setPoints(List)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getRelativeBendpoints_Points()
	 * @model dataType="org.eclipse.gmf.runtime.notation.RelativeBendpointList" many="false"
	 * @generated NOT
	 */
	List getPoints();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.RelativeBendpoints#getPoints <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * The value must be an empty list or one that contains only <code>org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint</code> objects
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' attribute. The value cannot be <code>null</code>
	 * @see #getPoints()
	 * @throws NullPointerException if the passed list is <code>null</code>
	 * @throws IllegalArgumentException if one or more objects in the passed list is not of type <code>corg.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint</code> 
	 * @generated NOT
	 */
	void setPoints(List value);

} // RelativeBendpoints
