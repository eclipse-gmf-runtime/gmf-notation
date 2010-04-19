/******************************************************************************
 * Copyright (c) 2009, 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/
package org.eclipse.gmf.runtime.notation.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.gmf.runtime.notation.Connector} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectorItemProvider
	extends EdgeItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addRoundedBendpointsRadiusPropertyDescriptor(object);
			addRoutingPropertyDescriptor(object);
			addSmoothnessPropertyDescriptor(object);
			addAvoidObstructionsPropertyDescriptor(object);
			addClosestDistancePropertyDescriptor(object);
			addJumpLinkStatusPropertyDescriptor(object);
			addJumpLinkTypePropertyDescriptor(object);
			addJumpLinksReversePropertyDescriptor(object);
			addLineColorPropertyDescriptor(object);
			addLineWidthPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Routing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoutingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoutingStyle_routing_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_RoutingStyle_routing_feature", "_UI_RoutingStyle_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 NotationPackage.Literals.ROUTING_STYLE__ROUTING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Smoothness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSmoothnessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoutingStyle_smoothness_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_RoutingStyle_smoothness_feature", "_UI_RoutingStyle_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 NotationPackage.Literals.ROUTING_STYLE__SMOOTHNESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Avoid Obstructions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvoidObstructionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoutingStyle_avoidObstructions_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_RoutingStyle_avoidObstructions_feature", "_UI_RoutingStyle_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 NotationPackage.Literals.ROUTING_STYLE__AVOID_OBSTRUCTIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Closest Distance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClosestDistancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoutingStyle_closestDistance_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_RoutingStyle_closestDistance_feature", "_UI_RoutingStyle_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 NotationPackage.Literals.ROUTING_STYLE__CLOSEST_DISTANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Jump Link Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJumpLinkStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoutingStyle_jumpLinkStatus_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_RoutingStyle_jumpLinkStatus_feature", "_UI_RoutingStyle_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 NotationPackage.Literals.ROUTING_STYLE__JUMP_LINK_STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Jump Link Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJumpLinkTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoutingStyle_jumpLinkType_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_RoutingStyle_jumpLinkType_feature", "_UI_RoutingStyle_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 NotationPackage.Literals.ROUTING_STYLE__JUMP_LINK_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Jump Links Reverse feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJumpLinksReversePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoutingStyle_jumpLinksReverse_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_RoutingStyle_jumpLinksReverse_feature", "_UI_RoutingStyle_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 NotationPackage.Literals.ROUTING_STYLE__JUMP_LINKS_REVERSE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rounded Bendpoints Radius feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoundedBendpointsRadiusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoundedCornersStyle_roundedBendpointsRadius_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_RoundedCornersStyle_roundedBendpointsRadius_feature", "_UI_RoundedCornersStyle_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 NotationPackage.Literals.ROUNDED_CORNERS_STYLE__ROUNDED_BENDPOINTS_RADIUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Line Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLineColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LineStyle_lineColor_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_LineStyle_lineColor_feature", "_UI_LineStyle_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 NotationPackage.Literals.LINE_STYLE__LINE_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Line Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLineWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LineStyle_lineWidth_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_LineStyle_lineWidth_feature", "_UI_LineStyle_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 NotationPackage.Literals.LINE_STYLE__LINE_WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Connector.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Connector")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		Connector connector = (Connector)object;
		return getString("_UI_Connector_type") + " " + connector.isVisible(); //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Connector.class)) {
			case NotationPackage.CONNECTOR__ROUNDED_BENDPOINTS_RADIUS:
			case NotationPackage.CONNECTOR__ROUTING:
			case NotationPackage.CONNECTOR__SMOOTHNESS:
			case NotationPackage.CONNECTOR__AVOID_OBSTRUCTIONS:
			case NotationPackage.CONNECTOR__CLOSEST_DISTANCE:
			case NotationPackage.CONNECTOR__JUMP_LINK_STATUS:
			case NotationPackage.CONNECTOR__JUMP_LINK_TYPE:
			case NotationPackage.CONNECTOR__JUMP_LINKS_REVERSE:
			case NotationPackage.CONNECTOR__LINE_COLOR:
			case NotationPackage.CONNECTOR__LINE_WIDTH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateChildText(Object owner, Object feature, Object child, Collection selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == NotationPackage.Literals.VIEW__PERSISTED_CHILDREN ||
			childFeature == NotationPackage.Literals.VIEW__TRANSIENT_CHILDREN ||
			childFeature == NotationPackage.Literals.VIEW__STYLES ||
			childFeature == NotationPackage.Literals.EDGE__SOURCE_ANCHOR ||
			childFeature == NotationPackage.Literals.EDGE__TARGET_ANCHOR;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2", //$NON-NLS-1$
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
