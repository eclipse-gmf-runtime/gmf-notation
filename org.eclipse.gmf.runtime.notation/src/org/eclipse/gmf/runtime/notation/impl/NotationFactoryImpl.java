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

package org.eclipse.gmf.runtime.notation.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.gmf.runtime.notation.*;

import org.eclipse.gmf.runtime.notation.Alignment;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.CanonicalStyle;
import org.eclipse.gmf.runtime.notation.ConnectorStyle;
import org.eclipse.gmf.runtime.notation.DescriptionStyle;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.DiagramStyle;
import org.eclipse.gmf.runtime.notation.DrawerStyle;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.FillStyle;
import org.eclipse.gmf.runtime.notation.Filtering;
import org.eclipse.gmf.runtime.notation.FilteringStyle;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.Guide;
import org.eclipse.gmf.runtime.notation.GuideStyle;
import org.eclipse.gmf.runtime.notation.IdentityAnchor;
import org.eclipse.gmf.runtime.notation.Image;
import org.eclipse.gmf.runtime.notation.ImageBufferStyle;
import org.eclipse.gmf.runtime.notation.ImageStyle;
import org.eclipse.gmf.runtime.notation.JumpLinkStatus;
import org.eclipse.gmf.runtime.notation.JumpLinkType;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.PageStyle;
import org.eclipse.gmf.runtime.notation.Ratio;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.RoutingStyle;
import org.eclipse.gmf.runtime.notation.ShapeStyle;
import org.eclipse.gmf.runtime.notation.Size;
import org.eclipse.gmf.runtime.notation.Smoothness;
import org.eclipse.gmf.runtime.notation.Sorting;
import org.eclipse.gmf.runtime.notation.SortingDirection;
import org.eclipse.gmf.runtime.notation.SortingStyle;
import org.eclipse.gmf.runtime.notation.TitleStyle;
import org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public class NotationFactoryImpl extends EFactoryImpl implements NotationFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static NotationFactory init() {
        try {
            NotationFactory theNotationFactory = (NotationFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/gmf/runtime/1.0.0/notation"); //$NON-NLS-1$ 
            if (theNotationFactory != null) {
                return theNotationFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new NotationFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotationFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case NotationPackage.EDGE: return createEdge();
            case NotationPackage.NODE: return createNode();
            case NotationPackage.FILL_STYLE: return createFillStyle();
            case NotationPackage.LINE_STYLE: return createLineStyle();
            case NotationPackage.FONT_STYLE: return createFontStyle();
            case NotationPackage.TITLE_STYLE: return createTitleStyle();
            case NotationPackage.SORTING_STYLE: return createSortingStyle();
            case NotationPackage.DESCRIPTION_STYLE: return createDescriptionStyle();
            case NotationPackage.SIZE: return createSize();
            case NotationPackage.LOCATION: return createLocation();
            case NotationPackage.BOUNDS: return createBounds();
            case NotationPackage.RATIO: return createRatio();
            case NotationPackage.IDENTITY_ANCHOR: return createIdentityAnchor();
            case NotationPackage.ROUTING_STYLE: return createRoutingStyle();
            case NotationPackage.RELATIVE_BENDPOINTS: return createRelativeBendpoints();
            case NotationPackage.DIAGRAM: return createDiagram();
            case NotationPackage.IMAGE: return createImage();
            case NotationPackage.CANONICAL_STYLE: return createCanonicalStyle();
            case NotationPackage.SHAPE_STYLE: return createShapeStyle();
            case NotationPackage.CONNECTOR_STYLE: return createConnectorStyle();
            case NotationPackage.PAGE_STYLE: return createPageStyle();
            case NotationPackage.DRAWER_STYLE: return createDrawerStyle();
            case NotationPackage.GUIDE_STYLE: return createGuideStyle();
            case NotationPackage.GUIDE: return createGuide();
            case NotationPackage.NODE_ENTRY: return (EObject)createNodeEntry();
            case NotationPackage.FILTERING_STYLE: return createFilteringStyle();
            case NotationPackage.DIAGRAM_STYLE: return createDiagramStyle();
            case NotationPackage.IMAGE_STYLE: return createImageStyle();
            case NotationPackage.IMAGE_BUFFER_STYLE: return createImageBufferStyle();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case NotationPackage.SORTING:
                return createSortingFromString(eDataType, initialValue);
            case NotationPackage.FILTERING:
                return createFilteringFromString(eDataType, initialValue);
            case NotationPackage.ROUTING:
                return createRoutingFromString(eDataType, initialValue);
            case NotationPackage.SMOOTHNESS:
                return createSmoothnessFromString(eDataType, initialValue);
            case NotationPackage.JUMP_LINK_STATUS:
                return createJumpLinkStatusFromString(eDataType, initialValue);
            case NotationPackage.JUMP_LINK_TYPE:
                return createJumpLinkTypeFromString(eDataType, initialValue);
            case NotationPackage.ALIGNMENT:
                return createAlignmentFromString(eDataType, initialValue);
            case NotationPackage.SORTING_DIRECTION:
                return createSortingDirectionFromString(eDataType, initialValue);
            case NotationPackage.MEASUREMENT_UNIT:
                return createMeasurementUnitFromString(eDataType, initialValue);
            case NotationPackage.RELATIVE_BENDPOINT_LIST:
                return createRelativeBendpointListFromString(eDataType, initialValue);
            case NotationPackage.FILTER_KEY_LIST:
                return createFilterKeyListFromString(eDataType, initialValue);
            case NotationPackage.SORT_KEY_MAP:
                return createSortKeyMapFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case NotationPackage.SORTING:
                return convertSortingToString(eDataType, instanceValue);
            case NotationPackage.FILTERING:
                return convertFilteringToString(eDataType, instanceValue);
            case NotationPackage.ROUTING:
                return convertRoutingToString(eDataType, instanceValue);
            case NotationPackage.SMOOTHNESS:
                return convertSmoothnessToString(eDataType, instanceValue);
            case NotationPackage.JUMP_LINK_STATUS:
                return convertJumpLinkStatusToString(eDataType, instanceValue);
            case NotationPackage.JUMP_LINK_TYPE:
                return convertJumpLinkTypeToString(eDataType, instanceValue);
            case NotationPackage.ALIGNMENT:
                return convertAlignmentToString(eDataType, instanceValue);
            case NotationPackage.SORTING_DIRECTION:
                return convertSortingDirectionToString(eDataType, instanceValue);
            case NotationPackage.MEASUREMENT_UNIT:
                return convertMeasurementUnitToString(eDataType, instanceValue);
            case NotationPackage.RELATIVE_BENDPOINT_LIST:
                return convertRelativeBendpointListToString(eDataType, instanceValue);
            case NotationPackage.FILTER_KEY_LIST:
                return convertFilterKeyListToString(eDataType, instanceValue);
            case NotationPackage.SORT_KEY_MAP:
                return convertSortKeyMapToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Edge createEdge() {
        EdgeImpl edge = new EdgeImpl();
        return edge;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Node createNode() {
        NodeImpl node = new NodeImpl();
        return node;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FillStyle createFillStyle() {
        FillStyleImpl fillStyle = new FillStyleImpl();
        return fillStyle;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public LineStyle createLineStyle() {
        LineStyleImpl lineStyle = new LineStyleImpl();
        return lineStyle;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FontStyle createFontStyle() {
        FontStyleImpl fontStyle = new FontStyleImpl();
        return fontStyle;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TitleStyle createTitleStyle() {
        TitleStyleImpl titleStyle = new TitleStyleImpl();
        return titleStyle;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SortingStyle createSortingStyle() {
        SortingStyleImpl sortingStyle = new SortingStyleImpl();
        return sortingStyle;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DescriptionStyle createDescriptionStyle() {
        DescriptionStyleImpl descriptionStyle = new DescriptionStyleImpl();
        return descriptionStyle;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Size createSize() {
        SizeImpl size = new SizeImpl();
        return size;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Location createLocation() {
        LocationImpl location = new LocationImpl();
        return location;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Bounds createBounds() {
        BoundsImpl bounds = new BoundsImpl();
        return bounds;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Ratio createRatio() {
        RatioImpl ratio = new RatioImpl();
        return ratio;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public IdentityAnchor createIdentityAnchor() {
        IdentityAnchorImpl identityAnchor = new IdentityAnchorImpl();
        return identityAnchor;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public RoutingStyle createRoutingStyle() {
        RoutingStyleImpl routingStyle = new RoutingStyleImpl();
        return routingStyle;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public RelativeBendpoints createRelativeBendpoints() {
        RelativeBendpointsImpl relativeBendpoints = new RelativeBendpointsImpl();
        return relativeBendpoints;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CanonicalStyle createCanonicalStyle() {
        CanonicalStyleImpl canonicalStyle = new CanonicalStyleImpl();
        return canonicalStyle;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ShapeStyle createShapeStyle() {
        ShapeStyleImpl shapeStyle = new ShapeStyleImpl();
        return shapeStyle;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ConnectorStyle createConnectorStyle() {
        ConnectorStyleImpl connectorStyle = new ConnectorStyleImpl();
        return connectorStyle;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Diagram createDiagram() {
        DiagramImpl diagram = new DiagramImpl();
        return diagram;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Image createImage() {
        ImageImpl image = new ImageImpl();
        return image;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PageStyle createPageStyle() {
        PageStyleImpl pageStyle = new PageStyleImpl();
        return pageStyle;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DrawerStyle createDrawerStyle() {
        DrawerStyleImpl drawerStyle = new DrawerStyleImpl();
        return drawerStyle;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public GuideStyle createGuideStyle() {
        GuideStyleImpl guideStyle = new GuideStyleImpl();
        return guideStyle;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Guide createGuide() {
        GuideImpl guide = new GuideImpl();
        return guide;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Map.Entry createNodeEntry() {
        NodeEntryImpl nodeEntry = new NodeEntryImpl();
        return nodeEntry;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FilteringStyle createFilteringStyle() {
        FilteringStyleImpl filteringStyle = new FilteringStyleImpl();
        return filteringStyle;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DiagramStyle createDiagramStyle() {
        DiagramStyleImpl diagramStyle = new DiagramStyleImpl();
        return diagramStyle;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ImageStyle createImageStyle() {
        ImageStyleImpl imageStyle = new ImageStyleImpl();
        return imageStyle;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ImageBufferStyle createImageBufferStyle() {
        ImageBufferStyleImpl imageBufferStyle = new ImageBufferStyleImpl();
        return imageBufferStyle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Sorting createSortingFromString(EDataType eDataType, String initialValue) {
        Sorting result = Sorting.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSortingToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Filtering createFilteringFromString(EDataType eDataType, String initialValue) {
        Filtering result = Filtering.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertFilteringToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Routing createRoutingFromString(EDataType eDataType, String initialValue) {
        Routing result = Routing.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertRoutingToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Smoothness createSmoothnessFromString(EDataType eDataType, String initialValue) {
        Smoothness result = Smoothness.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSmoothnessToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JumpLinkStatus createJumpLinkStatusFromString(EDataType eDataType, String initialValue) {
        JumpLinkStatus result = JumpLinkStatus.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertJumpLinkStatusToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JumpLinkType createJumpLinkTypeFromString(EDataType eDataType, String initialValue) {
        JumpLinkType result = JumpLinkType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertJumpLinkTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Alignment createAlignmentFromString(EDataType eDataType, String initialValue) {
        Alignment result = Alignment.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAlignmentToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SortingDirection createSortingDirectionFromString(EDataType eDataType, String initialValue) {
        SortingDirection result = SortingDirection.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSortingDirectionToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasurementUnit createMeasurementUnitFromString(EDataType eDataType, String initialValue) {
        MeasurementUnit result = MeasurementUnit.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMeasurementUnitToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List createRelativeBendpointListFromString(EDataType eDataType, String initialValue) {
		StringTokenizer st = new StringTokenizer(initialValue, "$"); //$NON-NLS-1$
		List newList = new ArrayList(st.countTokens());
		while (st.hasMoreTokens())
			newList.add(new RelativeBendpoint(st.nextToken().trim()));
		return newList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertRelativeBendpointListToString(EDataType eDataType, Object instanceValue) {
		StringBuffer sb = new StringBuffer();
		for (Iterator i = ((List)instanceValue).iterator(); i.hasNext();) {
			RelativeBendpoint point = (RelativeBendpoint) i.next();
			if (sb.length() != 0) sb.append('$');
			sb.append(point.convertToString());
		}
		return sb.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List createFilterKeyListFromString(EDataType eDataType, String initialValue) {
		StringTokenizer st = new StringTokenizer(initialValue, ","); //$NON-NLS-1$
		List newList = new ArrayList(st.countTokens());
		while (st.hasMoreTokens())
			newList.add(st.nextToken().trim());
		return newList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertFilterKeyListToString(EDataType eDataType, Object instanceValue) {
		StringBuffer sb = new StringBuffer();
		for (Iterator i = ((List)instanceValue).iterator(); i.hasNext();) {
			String key = (String) i.next();
			if (sb.length() != 0) sb.append(',');
			sb.append(key);
		}
		return sb.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Map createSortKeyMapFromString(EDataType eDataType, String initialValue) {
		StringTokenizer st = new StringTokenizer(initialValue, ","); //$NON-NLS-1$
		Map newMap = new LinkedHashMap(st.countTokens());
		String s;
		int i;
		while (st.hasMoreTokens()) {
			s = st.nextToken().trim();
			i = s.indexOf(':');
			newMap.put(s.substring(0, i).trim(), SortingDirection.get(s.substring(i+1).trim()));
		}
		return newMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertSortKeyMapToString(EDataType eDataType, Object instanceValue) {
		StringBuffer sb = new StringBuffer();
		Map keyMap = (Map) instanceValue;
		for (Iterator i = keyMap.keySet().iterator(); i.hasNext();) {
			String key = (String) i.next();
			SortingDirection direction = (SortingDirection) keyMap.get(key);
			if (sb.length() != 0) sb.append(',');
			sb.append(key + ":" + direction.getName()); //$NON-NLS-1$
		}
		return sb.toString();
	}

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotationPackage getNotationPackage() {
        return (NotationPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	public static NotationPackage getPackage() {
        return NotationPackage.eINSTANCE;
    }

} //NotationFactoryImpl
