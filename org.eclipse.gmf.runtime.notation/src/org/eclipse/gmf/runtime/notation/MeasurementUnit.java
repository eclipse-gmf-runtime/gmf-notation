/******************************************************************************
 * Copyright (c) 2006, 2007 IBM Corporation and others.
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
 * A representation of the literals of the enumeration '<em><b>Measurement Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getMeasurementUnit()
 * @model
 * @generated
 */
public final class MeasurementUnit extends AbstractEnumerator {
    /**
	 * The '<em><b>Himetric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Himetric</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIMETRIC_LITERAL
	 * @model name="Himetric"
	 * @generated
	 * @ordered
	 */
	public static final int HIMETRIC = 0;

    /**
	 * The '<em><b>Pixel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pixel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIXEL_LITERAL
	 * @model name="Pixel"
	 * @generated
	 * @ordered
	 */
	public static final int PIXEL = 1;

    /**
	 * The '<em><b>Himetric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIMETRIC
	 * @generated
	 * @ordered
	 */
	public static final MeasurementUnit HIMETRIC_LITERAL = new MeasurementUnit(HIMETRIC, "Himetric", "Himetric"); //$NON-NLS-2$//$NON-NLS-1$

    /**
	 * The '<em><b>Pixel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIXEL
	 * @generated
	 * @ordered
	 */
	public static final MeasurementUnit PIXEL_LITERAL = new MeasurementUnit(PIXEL, "Pixel", "Pixel"); //$NON-NLS-2$//$NON-NLS-1$

    /**
	 * An array of all the '<em><b>Measurement Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MeasurementUnit[] VALUES_ARRAY =
        new MeasurementUnit[] {
			HIMETRIC_LITERAL,
			PIXEL_LITERAL,
		};

    /**
	 * A public read-only list of all the '<em><b>Measurement Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
	 * Returns the '<em><b>Measurement Unit</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MeasurementUnit get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MeasurementUnit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

    /**
	 * Returns the '<em><b>Measurement Unit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static MeasurementUnit getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MeasurementUnit result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

    /**
	 * Returns the '<em><b>Measurement Unit</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MeasurementUnit get(int value) {
		switch (value) {
			case HIMETRIC: return HIMETRIC_LITERAL;
			case PIXEL: return PIXEL_LITERAL;
		}
		return null;
	}

    /**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private MeasurementUnit(int value, String name, String literal) {
		super(value, name, literal);
	}

} //MeasurementUnit
