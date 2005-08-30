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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sorting Direction</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getSortingDirection()
 * @model
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public final class SortingDirection extends AbstractEnumerator {
	/**
	 * The '<em><b>Ascending</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASCENDING_LITERAL
	 * @model name="Ascending"
	 * @generated
	 * @ordered
	 */
	public static final int ASCENDING = 0;

	/**
	 * The '<em><b>Descending</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCENDING_LITERAL
	 * @model name="Descending"
	 * @generated
	 * @ordered
	 */
	public static final int DESCENDING = 1;

	/**
	 * The '<em><b>Ascending</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASCENDING
	 * @generated
	 * @ordered
	 */
	public static final SortingDirection ASCENDING_LITERAL = new SortingDirection(ASCENDING, "Ascending"); //$NON-NLS-1$

	/**
	 * The '<em><b>Descending</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCENDING
	 * @generated
	 * @ordered
	 */
	public static final SortingDirection DESCENDING_LITERAL = new SortingDirection(DESCENDING, "Descending"); //$NON-NLS-1$

	/**
	 * An array of all the '<em><b>Sorting Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SortingDirection[] VALUES_ARRAY =
		new SortingDirection[] {
			ASCENDING_LITERAL,
			DESCENDING_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Sorting Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sorting Direction</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SortingDirection get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SortingDirection result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sorting Direction</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SortingDirection get(int value) {
		switch (value) {
			case ASCENDING: return ASCENDING_LITERAL;
			case DESCENDING: return DESCENDING_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SortingDirection(int value, String name) {
		super(value, name);
	}

} //SortingDirection
