/******************************************************************************
 * Copyright (c) 2004, 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.runtime.notation.util;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Anchor;
import org.eclipse.gmf.runtime.notation.Bendpoints;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.CanonicalStyle;
import org.eclipse.gmf.runtime.notation.ConnectorStyle;
import org.eclipse.gmf.runtime.notation.DescriptionStyle;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.DiagramStyle;
import org.eclipse.gmf.runtime.notation.DrawerStyle;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.FillStyle;
import org.eclipse.gmf.runtime.notation.FilteringStyle;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.Guide;
import org.eclipse.gmf.runtime.notation.GuideStyle;
import org.eclipse.gmf.runtime.notation.IdentityAnchor;
import org.eclipse.gmf.runtime.notation.Image;
import org.eclipse.gmf.runtime.notation.ImageBufferStyle;
import org.eclipse.gmf.runtime.notation.ImageStyle;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.PageStyle;
import org.eclipse.gmf.runtime.notation.Ratio;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;
import org.eclipse.gmf.runtime.notation.RoutingStyle;
import org.eclipse.gmf.runtime.notation.ShapeStyle;
import org.eclipse.gmf.runtime.notation.Size;
import org.eclipse.gmf.runtime.notation.SortingStyle;
import org.eclipse.gmf.runtime.notation.Style;
import org.eclipse.gmf.runtime.notation.TitleStyle;
import org.eclipse.gmf.runtime.notation.View;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.runtime.notation.NotationPackage
 * @generated
 */
/*
 * @canBeSeenBy org.eclipse.gmf.runtime.notation.*
 */
