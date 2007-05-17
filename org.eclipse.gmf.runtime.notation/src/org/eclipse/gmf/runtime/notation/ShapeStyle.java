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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape Style</b></em>'.
 * <p>
 * A shape style is a typical style to be installed on shape nodes that 
 * own a description (like note shapes). It gives the node fill, line, 
 * font and description style properties 
 * </p>
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getShapeStyle()
 * @model
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public interface ShapeStyle extends EObject, FontStyle, DescriptionStyle, FillStyle, LineStyle {
	// no default API
} // ShapeStyle
