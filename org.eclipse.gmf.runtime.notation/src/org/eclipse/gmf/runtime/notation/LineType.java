/******************************************************************************
 * Copyright (c) 2008 IBM Corporation and others.
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
 * A representation of the literals of the enumeration '<em><b>Line Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getLineType()
 * @model
 * @generated
 */
public final class LineType extends AbstractEnumerator {
	/**
	 * The '<em><b>Solid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Solid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOLID_LITERAL
	 * @model name="Solid"
	 * @generated
	 * @ordered
	 */
	public static final int SOLID = 0;

	/**
	 * The '<em><b>Dash</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dash</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DASH_LITERAL
	 * @model name="Dash"
	 * @generated
	 * @ordered
	 */
	public static final int DASH = 1;

	/**
	 * The '<em><b>Dot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dot</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOT_LITERAL
	 * @model name="Dot"
	 * @generated
	 * @ordered
	 */
	public static final int DOT = 2;

	/**
	 * The '<em><b>Dash Dot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dash Dot</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DASH_DOT_LITERAL
	 * @model name="DashDot"
	 * @generated
	 * @ordered
	 */
	public static final int DASH_DOT = 3;

	/**
	 * The '<em><b>Dash Dot Dot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dash Dot Dot</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DASH_DOT_DOT_LITERAL
	 * @model name="DashDotDot"
	 * @generated
	 * @ordered
	 */
	public static final int DASH_DOT_DOT = 4;

	/**
	 * The '<em><b>Double</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Double</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_LITERAL
	 * @model name="Double"
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE = 5;

	/**
	 * The '<em><b>Solid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLID
	 * @generated
	 * @ordered
	 */
	public static final LineType SOLID_LITERAL = new LineType(SOLID, "Solid", "Solid"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Dash</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DASH
	 * @generated
	 * @ordered
	 */
	public static final LineType DASH_LITERAL = new LineType(DASH, "Dash", "Dash"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Dot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOT
	 * @generated
	 * @ordered
	 */
	public static final LineType DOT_LITERAL = new LineType(DOT, "Dot", "Dot"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Dash Dot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DASH_DOT
	 * @generated
	 * @ordered
	 */
	public static final LineType DASH_DOT_LITERAL = new LineType(DASH_DOT, "DashDot", "DashDot"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Dash Dot Dot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DASH_DOT_DOT
	 * @generated
	 * @ordered
	 */
	public static final LineType DASH_DOT_DOT_LITERAL = new LineType(DASH_DOT_DOT, "DashDotDot", "DashDotDot"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Double</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE
	 * @generated
	 * @ordered
	 */
	public static final LineType DOUBLE_LITERAL = new LineType(DOUBLE, "Double", "Double"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * An array of all the '<em><b>Line Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LineType[] VALUES_ARRAY =
		new LineType[] {
			SOLID_LITERAL,
			DASH_LITERAL,
			DOT_LITERAL,
			DASH_DOT_LITERAL,
			DASH_DOT_DOT_LITERAL,
			DOUBLE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Line Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Line Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LineType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LineType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Line Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LineType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LineType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Line Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LineType get(int value) {
		switch (value) {
			case SOLID: return SOLID_LITERAL;
			case DASH: return DASH_LITERAL;
			case DOT: return DOT_LITERAL;
			case DASH_DOT: return DASH_DOT_LITERAL;
			case DASH_DOT_DOT: return DASH_DOT_DOT_LITERAL;
			case DOUBLE: return DOUBLE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LineType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //LineType
