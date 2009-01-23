/******************************************************************************
 * Copyright (c) 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/
package org.eclipse.gmf.runtime.notation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmf.runtime.notation.CanonicalStyle;
import org.eclipse.gmf.runtime.notation.Compartment;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.TitleStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compartment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.CompartmentImpl#isCanonical <em>Canonical</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.CompartmentImpl#isShowTitle <em>Show Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 * @since 1.2
 */
public class CompartmentImpl extends BasicCompartmentImpl implements Compartment {
	/**
	 * The default value of the '{@link #isCanonical() <em>Canonical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanonical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CANONICAL_EDEFAULT = true;

	/**
	 * The flag representing the value of the '{@link #isCanonical() <em>Canonical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanonical()
	 * @generated
	 * @ordered
	 */
	protected static final int CANONICAL_EFLAG = 1 << 12;

	/**
	 * The default value of the '{@link #isShowTitle() <em>Show Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowTitle()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_TITLE_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isShowTitle() <em>Show Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowTitle()
	 * @generated
	 * @ordered
	 */
	protected static final int SHOW_TITLE_EFLAG = 1 << 13;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompartmentImpl() {
		super();
		eFlags |= CANONICAL_EFLAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.COMPARTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanonical() {
		return (eFlags & CANONICAL_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanonical(boolean newCanonical) {
		boolean oldCanonical = (eFlags & CANONICAL_EFLAG) != 0;
		if (newCanonical) eFlags |= CANONICAL_EFLAG; else eFlags &= ~CANONICAL_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.COMPARTMENT__CANONICAL, oldCanonical, newCanonical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowTitle() {
		return (eFlags & SHOW_TITLE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowTitle(boolean newShowTitle) {
		boolean oldShowTitle = (eFlags & SHOW_TITLE_EFLAG) != 0;
		if (newShowTitle) eFlags |= SHOW_TITLE_EFLAG; else eFlags &= ~SHOW_TITLE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.COMPARTMENT__SHOW_TITLE, oldShowTitle, newShowTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.COMPARTMENT__EANNOTATIONS:
				return getEAnnotations();
			case NotationPackage.COMPARTMENT__VISIBLE:
				return isVisible() ? Boolean.TRUE : Boolean.FALSE;
			case NotationPackage.COMPARTMENT__TYPE:
				return getType();
			case NotationPackage.COMPARTMENT__MUTABLE:
				return isMutable() ? Boolean.TRUE : Boolean.FALSE;
			case NotationPackage.COMPARTMENT__SOURCE_EDGES:
				return getSourceEdges();
			case NotationPackage.COMPARTMENT__TARGET_EDGES:
				return getTargetEdges();
			case NotationPackage.COMPARTMENT__PERSISTED_CHILDREN:
				return getPersistedChildren();
			case NotationPackage.COMPARTMENT__STYLES:
				return getStyles();
			case NotationPackage.COMPARTMENT__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
			case NotationPackage.COMPARTMENT__DIAGRAM:
				if (resolve) return getDiagram();
				return basicGetDiagram();
			case NotationPackage.COMPARTMENT__TRANSIENT_CHILDREN:
				return getTransientChildren();
			case NotationPackage.COMPARTMENT__LAYOUT_CONSTRAINT:
				return getLayoutConstraint();
			case NotationPackage.COMPARTMENT__COLLAPSED:
				return isCollapsed() ? Boolean.TRUE : Boolean.FALSE;
			case NotationPackage.COMPARTMENT__CANONICAL:
				return isCanonical() ? Boolean.TRUE : Boolean.FALSE;
			case NotationPackage.COMPARTMENT__SHOW_TITLE:
				return isShowTitle() ? Boolean.TRUE : Boolean.FALSE;
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NotationPackage.COMPARTMENT__SOURCE_EDGES:
			case NotationPackage.COMPARTMENT__TARGET_EDGES:
				return;
			default:
				eSetGen(featureID, newValue);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSetGen(int featureID, Object newValue) {
		switch (featureID) {
			case NotationPackage.COMPARTMENT__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case NotationPackage.COMPARTMENT__VISIBLE:
				setVisible(((Boolean)newValue).booleanValue());
				return;
			case NotationPackage.COMPARTMENT__TYPE:
				setType((String)newValue);
				return;
			case NotationPackage.COMPARTMENT__MUTABLE:
				setMutable(((Boolean)newValue).booleanValue());
				return;
			case NotationPackage.COMPARTMENT__SOURCE_EDGES:
				getSourceEdges().clear();
				getSourceEdges().addAll((Collection)newValue);
				return;
			case NotationPackage.COMPARTMENT__TARGET_EDGES:
				getTargetEdges().clear();
				getTargetEdges().addAll((Collection)newValue);
				return;
			case NotationPackage.COMPARTMENT__PERSISTED_CHILDREN:
				getPersistedChildren().clear();
				getPersistedChildren().addAll((Collection)newValue);
				return;
			case NotationPackage.COMPARTMENT__STYLES:
				getStyles().clear();
				getStyles().addAll((Collection)newValue);
				return;
			case NotationPackage.COMPARTMENT__ELEMENT:
				setElement((EObject)newValue);
				return;
			case NotationPackage.COMPARTMENT__TRANSIENT_CHILDREN:
				getTransientChildren().clear();
				getTransientChildren().addAll((Collection)newValue);
				return;
			case NotationPackage.COMPARTMENT__LAYOUT_CONSTRAINT:
				setLayoutConstraint((LayoutConstraint)newValue);
				return;
			case NotationPackage.COMPARTMENT__COLLAPSED:
				setCollapsed(((Boolean)newValue).booleanValue());
				return;
			case NotationPackage.COMPARTMENT__CANONICAL:
				setCanonical(((Boolean)newValue).booleanValue());
				return;
			case NotationPackage.COMPARTMENT__SHOW_TITLE:
				setShowTitle(((Boolean)newValue).booleanValue());
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case NotationPackage.COMPARTMENT__SOURCE_EDGES:
			case NotationPackage.COMPARTMENT__TARGET_EDGES:
				return;
			default:
				eUnsetGen(featureID);
		}
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnsetGen(int featureID) {
		switch (featureID) {
			case NotationPackage.COMPARTMENT__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case NotationPackage.COMPARTMENT__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case NotationPackage.COMPARTMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case NotationPackage.COMPARTMENT__MUTABLE:
				setMutable(MUTABLE_EDEFAULT);
				return;
			case NotationPackage.COMPARTMENT__SOURCE_EDGES:
				getSourceEdges().clear();
				return;
			case NotationPackage.COMPARTMENT__TARGET_EDGES:
				getTargetEdges().clear();
				return;
			case NotationPackage.COMPARTMENT__PERSISTED_CHILDREN:
				getPersistedChildren().clear();
				return;
			case NotationPackage.COMPARTMENT__STYLES:
				getStyles().clear();
				return;
			case NotationPackage.COMPARTMENT__ELEMENT:
				unsetElement();
				return;
			case NotationPackage.COMPARTMENT__TRANSIENT_CHILDREN:
				getTransientChildren().clear();
				return;
			case NotationPackage.COMPARTMENT__LAYOUT_CONSTRAINT:
				setLayoutConstraint((LayoutConstraint)null);
				return;
			case NotationPackage.COMPARTMENT__COLLAPSED:
				setCollapsed(COLLAPSED_EDEFAULT);
				return;
			case NotationPackage.COMPARTMENT__CANONICAL:
				setCanonical(CANONICAL_EDEFAULT);
				return;
			case NotationPackage.COMPARTMENT__SHOW_TITLE:
				setShowTitle(SHOW_TITLE_EDEFAULT);
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NotationPackage.COMPARTMENT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case NotationPackage.COMPARTMENT__VISIBLE:
				return ((eFlags & VISIBLE_EFLAG) != 0) != VISIBLE_EDEFAULT;
			case NotationPackage.COMPARTMENT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case NotationPackage.COMPARTMENT__MUTABLE:
				return ((eFlags & MUTABLE_EFLAG) != 0) != MUTABLE_EDEFAULT;
			case NotationPackage.COMPARTMENT__SOURCE_EDGES:
			case NotationPackage.COMPARTMENT__TARGET_EDGES:
				return false;
			case NotationPackage.COMPARTMENT__PERSISTED_CHILDREN:
				return persistedChildren != null && !persistedChildren.isEmpty();
			case NotationPackage.COMPARTMENT__STYLES:
				return styles != null && !styles.isEmpty();
			case NotationPackage.COMPARTMENT__ELEMENT:
				return isSetElement();
			case NotationPackage.COMPARTMENT__DIAGRAM:
				return basicGetDiagram() != null;
			case NotationPackage.COMPARTMENT__TRANSIENT_CHILDREN:
				return transientChildren != null && !transientChildren.isEmpty();
			case NotationPackage.COMPARTMENT__LAYOUT_CONSTRAINT:
				return layoutConstraint != null;
			case NotationPackage.COMPARTMENT__COLLAPSED:
				return ((eFlags & COLLAPSED_EFLAG) != 0) != COLLAPSED_EDEFAULT;
			case NotationPackage.COMPARTMENT__CANONICAL:
				return ((eFlags & CANONICAL_EFLAG) != 0) != CANONICAL_EDEFAULT;
			case NotationPackage.COMPARTMENT__SHOW_TITLE:
				return ((eFlags & SHOW_TITLE_EFLAG) != 0) != SHOW_TITLE_EDEFAULT;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == CanonicalStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.COMPARTMENT__CANONICAL: return NotationPackage.CANONICAL_STYLE__CANONICAL;
				default: return -1;
			}
		}
		if (baseClass == TitleStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.COMPARTMENT__SHOW_TITLE: return NotationPackage.TITLE_STYLE__SHOW_TITLE;
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
		if (baseClass == CanonicalStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.CANONICAL_STYLE__CANONICAL: return NotationPackage.COMPARTMENT__CANONICAL;
				default: return -1;
			}
		}
		if (baseClass == TitleStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.TITLE_STYLE__SHOW_TITLE: return NotationPackage.COMPARTMENT__SHOW_TITLE;
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
		result.append(" (canonical: "); //$NON-NLS-1$
		result.append((eFlags & CANONICAL_EFLAG) != 0);
		result.append(", showTitle: "); //$NON-NLS-1$
		result.append((eFlags & SHOW_TITLE_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

} //CompartmentImpl
