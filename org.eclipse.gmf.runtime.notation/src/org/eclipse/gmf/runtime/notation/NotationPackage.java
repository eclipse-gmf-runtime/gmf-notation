/******************************************************************************
 * Copyright (c) 2004, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.runtime.notation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.runtime.notation.NotationFactory
 * @model kind="package"
 * @generated
 */
public interface NotationPackage extends EPackage{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "notation"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/gmf/runtime/1.0.0/notation"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "notation"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NotationPackage eINSTANCE = org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.impl.ViewImpl
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 18;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__EANNOTATIONS = EcorePackage.EMODEL_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__VISIBLE = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__TYPE = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__MUTABLE = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__SOURCE_EDGES = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__TARGET_EDGES = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Persisted Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__PERSISTED_CHILDREN = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__STYLES = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ELEMENT = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__DIAGRAM = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Transient Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__TRANSIENT_CHILDREN = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.impl.EdgeImpl
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__EANNOTATIONS = VIEW__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__VISIBLE = VIEW__VISIBLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TYPE = VIEW__TYPE;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__MUTABLE = VIEW__MUTABLE;

	/**
	 * The feature id for the '<em><b>Source Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SOURCE_EDGES = VIEW__SOURCE_EDGES;

	/**
	 * The feature id for the '<em><b>Target Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TARGET_EDGES = VIEW__TARGET_EDGES;

	/**
	 * The feature id for the '<em><b>Persisted Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__PERSISTED_CHILDREN = VIEW__PERSISTED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__STYLES = VIEW__STYLES;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ELEMENT = VIEW__ELEMENT;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__DIAGRAM = VIEW__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Transient Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TRANSIENT_CHILDREN = VIEW__TRANSIENT_CHILDREN;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SOURCE = VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TARGET = VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__BENDPOINTS = VIEW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Anchor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SOURCE_ANCHOR = VIEW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Anchor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TARGET_ANCHOR = VIEW_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = VIEW_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.impl.NodeImpl
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EANNOTATIONS = VIEW__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__VISIBLE = VIEW__VISIBLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TYPE = VIEW__TYPE;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MUTABLE = VIEW__MUTABLE;

	/**
	 * The feature id for the '<em><b>Source Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SOURCE_EDGES = VIEW__SOURCE_EDGES;

	/**
	 * The feature id for the '<em><b>Target Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TARGET_EDGES = VIEW__TARGET_EDGES;

	/**
	 * The feature id for the '<em><b>Persisted Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PERSISTED_CHILDREN = VIEW__PERSISTED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__STYLES = VIEW__STYLES;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ELEMENT = VIEW__ELEMENT;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DIAGRAM = VIEW__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Transient Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TRANSIENT_CHILDREN = VIEW__TRANSIENT_CHILDREN;

	/**
	 * The feature id for the '<em><b>Layout Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LAYOUT_CONSTRAINT = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.Style <em>Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.Style
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getStyle()
	 * @generated
	 */
	int STYLE = 2;

	/**
	 * The number of structural features of the the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.impl.FillStyleImpl <em>Fill Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.impl.FillStyleImpl
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getFillStyle()
	 * @generated
	 */
	int FILL_STYLE = 3;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL_STYLE__FILL_COLOR = STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Fill Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.impl.LineStyleImpl <em>Line Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.impl.LineStyleImpl
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getLineStyle()
	 * @generated
	 */
	int LINE_STYLE = 4;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__LINE_COLOR = STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Line Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.impl.FontStyleImpl <em>Font Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.impl.FontStyleImpl
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getFontStyle()
	 * @generated
	 */
	int FONT_STYLE = 5;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_STYLE__FONT_COLOR = STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_STYLE__FONT_NAME = STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Font Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_STYLE__FONT_HEIGHT = STYLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_STYLE__BOLD = STYLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_STYLE__ITALIC = STYLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_STYLE__UNDERLINE = STYLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Strike Through</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_STYLE__STRIKE_THROUGH = STYLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the the '<em>Font Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.impl.TitleStyleImpl <em>Title Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.impl.TitleStyleImpl
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getTitleStyle()
	 * @generated
	 */
	int TITLE_STYLE = 6;

	/**
	 * The feature id for the '<em><b>Show Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_STYLE__SHOW_TITLE = STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Title Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.impl.SortingStyleImpl <em>Sorting Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.impl.SortingStyleImpl
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getSortingStyle()
	 * @generated
	 */
	int SORTING_STYLE = 7;

	/**
	 * The feature id for the '<em><b>Sorting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_STYLE__SORTING = STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sorting Keys</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_STYLE__SORTING_KEYS = STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sorted Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_STYLE__SORTED_OBJECTS = STYLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the the '<em>Sorting Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.impl.DescriptionStyleImpl <em>Description Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.impl.DescriptionStyleImpl
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getDescriptionStyle()
	 * @generated
	 */
	int DESCRIPTION_STYLE = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_STYLE__DESCRIPTION = STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Description Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.LayoutConstraint <em>Layout Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.LayoutConstraint
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getLayoutConstraint()
	 * @generated
	 */
	int LAYOUT_CONSTRAINT = 9;

