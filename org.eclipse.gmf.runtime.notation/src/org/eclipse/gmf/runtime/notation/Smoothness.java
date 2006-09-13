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
 * A representation of the literals of the enumeration '<em><b>Smoothness</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getSmoothness()
 * @model
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public final class Smoothness extends AbstractEnumerator {
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
     * The '<em><b>Normal</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #NORMAL_LITERAL
     * @model name="Normal"
     * @generated
     * @ordered
     */
	public static final int NORMAL = 1;

    /**
     * The '<em><b>Less</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #LESS_LITERAL
     * @model name="Less"
     * @generated
     * @ordered
     */
	public static final int LESS = 2;

    /**
     * The '<em><b>More</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #MORE_LITERAL
     * @model name="More"
     * @generated
     * @ordered
     */
	public static final int MORE = 3;

    /**
     * The '<em><b>None</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #NONE
     * @generated
     * @ordered
     */
	public static final Smoothness NONE_LITERAL = new Smoothness(NONE, "None", "None"); //$NON-NLS-2$//$NON-NLS-1$

    /**
     * The '<em><b>Normal</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #NORMAL
     * @generated
     * @ordered
     */
	public static final Smoothness NORMAL_LITERAL = new Smoothness(NORMAL, "Normal", "Normal"); //$NON-NLS-2$//$NON-NLS-1$

    /**
     * The '<em><b>Less</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #LESS
     * @generated
     * @ordered
     */
	public static final Smoothness LESS_LITERAL = new Smoothness(LESS, "Less", "Less"); //$NON-NLS-2$//$NON-NLS-1$

    /**
     * The '<em><b>More</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #MORE
     * @generated
     * @ordered
     */
	public static final Smoothness MORE_LITERAL = new Smoothness(MORE, "More", "More"); //$NON-NLS-2$//$NON-NLS-1$

    /**
     * An array of all the '<em><b>Smoothness</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final Smoothness[] VALUES_ARRAY =
        new Smoothness[] {
            NONE_LITERAL,
            NORMAL_LITERAL,
            LESS_LITERAL,
            MORE_LITERAL,
        };

    /**
     * A public read-only list of all the '<em><b>Smoothness</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Smoothness</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static Smoothness get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            Smoothness result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Smoothness</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static Smoothness getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            Smoothness result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Smoothness</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static Smoothness get(int value) {
        switch (value) {
            case NONE: return NONE_LITERAL;
            case NORMAL: return NORMAL_LITERAL;
            case LESS: return LESS_LITERAL;
            case MORE: return MORE_LITERAL;
        }
        return null;	
    }

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private Smoothness(int value, String name, String literal) {
        super(value, name, literal);
    }

} //Smoothness
