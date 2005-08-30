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
