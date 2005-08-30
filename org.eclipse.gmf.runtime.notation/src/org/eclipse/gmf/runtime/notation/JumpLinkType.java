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
 * A representation of the literals of the enumeration '<em><b>Jump Link Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getJumpLinkType()
 * @model
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public final class JumpLinkType extends AbstractEnumerator {
	/**
	 * The '<em><b>Semicircle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMICIRCLE_LITERAL
	 * @model name="Semicircle"
	 * @generated
	 * @ordered
	 */
	public static final int SEMICIRCLE = 0;

	/**
	 * The '<em><b>Square</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQUARE_LITERAL
	 * @model name="Square"
	 * @generated
	 * @ordered
	 */
	public static final int SQUARE = 1;

	/**
	 * The '<em><b>Chamfered</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAMFERED_LITERAL
	 * @model name="Chamfered"
	 * @generated
	 * @ordered
	 */
	public static final int CHAMFERED = 2;

	/**
	 * The '<em><b>Semicircle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMICIRCLE
	 * @generated
	 * @ordered
	 */
	public static final JumpLinkType SEMICIRCLE_LITERAL = new JumpLinkType(SEMICIRCLE, "Semicircle"); //$NON-NLS-1$

	/**
	 * The '<em><b>Square</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQUARE
	 * @generated
	 * @ordered
	 */
	public static final JumpLinkType SQUARE_LITERAL = new JumpLinkType(SQUARE, "Square"); //$NON-NLS-1$

	/**
	 * The '<em><b>Chamfered</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAMFERED
	 * @generated
	 * @ordered
	 */
	public static final JumpLinkType CHAMFERED_LITERAL = new JumpLinkType(CHAMFERED, "Chamfered"); //$NON-NLS-1$

	/**
	 * An array of all the '<em><b>Jump Link Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final JumpLinkType[] VALUES_ARRAY =
		new JumpLinkType[] {
			SEMICIRCLE_LITERAL,
			SQUARE_LITERAL,
			CHAMFERED_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Jump Link Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Jump Link Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JumpLinkType get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JumpLinkType result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Jump Link Type</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JumpLinkType get(int value) {
		switch (value) {
			case SEMICIRCLE: return SEMICIRCLE_LITERAL;
			case SQUARE: return SQUARE_LITERAL;
			case CHAMFERED: return CHAMFERED_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private JumpLinkType(int value, String name) {
		super(value, name);
	}

} //JumpLinkType
