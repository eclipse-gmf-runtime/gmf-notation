/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2004.  All Rights Reserved.                    |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package org.eclipse.gmf.runtime.notation.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.gmf.runtime.notation.NotationEditPlugin;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.RoutingStyle;

/**
 * This is the item provider adapter for a {@link org.eclipse.gmf.runtime.notation.RoutingStyle} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RoutingStyleItemProvider
	extends ItemProviderAdapter
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
	public RoutingStyleItemProvider(AdapterFactory adapterFactory) {
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

			addRoutingPropertyDescriptor(object);
			addSmoothnessPropertyDescriptor(object);
			addAvoidObstructionsPropertyDescriptor(object);
			addClosestDistancePropertyDescriptor(object);
			addJumpLinkStatusPropertyDescriptor(object);
			addJumpLinkTypePropertyDescriptor(object);
			addJumpLinksReversePropertyDescriptor(object);
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
				 NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
				 true,
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
				 NotationPackage.eINSTANCE.getRoutingStyle_Smoothness(),
				 true,
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
				 NotationPackage.eINSTANCE.getRoutingStyle_AvoidObstructions(),
				 true,
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
				 NotationPackage.eINSTANCE.getRoutingStyle_ClosestDistance(),
				 true,
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
				 NotationPackage.eINSTANCE.getRoutingStyle_JumpLinkStatus(),
				 true,
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
				 NotationPackage.eINSTANCE.getRoutingStyle_JumpLinkType(),
				 true,
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
				 NotationPackage.eINSTANCE.getRoutingStyle_JumpLinksReverse(),
				 true,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns RoutingStyle.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/RoutingStyle"); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		Routing labelValue = ((RoutingStyle)object).getRouting();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_RoutingStyle_type") : //$NON-NLS-1$
			getString("_UI_RoutingStyle_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(RoutingStyle.class)) {
			case NotationPackage.ROUTING_STYLE__ROUTING:
			case NotationPackage.ROUTING_STYLE__SMOOTHNESS:
			case NotationPackage.ROUTING_STYLE__AVOID_OBSTRUCTIONS:
			case NotationPackage.ROUTING_STYLE__CLOSEST_DISTANCE:
			case NotationPackage.ROUTING_STYLE__JUMP_LINK_STATUS:
			case NotationPackage.ROUTING_STYLE__JUMP_LINK_TYPE:
			case NotationPackage.ROUTING_STYLE__JUMP_LINKS_REVERSE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing all of the children that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return NotationEditPlugin.INSTANCE;
	}

}
