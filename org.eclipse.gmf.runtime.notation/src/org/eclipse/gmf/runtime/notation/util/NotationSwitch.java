/******************************************************************************
 * Copyright (c) 2004, 2008 IBM Corporation and others.
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
import org.eclipse.gmf.runtime.notation.*;
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
			case NotationPackage.PROPERTIES_SET_STYLE: {
				PropertiesSetStyle propertiesSetStyle = (PropertiesSetStyle)theEObject;
				Object result = casePropertiesSetStyle(propertiesSetStyle);
				if (result == null) result = caseNamedStyle(propertiesSetStyle);
				if (result == null) result = caseStyle(propertiesSetStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.STRING_TO_PROPERTY_VALUE_MAP_ENTRY: {
				Map.Entry stringToPropertyValueMapEntry = (Map.Entry)theEObject;
				Object result = caseStringToPropertyValueMapEntry(stringToPropertyValueMapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.PROPERTY_VALUE: {
				PropertyValue propertyValue = (PropertyValue)theEObject;
				Object result = casePropertyValue(propertyValue);
				if (result == null) result = caseStringObjectConverter(propertyValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.SINGLE_VALUE_STYLE: {
				SingleValueStyle singleValueStyle = (SingleValueStyle)theEObject;
				Object result = caseSingleValueStyle(singleValueStyle);
				if (result == null) result = caseDataTypeStyle(singleValueStyle);
				if (result == null) result = caseNamedStyle(singleValueStyle);
				if (result == null) result = caseStringObjectConverter(singleValueStyle);
				if (result == null) result = caseStyle(singleValueStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.LIST_VALUE_STYLE: {
				ListValueStyle listValueStyle = (ListValueStyle)theEObject;
				Object result = caseListValueStyle(listValueStyle);
				if (result == null) result = caseDataTypeStyle(listValueStyle);
				if (result == null) result = caseNamedStyle(listValueStyle);
				if (result == null) result = caseStringObjectConverter(listValueStyle);
				if (result == null) result = caseStyle(listValueStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.NAMED_STYLE: {
				NamedStyle namedStyle = (NamedStyle)theEObject;
				Object result = caseNamedStyle(namedStyle);
				if (result == null) result = caseStyle(namedStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.STRING_OBJECT_CONVERTER: {
				StringObjectConverter stringObjectConverter = (StringObjectConverter)theEObject;
				Object result = caseStringObjectConverter(stringObjectConverter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.DATA_TYPE_STYLE: {
				DataTypeStyle dataTypeStyle = (DataTypeStyle)theEObject;
				Object result = caseDataTypeStyle(dataTypeStyle);
				if (result == null) result = caseNamedStyle(dataTypeStyle);
				if (result == null) result = caseStringObjectConverter(dataTypeStyle);
				if (result == null) result = caseStyle(dataTypeStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.INT_VALUE_STYLE: {
				IntValueStyle intValueStyle = (IntValueStyle)theEObject;
				Object result = caseIntValueStyle(intValueStyle);
				if (result == null) result = caseNamedStyle(intValueStyle);
				if (result == null) result = caseStyle(intValueStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.INT_LIST_VALUE_STYLE: {
				IntListValueStyle intListValueStyle = (IntListValueStyle)theEObject;
				Object result = caseIntListValueStyle(intListValueStyle);
				if (result == null) result = caseNamedStyle(intListValueStyle);
				if (result == null) result = caseStyle(intListValueStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.BOOLEAN_VALUE_STYLE: {
				BooleanValueStyle booleanValueStyle = (BooleanValueStyle)theEObject;
				Object result = caseBooleanValueStyle(booleanValueStyle);
				if (result == null) result = caseNamedStyle(booleanValueStyle);
				if (result == null) result = caseStyle(booleanValueStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.DOUBLE_VALUE_STYLE: {
				DoubleValueStyle doubleValueStyle = (DoubleValueStyle)theEObject;
				Object result = caseDoubleValueStyle(doubleValueStyle);
				if (result == null) result = caseNamedStyle(doubleValueStyle);
				if (result == null) result = caseStyle(doubleValueStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.DOUBLE_LIST_VALUE_STYLE: {
				DoubleListValueStyle doubleListValueStyle = (DoubleListValueStyle)theEObject;
				Object result = caseDoubleListValueStyle(doubleListValueStyle);
				if (result == null) result = caseNamedStyle(doubleListValueStyle);
				if (result == null) result = caseStyle(doubleListValueStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.STRING_VALUE_STYLE: {
				StringValueStyle stringValueStyle = (StringValueStyle)theEObject;
				Object result = caseStringValueStyle(stringValueStyle);
				if (result == null) result = caseNamedStyle(stringValueStyle);
				if (result == null) result = caseStyle(stringValueStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.STRING_LIST_VALUE_STYLE: {
				StringListValueStyle stringListValueStyle = (StringListValueStyle)theEObject;
				Object result = caseStringListValueStyle(stringListValueStyle);
				if (result == null) result = caseNamedStyle(stringListValueStyle);
				if (result == null) result = caseStyle(stringListValueStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.EOBJECT_VALUE_STYLE: {
				EObjectValueStyle eObjectValueStyle = (EObjectValueStyle)theEObject;
				Object result = caseEObjectValueStyle(eObjectValueStyle);
				if (result == null) result = caseNamedStyle(eObjectValueStyle);
				if (result == null) result = caseStyle(eObjectValueStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.EOBJECT_LIST_VALUE_STYLE: {
				EObjectListValueStyle eObjectListValueStyle = (EObjectListValueStyle)theEObject;
				Object result = caseEObjectListValueStyle(eObjectListValueStyle);
				if (result == null) result = caseNamedStyle(eObjectListValueStyle);
				if (result == null) result = caseStyle(eObjectListValueStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.BYTE_ARRAY_VALUE_STYLE: {
				ByteArrayValueStyle byteArrayValueStyle = (ByteArrayValueStyle)theEObject;
				Object result = caseByteArrayValueStyle(byteArrayValueStyle);
				if (result == null) result = caseNamedStyle(byteArrayValueStyle);
				if (result == null) result = caseStyle(byteArrayValueStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.BOOLEAN_LIST_VALUE_STYLE: {
				BooleanListValueStyle booleanListValueStyle = (BooleanListValueStyle)theEObject;
				Object result = caseBooleanListValueStyle(booleanListValueStyle);
				if (result == null) result = caseNamedStyle(booleanListValueStyle);
				if (result == null) result = caseStyle(booleanListValueStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.HINTED_DIAGRAM_LINK_STYLE: {
				HintedDiagramLinkStyle hintedDiagramLinkStyle = (HintedDiagramLinkStyle)theEObject;
				Object result = caseHintedDiagramLinkStyle(hintedDiagramLinkStyle);
				if (result == null) result = caseDiagramLinkStyle(hintedDiagramLinkStyle);
				if (result == null) result = caseStyle(hintedDiagramLinkStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.DIAGRAM_LINK_STYLE: {
				DiagramLinkStyle diagramLinkStyle = (DiagramLinkStyle)theEObject;
				Object result = caseDiagramLinkStyle(diagramLinkStyle);
				if (result == null) result = caseStyle(diagramLinkStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.MULTI_DIAGRAM_LINK_STYLE: {
				MultiDiagramLinkStyle multiDiagramLinkStyle = (MultiDiagramLinkStyle)theEObject;
				Object result = caseMultiDiagramLinkStyle(multiDiagramLinkStyle);
				if (result == null) result = caseStyle(multiDiagramLinkStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.TEXT_STYLE: {
				TextStyle textStyle = (TextStyle)theEObject;
				Object result = caseTextStyle(textStyle);
				if (result == null) result = caseStyle(textStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.LINE_TYPE_STYLE: {
				LineTypeStyle lineTypeStyle = (LineTypeStyle)theEObject;
				Object result = caseLineTypeStyle(lineTypeStyle);
				if (result == null) result = caseStyle(lineTypeStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.ARROW_STYLE: {
				ArrowStyle arrowStyle = (ArrowStyle)theEObject;
				Object result = caseArrowStyle(arrowStyle);
				if (result == null) result = caseStyle(arrowStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEdge(Edge object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNode(Node object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStyle(Style object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Fill Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fill Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFillStyle(FillStyle object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Line Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLineStyle(LineStyle object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Font Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFontStyle(FontStyle object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Title Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Title Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTitleStyle(TitleStyle object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Sorting Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sorting Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSortingStyle(SortingStyle object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Description Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDescriptionStyle(DescriptionStyle object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Layout Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLayoutConstraint(LayoutConstraint object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSize(Size object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLocation(Location object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Bounds</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounds</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBounds(Bounds object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Ratio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ratio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRatio(Ratio object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Anchor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anchor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAnchor(Anchor object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Bendpoints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bendpoints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBendpoints(Bendpoints object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Identity Anchor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identity Anchor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIdentityAnchor(IdentityAnchor object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Routing Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Routing Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRoutingStyle(RoutingStyle object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseView(View object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Bendpoints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Bendpoints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRelativeBendpoints(RelativeBendpoints object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Canonical Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Canonical Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCanonicalStyle(CanonicalStyle object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Shape Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseShapeStyle(ShapeStyle object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConnectorStyle(ConnectorStyle object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDiagram(Diagram object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseImage(Image object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Page Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePageStyle(PageStyle object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Drawer Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drawer Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDrawerStyle(DrawerStyle object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Guide Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guide Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGuideStyle(GuideStyle object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Guide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGuide(Guide object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Node Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNodeEntry(Map.Entry object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Filtering Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filtering Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFilteringStyle(FilteringStyle object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDiagramStyle(DiagramStyle object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Image Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseImageStyle(ImageStyle object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Image Buffer Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Buffer Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseImageBufferStyle(ImageBufferStyle object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Properties Set Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties Set Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePropertiesSetStyle(PropertiesSetStyle object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Property Value Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Property Value Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStringToPropertyValueMapEntry(Map.Entry object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePropertyValue(PropertyValue object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Value Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Value Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSingleValueStyle(SingleValueStyle object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>List Value Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Value Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseListValueStyle(ListValueStyle object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNamedStyle(NamedStyle object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>String Object Converter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Object Converter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStringObjectConverter(StringObjectConverter object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDataTypeStyle(DataTypeStyle object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Value Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Value Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIntValueStyle(IntValueStyle object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Int List Value Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int List Value Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIntListValueStyle(IntListValueStyle object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Value Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Value Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBooleanValueStyle(BooleanValueStyle object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Value Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Value Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDoubleValueStyle(DoubleValueStyle object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Double List Value Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double List Value Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDoubleListValueStyle(DoubleListValueStyle object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>String Value Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Value Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStringValueStyle(StringValueStyle object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>String List Value Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String List Value Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStringListValueStyle(StringListValueStyle object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject Value Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject Value Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEObjectValueStyle(EObjectValueStyle object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject List Value Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject List Value Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEObjectListValueStyle(EObjectListValueStyle object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Byte Array Value Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Byte Array Value Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseByteArrayValueStyle(ByteArrayValueStyle object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean List Value Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean List Value Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBooleanListValueStyle(BooleanListValueStyle object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Hinted Diagram Link Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hinted Diagram Link Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHintedDiagramLinkStyle(HintedDiagramLinkStyle object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Link Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Link Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDiagramLinkStyle(DiagramLinkStyle object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Diagram Link Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Diagram Link Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMultiDiagramLinkStyle(MultiDiagramLinkStyle object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTextStyle(TextStyle object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Type Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Type Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLineTypeStyle(LineTypeStyle object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Arrow Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arrow Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseArrowStyle(ArrowStyle object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEModelElement(EModelElement object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //NotationSwitch