	/**
	 * The number of structural features of the the '<em>Layout Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.impl.SizeImpl <em>Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.impl.SizeImpl
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getSize()
	 * @generated
	 */
	int SIZE = 10;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE__WIDTH = LAYOUT_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE__HEIGHT = LAYOUT_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_FEATURE_COUNT = LAYOUT_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.impl.LocationImpl
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 11;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__X = LAYOUT_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__Y = LAYOUT_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = LAYOUT_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.impl.BoundsImpl <em>Bounds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.impl.BoundsImpl
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getBounds()
	 * @generated
	 */
	int BOUNDS = 12;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__X = LOCATION__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__Y = LOCATION__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__WIDTH = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__HEIGHT = LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Bounds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.impl.RatioImpl <em>Ratio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.impl.RatioImpl
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getRatio()
	 * @generated
	 */
	int RATIO = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__VALUE = LAYOUT_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Ratio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_FEATURE_COUNT = LAYOUT_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.Anchor <em>Anchor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.Anchor
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getAnchor()
	 * @generated
	 */
	int ANCHOR = 14;

	/**
	 * The number of structural features of the the '<em>Anchor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.Bendpoints <em>Bendpoints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.Bendpoints
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getBendpoints()
	 * @generated
	 */
	int BENDPOINTS = 15;

	/**
	 * The number of structural features of the the '<em>Bendpoints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENDPOINTS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.impl.IdentityAnchorImpl <em>Identity Anchor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.impl.IdentityAnchorImpl
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getIdentityAnchor()
	 * @generated
	 */
	int IDENTITY_ANCHOR = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_ANCHOR__ID = ANCHOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Identity Anchor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_ANCHOR_FEATURE_COUNT = ANCHOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.impl.RoutingStyleImpl <em>Routing Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.impl.RoutingStyleImpl
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getRoutingStyle()
	 * @generated
	 */
	int ROUTING_STYLE = 17;

	/**
	 * The feature id for the '<em><b>Routing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_STYLE__ROUTING = STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Smoothness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_STYLE__SMOOTHNESS = STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Avoid Obstructions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_STYLE__AVOID_OBSTRUCTIONS = STYLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Closest Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_STYLE__CLOSEST_DISTANCE = STYLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Jump Link Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_STYLE__JUMP_LINK_STATUS = STYLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Jump Link Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_STYLE__JUMP_LINK_TYPE = STYLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Jump Links Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_STYLE__JUMP_LINKS_REVERSE = STYLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the the '<em>Routing Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.impl.RelativeBendpointsImpl <em>Relative Bendpoints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.impl.RelativeBendpointsImpl
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getRelativeBendpoints()
	 * @generated
	 */
	int RELATIVE_BENDPOINTS = 19;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_BENDPOINTS__POINTS = BENDPOINTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Relative Bendpoints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_BENDPOINTS_FEATURE_COUNT = BENDPOINTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.impl.DiagramImpl
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 20;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__EANNOTATIONS = VIEW__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__VISIBLE = VIEW__VISIBLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__TYPE = VIEW__TYPE;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__MUTABLE = VIEW__MUTABLE;

	/**
	 * The feature id for the '<em><b>Source Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__SOURCE_EDGES = VIEW__SOURCE_EDGES;

	/**
	 * The feature id for the '<em><b>Target Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__TARGET_EDGES = VIEW__TARGET_EDGES;

	/**
	 * The feature id for the '<em><b>Persisted Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__PERSISTED_CHILDREN = VIEW__PERSISTED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__STYLES = VIEW__STYLES;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__ELEMENT = VIEW__ELEMENT;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__DIAGRAM = VIEW__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Transient Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__TRANSIENT_CHILDREN = VIEW__TRANSIENT_CHILDREN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__NAME = VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measurement Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__MEASUREMENT_UNIT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Persisted Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__PERSISTED_EDGES = VIEW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transient Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__TRANSIENT_EDGES = VIEW_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = VIEW_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.impl.ImageImpl
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 21;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__DATA = 0;

	/**
	 * The number of structural features of the the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.impl.CanonicalStyleImpl <em>Canonical Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.impl.CanonicalStyleImpl
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getCanonicalStyle()
	 * @generated
	 */
	int CANONICAL_STYLE = 22;

