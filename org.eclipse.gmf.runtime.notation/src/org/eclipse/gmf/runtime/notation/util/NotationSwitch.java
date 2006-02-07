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

package org.eclipse.gmf.runtime.notation.util;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.runtime.notation.NotationPackage
 * @generated
 */
/*
 * @canBeSeenBy org.eclipse.gmf.runtime.notation.*
 */
public class NotationSwitch {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static NotationPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotationSwitch() {
        if (modelPackage == null) {
            modelPackage = NotationPackage.eINSTANCE;
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
	public Object doSwitch(EObject theEObject) {
        return doSwitch(theEObject.eClass(), theEObject);
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return doSwitch(theEClass.getClassifierID(), theEObject);
        }
        else {
            List eSuperTypes = theEClass.getESuperTypes();
            return
                eSuperTypes.isEmpty() ?
                    defaultCase(theEObject) :
                    doSwitch((EClass)eSuperTypes.get(0), theEObject);
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
	protected Object doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case NotationPackage.EDGE: {
                Edge edge = (Edge)theEObject;
                Object result = caseEdge(edge);
                if (result == null) result = caseView(edge);
                if (result == null) result = caseEModelElement(edge);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.NODE: {
                Node node = (Node)theEObject;
                Object result = caseNode(node);
                if (result == null) result = caseView(node);
                if (result == null) result = caseEModelElement(node);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.STYLE: {
                Style style = (Style)theEObject;
                Object result = caseStyle(style);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.FILL_STYLE: {
                FillStyle fillStyle = (FillStyle)theEObject;
                Object result = caseFillStyle(fillStyle);
                if (result == null) result = caseStyle(fillStyle);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.LINE_STYLE: {
                LineStyle lineStyle = (LineStyle)theEObject;
                Object result = caseLineStyle(lineStyle);
                if (result == null) result = caseStyle(lineStyle);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.FONT_STYLE: {
                FontStyle fontStyle = (FontStyle)theEObject;
                Object result = caseFontStyle(fontStyle);
                if (result == null) result = caseStyle(fontStyle);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.TITLE_STYLE: {
                TitleStyle titleStyle = (TitleStyle)theEObject;
                Object result = caseTitleStyle(titleStyle);
                if (result == null) result = caseStyle(titleStyle);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.SORTING_STYLE: {
                SortingStyle sortingStyle = (SortingStyle)theEObject;
                Object result = caseSortingStyle(sortingStyle);
                if (result == null) result = caseStyle(sortingStyle);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.DESCRIPTION_STYLE: {
                DescriptionStyle descriptionStyle = (DescriptionStyle)theEObject;
                Object result = caseDescriptionStyle(descriptionStyle);
                if (result == null) result = caseStyle(descriptionStyle);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.LAYOUT_CONSTRAINT: {
                LayoutConstraint layoutConstraint = (LayoutConstraint)theEObject;
                Object result = caseLayoutConstraint(layoutConstraint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.SIZE: {
                Size size = (Size)theEObject;
                Object result = caseSize(size);
                if (result == null) result = caseLayoutConstraint(size);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.LOCATION: {
                Location location = (Location)theEObject;
                Object result = caseLocation(location);
                if (result == null) result = caseLayoutConstraint(location);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.BOUNDS: {
                Bounds bounds = (Bounds)theEObject;
                Object result = caseBounds(bounds);
                if (result == null) result = caseLocation(bounds);
                if (result == null) result = caseSize(bounds);
                if (result == null) result = caseLayoutConstraint(bounds);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.RATIO: {
                Ratio ratio = (Ratio)theEObject;
                Object result = caseRatio(ratio);
                if (result == null) result = caseLayoutConstraint(ratio);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.ANCHOR: {
                Anchor anchor = (Anchor)theEObject;
                Object result = caseAnchor(anchor);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.BENDPOINTS: {
                Bendpoints bendpoints = (Bendpoints)theEObject;
                Object result = caseBendpoints(bendpoints);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.IDENTITY_ANCHOR: {
                IdentityAnchor identityAnchor = (IdentityAnchor)theEObject;
                Object result = caseIdentityAnchor(identityAnchor);
                if (result == null) result = caseAnchor(identityAnchor);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.ROUTING_STYLE: {
                RoutingStyle routingStyle = (RoutingStyle)theEObject;
                Object result = caseRoutingStyle(routingStyle);
                if (result == null) result = caseStyle(routingStyle);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.VIEW: {
                View view = (View)theEObject;
                Object result = caseView(view);
                if (result == null) result = caseEModelElement(view);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.RELATIVE_BENDPOINTS: {
                RelativeBendpoints relativeBendpoints = (RelativeBendpoints)theEObject;
                Object result = caseRelativeBendpoints(relativeBendpoints);
                if (result == null) result = caseBendpoints(relativeBendpoints);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.DIAGRAM: {
                Diagram diagram = (Diagram)theEObject;
                Object result = caseDiagram(diagram);
                if (result == null) result = caseView(diagram);
                if (result == null) result = caseEModelElement(diagram);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.IMAGE: {
                Image image = (Image)theEObject;
                Object result = caseImage(image);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.CANONICAL_STYLE: {
                CanonicalStyle canonicalStyle = (CanonicalStyle)theEObject;
                Object result = caseCanonicalStyle(canonicalStyle);
                if (result == null) result = caseStyle(canonicalStyle);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.SHAPE_STYLE: {
                ShapeStyle shapeStyle = (ShapeStyle)theEObject;
                Object result = caseShapeStyle(shapeStyle);
                if (result == null) result = caseFontStyle(shapeStyle);
                if (result == null) result = caseDescriptionStyle(shapeStyle);
                if (result == null) result = caseFillStyle(shapeStyle);
                if (result == null) result = caseLineStyle(shapeStyle);
                if (result == null) result = caseStyle(shapeStyle);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.CONNECTOR_STYLE: {
                ConnectorStyle connectorStyle = (ConnectorStyle)theEObject;
                Object result = caseConnectorStyle(connectorStyle);
                if (result == null) result = caseRoutingStyle(connectorStyle);
                if (result == null) result = caseLineStyle(connectorStyle);
                if (result == null) result = caseStyle(connectorStyle);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.PAGE_STYLE: {
                PageStyle pageStyle = (PageStyle)theEObject;
                Object result = casePageStyle(pageStyle);
                if (result == null) result = caseStyle(pageStyle);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.DRAWER_STYLE: {
                DrawerStyle drawerStyle = (DrawerStyle)theEObject;
                Object result = caseDrawerStyle(drawerStyle);
                if (result == null) result = caseStyle(drawerStyle);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.GUIDE_STYLE: {
                GuideStyle guideStyle = (GuideStyle)theEObject;
                Object result = caseGuideStyle(guideStyle);
                if (result == null) result = caseStyle(guideStyle);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.GUIDE: {
                Guide guide = (Guide)theEObject;
                Object result = caseGuide(guide);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.NODE_ENTRY: {
                Map.Entry nodeEntry = (Map.Entry)theEObject;
                Object result = caseNodeEntry(nodeEntry);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.FILTERING_STYLE: {
                FilteringStyle filteringStyle = (FilteringStyle)theEObject;
                Object result = caseFilteringStyle(filteringStyle);
                if (result == null) result = caseStyle(filteringStyle);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.DIAGRAM_STYLE: {
                DiagramStyle diagramStyle = (DiagramStyle)theEObject;
                Object result = caseDiagramStyle(diagramStyle);
                if (result == null) result = casePageStyle(diagramStyle);
                if (result == null) result = caseGuideStyle(diagramStyle);
                if (result == null) result = caseDescriptionStyle(diagramStyle);
                if (result == null) result = caseStyle(diagramStyle);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.IMAGE_STYLE: {
                ImageStyle imageStyle = (ImageStyle)theEObject;
                Object result = caseImageStyle(imageStyle);
                if (result == null) result = caseStyle(imageStyle);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NotationPackage.IMAGE_BUFFER_STYLE: {
                ImageBufferStyle imageBufferStyle = (ImageBufferStyle)theEObject;
                Object result = caseImageBufferStyle(imageBufferStyle);
                if (result == null) result = caseImageStyle(imageBufferStyle);
                if (result == null) result = caseStyle(imageBufferStyle);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Edge</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Edge</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseEdge(Edge object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Node</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseNode(Node object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Style</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Style</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseStyle(Style object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Fill Style</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Fill Style</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseFillStyle(FillStyle object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Line Style</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Line Style</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseLineStyle(LineStyle object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Font Style</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Font Style</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseFontStyle(FontStyle object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Title Style</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Title Style</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseTitleStyle(TitleStyle object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Sorting Style</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Sorting Style</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseSortingStyle(SortingStyle object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Description Style</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Description Style</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseDescriptionStyle(DescriptionStyle object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Layout Constraint</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Layout Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseLayoutConstraint(LayoutConstraint object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Size</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Size</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseSize(Size object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Location</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Location</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseLocation(Location object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Bounds</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Bounds</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseBounds(Bounds object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Ratio</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Ratio</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseRatio(Ratio object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Anchor</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Anchor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseAnchor(Anchor object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Bendpoints</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Bendpoints</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseBendpoints(Bendpoints object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Identity Anchor</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Identity Anchor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseIdentityAnchor(IdentityAnchor object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Routing Style</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Routing Style</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseRoutingStyle(RoutingStyle object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>View</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>View</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseView(View object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Relative Bendpoints</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Relative Bendpoints</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseRelativeBendpoints(RelativeBendpoints object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Canonical Style</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Canonical Style</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseCanonicalStyle(CanonicalStyle object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Shape Style</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Shape Style</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseShapeStyle(ShapeStyle object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Connector Style</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Connector Style</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseConnectorStyle(ConnectorStyle object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Diagram</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Diagram</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseDiagram(Diagram object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Image</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Image</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseImage(Image object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Page Style</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Page Style</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object casePageStyle(PageStyle object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Drawer Style</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Drawer Style</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseDrawerStyle(DrawerStyle object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Guide Style</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Guide Style</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseGuideStyle(GuideStyle object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Guide</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Guide</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseGuide(Guide object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Node Entry</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Node Entry</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseNodeEntry(Map.Entry object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Filtering Style</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Filtering Style</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseFilteringStyle(FilteringStyle object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Diagram Style</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Diagram Style</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseDiagramStyle(DiagramStyle object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Image Style</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Image Style</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseImageStyle(ImageStyle object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Image Buffer Style</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Image Buffer Style</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseImageBufferStyle(ImageBufferStyle object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>EModel Element</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>EModel Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public Object caseEModelElement(EModelElement object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
	public Object defaultCase(EObject object) {
        return null;
    }

} //NotationSwitch