public class NotationAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static NotationPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotationAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = NotationPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
	public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch the delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected NotationSwitch modelSwitch =
        new NotationSwitch() {
            public Object caseEdge(Edge object) {
                return createEdgeAdapter();
            }
            public Object caseNode(Node object) {
                return createNodeAdapter();
            }
            public Object caseStyle(Style object) {
                return createStyleAdapter();
            }
            public Object caseFillStyle(FillStyle object) {
                return createFillStyleAdapter();
            }
            public Object caseLineStyle(LineStyle object) {
                return createLineStyleAdapter();
            }
            public Object caseFontStyle(FontStyle object) {
                return createFontStyleAdapter();
            }
            public Object caseTitleStyle(TitleStyle object) {
                return createTitleStyleAdapter();
            }
            public Object caseSortingStyle(SortingStyle object) {
                return createSortingStyleAdapter();
            }
            public Object caseDescriptionStyle(DescriptionStyle object) {
                return createDescriptionStyleAdapter();
            }
            public Object caseLayoutConstraint(LayoutConstraint object) {
                return createLayoutConstraintAdapter();
            }
            public Object caseSize(Size object) {
                return createSizeAdapter();
            }
            public Object caseLocation(Location object) {
                return createLocationAdapter();
            }
            public Object caseBounds(Bounds object) {
                return createBoundsAdapter();
            }
            public Object caseRatio(Ratio object) {
                return createRatioAdapter();
            }
            public Object caseAnchor(Anchor object) {
                return createAnchorAdapter();
            }
            public Object caseBendpoints(Bendpoints object) {
                return createBendpointsAdapter();
            }
            public Object caseIdentityAnchor(IdentityAnchor object) {
                return createIdentityAnchorAdapter();
            }
            public Object caseRoutingStyle(RoutingStyle object) {
                return createRoutingStyleAdapter();
            }
            public Object caseView(View object) {
                return createViewAdapter();
            }
            public Object caseRelativeBendpoints(RelativeBendpoints object) {
                return createRelativeBendpointsAdapter();
            }
            public Object caseDiagram(Diagram object) {
                return createDiagramAdapter();
            }
            public Object caseImage(Image object) {
                return createImageAdapter();
            }
            public Object caseCanonicalStyle(CanonicalStyle object) {
                return createCanonicalStyleAdapter();
            }
            public Object caseShapeStyle(ShapeStyle object) {
                return createShapeStyleAdapter();
            }
            public Object caseConnectorStyle(ConnectorStyle object) {
                return createConnectorStyleAdapter();
            }
            public Object casePageStyle(PageStyle object) {
                return createPageStyleAdapter();
            }
            public Object caseDrawerStyle(DrawerStyle object) {
                return createDrawerStyleAdapter();
            }
            public Object caseGuideStyle(GuideStyle object) {
                return createGuideStyleAdapter();
            }
            public Object caseGuide(Guide object) {
                return createGuideAdapter();
            }
            public Object caseNodeEntry(Map.Entry object) {
                return createNodeEntryAdapter();
            }
            public Object caseFilteringStyle(FilteringStyle object) {
                return createFilteringStyleAdapter();
            }
            public Object caseDiagramStyle(DiagramStyle object) {
                return createDiagramStyleAdapter();
            }
            public Object caseImageStyle(ImageStyle object) {
                return createImageStyleAdapter();
            }
            public Object caseImageBufferStyle(ImageBufferStyle object) {
                return createImageBufferStyleAdapter();
            }
            public Object caseEModelElement(EModelElement object) {
                return createEModelElementAdapter();
            }
            public Object defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
	public Adapter createAdapter(Notifier target) {
        return (Adapter)modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.Edge <em>Edge</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.Edge
     * @generated
     */
	public Adapter createEdgeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.Node <em>Node</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.Node
     * @generated
     */
	public Adapter createNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.Style <em>Style</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.Style
     * @generated
     */
	public Adapter createStyleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.FillStyle <em>Fill Style</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.FillStyle
     * @generated
     */
	public Adapter createFillStyleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.LineStyle <em>Line Style</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.LineStyle
     * @generated
     */
	public Adapter createLineStyleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.FontStyle <em>Font Style</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.FontStyle
     * @generated
     */
	public Adapter createFontStyleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.TitleStyle <em>Title Style</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.TitleStyle
     * @generated
     */
	public Adapter createTitleStyleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.SortingStyle <em>Sorting Style</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.SortingStyle
     * @generated
     */
	public Adapter createSortingStyleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.DescriptionStyle <em>Description Style</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.DescriptionStyle
     * @generated
     */
	public Adapter createDescriptionStyleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.LayoutConstraint <em>Layout Constraint</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.LayoutConstraint
     * @generated
     */
	public Adapter createLayoutConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.Size <em>Size</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.Size
     * @generated
     */
	public Adapter createSizeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.Location <em>Location</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.Location
     * @generated
     */
	public Adapter createLocationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.Bounds <em>Bounds</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.Bounds
     * @generated
     */
	public Adapter createBoundsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.Ratio <em>Ratio</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.Ratio
     * @generated
     */
	public Adapter createRatioAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.Anchor <em>Anchor</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.Anchor
     * @generated
     */
	public Adapter createAnchorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.Bendpoints <em>Bendpoints</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.Bendpoints
     * @generated
     */
	public Adapter createBendpointsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.IdentityAnchor <em>Identity Anchor</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.IdentityAnchor
     * @generated
     */
	public Adapter createIdentityAnchorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.RoutingStyle <em>Routing Style</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.RoutingStyle
     * @generated
     */
	public Adapter createRoutingStyleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.View <em>View</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.View
     * @generated
     */
	public Adapter createViewAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.RelativeBendpoints <em>Relative Bendpoints</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.RelativeBendpoints
     * @generated
     */
	public Adapter createRelativeBendpointsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.CanonicalStyle <em>Canonical Style</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.CanonicalStyle
     * @generated
     */
	public Adapter createCanonicalStyleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.ShapeStyle <em>Shape Style</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.ShapeStyle
     * @generated
     */
	public Adapter createShapeStyleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.ConnectorStyle <em>Connector Style</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.ConnectorStyle
     * @generated
     */
	public Adapter createConnectorStyleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.Diagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.Diagram
     * @generated
     */
	public Adapter createDiagramAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.Image <em>Image</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.Image
     * @generated
     */
	public Adapter createImageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.PageStyle <em>Page Style</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.PageStyle
     * @generated
     */
	public Adapter createPageStyleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.DrawerStyle <em>Drawer Style</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.DrawerStyle
     * @generated
     */
	public Adapter createDrawerStyleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.GuideStyle <em>Guide Style</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.GuideStyle
     * @generated
     */
	public Adapter createGuideStyleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.Guide <em>Guide</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.Guide
     * @generated
     */
	public Adapter createGuideAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Node Entry</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see java.util.Map.Entry
     * @generated
     */
	public Adapter createNodeEntryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.FilteringStyle <em>Filtering Style</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.FilteringStyle
     * @generated
     */
	public Adapter createFilteringStyleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.DiagramStyle <em>Diagram Style</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.DiagramStyle
     * @generated
     */
	public Adapter createDiagramStyleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.ImageStyle <em>Image Style</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.ImageStyle
     * @generated
     */
	public Adapter createImageStyleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.ImageBufferStyle <em>Image Buffer Style</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.gmf.runtime.notation.ImageBufferStyle
     * @generated
     */
	public Adapter createImageBufferStyleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EModelElement <em>EModel Element</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.emf.ecore.EModelElement
     * @generated
     */
	public Adapter createEModelElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
	public Adapter createEObjectAdapter() {
        return null;
    }

} //NotationAdapterFactory