	/**
	 * The feature id for the '<em><b>Canonical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANONICAL_STYLE__CANONICAL = STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Canonical Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANONICAL_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.impl.ShapeStyleImpl <em>Shape Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.impl.ShapeStyleImpl
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getShapeStyle()
	 * @generated
	 */
	int SHAPE_STYLE = 23;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_STYLE__FONT_COLOR = EcorePackage.EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_STYLE__FONT_NAME = EcorePackage.EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Font Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_STYLE__FONT_HEIGHT = EcorePackage.EOBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_STYLE__BOLD = EcorePackage.EOBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_STYLE__ITALIC = EcorePackage.EOBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_STYLE__UNDERLINE = EcorePackage.EOBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Strike Through</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_STYLE__STRIKE_THROUGH = EcorePackage.EOBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_STYLE__DESCRIPTION = EcorePackage.EOBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_STYLE__FILL_COLOR = EcorePackage.EOBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_STYLE__LINE_COLOR = EcorePackage.EOBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the the '<em>Shape Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_STYLE_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.impl.ConnectorStyleImpl <em>Connector Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.impl.ConnectorStyleImpl
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getConnectorStyle()
	 * @generated
	 */
	int CONNECTOR_STYLE = 24;

	/**
	 * The feature id for the '<em><b>Routing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_STYLE__ROUTING = EcorePackage.EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Smoothness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_STYLE__SMOOTHNESS = EcorePackage.EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Avoid Obstructions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_STYLE__AVOID_OBSTRUCTIONS = EcorePackage.EOBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Closest Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_STYLE__CLOSEST_DISTANCE = EcorePackage.EOBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Jump Link Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_STYLE__JUMP_LINK_STATUS = EcorePackage.EOBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Jump Link Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_STYLE__JUMP_LINK_TYPE = EcorePackage.EOBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Jump Links Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_STYLE__JUMP_LINKS_REVERSE = EcorePackage.EOBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_STYLE__LINE_COLOR = EcorePackage.EOBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the the '<em>Connector Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_STYLE_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.impl.PageStyleImpl <em>Page Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.impl.PageStyleImpl
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getPageStyle()
	 * @generated
	 */
	int PAGE_STYLE = 25;

	/**
	 * The feature id for the '<em><b>Page X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_STYLE__PAGE_X = STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Page Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_STYLE__PAGE_Y = STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Page Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_STYLE__PAGE_WIDTH = STYLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Page Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_STYLE__PAGE_HEIGHT = STYLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the the '<em>Page Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.impl.DrawerStyleImpl <em>Drawer Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.impl.DrawerStyleImpl
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getDrawerStyle()
	 * @generated
	 */
	int DRAWER_STYLE = 26;

	/**
	 * The feature id for the '<em><b>Collapsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWER_STYLE__COLLAPSED = STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Drawer Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWER_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.impl.GuideStyleImpl <em>Guide Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.impl.GuideStyleImpl
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getGuideStyle()
	 * @generated
	 */
	int GUIDE_STYLE = 27;

	/**
	 * The feature id for the '<em><b>Horizontal Guides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDE_STYLE__HORIZONTAL_GUIDES = STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vertical Guides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDE_STYLE__VERTICAL_GUIDES = STYLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Guide Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDE_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.impl.GuideImpl <em>Guide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.impl.GuideImpl
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getGuide()
	 * @generated
	 */
	int GUIDE = 28;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDE__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Node Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDE__NODE_MAP = 1;

	/**
	 * The number of structural features of the the '<em>Guide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.impl.NodeEntryImpl <em>Node Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.impl.NodeEntryImpl
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getNodeEntry()
	 * @generated
	 */
	int NODE_ENTRY = 29;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTRY__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTRY__KEY = 1;

	/**
	 * The number of structural features of the the '<em>Node Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.impl.FilteringStyleImpl <em>Filtering Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.impl.FilteringStyleImpl
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getFilteringStyle()
	 * @generated
	 */
	int FILTERING_STYLE = 30;

	/**
	 * The feature id for the '<em><b>Filtering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_STYLE__FILTERING = STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filtering Keys</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_STYLE__FILTERING_KEYS = STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filtered Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_STYLE__FILTERED_OBJECTS = STYLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the the '<em>Filtering Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.impl.DiagramStyleImpl <em>Diagram Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.impl.DiagramStyleImpl
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getDiagramStyle()
	 * @generated
	 */
	int DIAGRAM_STYLE = 31;

	/**
	 * The feature id for the '<em><b>Page X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_STYLE__PAGE_X = EcorePackage.EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Page Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_STYLE__PAGE_Y = EcorePackage.EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Page Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_STYLE__PAGE_WIDTH = EcorePackage.EOBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Page Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_STYLE__PAGE_HEIGHT = EcorePackage.EOBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Horizontal Guides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_STYLE__HORIZONTAL_GUIDES = EcorePackage.EOBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Vertical Guides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_STYLE__VERTICAL_GUIDES = EcorePackage.EOBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_STYLE__DESCRIPTION = EcorePackage.EOBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the the '<em>Diagram Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_STYLE_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.impl.ImageStyleImpl <em>Image Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.impl.ImageStyleImpl
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getImageStyle()
	 * @generated
	 */
	int IMAGE_STYLE = 32;

