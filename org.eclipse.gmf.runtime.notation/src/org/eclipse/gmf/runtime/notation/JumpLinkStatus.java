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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Jump Link Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getJumpLinkStatus()
 * @model
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public final class JumpLinkStatus extends AbstractEnumerator {
	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_LITERAL
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE = 0;

	/**
	 * The '<em><b>All</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_LITERAL
	 * @model name="All"
	 * @generated
	 * @ordered
	 */
	public static final int ALL = 1;

	/**
	 * The '<em><b>Below</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BELOW_LITERAL
	 * @model name="Below"
	 * @generated
	 * @ordered
	 */
	public static final int BELOW = 2;

	/**
	 * The '<em><b>Above</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABOVE_LITERAL
	 * @model name="Above"
	 * @generated
	 * @ordered
	 */
	public static final int ABOVE = 3;

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @generated
	 * @ordered
	 */
	public static final JumpLinkStatus NONE_LITERAL = new JumpLinkStatus(NONE, "None"); //$NON-NLS-1$

	/**
	 * The '<em><b>All</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL
	 * @generated
	 * @ordered
	 */
	public static final JumpLinkStatus ALL_LITERAL = new JumpLinkStatus(ALL, "All"); //$NON-NLS-1$

	/**
	 * The '<em><b>Below</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BELOW
	 * @generated
	 * @ordered
	 */
	public static final JumpLinkStatus BELOW_LITERAL = new JumpLinkStatus(BELOW, "Below"); //$NON-NLS-1$

	/**
	 * The '<em><b>Above</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABOVE
	 * @generated
	 * @ordered
	 */
	public static final JumpLinkStatus ABOVE_LITERAL = new JumpLinkStatus(ABOVE, "Above"); //$NON-NLS-1$

	/**
	 * An array of all the '<em><b>Jump Link Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final JumpLinkStatus[] VALUES_ARRAY =
		new JumpLinkStatus[] {
			NONE_LITERAL,
			ALL_LITERAL,
			BELOW_LITERAL,
			ABOVE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Jump Link Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Jump Link Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JumpLinkStatus get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JumpLinkStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Jump Link Status</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JumpLinkStatus get(int value) {
		switch (value) {
			case NONE: return NONE_LITERAL;
			case ALL: return ALL_LITERAL;
			case BELOW: return BELOW_LITERAL;
			case ABOVE: return ABOVE_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private JumpLinkStatus(int value, String name) {
		super(value, name);
	}

} //JumpLinkStatus
