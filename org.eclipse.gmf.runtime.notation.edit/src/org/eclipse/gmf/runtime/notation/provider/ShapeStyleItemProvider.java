/******************************************************************************
 * Copyright (c) 2004, 2010 IBM Corporation and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
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
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.ShapeStyle;

/**
 * This is the item provider adapter for a {@link org.eclipse.gmf.runtime.notation.ShapeStyle} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ShapeStyleItemProvider
	extends FontStyleItemProvider
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
	public ShapeStyleItemProvider(AdapterFactory adapterFactory) {
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

			addDescriptionPropertyDescriptor(object);
			addFillColorPropertyDescriptor(object);
			addTransparencyPropertyDescriptor(object);
			addGradientPropertyDescriptor(object);
			addLineColorPropertyDescriptor(object);
			addLineWidthPropertyDescriptor(object);
			addRoundedBendpointsRadiusPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

    /**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DescriptionStyle_description_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DescriptionStyle_description_feature", "_UI_DescriptionStyle_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 NotationPackage.Literals.DESCRIPTION_STYLE__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Fill Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFillColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FillStyle_fillColor_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_FillStyle_fillColor_feature", "_UI_FillStyle_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 NotationPackage.Literals.FILL_STYLE__FILL_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Transparency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransparencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FillStyle_transparency_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_FillStyle_transparency_feature", "_UI_FillStyle_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 NotationPackage.Literals.FILL_STYLE__TRANSPARENCY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

				/**
	 * This adds a property descriptor for the Gradient feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGradientPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FillStyle_gradient_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_FillStyle_gradient_feature", "_UI_FillStyle_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 NotationPackage.Literals.FILL_STYLE__GRADIENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
	 * This adds a property descriptor for the Rounded Bendpoints Radius feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     * @since 1.4
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
	 * This returns ShapeStyle.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ShapeStyle")); //$NON-NLS-1$
	}

    /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((ShapeStyle)object).getFontName();
		return label == null || label.length() == 0 ?
			getString("_UI_ShapeStyle_type") : //$NON-NLS-1$
			getString("_UI_ShapeStyle_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(ShapeStyle.class)) {
			case NotationPackage.SHAPE_STYLE__DESCRIPTION:
			case NotationPackage.SHAPE_STYLE__FILL_COLOR:
			case NotationPackage.SHAPE_STYLE__TRANSPARENCY:
			case NotationPackage.SHAPE_STYLE__GRADIENT:
			case NotationPackage.SHAPE_STYLE__LINE_COLOR:
			case NotationPackage.SHAPE_STYLE__LINE_WIDTH:
			case NotationPackage.SHAPE_STYLE__ROUNDED_BENDPOINTS_RADIUS:
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

}
