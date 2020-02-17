/******************************************************************************
 * Copyright (c) 2008 IBM Corporation and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/
package org.eclipse.gmf.runtime.notation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.runtime.notation.DescriptionStyle;
import org.eclipse.gmf.runtime.notation.DiagramStyle;
import org.eclipse.gmf.runtime.notation.Guide;
import org.eclipse.gmf.runtime.notation.GuideStyle;
import org.eclipse.gmf.runtime.notation.MeasurementUnit;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.PageStyle;
import org.eclipse.gmf.runtime.notation.StandardDiagram;
import org.eclipse.gmf.runtime.notation.Style;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.StandardDiagramImpl#getPageX <em>Page X</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.StandardDiagramImpl#getPageY <em>Page Y</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.StandardDiagramImpl#getPageWidth <em>Page Width</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.StandardDiagramImpl#getPageHeight <em>Page Height</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.StandardDiagramImpl#getHorizontalGuides <em>Horizontal Guides</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.StandardDiagramImpl#getVerticalGuides <em>Vertical Guides</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.StandardDiagramImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 * @since 1.2
 */
public class StandardDiagramImpl extends DiagramImpl implements StandardDiagram {
	/**
	 * The default value of the '{@link #getPageX() <em>Page X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageX()
	 * @generated
	 * @ordered
	 */
	protected static final int PAGE_X_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getPageX() <em>Page X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageX()
	 * @generated
	 * @ordered
	 */
	protected int pageX = PAGE_X_EDEFAULT;
	/**
	 * The default value of the '{@link #getPageY() <em>Page Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageY()
	 * @generated
	 * @ordered
	 */
	protected static final int PAGE_Y_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getPageY() <em>Page Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageY()
	 * @generated
	 * @ordered
	 */
	protected int pageY = PAGE_Y_EDEFAULT;
	/**
	 * The default value of the '{@link #getPageWidth() <em>Page Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int PAGE_WIDTH_EDEFAULT = 100;
	/**
	 * The cached value of the '{@link #getPageWidth() <em>Page Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageWidth()
	 * @generated
	 * @ordered
	 */
	protected int pageWidth = PAGE_WIDTH_EDEFAULT;
	/**
	 * The default value of the '{@link #getPageHeight() <em>Page Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int PAGE_HEIGHT_EDEFAULT = 100;
	/**
	 * The cached value of the '{@link #getPageHeight() <em>Page Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageHeight()
	 * @generated
	 * @ordered
	 */
	protected int pageHeight = PAGE_HEIGHT_EDEFAULT;
	/**
	 * The cached value of the '{@link #getHorizontalGuides() <em>Horizontal Guides</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalGuides()
	 * @generated
	 * @ordered
	 */
	protected EList horizontalGuides;
	/**
	 * The cached value of the '{@link #getVerticalGuides() <em>Vertical Guides</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalGuides()
	 * @generated
	 * @ordered
	 */
	protected EList verticalGuides;
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = ""; //$NON-NLS-1$
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.STANDARD_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPageX() {
		return pageX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageX(int newPageX) {
		int oldPageX = pageX;
		pageX = newPageX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.STANDARD_DIAGRAM__PAGE_X, oldPageX, pageX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPageY() {
		return pageY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageY(int newPageY) {
		int oldPageY = pageY;
		pageY = newPageY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.STANDARD_DIAGRAM__PAGE_Y, oldPageY, pageY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPageWidth() {
		return pageWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageWidth(int newPageWidth) {
		int oldPageWidth = pageWidth;
		pageWidth = newPageWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.STANDARD_DIAGRAM__PAGE_WIDTH, oldPageWidth, pageWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPageHeight() {
		return pageHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageHeight(int newPageHeight) {
		int oldPageHeight = pageHeight;
		pageHeight = newPageHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.STANDARD_DIAGRAM__PAGE_HEIGHT, oldPageHeight, pageHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getHorizontalGuides() {
		if (horizontalGuides == null) {
			horizontalGuides = new EObjectContainmentEList(Guide.class, this, NotationPackage.STANDARD_DIAGRAM__HORIZONTAL_GUIDES);
		}
		return horizontalGuides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getVerticalGuides() {
		if (verticalGuides == null) {
			verticalGuides = new EObjectContainmentEList(Guide.class, this, NotationPackage.STANDARD_DIAGRAM__VERTICAL_GUIDES);
		}
		return verticalGuides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.STANDARD_DIAGRAM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NotationPackage.STANDARD_DIAGRAM__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case NotationPackage.STANDARD_DIAGRAM__SOURCE_EDGES:
				return ((InternalEList)getSourceEdges()).basicRemove(otherEnd, msgs);
			case NotationPackage.STANDARD_DIAGRAM__TARGET_EDGES:
				return ((InternalEList)getTargetEdges()).basicRemove(otherEnd, msgs);
			case NotationPackage.STANDARD_DIAGRAM__PERSISTED_CHILDREN:
				return ((InternalEList)getPersistedChildren()).basicRemove(otherEnd, msgs);
			case NotationPackage.STANDARD_DIAGRAM__STYLES:
				return ((InternalEList)getStyles()).basicRemove(otherEnd, msgs);
			case NotationPackage.STANDARD_DIAGRAM__TRANSIENT_CHILDREN:
				return ((InternalEList)getTransientChildren()).basicRemove(otherEnd, msgs);
			case NotationPackage.STANDARD_DIAGRAM__PERSISTED_EDGES:
				return ((InternalEList)getPersistedEdges()).basicRemove(otherEnd, msgs);
			case NotationPackage.STANDARD_DIAGRAM__TRANSIENT_EDGES:
				return ((InternalEList)getTransientEdges()).basicRemove(otherEnd, msgs);
			case NotationPackage.STANDARD_DIAGRAM__HORIZONTAL_GUIDES:
				return ((InternalEList)getHorizontalGuides()).basicRemove(otherEnd, msgs);
			case NotationPackage.STANDARD_DIAGRAM__VERTICAL_GUIDES:
				return ((InternalEList)getVerticalGuides()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.STANDARD_DIAGRAM__EANNOTATIONS:
				return getEAnnotations();
			case NotationPackage.STANDARD_DIAGRAM__VISIBLE:
				return isVisible() ? Boolean.TRUE : Boolean.FALSE;
			case NotationPackage.STANDARD_DIAGRAM__TYPE:
				return getType();
			case NotationPackage.STANDARD_DIAGRAM__MUTABLE:
				return isMutable() ? Boolean.TRUE : Boolean.FALSE;
			case NotationPackage.STANDARD_DIAGRAM__SOURCE_EDGES:
				return getSourceEdges();
			case NotationPackage.STANDARD_DIAGRAM__TARGET_EDGES:
				return getTargetEdges();
			case NotationPackage.STANDARD_DIAGRAM__PERSISTED_CHILDREN:
				return getPersistedChildren();
			case NotationPackage.STANDARD_DIAGRAM__STYLES:
				return getStyles();
			case NotationPackage.STANDARD_DIAGRAM__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
			case NotationPackage.STANDARD_DIAGRAM__DIAGRAM:
				if (resolve) return getDiagram();
				return basicGetDiagram();
			case NotationPackage.STANDARD_DIAGRAM__TRANSIENT_CHILDREN:
				return getTransientChildren();
			case NotationPackage.STANDARD_DIAGRAM__NAME:
				return getName();
			case NotationPackage.STANDARD_DIAGRAM__MEASUREMENT_UNIT:
				return getMeasurementUnit();
			case NotationPackage.STANDARD_DIAGRAM__PERSISTED_EDGES:
				return getPersistedEdges();
			case NotationPackage.STANDARD_DIAGRAM__TRANSIENT_EDGES:
				return getTransientEdges();
			case NotationPackage.STANDARD_DIAGRAM__PAGE_X:
				return new Integer(getPageX());
			case NotationPackage.STANDARD_DIAGRAM__PAGE_Y:
				return new Integer(getPageY());
			case NotationPackage.STANDARD_DIAGRAM__PAGE_WIDTH:
				return new Integer(getPageWidth());
			case NotationPackage.STANDARD_DIAGRAM__PAGE_HEIGHT:
				return new Integer(getPageHeight());
			case NotationPackage.STANDARD_DIAGRAM__HORIZONTAL_GUIDES:
				return getHorizontalGuides();
			case NotationPackage.STANDARD_DIAGRAM__VERTICAL_GUIDES:
				return getVerticalGuides();
			case NotationPackage.STANDARD_DIAGRAM__DESCRIPTION:
				return getDescription();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NotationPackage.STANDARD_DIAGRAM__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case NotationPackage.STANDARD_DIAGRAM__VISIBLE:
				setVisible(((Boolean)newValue).booleanValue());
				return;
			case NotationPackage.STANDARD_DIAGRAM__TYPE:
				setType((String)newValue);
				return;
			case NotationPackage.STANDARD_DIAGRAM__MUTABLE:
				setMutable(((Boolean)newValue).booleanValue());
				return;
			case NotationPackage.STANDARD_DIAGRAM__SOURCE_EDGES:
				getSourceEdges().clear();
				getSourceEdges().addAll((Collection)newValue);
				return;
			case NotationPackage.STANDARD_DIAGRAM__TARGET_EDGES:
				getTargetEdges().clear();
				getTargetEdges().addAll((Collection)newValue);
				return;
			case NotationPackage.STANDARD_DIAGRAM__PERSISTED_CHILDREN:
				getPersistedChildren().clear();
				getPersistedChildren().addAll((Collection)newValue);
				return;
			case NotationPackage.STANDARD_DIAGRAM__STYLES:
				getStyles().clear();
				getStyles().addAll((Collection)newValue);
				return;
			case NotationPackage.STANDARD_DIAGRAM__ELEMENT:
				setElement((EObject)newValue);
				return;
			case NotationPackage.STANDARD_DIAGRAM__TRANSIENT_CHILDREN:
				getTransientChildren().clear();
				getTransientChildren().addAll((Collection)newValue);
				return;
			case NotationPackage.STANDARD_DIAGRAM__NAME:
				setName((String)newValue);
				return;
			case NotationPackage.STANDARD_DIAGRAM__MEASUREMENT_UNIT:
				setMeasurementUnit((MeasurementUnit)newValue);
				return;
			case NotationPackage.STANDARD_DIAGRAM__PERSISTED_EDGES:
				getPersistedEdges().clear();
				getPersistedEdges().addAll((Collection)newValue);
				return;
			case NotationPackage.STANDARD_DIAGRAM__TRANSIENT_EDGES:
				getTransientEdges().clear();
				getTransientEdges().addAll((Collection)newValue);
				return;
			case NotationPackage.STANDARD_DIAGRAM__PAGE_X:
				setPageX(((Integer)newValue).intValue());
				return;
			case NotationPackage.STANDARD_DIAGRAM__PAGE_Y:
				setPageY(((Integer)newValue).intValue());
				return;
			case NotationPackage.STANDARD_DIAGRAM__PAGE_WIDTH:
				setPageWidth(((Integer)newValue).intValue());
				return;
			case NotationPackage.STANDARD_DIAGRAM__PAGE_HEIGHT:
				setPageHeight(((Integer)newValue).intValue());
				return;
			case NotationPackage.STANDARD_DIAGRAM__HORIZONTAL_GUIDES:
				getHorizontalGuides().clear();
				getHorizontalGuides().addAll((Collection)newValue);
				return;
			case NotationPackage.STANDARD_DIAGRAM__VERTICAL_GUIDES:
				getVerticalGuides().clear();
				getVerticalGuides().addAll((Collection)newValue);
				return;
			case NotationPackage.STANDARD_DIAGRAM__DESCRIPTION:
				setDescription((String)newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case NotationPackage.STANDARD_DIAGRAM__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case NotationPackage.STANDARD_DIAGRAM__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case NotationPackage.STANDARD_DIAGRAM__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case NotationPackage.STANDARD_DIAGRAM__MUTABLE:
				setMutable(MUTABLE_EDEFAULT);
				return;
			case NotationPackage.STANDARD_DIAGRAM__SOURCE_EDGES:
				getSourceEdges().clear();
				return;
			case NotationPackage.STANDARD_DIAGRAM__TARGET_EDGES:
				getTargetEdges().clear();
				return;
			case NotationPackage.STANDARD_DIAGRAM__PERSISTED_CHILDREN:
				getPersistedChildren().clear();
				return;
			case NotationPackage.STANDARD_DIAGRAM__STYLES:
				getStyles().clear();
				return;
			case NotationPackage.STANDARD_DIAGRAM__ELEMENT:
				unsetElement();
				return;
			case NotationPackage.STANDARD_DIAGRAM__TRANSIENT_CHILDREN:
				getTransientChildren().clear();
				return;
			case NotationPackage.STANDARD_DIAGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NotationPackage.STANDARD_DIAGRAM__MEASUREMENT_UNIT:
				unsetMeasurementUnit();
				return;
			case NotationPackage.STANDARD_DIAGRAM__PERSISTED_EDGES:
				getPersistedEdges().clear();
				return;
			case NotationPackage.STANDARD_DIAGRAM__TRANSIENT_EDGES:
				getTransientEdges().clear();
				return;
			case NotationPackage.STANDARD_DIAGRAM__PAGE_X:
				setPageX(PAGE_X_EDEFAULT);
				return;
			case NotationPackage.STANDARD_DIAGRAM__PAGE_Y:
				setPageY(PAGE_Y_EDEFAULT);
				return;
			case NotationPackage.STANDARD_DIAGRAM__PAGE_WIDTH:
				setPageWidth(PAGE_WIDTH_EDEFAULT);
				return;
			case NotationPackage.STANDARD_DIAGRAM__PAGE_HEIGHT:
				setPageHeight(PAGE_HEIGHT_EDEFAULT);
				return;
			case NotationPackage.STANDARD_DIAGRAM__HORIZONTAL_GUIDES:
				getHorizontalGuides().clear();
				return;
			case NotationPackage.STANDARD_DIAGRAM__VERTICAL_GUIDES:
				getVerticalGuides().clear();
				return;
			case NotationPackage.STANDARD_DIAGRAM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NotationPackage.STANDARD_DIAGRAM__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case NotationPackage.STANDARD_DIAGRAM__VISIBLE:
				return ((eFlags & VISIBLE_EFLAG) != 0) != VISIBLE_EDEFAULT;
			case NotationPackage.STANDARD_DIAGRAM__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case NotationPackage.STANDARD_DIAGRAM__MUTABLE:
				return ((eFlags & MUTABLE_EFLAG) != 0) != MUTABLE_EDEFAULT;
			case NotationPackage.STANDARD_DIAGRAM__SOURCE_EDGES:
				return sourceEdges != null && !sourceEdges.isEmpty();
			case NotationPackage.STANDARD_DIAGRAM__TARGET_EDGES:
				return targetEdges != null && !targetEdges.isEmpty();
			case NotationPackage.STANDARD_DIAGRAM__PERSISTED_CHILDREN:
				return persistedChildren != null && !persistedChildren.isEmpty();
			case NotationPackage.STANDARD_DIAGRAM__STYLES:
				return styles != null && !styles.isEmpty();
			case NotationPackage.STANDARD_DIAGRAM__ELEMENT:
				return isSetElement();
			case NotationPackage.STANDARD_DIAGRAM__DIAGRAM:
				return basicGetDiagram() != null;
			case NotationPackage.STANDARD_DIAGRAM__TRANSIENT_CHILDREN:
				return transientChildren != null && !transientChildren.isEmpty();
			case NotationPackage.STANDARD_DIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NotationPackage.STANDARD_DIAGRAM__MEASUREMENT_UNIT:
				return isSetMeasurementUnit();
			case NotationPackage.STANDARD_DIAGRAM__PERSISTED_EDGES:
				return persistedEdges != null && !persistedEdges.isEmpty();
			case NotationPackage.STANDARD_DIAGRAM__TRANSIENT_EDGES:
				return transientEdges != null && !transientEdges.isEmpty();
			case NotationPackage.STANDARD_DIAGRAM__PAGE_X:
				return pageX != PAGE_X_EDEFAULT;
			case NotationPackage.STANDARD_DIAGRAM__PAGE_Y:
				return pageY != PAGE_Y_EDEFAULT;
			case NotationPackage.STANDARD_DIAGRAM__PAGE_WIDTH:
				return pageWidth != PAGE_WIDTH_EDEFAULT;
			case NotationPackage.STANDARD_DIAGRAM__PAGE_HEIGHT:
				return pageHeight != PAGE_HEIGHT_EDEFAULT;
			case NotationPackage.STANDARD_DIAGRAM__HORIZONTAL_GUIDES:
				return horizontalGuides != null && !horizontalGuides.isEmpty();
			case NotationPackage.STANDARD_DIAGRAM__VERTICAL_GUIDES:
				return verticalGuides != null && !verticalGuides.isEmpty();
			case NotationPackage.STANDARD_DIAGRAM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == Style.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PageStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.STANDARD_DIAGRAM__PAGE_X: return NotationPackage.PAGE_STYLE__PAGE_X;
				case NotationPackage.STANDARD_DIAGRAM__PAGE_Y: return NotationPackage.PAGE_STYLE__PAGE_Y;
				case NotationPackage.STANDARD_DIAGRAM__PAGE_WIDTH: return NotationPackage.PAGE_STYLE__PAGE_WIDTH;
				case NotationPackage.STANDARD_DIAGRAM__PAGE_HEIGHT: return NotationPackage.PAGE_STYLE__PAGE_HEIGHT;
				default: return -1;
			}
		}
		if (baseClass == GuideStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.STANDARD_DIAGRAM__HORIZONTAL_GUIDES: return NotationPackage.GUIDE_STYLE__HORIZONTAL_GUIDES;
				case NotationPackage.STANDARD_DIAGRAM__VERTICAL_GUIDES: return NotationPackage.GUIDE_STYLE__VERTICAL_GUIDES;
				default: return -1;
			}
		}
		if (baseClass == DescriptionStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.STANDARD_DIAGRAM__DESCRIPTION: return NotationPackage.DESCRIPTION_STYLE__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == DiagramStyle.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == Style.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PageStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.PAGE_STYLE__PAGE_X: return NotationPackage.STANDARD_DIAGRAM__PAGE_X;
				case NotationPackage.PAGE_STYLE__PAGE_Y: return NotationPackage.STANDARD_DIAGRAM__PAGE_Y;
				case NotationPackage.PAGE_STYLE__PAGE_WIDTH: return NotationPackage.STANDARD_DIAGRAM__PAGE_WIDTH;
				case NotationPackage.PAGE_STYLE__PAGE_HEIGHT: return NotationPackage.STANDARD_DIAGRAM__PAGE_HEIGHT;
				default: return -1;
			}
		}
		if (baseClass == GuideStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.GUIDE_STYLE__HORIZONTAL_GUIDES: return NotationPackage.STANDARD_DIAGRAM__HORIZONTAL_GUIDES;
				case NotationPackage.GUIDE_STYLE__VERTICAL_GUIDES: return NotationPackage.STANDARD_DIAGRAM__VERTICAL_GUIDES;
				default: return -1;
			}
		}
		if (baseClass == DescriptionStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.DESCRIPTION_STYLE__DESCRIPTION: return NotationPackage.STANDARD_DIAGRAM__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == DiagramStyle.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (pageX: "); //$NON-NLS-1$
		result.append(pageX);
		result.append(", pageY: "); //$NON-NLS-1$
		result.append(pageY);
		result.append(", pageWidth: "); //$NON-NLS-1$
		result.append(pageWidth);
		result.append(", pageHeight: "); //$NON-NLS-1$
		result.append(pageHeight);
		result.append(", description: "); //$NON-NLS-1$
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //StandardDiagramImpl
