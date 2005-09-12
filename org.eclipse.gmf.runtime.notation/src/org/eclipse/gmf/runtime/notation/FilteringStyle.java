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

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filtering Style</b></em>'.
 * <p>
 * The filtering style is a style to be installed on nodes representing lists to be filtered
 * </p>
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.FilteringStyle#getFiltering <em>Filtering</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.FilteringStyle#getFilteringKeys <em>Filtering Keys</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.FilteringStyle#getFilteredObjects <em>Filtered Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getFilteringStyle()
 * @model 
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public interface FilteringStyle extends Style{
	/**
	 * Returns the value of the '<em><b>Filtering</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link org.eclipse.gmf.runtime.notation.Filtering}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * This is the type of filtering applied to the list represented by the node
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filtering</em>' attribute.
	 * @see org.eclipse.gmf.runtime.notation.Filtering
	 * @see #setFiltering(Filtering)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getFilteringStyle_Filtering()
	 * @model default="None"
	 * @generated
	 */
	Filtering getFiltering();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.FilteringStyle#getFiltering <em>Filtering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * This is the type of filtering applied to the list represented by the node
	 * </p>
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filtering</em>' attribute.
	 * @see org.eclipse.gmf.runtime.notation.Filtering
	 * @see #getFiltering()
	 * @generated
	 */
	void setFiltering(Filtering value);

	/**
	 * Returns the value of the '<em><b>Filtering Keys</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The property is an unordered list of string keys to filter on. The keys string are user-defined and
	 * normally used when the <em>Filtering</em> property is set to <em>Automatic</em>
	 * 
	 * The value is a non-modifiable list of <code>java.lang.String</code> objects
	 * Any attempt to change the returned list will result in <code>UnsupportedOperationException</code> thrown;
	 * instead use <code>setFilteringKeys</code> to change the list
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filtering Keys</em>' attribute.
	 * @see #setFilteringKeys(List)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getFilteringStyle_FilteringKeys()
	 * @model dataType="org.eclipse.gmf.runtime.notation.FilterKeyList" many="false"
	 * @generated NOT
	 */
	List getFilteringKeys();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.FilteringStyle#getFilteringKeys <em>Filtering Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The property is an unordered list of string keys to filter on. The keys string are user-defined and
	 * normally used when the <em>Filtering</em> property is set to <em>Automatic</em>
	 * 
	 * The value must be an empty list or one that contains only <code>java.lang.String</code> objects
	 * </p>
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filtering Keys</em>' attribute. The value cannot be <code>null</code>
	 * @see #getFilteringKeys()
	 * @throws NullPointerException if the passed list is <code>null</code>
	 * @throws IllegalArgumentException if one or more objects in the passed list is not of type <code>java.lang.String</code> 
	 * @generated NOT
	 */
	void setFilteringKeys(List value);

	/**
	 * Returns the value of the '<em><b>Filtered Objects</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The property is an unordered list of references to objects be filtered. The property is
	 * normally used when the <em>Filtering</em> property is set to <em>Manual</em>
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filtered Objects</em>' reference list.
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getFilteringStyle_FilteredObjects()
	 * @model type="org.eclipse.emf.ecore.EObject"
	 * @generated
	 */
	EList getFilteredObjects();

} // FilteringStyle
