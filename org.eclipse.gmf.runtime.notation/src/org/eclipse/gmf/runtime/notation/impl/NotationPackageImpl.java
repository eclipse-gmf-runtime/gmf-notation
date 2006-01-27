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

package org.eclipse.gmf.runtime.notation.impl;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.impl.EcorePackageImpl;

import org.eclipse.gmf.runtime.notation.Alignment;
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
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.MeasurementUnit;
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
import org.eclipse.gmf.runtime.notation.Style;
import org.eclipse.gmf.runtime.notation.TitleStyle;
import org.eclipse.gmf.runtime.notation.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NotationPackageImpl extends EPackageImpl implements NotationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fillStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fontStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titleStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortingStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ratioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anchorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bendpointsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identityAnchorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routingStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeBendpointsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass canonicalStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass drawerStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guideStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filteringStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageBufferStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sortingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum filteringEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum routingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum smoothnessEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jumpLinkStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jumpLinkTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum alignmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sortingDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum measurementUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType relativeBendpointListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType filterKeyListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sortKeyMapEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NotationPackageImpl() {
		super(eNS_URI, NotationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NotationPackage init() {
		if (isInited) return (NotationPackage)EPackage.Registry.INSTANCE.getEPackage(NotationPackage.eNS_URI);

		// Obtain or create and register package
		NotationPackageImpl theNotationPackage = (NotationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof NotationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new NotationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackageImpl.init();

		// Create package meta-data objects
		theNotationPackage.createPackageContents();

		// Initialize created meta-data
		theNotationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNotationPackage.freeze();

		return theNotationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdge() {
		return edgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_Source() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_Target() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_Bendpoints() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_SourceAnchor() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_TargetAnchor() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_LayoutConstraint() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyle() {
		return styleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFillStyle() {
		return fillStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFillStyle_FillColor() {
		return (EAttribute)fillStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineStyle() {
		return lineStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineStyle_LineColor() {
		return (EAttribute)lineStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFontStyle() {
		return fontStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontStyle_FontColor() {
		return (EAttribute)fontStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontStyle_FontName() {
		return (EAttribute)fontStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontStyle_FontHeight() {
		return (EAttribute)fontStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontStyle_Bold() {
		return (EAttribute)fontStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontStyle_Italic() {
		return (EAttribute)fontStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontStyle_Underline() {
		return (EAttribute)fontStyleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontStyle_StrikeThrough() {
		return (EAttribute)fontStyleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTitleStyle() {
		return titleStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitleStyle_ShowTitle() {
		return (EAttribute)titleStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortingStyle() {
		return sortingStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingStyle_Sorting() {
		return (EAttribute)sortingStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingStyle_SortingKeys() {
		return (EAttribute)sortingStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortingStyle_SortedObjects() {
		return (EReference)sortingStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptionStyle() {
		return descriptionStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionStyle_Description() {
		return (EAttribute)descriptionStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayoutConstraint() {
		return layoutConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSize() {
		return sizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSize_Width() {
		return (EAttribute)sizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSize_Height() {
		return (EAttribute)sizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_X() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Y() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBounds() {
		return boundsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRatio() {
		return ratioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRatio_Value() {
		return (EAttribute)ratioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnchor() {
		return anchorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBendpoints() {
		return bendpointsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentityAnchor() {
		return identityAnchorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentityAnchor_Id() {
		return (EAttribute)identityAnchorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoutingStyle() {
		return routingStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoutingStyle_Routing() {
		return (EAttribute)routingStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoutingStyle_Smoothness() {
		return (EAttribute)routingStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoutingStyle_AvoidObstructions() {
		return (EAttribute)routingStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoutingStyle_ClosestDistance() {
		return (EAttribute)routingStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoutingStyle_JumpLinkStatus() {
		return (EAttribute)routingStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoutingStyle_JumpLinkType() {
		return (EAttribute)routingStyleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoutingStyle_JumpLinksReverse() {
		return (EAttribute)routingStyleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_Visible() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_Type() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_Mutable() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_SourceEdges() {
		return (EReference)viewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_TargetEdges() {
		return (EReference)viewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_PersistedChildren() {
		return (EReference)viewEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Styles() {
		return (EReference)viewEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Element() {
		return (EReference)viewEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Diagram() {
		return (EReference)viewEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_TransientChildren() {
		return (EReference)viewEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativeBendpoints() {
		return relativeBendpointsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeBendpoints_Points() {
		return (EAttribute)relativeBendpointsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagram() {
		return diagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_Name() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_MeasurementUnit() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagram_PersistedEdges() {
		return (EReference)diagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagram_TransientEdges() {
		return (EReference)diagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Data() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCanonicalStyle() {
		return canonicalStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCanonicalStyle_Canonical() {
		return (EAttribute)canonicalStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShapeStyle() {
		return shapeStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorStyle() {
		return connectorStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageStyle() {
		return pageStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageStyle_PageX() {
		return (EAttribute)pageStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageStyle_PageY() {
		return (EAttribute)pageStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageStyle_PageWidth() {
		return (EAttribute)pageStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageStyle_PageHeight() {
		return (EAttribute)pageStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrawerStyle() {
		return drawerStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrawerStyle_Collapsed() {
		return (EAttribute)drawerStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuideStyle() {
		return guideStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuideStyle_HorizontalGuides() {
		return (EReference)guideStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuideStyle_VerticalGuides() {
		return (EReference)guideStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuide() {
		return guideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuide_Position() {
		return (EAttribute)guideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuide_NodeMap() {
		return (EReference)guideEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeEntry() {
		return nodeEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeEntry_Value() {
		return (EAttribute)nodeEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeEntry_Key() {
		return (EReference)nodeEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilteringStyle() {
		return filteringStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilteringStyle_Filtering() {
		return (EAttribute)filteringStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilteringStyle_FilteringKeys() {
		return (EAttribute)filteringStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilteringStyle_FilteredObjects() {
		return (EReference)filteringStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramStyle() {
		return diagramStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageStyle() {
		return imageStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageStyle_AntiAlias() {
		return (EAttribute)imageStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageStyle_MaintainAspectRatio() {
		return (EAttribute)imageStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageStyle_CropBound() {
		return (EReference)imageStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageBufferStyle() {
		return imageBufferStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageBufferStyle_ImageBuffer() {
		return (EReference)imageBufferStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSorting() {
		return sortingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFiltering() {
		return filteringEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRouting() {
		return routingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSmoothness() {
		return smoothnessEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJumpLinkStatus() {
		return jumpLinkStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJumpLinkType() {
		return jumpLinkTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAlignment() {
		return alignmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSortingDirection() {
		return sortingDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMeasurementUnit() {
		return measurementUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRelativeBendpointList() {
		return relativeBendpointListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFilterKeyList() {
		return filterKeyListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSortKeyMap() {
		return sortKeyMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotationFactory getNotationFactory() {
		return (NotationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		edgeEClass = createEClass(EDGE);
		createEReference(edgeEClass, EDGE__SOURCE);
		createEReference(edgeEClass, EDGE__TARGET);
		createEReference(edgeEClass, EDGE__BENDPOINTS);
		createEReference(edgeEClass, EDGE__SOURCE_ANCHOR);
		createEReference(edgeEClass, EDGE__TARGET_ANCHOR);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__LAYOUT_CONSTRAINT);

		styleEClass = createEClass(STYLE);

		fillStyleEClass = createEClass(FILL_STYLE);
		createEAttribute(fillStyleEClass, FILL_STYLE__FILL_COLOR);

		lineStyleEClass = createEClass(LINE_STYLE);
		createEAttribute(lineStyleEClass, LINE_STYLE__LINE_COLOR);

		fontStyleEClass = createEClass(FONT_STYLE);
		createEAttribute(fontStyleEClass, FONT_STYLE__FONT_COLOR);
		createEAttribute(fontStyleEClass, FONT_STYLE__FONT_NAME);
		createEAttribute(fontStyleEClass, FONT_STYLE__FONT_HEIGHT);
		createEAttribute(fontStyleEClass, FONT_STYLE__BOLD);
		createEAttribute(fontStyleEClass, FONT_STYLE__ITALIC);
		createEAttribute(fontStyleEClass, FONT_STYLE__UNDERLINE);
		createEAttribute(fontStyleEClass, FONT_STYLE__STRIKE_THROUGH);

		titleStyleEClass = createEClass(TITLE_STYLE);
		createEAttribute(titleStyleEClass, TITLE_STYLE__SHOW_TITLE);

		sortingStyleEClass = createEClass(SORTING_STYLE);
		createEAttribute(sortingStyleEClass, SORTING_STYLE__SORTING);
		createEAttribute(sortingStyleEClass, SORTING_STYLE__SORTING_KEYS);
		createEReference(sortingStyleEClass, SORTING_STYLE__SORTED_OBJECTS);

		descriptionStyleEClass = createEClass(DESCRIPTION_STYLE);
		createEAttribute(descriptionStyleEClass, DESCRIPTION_STYLE__DESCRIPTION);

		layoutConstraintEClass = createEClass(LAYOUT_CONSTRAINT);

		sizeEClass = createEClass(SIZE);
		createEAttribute(sizeEClass, SIZE__WIDTH);
		createEAttribute(sizeEClass, SIZE__HEIGHT);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__X);
		createEAttribute(locationEClass, LOCATION__Y);

		boundsEClass = createEClass(BOUNDS);

		ratioEClass = createEClass(RATIO);
		createEAttribute(ratioEClass, RATIO__VALUE);

		anchorEClass = createEClass(ANCHOR);

		bendpointsEClass = createEClass(BENDPOINTS);

		identityAnchorEClass = createEClass(IDENTITY_ANCHOR);
		createEAttribute(identityAnchorEClass, IDENTITY_ANCHOR__ID);

		routingStyleEClass = createEClass(ROUTING_STYLE);
		createEAttribute(routingStyleEClass, ROUTING_STYLE__ROUTING);
		createEAttribute(routingStyleEClass, ROUTING_STYLE__SMOOTHNESS);
		createEAttribute(routingStyleEClass, ROUTING_STYLE__AVOID_OBSTRUCTIONS);
		createEAttribute(routingStyleEClass, ROUTING_STYLE__CLOSEST_DISTANCE);
		createEAttribute(routingStyleEClass, ROUTING_STYLE__JUMP_LINK_STATUS);
		createEAttribute(routingStyleEClass, ROUTING_STYLE__JUMP_LINK_TYPE);
		createEAttribute(routingStyleEClass, ROUTING_STYLE__JUMP_LINKS_REVERSE);

		viewEClass = createEClass(VIEW);
		createEAttribute(viewEClass, VIEW__VISIBLE);
		createEAttribute(viewEClass, VIEW__TYPE);
		createEAttribute(viewEClass, VIEW__MUTABLE);
		createEReference(viewEClass, VIEW__SOURCE_EDGES);
		createEReference(viewEClass, VIEW__TARGET_EDGES);
		createEReference(viewEClass, VIEW__PERSISTED_CHILDREN);
		createEReference(viewEClass, VIEW__STYLES);
		createEReference(viewEClass, VIEW__ELEMENT);
		createEReference(viewEClass, VIEW__DIAGRAM);
		createEReference(viewEClass, VIEW__TRANSIENT_CHILDREN);

		relativeBendpointsEClass = createEClass(RELATIVE_BENDPOINTS);
		createEAttribute(relativeBendpointsEClass, RELATIVE_BENDPOINTS__POINTS);

		diagramEClass = createEClass(DIAGRAM);
		createEAttribute(diagramEClass, DIAGRAM__NAME);
		createEAttribute(diagramEClass, DIAGRAM__MEASUREMENT_UNIT);
		createEReference(diagramEClass, DIAGRAM__PERSISTED_EDGES);
		createEReference(diagramEClass, DIAGRAM__TRANSIENT_EDGES);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__DATA);

		canonicalStyleEClass = createEClass(CANONICAL_STYLE);
		createEAttribute(canonicalStyleEClass, CANONICAL_STYLE__CANONICAL);

		shapeStyleEClass = createEClass(SHAPE_STYLE);

		connectorStyleEClass = createEClass(CONNECTOR_STYLE);

		pageStyleEClass = createEClass(PAGE_STYLE);
		createEAttribute(pageStyleEClass, PAGE_STYLE__PAGE_X);
		createEAttribute(pageStyleEClass, PAGE_STYLE__PAGE_Y);
		createEAttribute(pageStyleEClass, PAGE_STYLE__PAGE_WIDTH);
		createEAttribute(pageStyleEClass, PAGE_STYLE__PAGE_HEIGHT);

		drawerStyleEClass = createEClass(DRAWER_STYLE);
		createEAttribute(drawerStyleEClass, DRAWER_STYLE__COLLAPSED);

		guideStyleEClass = createEClass(GUIDE_STYLE);
		createEReference(guideStyleEClass, GUIDE_STYLE__HORIZONTAL_GUIDES);
		createEReference(guideStyleEClass, GUIDE_STYLE__VERTICAL_GUIDES);

		guideEClass = createEClass(GUIDE);
		createEAttribute(guideEClass, GUIDE__POSITION);
		createEReference(guideEClass, GUIDE__NODE_MAP);

		nodeEntryEClass = createEClass(NODE_ENTRY);
		createEAttribute(nodeEntryEClass, NODE_ENTRY__VALUE);
		createEReference(nodeEntryEClass, NODE_ENTRY__KEY);

		filteringStyleEClass = createEClass(FILTERING_STYLE);
		createEAttribute(filteringStyleEClass, FILTERING_STYLE__FILTERING);
		createEAttribute(filteringStyleEClass, FILTERING_STYLE__FILTERING_KEYS);
		createEReference(filteringStyleEClass, FILTERING_STYLE__FILTERED_OBJECTS);

		diagramStyleEClass = createEClass(DIAGRAM_STYLE);

		imageStyleEClass = createEClass(IMAGE_STYLE);
		createEAttribute(imageStyleEClass, IMAGE_STYLE__ANTI_ALIAS);
		createEAttribute(imageStyleEClass, IMAGE_STYLE__MAINTAIN_ASPECT_RATIO);
		createEReference(imageStyleEClass, IMAGE_STYLE__CROP_BOUND);

		imageBufferStyleEClass = createEClass(IMAGE_BUFFER_STYLE);
		createEReference(imageBufferStyleEClass, IMAGE_BUFFER_STYLE__IMAGE_BUFFER);

		// Create enums
		sortingEEnum = createEEnum(SORTING);
		filteringEEnum = createEEnum(FILTERING);
		routingEEnum = createEEnum(ROUTING);
		smoothnessEEnum = createEEnum(SMOOTHNESS);
		jumpLinkStatusEEnum = createEEnum(JUMP_LINK_STATUS);
		jumpLinkTypeEEnum = createEEnum(JUMP_LINK_TYPE);
		alignmentEEnum = createEEnum(ALIGNMENT);
		sortingDirectionEEnum = createEEnum(SORTING_DIRECTION);
		measurementUnitEEnum = createEEnum(MEASUREMENT_UNIT);

		// Create data types
		relativeBendpointListEDataType = createEDataType(RELATIVE_BENDPOINT_LIST);
		filterKeyListEDataType = createEDataType(FILTER_KEY_LIST);
		sortKeyMapEDataType = createEDataType(SORT_KEY_MAP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackageImpl theEcorePackage = (EcorePackageImpl)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Add supertypes to classes
		edgeEClass.getESuperTypes().add(this.getView());
		nodeEClass.getESuperTypes().add(this.getView());
		fillStyleEClass.getESuperTypes().add(this.getStyle());
		lineStyleEClass.getESuperTypes().add(this.getStyle());
		fontStyleEClass.getESuperTypes().add(this.getStyle());
		titleStyleEClass.getESuperTypes().add(this.getStyle());
		sortingStyleEClass.getESuperTypes().add(this.getStyle());
		descriptionStyleEClass.getESuperTypes().add(this.getStyle());
		sizeEClass.getESuperTypes().add(this.getLayoutConstraint());
		locationEClass.getESuperTypes().add(this.getLayoutConstraint());
		boundsEClass.getESuperTypes().add(this.getLocation());
		boundsEClass.getESuperTypes().add(this.getSize());
		ratioEClass.getESuperTypes().add(this.getLayoutConstraint());
		identityAnchorEClass.getESuperTypes().add(this.getAnchor());
		routingStyleEClass.getESuperTypes().add(this.getStyle());
		viewEClass.getESuperTypes().add(theEcorePackage.getEModelElement());
		relativeBendpointsEClass.getESuperTypes().add(this.getBendpoints());
		diagramEClass.getESuperTypes().add(this.getView());
		canonicalStyleEClass.getESuperTypes().add(this.getStyle());
		shapeStyleEClass.getESuperTypes().add(theEcorePackage.getEObject());
		shapeStyleEClass.getESuperTypes().add(this.getFontStyle());
		shapeStyleEClass.getESuperTypes().add(this.getDescriptionStyle());
		shapeStyleEClass.getESuperTypes().add(this.getFillStyle());
		shapeStyleEClass.getESuperTypes().add(this.getLineStyle());
		connectorStyleEClass.getESuperTypes().add(theEcorePackage.getEObject());
		connectorStyleEClass.getESuperTypes().add(this.getRoutingStyle());
		connectorStyleEClass.getESuperTypes().add(this.getLineStyle());
		pageStyleEClass.getESuperTypes().add(this.getStyle());
		drawerStyleEClass.getESuperTypes().add(this.getStyle());
		guideStyleEClass.getESuperTypes().add(this.getStyle());
		filteringStyleEClass.getESuperTypes().add(this.getStyle());
		diagramStyleEClass.getESuperTypes().add(theEcorePackage.getEObject());
		diagramStyleEClass.getESuperTypes().add(this.getPageStyle());
		diagramStyleEClass.getESuperTypes().add(this.getGuideStyle());
		diagramStyleEClass.getESuperTypes().add(this.getDescriptionStyle());
		imageStyleEClass.getESuperTypes().add(this.getStyle());
		imageBufferStyleEClass.getESuperTypes().add(this.getImageStyle());

		// Initialize classes and features; add operations and parameters
		initEClass(edgeEClass, Edge.class, "Edge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
			initEReference(getEdge_Source(), this.getView(), this.getView_SourceEdges(), "source", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
	      
			initEReference(getEdge_Target(), this.getView(), this.getView_TargetEdges(), "target", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
	      
			initEReference(getEdge_Bendpoints(), this.getBendpoints(), null, "bendpoints", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
	      
			initEReference(getEdge_SourceAnchor(), this.getAnchor(), null, "sourceAnchor", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
	      
			initEReference(getEdge_TargetAnchor(), this.getAnchor(), null, "targetAnchor", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
	      

		EOperation op = addEOperation(edgeEClass, this.getBendpoints(), "createBendpoints"); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEClass(), "eClass"); //$NON-NLS-1$

		op = addEOperation(edgeEClass, this.getAnchor(), "createSourceAnchor"); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEClass(), "eClass"); //$NON-NLS-1$

		op = addEOperation(edgeEClass, this.getAnchor(), "createTargetAnchor"); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEClass(), "eClass"); //$NON-NLS-1$

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
			initEReference(getNode_LayoutConstraint(), this.getLayoutConstraint(), null, "layoutConstraint", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
	      

		op = addEOperation(nodeEClass, this.getLayoutConstraint(), "createLayoutConstraint"); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEClass(), "eClass"); //$NON-NLS-1$

		initEClass(styleEClass, Style.class, "Style", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(fillStyleEClass, FillStyle.class, "FillStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getFillStyle_FillColor(), ecorePackage.getEInt(), "fillColor", "16777215", 0, 1, FillStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(lineStyleEClass, LineStyle.class, "LineStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getLineStyle_LineColor(), ecorePackage.getEInt(), "lineColor", "11579568", 0, 1, LineStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(fontStyleEClass, FontStyle.class, "FontStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getFontStyle_FontColor(), ecorePackage.getEInt(), "fontColor", "0", 0, 1, FontStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getFontStyle_FontName(), ecorePackage.getEString(), "fontName", "Tahoma", 0, 1, FontStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getFontStyle_FontHeight(), ecorePackage.getEInt(), "fontHeight", "9", 0, 1, FontStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getFontStyle_Bold(), ecorePackage.getEBoolean(), "bold", "false", 0, 1, FontStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getFontStyle_Italic(), ecorePackage.getEBoolean(), "italic", "false", 0, 1, FontStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getFontStyle_Underline(), ecorePackage.getEBoolean(), "underline", "false", 0, 1, FontStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getFontStyle_StrikeThrough(), ecorePackage.getEBoolean(), "strikeThrough", "false", 0, 1, FontStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(titleStyleEClass, TitleStyle.class, "TitleStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getTitleStyle_ShowTitle(), ecorePackage.getEBoolean(), "showTitle", "false", 0, 1, TitleStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(sortingStyleEClass, SortingStyle.class, "SortingStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getSortingStyle_Sorting(), this.getSorting(), "sorting", "None", 0, 1, SortingStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getSortingStyle_SortingKeys(), this.getSortKeyMap(), "sortingKeys", null, 0, 1, SortingStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEReference(getSortingStyle_SortedObjects(), theEcorePackage.getEObject(), null, "sortedObjects", null, 0, -1, SortingStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
	      

		initEClass(descriptionStyleEClass, DescriptionStyle.class, "DescriptionStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDescriptionStyle_Description(), ecorePackage.getEString(), "description", "", 0, 1, DescriptionStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(layoutConstraintEClass, LayoutConstraint.class, "LayoutConstraint", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(sizeEClass, Size.class, "Size", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getSize_Width(), ecorePackage.getEInt(), "width", "-1", 0, 1, Size.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getSize_Height(), ecorePackage.getEInt(), "height", "-1", 0, 1, Size.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getLocation_X(), ecorePackage.getEInt(), "x", "0", 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getLocation_Y(), ecorePackage.getEInt(), "y", "0", 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(boundsEClass, Bounds.class, "Bounds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(ratioEClass, Ratio.class, "Ratio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getRatio_Value(), ecorePackage.getEDouble(), "value", "-1", 0, 1, Ratio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(anchorEClass, Anchor.class, "Anchor", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(bendpointsEClass, Bendpoints.class, "Bendpoints", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(identityAnchorEClass, IdentityAnchor.class, "IdentityAnchor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getIdentityAnchor_Id(), ecorePackage.getEString(), "id", "anchor", 0, 1, IdentityAnchor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(routingStyleEClass, RoutingStyle.class, "RoutingStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getRoutingStyle_Routing(), this.getRouting(), "routing", "Manual", 0, 1, RoutingStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getRoutingStyle_Smoothness(), this.getSmoothness(), "smoothness", "None", 0, 1, RoutingStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getRoutingStyle_AvoidObstructions(), ecorePackage.getEBoolean(), "avoidObstructions", "false", 0, 1, RoutingStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getRoutingStyle_ClosestDistance(), ecorePackage.getEBoolean(), "closestDistance", "false", 0, 1, RoutingStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getRoutingStyle_JumpLinkStatus(), this.getJumpLinkStatus(), "jumpLinkStatus", "None", 0, 1, RoutingStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getRoutingStyle_JumpLinkType(), this.getJumpLinkType(), "jumpLinkType", "Semicircle", 0, 1, RoutingStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getRoutingStyle_JumpLinksReverse(), ecorePackage.getEBoolean(), "jumpLinksReverse", "false", 0, 1, RoutingStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(viewEClass, View.class, "View", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getView_Visible(), ecorePackage.getEBoolean(), "visible", "true", 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getView_Type(), ecorePackage.getEString(), "type", "", 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getView_Mutable(), ecorePackage.getEBoolean(), "mutable", "false", 0, 1, View.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
			initEReference(getView_SourceEdges(), this.getEdge(), this.getEdge_Source(), "sourceEdges", null, 0, -1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
	      
			initEReference(getView_TargetEdges(), this.getEdge(), this.getEdge_Target(), "targetEdges", null, 0, -1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
	      
			initEReference(getView_PersistedChildren(), this.getNode(), null, "children", null, 0, -1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		  
			initEReference(getView_Styles(), this.getStyle(), null, "styles", null, 0, -1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
	      
			initEReference(getView_Element(), theEcorePackage.getEObject(), null, "element", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
	      
			initEReference(getView_Diagram(), this.getDiagram(), null, "diagram", null, 1, 1, View.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
	      
			initEReference(getView_TransientChildren(), this.getNode(), null, "transientChildren", null, 0, -1, View.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
	      

		op = addEOperation(viewEClass, this.getStyle(), "getStyle"); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEClass(), "eClass"); //$NON-NLS-1$

		op = addEOperation(viewEClass, this.getNode(), "createChild"); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEClass(), "eClass"); //$NON-NLS-1$

		op = addEOperation(viewEClass, this.getStyle(), "createStyle"); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEClass(), "eClass"); //$NON-NLS-1$

		initEClass(relativeBendpointsEClass, RelativeBendpoints.class, "RelativeBendpoints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getRelativeBendpoints_Points(), this.getRelativeBendpointList(), "points", null, 0, 1, RelativeBendpoints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(diagramEClass, Diagram.class, "Diagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDiagram_Name(), ecorePackage.getEString(), "name", "", 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getDiagram_MeasurementUnit(), this.getMeasurementUnit(), "measurementUnit", "Himetric", 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
			initEReference(getDiagram_PersistedEdges(), this.getEdge(), null, "edges", null, 0, -1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		  
			initEReference(getDiagram_TransientEdges(), this.getEdge(), null, "TransientEdges", null, 0, -1, Diagram.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
	      

		op = addEOperation(diagramEClass, this.getEdge(), "createEdge"); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEClass(), "eClass"); //$NON-NLS-1$

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getImage_Data(), theEcorePackage.getEByteArray(), "data", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(canonicalStyleEClass, CanonicalStyle.class, "CanonicalStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getCanonicalStyle_Canonical(), ecorePackage.getEBoolean(), "canonical", "true", 0, 1, CanonicalStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(shapeStyleEClass, ShapeStyle.class, "ShapeStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(connectorStyleEClass, ConnectorStyle.class, "ConnectorStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(pageStyleEClass, PageStyle.class, "PageStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getPageStyle_PageX(), ecorePackage.getEInt(), "pageX", "0", 0, 1, PageStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getPageStyle_PageY(), ecorePackage.getEInt(), "pageY", "0", 0, 1, PageStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getPageStyle_PageWidth(), ecorePackage.getEInt(), "pageWidth", "100", 0, 1, PageStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getPageStyle_PageHeight(), ecorePackage.getEInt(), "pageHeight", "100", 0, 1, PageStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(drawerStyleEClass, DrawerStyle.class, "DrawerStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDrawerStyle_Collapsed(), ecorePackage.getEBoolean(), "collapsed", "false", 0, 1, DrawerStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(guideStyleEClass, GuideStyle.class, "GuideStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
			initEReference(getGuideStyle_HorizontalGuides(), this.getGuide(), null, "horizontalGuides", null, 0, -1, GuideStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
	      
			initEReference(getGuideStyle_VerticalGuides(), this.getGuide(), null, "verticalGuides", null, 0, -1, GuideStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
	      

		initEClass(guideEClass, Guide.class, "Guide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getGuide_Position(), ecorePackage.getEInt(), "position", "0", 0, 1, Guide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
			initEReference(getGuide_NodeMap(), this.getNodeEntry(), null, "nodeMap", null, 0, -1, Guide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
	      

		initEClass(nodeEntryEClass, Map.Entry.class, "NodeEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getNodeEntry_Value(), this.getAlignment(), "value", "Center", 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
			initEReference(getNodeEntry_Key(), this.getNode(), null, "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
	      

		initEClass(filteringStyleEClass, FilteringStyle.class, "FilteringStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getFilteringStyle_Filtering(), this.getFiltering(), "filtering", "None", 0, 1, FilteringStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getFilteringStyle_FilteringKeys(), this.getFilterKeyList(), "filteringKeys", null, 0, 1, FilteringStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEReference(getFilteringStyle_FilteredObjects(), theEcorePackage.getEObject(), null, "filteredObjects", null, 0, -1, FilteringStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
	      

		initEClass(diagramStyleEClass, DiagramStyle.class, "DiagramStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(imageStyleEClass, ImageStyle.class, "ImageStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getImageStyle_AntiAlias(), ecorePackage.getEBooleanObject(), "antiAlias", "true", 0, 1, ImageStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getImageStyle_MaintainAspectRatio(), ecorePackage.getEBooleanObject(), "maintainAspectRatio", "true", 0, 1, ImageStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
			initEReference(getImageStyle_CropBound(), this.getBounds(), null, "cropBound", null, 1, 1, ImageStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
	      

		initEClass(imageBufferStyleEClass, ImageBufferStyle.class, "ImageBufferStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
			initEReference(getImageBufferStyle_ImageBuffer(), this.getImage(), null, "imageBuffer", null, 1, 1, ImageBufferStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
	      

		// Initialize enums and add enum literals
		initEEnum(sortingEEnum, Sorting.class, "Sorting"); //$NON-NLS-1$
		addEEnumLiteral(sortingEEnum, Sorting.NONE_LITERAL);
		addEEnumLiteral(sortingEEnum, Sorting.MANUAL_LITERAL);
		addEEnumLiteral(sortingEEnum, Sorting.AUTOMATIC_LITERAL);

		initEEnum(filteringEEnum, Filtering.class, "Filtering"); //$NON-NLS-1$
		addEEnumLiteral(filteringEEnum, Filtering.NONE_LITERAL);
		addEEnumLiteral(filteringEEnum, Filtering.MANUAL_LITERAL);
		addEEnumLiteral(filteringEEnum, Filtering.AUTOMATIC_LITERAL);

		initEEnum(routingEEnum, Routing.class, "Routing"); //$NON-NLS-1$
		addEEnumLiteral(routingEEnum, Routing.MANUAL_LITERAL);
		addEEnumLiteral(routingEEnum, Routing.RECTILINEAR_LITERAL);
		addEEnumLiteral(routingEEnum, Routing.TREE_LITERAL);

		initEEnum(smoothnessEEnum, Smoothness.class, "Smoothness"); //$NON-NLS-1$
		addEEnumLiteral(smoothnessEEnum, Smoothness.NONE_LITERAL);
		addEEnumLiteral(smoothnessEEnum, Smoothness.NORMAL_LITERAL);
		addEEnumLiteral(smoothnessEEnum, Smoothness.LESS_LITERAL);
		addEEnumLiteral(smoothnessEEnum, Smoothness.MORE_LITERAL);

		initEEnum(jumpLinkStatusEEnum, JumpLinkStatus.class, "JumpLinkStatus"); //$NON-NLS-1$
		addEEnumLiteral(jumpLinkStatusEEnum, JumpLinkStatus.NONE_LITERAL);
		addEEnumLiteral(jumpLinkStatusEEnum, JumpLinkStatus.ALL_LITERAL);
		addEEnumLiteral(jumpLinkStatusEEnum, JumpLinkStatus.BELOW_LITERAL);
		addEEnumLiteral(jumpLinkStatusEEnum, JumpLinkStatus.ABOVE_LITERAL);

		initEEnum(jumpLinkTypeEEnum, JumpLinkType.class, "JumpLinkType"); //$NON-NLS-1$
		addEEnumLiteral(jumpLinkTypeEEnum, JumpLinkType.SEMICIRCLE_LITERAL);
		addEEnumLiteral(jumpLinkTypeEEnum, JumpLinkType.SQUARE_LITERAL);
		addEEnumLiteral(jumpLinkTypeEEnum, JumpLinkType.CHAMFERED_LITERAL);

		initEEnum(alignmentEEnum, Alignment.class, "Alignment"); //$NON-NLS-1$
		addEEnumLiteral(alignmentEEnum, Alignment.LEFT_LITERAL);
		addEEnumLiteral(alignmentEEnum, Alignment.RIGHT_LITERAL);
		addEEnumLiteral(alignmentEEnum, Alignment.CENTER_LITERAL);
		addEEnumLiteral(alignmentEEnum, Alignment.TOP_LITERAL);
		addEEnumLiteral(alignmentEEnum, Alignment.BOTTOM_LITERAL);

		initEEnum(sortingDirectionEEnum, SortingDirection.class, "SortingDirection"); //$NON-NLS-1$
		addEEnumLiteral(sortingDirectionEEnum, SortingDirection.ASCENDING_LITERAL);
		addEEnumLiteral(sortingDirectionEEnum, SortingDirection.DESCENDING_LITERAL);

		initEEnum(measurementUnitEEnum, MeasurementUnit.class, "MeasurementUnit"); //$NON-NLS-1$
		addEEnumLiteral(measurementUnitEEnum, MeasurementUnit.HIMETRIC_LITERAL);
		addEEnumLiteral(measurementUnitEEnum, MeasurementUnit.PIXEL_LITERAL);

		// Initialize data types
		initEDataType(relativeBendpointListEDataType, List.class, "RelativeBendpointList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(filterKeyListEDataType, List.class, "FilterKeyList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(sortKeyMapEDataType, Map.class, "SortKeyMap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //NotationPackageImpl
