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
 * A representation of the literals of the enumeration '<em><b>Text Alignment</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getTextAlignment()
 * @model
 * @generated
 */
public final class TextAlignment extends AbstractEnumerator {
	/**
	 * The '<em><b>Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Left</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEFT_LITERAL
	 * @model name="Left"
	 * @generated
	 * @ordered
	 */
	public static final int LEFT = 0;

	/**
	 * The '<em><b>Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Right</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RIGHT_LITERAL
	 * @model name="Right"
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT = 1;

	/**
	 * The '<em><b>Center</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Center</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CENTER_LITERAL
	 * @model name="Center"
	 * @generated
	 * @ordered
	 */
	public static final int CENTER = 2;

	/**
	 * The '<em><b>Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT
	 * @generated
	 * @ordered
	 */
	public static final TextAlignment LEFT_LITERAL = new TextAlignment(LEFT, "Left", "Left"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT
	 * @generated
	 * @ordered
	 */
	public static final TextAlignment RIGHT_LITERAL = new TextAlignment(RIGHT, "Right", "Right"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Center</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTER
	 * @generated
	 * @ordered
	 */
	public static final TextAlignment CENTER_LITERAL = new TextAlignment(CENTER, "Center", "Center"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * An array of all the '<em><b>Text Alignment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TextAlignment[] VALUES_ARRAY =
		new TextAlignment[] {
			LEFT_LITERAL,
			RIGHT_LITERAL,
			CENTER_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Text Alignment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Text Alignment</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TextAlignment get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TextAlignment result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Text Alignment</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TextAlignment getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TextAlignment result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Text Alignment</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TextAlignment get(int value) {
		switch (value) {
			case LEFT: return LEFT_LITERAL;
			case RIGHT: return RIGHT_LITERAL;
			case CENTER: return CENTER_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TextAlignment(int value, String name, String literal) {
		super(value, name, literal);
	}

} //TextAlignment
