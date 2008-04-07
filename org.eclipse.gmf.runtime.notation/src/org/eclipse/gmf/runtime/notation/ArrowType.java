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
 * A representation of the literals of the enumeration '<em><b>Arrow Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getArrowType()
 * @model
 * @generated
 */
public final class ArrowType extends AbstractEnumerator {
	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE_LITERAL
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE = 0;

	/**
	 * The '<em><b>Open Arrow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Open Arrow</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPEN_ARROW_LITERAL
	 * @model name="OpenArrow"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_ARROW = 1;

	/**
	 * The '<em><b>Solid Arrow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Solid Arrow</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOLID_ARROW_LITERAL
	 * @model name="SolidArrow"
	 * @generated
	 * @ordered
	 */
	public static final int SOLID_ARROW = 2;

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @generated
	 * @ordered
	 */
	public static final ArrowType NONE_LITERAL = new ArrowType(NONE, "None", "None"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Open Arrow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_ARROW
	 * @generated
	 * @ordered
	 */
	public static final ArrowType OPEN_ARROW_LITERAL = new ArrowType(OPEN_ARROW, "OpenArrow", "OpenArrow"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Solid Arrow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLID_ARROW
	 * @generated
	 * @ordered
	 */
	public static final ArrowType SOLID_ARROW_LITERAL = new ArrowType(SOLID_ARROW, "SolidArrow", "SolidArrow"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * An array of all the '<em><b>Arrow Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ArrowType[] VALUES_ARRAY =
		new ArrowType[] {
			NONE_LITERAL,
			OPEN_ARROW_LITERAL,
			SOLID_ARROW_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Arrow Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Arrow Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArrowType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArrowType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Arrow Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArrowType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArrowType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Arrow Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArrowType get(int value) {
		switch (value) {
			case NONE: return NONE_LITERAL;
			case OPEN_ARROW: return OPEN_ARROW_LITERAL;
			case SOLID_ARROW: return SOLID_ARROW_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ArrowType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ArrowType
