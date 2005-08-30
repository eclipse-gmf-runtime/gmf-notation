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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guide Style</b></em>'.
 * <p>
 * The guide style is a style to be installed on diagrams that support rulers/guides
 * </p>
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.GuideStyle#getHorizontalGuides <em>Horizontal Guides</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.GuideStyle#getVerticalGuides <em>Vertical Guides</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getGuideStyle()
 * @model 
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public interface GuideStyle extends Style {
	/**
	 * Returns the value of the '<em><b>Horizontal Guides</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.runtime.notation.Guide}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * These are the guides along the horizontal ruler of the diagram
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Guides</em>' containment reference list.
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getGuideStyle_HorizontalGuides()
	 * @model type="org.eclipse.gmf.runtime.notation.Guide" containment="true"
	 * @generated
	 */
	EList getHorizontalGuides();

	/**
	 * Returns the value of the '<em><b>Vertical Guides</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.runtime.notation.Guide}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * These are the guides along the vertical ruler of the diagram
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Guides</em>' containment reference list.
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getGuideStyle_VerticalGuides()
	 * @model type="org.eclipse.gmf.runtime.notation.Guide" containment="true"
	 * @generated
	 */
	EList getVerticalGuides();

} // GuideStyle
