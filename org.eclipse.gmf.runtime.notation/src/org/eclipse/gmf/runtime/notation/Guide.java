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

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guide</b></em>'.
 * <p>
 * A guide is a constraint on the x-y layout of nodes. A guide is defined by a position along 
 * one the of the diagram rulers. Nodes attached to a guide can be attached by a varierty
 * of alignments
 * </p>
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.Guide#getPosition <em>Position</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.Guide#getNodeMap <em>Node Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getGuide()
 * @model 
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public interface Guide extends EObject {
    /**
     * Returns the value of the '<em><b>Position</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * The position is the distance along the diagram ruler of the guide
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Position</em>' attribute.
     * @see #setPosition(int)
     * @see org.eclipse.gmf.runtime.notation.NotationPackage#getGuide_Position()
     * @model default="0"
     * @generated
     */
	int getPosition();

    /**
     * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.Guide#getPosition <em>Position</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * The position is the distance along the diagram ruler of the guide
	 * </p>
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Position</em>' attribute.
     * @see #getPosition()
     * @generated
     */
	void setPosition(int value);

    /**
     * Returns the value of the '<em><b>Node Map</b></em>' map.
     * The key is of type {@link org.eclipse.gmf.runtime.notation.Node},
     * and the value is of type {@link org.eclipse.gmf.runtime.notation.Alignment},
     * <!-- begin-user-doc -->
	 * <p>
	 * The map is an unordered map from nodes to their alignment in respect to the guide.
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Node Map</em>' map.
     * @see org.eclipse.gmf.runtime.notation.NotationPackage#getGuide_NodeMap()
     * @model mapType="org.eclipse.gmf.runtime.notation.NodeEntry" keyType="org.eclipse.gmf.runtime.notation.Node" valueType="org.eclipse.gmf.runtime.notation.Alignment"
     * @generated
     */
	EMap getNodeMap();

} // Guide
