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
	public static final JumpLinkType SEMICIRCLE_LITERAL = new JumpLinkType(SEMICIRCLE, "Semicircle", "Semicircle"); //$NON-NLS-2$//$NON-NLS-1$

    /**
	 * The '<em><b>Square</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQUARE
	 * @generated
	 * @ordered
	 */
	public static final JumpLinkType SQUARE_LITERAL = new JumpLinkType(SQUARE, "Square", "Square"); //$NON-NLS-2$//$NON-NLS-1$

    /**
	 * The '<em><b>Chamfered</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAMFERED
	 * @generated
	 * @ordered
	 */
	public static final JumpLinkType CHAMFERED_LITERAL = new JumpLinkType(CHAMFERED, "Chamfered", "Chamfered"); //$NON-NLS-2$//$NON-NLS-1$

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
	 * Returns the '<em><b>Jump Link Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JumpLinkType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JumpLinkType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

    /**
	 * Returns the '<em><b>Jump Link Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static JumpLinkType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JumpLinkType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

    /**
	 * Returns the '<em><b>Jump Link Type</b></em>' literal with the specified integer value.
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
    private JumpLinkType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //JumpLinkType
