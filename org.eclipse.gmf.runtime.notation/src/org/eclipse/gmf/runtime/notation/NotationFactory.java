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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.runtime.notation.NotationPackage
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public interface NotationFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	NotationFactory eINSTANCE = org.eclipse.gmf.runtime.notation.impl.NotationFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Edge</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Edge</em>'.
     * @generated
     */
	Edge createEdge();

    /**
     * Returns a new object of class '<em>Node</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Node</em>'.
     * @generated
     */
	Node createNode();

    /**
     * Returns a new object of class '<em>Fill Style</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Fill Style</em>'.
     * @generated
     */
	FillStyle createFillStyle();

    /**
     * Returns a new object of class '<em>Line Style</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Line Style</em>'.
     * @generated
     */
	LineStyle createLineStyle();

    /**
     * Returns a new object of class '<em>Font Style</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Font Style</em>'.
     * @generated
     */
	FontStyle createFontStyle();

    /**
     * Returns a new object of class '<em>Title Style</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Title Style</em>'.
     * @generated
     */
	TitleStyle createTitleStyle();

    /**
     * Returns a new object of class '<em>Sorting Style</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Sorting Style</em>'.
     * @generated
     */
	SortingStyle createSortingStyle();

    /**
     * Returns a new object of class '<em>Description Style</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Description Style</em>'.
     * @generated
     */
	DescriptionStyle createDescriptionStyle();

    /**
     * Returns a new object of class '<em>Size</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Size</em>'.
     * @generated
     */
	Size createSize();

    /**
     * Returns a new object of class '<em>Location</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Location</em>'.
     * @generated
     */
	Location createLocation();

    /**
     * Returns a new object of class '<em>Bounds</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Bounds</em>'.
     * @generated
     */
	Bounds createBounds();

    /**
     * Returns a new object of class '<em>Ratio</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Ratio</em>'.
     * @generated
     */
	Ratio createRatio();

    /**
     * Returns a new object of class '<em>Identity Anchor</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Identity Anchor</em>'.
     * @generated
     */
	IdentityAnchor createIdentityAnchor();

    /**
     * Returns a new object of class '<em>Routing Style</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Routing Style</em>'.
     * @generated
     */
	RoutingStyle createRoutingStyle();

    /**
     * Returns a new object of class '<em>Relative Bendpoints</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Relative Bendpoints</em>'.
     * @generated
     */
	RelativeBendpoints createRelativeBendpoints();

    /**
     * Returns a new object of class '<em>Canonical Style</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Canonical Style</em>'.
     * @generated
     */
	CanonicalStyle createCanonicalStyle();

    /**
     * Returns a new object of class '<em>Shape Style</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Shape Style</em>'.
     * @generated
     */
	ShapeStyle createShapeStyle();

    /**
     * Returns a new object of class '<em>Connector Style</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Connector Style</em>'.
     * @generated
     */
	ConnectorStyle createConnectorStyle();

    /**
     * Returns a new object of class '<em>Diagram</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram</em>'.
     * @generated
     */
	Diagram createDiagram();

    /**
     * Returns a new object of class '<em>Image</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Image</em>'.
     * @generated
     */
	Image createImage();

    /**
     * Returns a new object of class '<em>Page Style</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Page Style</em>'.
     * @generated
     */
	PageStyle createPageStyle();

    /**
     * Returns a new object of class '<em>Drawer Style</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Drawer Style</em>'.
     * @generated
     */
	DrawerStyle createDrawerStyle();

    /**
     * Returns a new object of class '<em>Guide Style</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Guide Style</em>'.
     * @generated
     */
	GuideStyle createGuideStyle();

    /**
     * Returns a new object of class '<em>Guide</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Guide</em>'.
     * @generated
     */
	Guide createGuide();

    /**
     * Returns a new object of class '<em>Filtering Style</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Filtering Style</em>'.
     * @generated
     */
	FilteringStyle createFilteringStyle();

    /**
     * Returns a new object of class '<em>Diagram Style</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram Style</em>'.
     * @generated
     */
	DiagramStyle createDiagramStyle();

    /**
     * Returns a new object of class '<em>Image Style</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Image Style</em>'.
     * @generated
     */
	ImageStyle createImageStyle();

    /**
     * Returns a new object of class '<em>Image Buffer Style</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Image Buffer Style</em>'.
     * @generated
     */
	ImageBufferStyle createImageBufferStyle();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
	NotationPackage getNotationPackage();

} //NotationFactory