	/**
	 * The feature id for the '<em><b>Anti Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__ANTI_ALIAS = STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maintain Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__MAINTAIN_ASPECT_RATIO = STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Crop Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__CROP_BOUND = STYLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the the '<em>Image Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.impl.ImageBufferStyleImpl <em>Image Buffer Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.impl.ImageBufferStyleImpl
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getImageBufferStyle()
	 * @generated
	 */
	int IMAGE_BUFFER_STYLE = 33;

	/**
	 * The feature id for the '<em><b>Anti Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUFFER_STYLE__ANTI_ALIAS = IMAGE_STYLE__ANTI_ALIAS;

	/**
	 * The feature id for the '<em><b>Maintain Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUFFER_STYLE__MAINTAIN_ASPECT_RATIO = IMAGE_STYLE__MAINTAIN_ASPECT_RATIO;

	/**
	 * The feature id for the '<em><b>Crop Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUFFER_STYLE__CROP_BOUND = IMAGE_STYLE__CROP_BOUND;

	/**
	 * The feature id for the '<em><b>Image Buffer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUFFER_STYLE__IMAGE_BUFFER = IMAGE_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Image Buffer Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BUFFER_STYLE_FEATURE_COUNT = IMAGE_STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.Sorting <em>Sorting</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.Sorting
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getSorting()
	 * @generated
	 */
	int SORTING = 34;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.Filtering <em>Filtering</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.Filtering
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getFiltering()
	 * @generated
	 */
	int FILTERING = 35;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.Routing <em>Routing</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.Routing
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getRouting()
	 * @generated
	 */
	int ROUTING = 36;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.Smoothness <em>Smoothness</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.Smoothness
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getSmoothness()
	 * @generated
	 */
	int SMOOTHNESS = 37;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.JumpLinkStatus <em>Jump Link Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.JumpLinkStatus
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getJumpLinkStatus()
	 * @generated
	 */
	int JUMP_LINK_STATUS = 38;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.JumpLinkType <em>Jump Link Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.JumpLinkType
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getJumpLinkType()
	 * @generated
	 */
	int JUMP_LINK_TYPE = 39;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.Alignment <em>Alignment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.Alignment
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getAlignment()
	 * @generated
	 */
	int ALIGNMENT = 40;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.SortingDirection <em>Sorting Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.SortingDirection
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getSortingDirection()
	 * @generated
	 */
	int SORTING_DIRECTION = 41;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.runtime.notation.MeasurementUnit <em>Measurement Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.MeasurementUnit
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getMeasurementUnit()
	 * @generated
	 */
	int MEASUREMENT_UNIT = 42;

	/**
	 * The meta object id for the '<em>Relative Bendpoint List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getRelativeBendpointList()
	 * @generated
	 */
	int RELATIVE_BENDPOINT_LIST = 43;

	/**
	 * The meta object id for the '<em>Filter Key List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getFilterKeyList()
	 * @generated
	 */
	int FILTER_KEY_LIST = 44;

