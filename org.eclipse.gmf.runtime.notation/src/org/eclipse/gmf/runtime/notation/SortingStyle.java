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

import java.util.Map;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sorting Style</b></em>'.
 * <p>
 * The sorting style is a style to be installed on nodes representing lists to be sorted
 * </p>
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.SortingStyle#getSorting <em>Sorting</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.SortingStyle#getSortingKeys <em>Sorting Keys</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.SortingStyle#getSortedObjects <em>Sorted Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getSortingStyle()
 * @model 
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public interface SortingStyle extends Style {
    /**
     * Returns the value of the '<em><b>Sorting</b></em>' attribute.
     * The default value is <code>"None"</code>.
     * The literals are from the enumeration {@link org.eclipse.gmf.runtime.notation.Sorting}.
     * <!-- begin-user-doc -->
	 * <p>
	 * This is the type of sorting applied to the list represented by the node
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Sorting</em>' attribute.
     * @see org.eclipse.gmf.runtime.notation.Sorting
     * @see #setSorting(Sorting)
     * @see org.eclipse.gmf.runtime.notation.NotationPackage#getSortingStyle_Sorting()
     * @model default="None"
     * @generated
     */
	Sorting getSorting();

    /**
     * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.SortingStyle#getSorting <em>Sorting</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * This is the type of sorting applied to the list represented by the node
	 * </p>
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sorting</em>' attribute.
     * @see org.eclipse.gmf.runtime.notation.Sorting
     * @see #getSorting()
     * @generated
     */
	void setSorting(Sorting value);

	/**
	 * Returns the value of the '<em><b>Sorting Keys</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The property is an ordered map of sorting string keys to their <code>SortingDirection</code>. The key strings are user-defined and
	 * normally used when the <em>Sorting</em> property is set to <em>Automatic</em>
	 * 
	 * The value is a non-modifiable map of <code>java.lang.String</code> objects to <code>org.eclipse.gmf.runtime.notation.SortingDirection</code> objects
	 * Any attempt to change the returned map will result in <code>UnsupportedOperationException</code> thrown;
	 * instead use <code>setSortingKeys</code> to change the map
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Keys</em>' attribute.
	 * @see #setSortingKeys(Map)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getSortingStyle_SortingKeys()
	 * @model dataType="org.eclipse.gmf.runtime.notation.SortKeyMap"
	 * @generated NOT
	 */
	Map getSortingKeys();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.SortingStyle#getSortingKeys <em>Sorting Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The property is an ordered map of sorting string keys to their <code>SortingDirection</code>. The key strings are user-defined and
	 * normally used when the <em>Sorting</em> property is set to <em>Automatic</em>
	 * 
	 * The value must be an empty map or one that contains only <code>java.lang.String</code> objects in the keys and <code>org.eclipse.gmf.runtime.notation.Alignment</code> objects in the values
	 * </p>
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Keys</em>' attribute. The value cannot be <code>null</code>
	 * @see #getSortingKeys()
	 * @throws NullPointerException if the passed map is <code>null</code>
	 * @throws IllegalArgumentException if one or more keys in the passed map is not of type <code>java.lang.String</code> or one or more values is not of type <code>org.eclipse.gmf.runtime.notation.Alignment</code>
	 * @generated NOT
	 */
	void setSortingKeys(Map value);

    /**
     * Returns the value of the '<em><b>Sorted Objects</b></em>' reference list.
     * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
     * <!-- begin-user-doc -->
	 * <p>
	 * The property is an ordered list of references to objects be sorted. The property is
	 * normally used when the <em>Sorting</em> property is set to <em>Manual</em>
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Sorted Objects</em>' reference list.
     * @see org.eclipse.gmf.runtime.notation.NotationPackage#getSortingStyle_SortedObjects()
     * @model type="org.eclipse.emf.ecore.EObject"
     * @generated
     */
	EList getSortedObjects();

} // SortingStyle
