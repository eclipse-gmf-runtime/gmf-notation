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

package org.eclipse.gmf.runtime.notation.datatype;

import java.util.StringTokenizer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relative Bendpoint</b></em>'.
 * <p>
 * A type of bendpoints representing a collection of points with relative distances 
 * along the x- and y-axis to the source and target views of an edge
 * </p>
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.RelativeBendpointImpl#getSourceX <em>Source X</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.RelativeBendpointImpl#getSourceY <em>Source Y</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.RelativeBendpointImpl#getTargetX <em>Target X</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.RelativeBendpointImpl#getTargetY <em>Target Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public class RelativeBendpoint {
	/**
	 * The default value of the '{@link #getSourceX() <em>Source X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceX()
	 * @generated
	 * @ordered
	 */
	protected static final int SOURCE_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSourceX() <em>Source X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceX()
	 * @generated
	 * @ordered
	 */
	protected int sourceX = SOURCE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceY() <em>Source Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceY()
	 * @generated
	 * @ordered
	 */
	protected static final int SOURCE_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSourceY() <em>Source Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceY()
	 * @generated
	 * @ordered
	 */
	protected int sourceY = SOURCE_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetX() <em>Target X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetX()
	 * @generated
	 * @ordered
	 */
	protected static final int TARGET_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTargetX() <em>Target X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetX()
	 * @generated
	 * @ordered
	 */
	protected int targetX = TARGET_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetY() <em>Target Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetY()
	 * @generated
	 * @ordered
	 */
	protected static final int TARGET_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTargetY() <em>Target Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetY()
	 * @generated
	 * @ordered
	 */
	protected int targetY = TARGET_Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeBendpoint(String string) {
		StringTokenizer t = new StringTokenizer(string.substring(1, string.length()-1), ","); //$NON-NLS-1$
		setSourceX(Integer.parseInt(t.nextToken().trim()));
		setSourceY(Integer.parseInt(t.nextToken().trim()));
		setTargetX(Integer.parseInt(t.nextToken().trim()));
		setTargetY(Integer.parseInt(t.nextToken().trim()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeBendpoint() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeBendpoint(int sourceX, int sourceY, int targetX, int targetY) {
		setSourceX(sourceX);
		setSourceY(sourceY);
		setTargetX(targetX);
		setTargetY(targetY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returns the x-distance from the bendpoint to 
	 * the attach point with the source view
	 * </p>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSourceX() {
		return sourceX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * Sets the x-distance from the bendpoint to 
	 * the attach point with the source view
	 * </p>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setSourceX(int newSourceX) {
		sourceX = newSourceX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returns the y-distance from the bendpoint to 
	 * the attach point with the source view
	 * </p>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSourceY() {
		return sourceY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * Sets the y-distance from the bendpoint to 
	 * the attach point with the source view
	 * </p>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setSourceY(int newSourceY) {
		sourceY = newSourceY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returns the x-distance from the bendpoint to 
	 * the attach point with the target view
	 * </p>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTargetX() {
		return targetX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * Sets the x-distance from the bendpoint to 
	 * the attach point with the target view
	 * </p>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setTargetX(int newTargetX) {
		targetX = newTargetX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returns the y-distance from the bendpoint to 
	 * the attach point with the target view
	 * </p>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTargetY() {
		return targetY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * Sets the y-distance from the bendpoint to 
	 * the attach point with the target view
	 * </p>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setTargetY(int newTargetY) {
		targetY = newTargetY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (sourceX: "); //$NON-NLS-1$
		result.append(sourceX);
		result.append(", sourceY: "); //$NON-NLS-1$
		result.append(sourceY);
		result.append(", targetX: "); //$NON-NLS-1$
		result.append(targetX);
		result.append(", targetY: "); //$NON-NLS-1$
		result.append(targetY);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString() {
		StringBuffer result = new StringBuffer(""); //$NON-NLS-1$
		result.append('[');
		result.append(sourceX);
		result.append(", "); //$NON-NLS-1$
		result.append(sourceY);
		result.append(", "); //$NON-NLS-1$
		result.append(targetX);
		result.append(", "); //$NON-NLS-1$
		result.append(targetY);
		result.append(']');
		return result.toString();
	}

} //RelativeBendpointImpl