	/**
	 * The meta object id for the '<em>Sort Key Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl#getSortKeyMap()
	 * @generated
	 */
	int SORT_KEY_MAP = 45;


	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.runtime.notation.Edge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Edge#getSource()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.runtime.notation.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Edge#getTarget()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Target();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.runtime.notation.Edge#getBendpoints <em>Bendpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bendpoints</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Edge#getBendpoints()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Bendpoints();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.runtime.notation.Edge#getSourceAnchor <em>Source Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Anchor</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Edge#getSourceAnchor()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_SourceAnchor();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.runtime.notation.Edge#getTargetAnchor <em>Target Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Anchor</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Edge#getTargetAnchor()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_TargetAnchor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.runtime.notation.Node#getLayoutConstraint <em>Layout Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout Constraint</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Node#getLayoutConstraint()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_LayoutConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.Style <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Style
	 * @generated
	 */
	EClass getStyle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.FillStyle <em>Fill Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fill Style</em>'.
	 * @see org.eclipse.gmf.runtime.notation.FillStyle
	 * @generated
	 */
	EClass getFillStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.FillStyle#getFillColor <em>Fill Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Color</em>'.
	 * @see org.eclipse.gmf.runtime.notation.FillStyle#getFillColor()
	 * @see #getFillStyle()
	 * @generated
	 */
	EAttribute getFillStyle_FillColor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.LineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Style</em>'.
	 * @see org.eclipse.gmf.runtime.notation.LineStyle
	 * @generated
	 */
	EClass getLineStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.LineStyle#getLineColor <em>Line Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Color</em>'.
	 * @see org.eclipse.gmf.runtime.notation.LineStyle#getLineColor()
	 * @see #getLineStyle()
	 * @generated
	 */
	EAttribute getLineStyle_LineColor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.FontStyle <em>Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font Style</em>'.
	 * @see org.eclipse.gmf.runtime.notation.FontStyle
	 * @generated
	 */
	EClass getFontStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.FontStyle#getFontColor <em>Font Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Color</em>'.
	 * @see org.eclipse.gmf.runtime.notation.FontStyle#getFontColor()
	 * @see #getFontStyle()
	 * @generated
	 */
	EAttribute getFontStyle_FontColor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.FontStyle#getFontName <em>Font Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Name</em>'.
	 * @see org.eclipse.gmf.runtime.notation.FontStyle#getFontName()
	 * @see #getFontStyle()
	 * @generated
	 */
	EAttribute getFontStyle_FontName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.FontStyle#getFontHeight <em>Font Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Height</em>'.
	 * @see org.eclipse.gmf.runtime.notation.FontStyle#getFontHeight()
	 * @see #getFontStyle()
	 * @generated
	 */
	EAttribute getFontStyle_FontHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.FontStyle#isBold <em>Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bold</em>'.
	 * @see org.eclipse.gmf.runtime.notation.FontStyle#isBold()
	 * @see #getFontStyle()
	 * @generated
	 */
	EAttribute getFontStyle_Bold();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.FontStyle#isItalic <em>Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Italic</em>'.
	 * @see org.eclipse.gmf.runtime.notation.FontStyle#isItalic()
	 * @see #getFontStyle()
	 * @generated
	 */
	EAttribute getFontStyle_Italic();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.FontStyle#isUnderline <em>Underline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Underline</em>'.
	 * @see org.eclipse.gmf.runtime.notation.FontStyle#isUnderline()
	 * @see #getFontStyle()
	 * @generated
	 */
	EAttribute getFontStyle_Underline();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.FontStyle#isStrikeThrough <em>Strike Through</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strike Through</em>'.
	 * @see org.eclipse.gmf.runtime.notation.FontStyle#isStrikeThrough()
	 * @see #getFontStyle()
	 * @generated
	 */
	EAttribute getFontStyle_StrikeThrough();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.TitleStyle <em>Title Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title Style</em>'.
	 * @see org.eclipse.gmf.runtime.notation.TitleStyle
	 * @generated
	 */
	EClass getTitleStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.TitleStyle#isShowTitle <em>Show Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Title</em>'.
	 * @see org.eclipse.gmf.runtime.notation.TitleStyle#isShowTitle()
	 * @see #getTitleStyle()
	 * @generated
	 */
	EAttribute getTitleStyle_ShowTitle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.SortingStyle <em>Sorting Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sorting Style</em>'.
	 * @see org.eclipse.gmf.runtime.notation.SortingStyle
	 * @generated
	 */
	EClass getSortingStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.SortingStyle#getSorting <em>Sorting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sorting</em>'.
	 * @see org.eclipse.gmf.runtime.notation.SortingStyle#getSorting()
	 * @see #getSortingStyle()
	 * @generated
	 */
	EAttribute getSortingStyle_Sorting();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.SortingStyle#getSortingKeys <em>Sorting Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sorting Keys</em>'.
	 * @see org.eclipse.gmf.runtime.notation.SortingStyle#getSortingKeys()
	 * @see #getSortingStyle()
	 * @generated
	 */
	EAttribute getSortingStyle_SortingKeys();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmf.runtime.notation.SortingStyle#getSortedObjects <em>Sorted Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sorted Objects</em>'.
	 * @see org.eclipse.gmf.runtime.notation.SortingStyle#getSortedObjects()
	 * @see #getSortingStyle()
	 * @generated
	 */
	EReference getSortingStyle_SortedObjects();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.DescriptionStyle <em>Description Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Style</em>'.
	 * @see org.eclipse.gmf.runtime.notation.DescriptionStyle
	 * @generated
	 */
	EClass getDescriptionStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.DescriptionStyle#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.gmf.runtime.notation.DescriptionStyle#getDescription()
	 * @see #getDescriptionStyle()
	 * @generated
	 */
	EAttribute getDescriptionStyle_Description();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.LayoutConstraint <em>Layout Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout Constraint</em>'.
	 * @see org.eclipse.gmf.runtime.notation.LayoutConstraint
	 * @generated
	 */
	EClass getLayoutConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Size</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Size
	 * @generated
	 */
	EClass getSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.Size#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Size#getWidth()
	 * @see #getSize()
	 * @generated
	 */
	EAttribute getSize_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.Size#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Size#getHeight()
	 * @see #getSize()
	 * @generated
	 */
	EAttribute getSize_Height();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.Location#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Location#getX()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_X();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.Location#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Location#getY()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Y();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.Bounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounds</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Bounds
	 * @generated
	 */
	EClass getBounds();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.Ratio <em>Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ratio</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Ratio
	 * @generated
	 */
	EClass getRatio();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.Ratio#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Ratio#getValue()
	 * @see #getRatio()
	 * @generated
	 */
	EAttribute getRatio_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.Anchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anchor</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Anchor
	 * @generated
	 */
	EClass getAnchor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.Bendpoints <em>Bendpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bendpoints</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Bendpoints
	 * @generated
	 */
	EClass getBendpoints();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.IdentityAnchor <em>Identity Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identity Anchor</em>'.
	 * @see org.eclipse.gmf.runtime.notation.IdentityAnchor
	 * @generated
	 */
	EClass getIdentityAnchor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.IdentityAnchor#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.gmf.runtime.notation.IdentityAnchor#getId()
	 * @see #getIdentityAnchor()
	 * @generated
	 */
	EAttribute getIdentityAnchor_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.RoutingStyle <em>Routing Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Routing Style</em>'.
	 * @see org.eclipse.gmf.runtime.notation.RoutingStyle
	 * @generated
	 */
	EClass getRoutingStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.RoutingStyle#getRouting <em>Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Routing</em>'.
	 * @see org.eclipse.gmf.runtime.notation.RoutingStyle#getRouting()
	 * @see #getRoutingStyle()
	 * @generated
	 */
	EAttribute getRoutingStyle_Routing();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.RoutingStyle#getSmoothness <em>Smoothness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smoothness</em>'.
	 * @see org.eclipse.gmf.runtime.notation.RoutingStyle#getSmoothness()
	 * @see #getRoutingStyle()
	 * @generated
	 */
	EAttribute getRoutingStyle_Smoothness();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.RoutingStyle#isAvoidObstructions <em>Avoid Obstructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avoid Obstructions</em>'.
	 * @see org.eclipse.gmf.runtime.notation.RoutingStyle#isAvoidObstructions()
	 * @see #getRoutingStyle()
	 * @generated
	 */
	EAttribute getRoutingStyle_AvoidObstructions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.RoutingStyle#isClosestDistance <em>Closest Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closest Distance</em>'.
	 * @see org.eclipse.gmf.runtime.notation.RoutingStyle#isClosestDistance()
	 * @see #getRoutingStyle()
	 * @generated
	 */
	EAttribute getRoutingStyle_ClosestDistance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.RoutingStyle#getJumpLinkStatus <em>Jump Link Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jump Link Status</em>'.
	 * @see org.eclipse.gmf.runtime.notation.RoutingStyle#getJumpLinkStatus()
	 * @see #getRoutingStyle()
	 * @generated
	 */
	EAttribute getRoutingStyle_JumpLinkStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.RoutingStyle#getJumpLinkType <em>Jump Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jump Link Type</em>'.
	 * @see org.eclipse.gmf.runtime.notation.RoutingStyle#getJumpLinkType()
	 * @see #getRoutingStyle()
	 * @generated
	 */
	EAttribute getRoutingStyle_JumpLinkType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.RoutingStyle#isJumpLinksReverse <em>Jump Links Reverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jump Links Reverse</em>'.
	 * @see org.eclipse.gmf.runtime.notation.RoutingStyle#isJumpLinksReverse()
	 * @see #getRoutingStyle()
	 * @generated
	 */
	EAttribute getRoutingStyle_JumpLinksReverse();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see org.eclipse.gmf.runtime.notation.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.View#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.eclipse.gmf.runtime.notation.View#isVisible()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Visible();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.View#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.gmf.runtime.notation.View#getType()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.View#isMutable <em>Mutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutable</em>'.
	 * @see org.eclipse.gmf.runtime.notation.View#isMutable()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Mutable();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmf.runtime.notation.View#getSourceEdges <em>Source Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Edges</em>'.
	 * @see org.eclipse.gmf.runtime.notation.View#getSourceEdges()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_SourceEdges();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmf.runtime.notation.View#getTargetEdges <em>Target Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Edges</em>'.
	 * @see org.eclipse.gmf.runtime.notation.View#getTargetEdges()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_TargetEdges();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.runtime.notation.View#getPersistedChildren <em>Persisted Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persisted Children</em>'.
	 * @see org.eclipse.gmf.runtime.notation.View#getPersistedChildren()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_PersistedChildren();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.runtime.notation.View#getStyles <em>Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Styles</em>'.
	 * @see org.eclipse.gmf.runtime.notation.View#getStyles()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Styles();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.runtime.notation.View#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.eclipse.gmf.runtime.notation.View#getElement()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Element();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.runtime.notation.View#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diagram</em>'.
	 * @see org.eclipse.gmf.runtime.notation.View#getDiagram()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Diagram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.runtime.notation.View#getTransientChildren <em>Transient Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transient Children</em>'.
	 * @see org.eclipse.gmf.runtime.notation.View#getTransientChildren()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_TransientChildren();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.RelativeBendpoints <em>Relative Bendpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Bendpoints</em>'.
	 * @see org.eclipse.gmf.runtime.notation.RelativeBendpoints
	 * @generated
	 */
	EClass getRelativeBendpoints();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.RelativeBendpoints#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see org.eclipse.gmf.runtime.notation.RelativeBendpoints#getPoints()
	 * @see #getRelativeBendpoints()
	 * @generated
	 */
	EAttribute getRelativeBendpoints_Points();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.Diagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Diagram#getName()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.Diagram#getMeasurementUnit <em>Measurement Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measurement Unit</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Diagram#getMeasurementUnit()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_MeasurementUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.runtime.notation.Diagram#getPersistedEdges <em>Persisted Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persisted Edges</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Diagram#getPersistedEdges()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_PersistedEdges();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.runtime.notation.Diagram#getTransientEdges <em>Transient Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transient Edges</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Diagram#getTransientEdges()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_TransientEdges();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.Image#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Image#getData()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Data();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.CanonicalStyle <em>Canonical Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Canonical Style</em>'.
	 * @see org.eclipse.gmf.runtime.notation.CanonicalStyle
	 * @generated
	 */
	EClass getCanonicalStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.CanonicalStyle#isCanonical <em>Canonical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Canonical</em>'.
	 * @see org.eclipse.gmf.runtime.notation.CanonicalStyle#isCanonical()
	 * @see #getCanonicalStyle()
	 * @generated
	 */
	EAttribute getCanonicalStyle_Canonical();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.ShapeStyle <em>Shape Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape Style</em>'.
	 * @see org.eclipse.gmf.runtime.notation.ShapeStyle
	 * @generated
	 */
	EClass getShapeStyle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.ConnectorStyle <em>Connector Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Style</em>'.
	 * @see org.eclipse.gmf.runtime.notation.ConnectorStyle
	 * @generated
	 */
	EClass getConnectorStyle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.PageStyle <em>Page Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Style</em>'.
	 * @see org.eclipse.gmf.runtime.notation.PageStyle
	 * @generated
	 */
	EClass getPageStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.PageStyle#getPageX <em>Page X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page X</em>'.
	 * @see org.eclipse.gmf.runtime.notation.PageStyle#getPageX()
	 * @see #getPageStyle()
	 * @generated
	 */
	EAttribute getPageStyle_PageX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.PageStyle#getPageY <em>Page Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Y</em>'.
	 * @see org.eclipse.gmf.runtime.notation.PageStyle#getPageY()
	 * @see #getPageStyle()
	 * @generated
	 */
	EAttribute getPageStyle_PageY();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.PageStyle#getPageWidth <em>Page Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Width</em>'.
	 * @see org.eclipse.gmf.runtime.notation.PageStyle#getPageWidth()
	 * @see #getPageStyle()
	 * @generated
	 */
	EAttribute getPageStyle_PageWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.PageStyle#getPageHeight <em>Page Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Height</em>'.
	 * @see org.eclipse.gmf.runtime.notation.PageStyle#getPageHeight()
	 * @see #getPageStyle()
	 * @generated
	 */
	EAttribute getPageStyle_PageHeight();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.DrawerStyle <em>Drawer Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drawer Style</em>'.
	 * @see org.eclipse.gmf.runtime.notation.DrawerStyle
	 * @generated
	 */
	EClass getDrawerStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.DrawerStyle#isCollapsed <em>Collapsed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collapsed</em>'.
	 * @see org.eclipse.gmf.runtime.notation.DrawerStyle#isCollapsed()
	 * @see #getDrawerStyle()
	 * @generated
	 */
	EAttribute getDrawerStyle_Collapsed();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.GuideStyle <em>Guide Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guide Style</em>'.
	 * @see org.eclipse.gmf.runtime.notation.GuideStyle
	 * @generated
	 */
	EClass getGuideStyle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.runtime.notation.GuideStyle#getHorizontalGuides <em>Horizontal Guides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Horizontal Guides</em>'.
	 * @see org.eclipse.gmf.runtime.notation.GuideStyle#getHorizontalGuides()
	 * @see #getGuideStyle()
	 * @generated
	 */
	EReference getGuideStyle_HorizontalGuides();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.runtime.notation.GuideStyle#getVerticalGuides <em>Vertical Guides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vertical Guides</em>'.
	 * @see org.eclipse.gmf.runtime.notation.GuideStyle#getVerticalGuides()
	 * @see #getGuideStyle()
	 * @generated
	 */
	EReference getGuideStyle_VerticalGuides();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.Guide <em>Guide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guide</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Guide
	 * @generated
	 */
	EClass getGuide();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.Guide#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Guide#getPosition()
	 * @see #getGuide()
	 * @generated
	 */
	EAttribute getGuide_Position();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.gmf.runtime.notation.Guide#getNodeMap <em>Node Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Node Map</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Guide#getNodeMap()
	 * @see #getGuide()
	 * @generated
	 */
	EReference getGuide_NodeMap();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Node Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model features="value key" 
	 *        valueType="org.eclipse.gmf.runtime.notation.Alignment" valueDefault="Center"
	 *        keyType="org.eclipse.gmf.runtime.notation.Node" keyRequired="true"
	 * @generated
	 */
	EClass getNodeEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getNodeEntry()
	 * @generated
	 */
	EAttribute getNodeEntry_Value();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getNodeEntry()
	 * @generated
	 */
	EReference getNodeEntry_Key();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.FilteringStyle <em>Filtering Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filtering Style</em>'.
	 * @see org.eclipse.gmf.runtime.notation.FilteringStyle
	 * @generated
	 */
	EClass getFilteringStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.FilteringStyle#getFiltering <em>Filtering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filtering</em>'.
	 * @see org.eclipse.gmf.runtime.notation.FilteringStyle#getFiltering()
	 * @see #getFilteringStyle()
	 * @generated
	 */
	EAttribute getFilteringStyle_Filtering();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.FilteringStyle#getFilteringKeys <em>Filtering Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filtering Keys</em>'.
	 * @see org.eclipse.gmf.runtime.notation.FilteringStyle#getFilteringKeys()
	 * @see #getFilteringStyle()
	 * @generated
	 */
	EAttribute getFilteringStyle_FilteringKeys();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmf.runtime.notation.FilteringStyle#getFilteredObjects <em>Filtered Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Filtered Objects</em>'.
	 * @see org.eclipse.gmf.runtime.notation.FilteringStyle#getFilteredObjects()
	 * @see #getFilteringStyle()
	 * @generated
	 */
	EReference getFilteringStyle_FilteredObjects();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.DiagramStyle <em>Diagram Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Style</em>'.
	 * @see org.eclipse.gmf.runtime.notation.DiagramStyle
	 * @generated
	 */
	EClass getDiagramStyle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.ImageStyle <em>Image Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Style</em>'.
	 * @see org.eclipse.gmf.runtime.notation.ImageStyle
	 * @generated
	 */
	EClass getImageStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.ImageStyle#getAntiAlias <em>Anti Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anti Alias</em>'.
	 * @see org.eclipse.gmf.runtime.notation.ImageStyle#getAntiAlias()
	 * @see #getImageStyle()
	 * @generated
	 */
	EAttribute getImageStyle_AntiAlias();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.runtime.notation.ImageStyle#getMaintainAspectRatio <em>Maintain Aspect Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maintain Aspect Ratio</em>'.
	 * @see org.eclipse.gmf.runtime.notation.ImageStyle#getMaintainAspectRatio()
	 * @see #getImageStyle()
	 * @generated
	 */
	EAttribute getImageStyle_MaintainAspectRatio();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.runtime.notation.ImageStyle#getCropBound <em>Crop Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Crop Bound</em>'.
	 * @see org.eclipse.gmf.runtime.notation.ImageStyle#getCropBound()
	 * @see #getImageStyle()
	 * @generated
	 */
	EReference getImageStyle_CropBound();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.runtime.notation.ImageBufferStyle <em>Image Buffer Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Buffer Style</em>'.
	 * @see org.eclipse.gmf.runtime.notation.ImageBufferStyle
	 * @generated
	 */
	EClass getImageBufferStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.runtime.notation.ImageBufferStyle#getImageBuffer <em>Image Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image Buffer</em>'.
	 * @see org.eclipse.gmf.runtime.notation.ImageBufferStyle#getImageBuffer()
	 * @see #getImageBufferStyle()
	 * @generated
	 */
	EReference getImageBufferStyle_ImageBuffer();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmf.runtime.notation.Sorting <em>Sorting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sorting</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Sorting
	 * @generated
	 */
	EEnum getSorting();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmf.runtime.notation.Filtering <em>Filtering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Filtering</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Filtering
	 * @generated
	 */
	EEnum getFiltering();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmf.runtime.notation.Routing <em>Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Routing</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Routing
	 * @generated
	 */
	EEnum getRouting();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmf.runtime.notation.Smoothness <em>Smoothness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Smoothness</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Smoothness
	 * @generated
	 */
	EEnum getSmoothness();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmf.runtime.notation.JumpLinkStatus <em>Jump Link Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Jump Link Status</em>'.
	 * @see org.eclipse.gmf.runtime.notation.JumpLinkStatus
	 * @generated
	 */
	EEnum getJumpLinkStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmf.runtime.notation.JumpLinkType <em>Jump Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Jump Link Type</em>'.
	 * @see org.eclipse.gmf.runtime.notation.JumpLinkType
	 * @generated
	 */
	EEnum getJumpLinkType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmf.runtime.notation.Alignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Alignment</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Alignment
	 * @generated
	 */
	EEnum getAlignment();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmf.runtime.notation.SortingDirection <em>Sorting Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sorting Direction</em>'.
	 * @see org.eclipse.gmf.runtime.notation.SortingDirection
	 * @generated
	 */
	EEnum getSortingDirection();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmf.runtime.notation.MeasurementUnit <em>Measurement Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Measurement Unit</em>'.
	 * @see org.eclipse.gmf.runtime.notation.MeasurementUnit
	 * @generated
	 */
	EEnum getMeasurementUnit();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Relative Bendpoint List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Relative Bendpoint List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 * @generated
	 */
	EDataType getRelativeBendpointList();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Filter Key List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Filter Key List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 * @generated
	 */
	EDataType getFilterKeyList();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>Sort Key Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sort Key Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map"
	 * @generated
	 */
	EDataType getSortKeyMap();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NotationFactory getNotationFactory();

} //NotationPackage
