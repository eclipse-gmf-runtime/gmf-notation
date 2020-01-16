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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.runtime.notation.BasicSemanticCompartment;
import org.eclipse.gmf.runtime.notation.DrawerStyle;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Style;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Basic
 * Semantic Compartment</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.gmf.runtime.notation.impl.BasicSemanticCompartmentImpl#isCollapsed
 * <em>Collapsed</em>}</li>
 * </ul>
 *
 * @generated
 * @since 1.2
 */
public class BasicSemanticCompartmentImpl extends BasicDecorationNodeImpl implements BasicSemanticCompartment {

	protected LayoutConstraint layoutConstraint;

	/**
	 * The default value of the '{@link #isCollapsed() <em>Collapsed</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isCollapsed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLLAPSED_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isCollapsed()
	 * <em>Collapsed</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isCollapsed()
	 * @generated
	 * @ordered
	 */
	protected static final int COLLAPSED_EFLAG = 1 << 11;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BasicSemanticCompartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.BASIC_SEMANTIC_COMPARTMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isCollapsed() {
		return (eFlags & COLLAPSED_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCollapsed(boolean newCollapsed) {
		boolean oldCollapsed = (eFlags & COLLAPSED_EFLAG) != 0;
		if (newCollapsed)
			eFlags |= COLLAPSED_EFLAG;
		else
			eFlags &= ~COLLAPSED_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.BASIC_SEMANTIC_COMPARTMENT__COLLAPSED,
					oldCollapsed, newCollapsed));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__EANNOTATIONS:
			return getEAnnotations();
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__VISIBLE:
			return isVisible() ? Boolean.TRUE : Boolean.FALSE;
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__TYPE:
			return getType();
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__MUTABLE:
			return isMutable() ? Boolean.TRUE : Boolean.FALSE;
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__SOURCE_EDGES:
			return getSourceEdges();
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__TARGET_EDGES:
			return getTargetEdges();
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__PERSISTED_CHILDREN:
			return getPersistedChildren();
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__STYLES:
			return getStyles();
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__ELEMENT:
			if (resolve)
				return getElement();
			return basicGetElement();
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__DIAGRAM:
			if (resolve)
				return getDiagram();
			return basicGetDiagram();
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__TRANSIENT_CHILDREN:
			return getTransientChildren();
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__LAYOUT_CONSTRAINT:
			return getLayoutConstraint();
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__COLLAPSED:
			return isCollapsed() ? Boolean.TRUE : Boolean.FALSE;
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__SOURCE_EDGES:
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__TARGET_EDGES:
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__PERSISTED_CHILDREN:
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__STYLES:
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__TRANSIENT_CHILDREN:
			return;
		default:
			eSetGen(featureID, newValue);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void eSetGen(int featureID, Object newValue) {
		switch (featureID) {
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__EANNOTATIONS:
			getEAnnotations().clear();
			getEAnnotations().addAll((Collection) newValue);
			return;
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__VISIBLE:
			setVisible(((Boolean) newValue).booleanValue());
			return;
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__TYPE:
			setType((String) newValue);
			return;
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__MUTABLE:
			setMutable(((Boolean) newValue).booleanValue());
			return;
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__SOURCE_EDGES:
			getSourceEdges().clear();
			getSourceEdges().addAll((Collection) newValue);
			return;
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__TARGET_EDGES:
			getTargetEdges().clear();
			getTargetEdges().addAll((Collection) newValue);
			return;
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__PERSISTED_CHILDREN:
			getPersistedChildren().clear();
			getPersistedChildren().addAll((Collection) newValue);
			return;
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__STYLES:
			getStyles().clear();
			getStyles().addAll((Collection) newValue);
			return;
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__ELEMENT:
			setElement((EObject) newValue);
			return;
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__TRANSIENT_CHILDREN:
			getTransientChildren().clear();
			getTransientChildren().addAll((Collection) newValue);
			return;
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__LAYOUT_CONSTRAINT:
			setLayoutConstraint((LayoutConstraint) newValue);
			return;
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__COLLAPSED:
			setCollapsed(((Boolean) newValue).booleanValue());
			return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__SOURCE_EDGES:
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__TARGET_EDGES:
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__PERSISTED_CHILDREN:
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__STYLES:
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__TRANSIENT_CHILDREN:
			return;
		default:
			eUnsetGen(featureID);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void eUnsetGen(int featureID) {
		switch (featureID) {
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__EANNOTATIONS:
			getEAnnotations().clear();
			return;
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__VISIBLE:
			setVisible(VISIBLE_EDEFAULT);
			return;
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__MUTABLE:
			setMutable(MUTABLE_EDEFAULT);
			return;
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__SOURCE_EDGES:
			getSourceEdges().clear();
			return;
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__TARGET_EDGES:
			getTargetEdges().clear();
			return;
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__PERSISTED_CHILDREN:
			getPersistedChildren().clear();
			return;
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__STYLES:
			getStyles().clear();
			return;
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__ELEMENT:
			unsetElement();
			return;
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__TRANSIENT_CHILDREN:
			getTransientChildren().clear();
			return;
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__LAYOUT_CONSTRAINT:
			setLayoutConstraint((LayoutConstraint) null);
			return;
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__COLLAPSED:
			setCollapsed(COLLAPSED_EDEFAULT);
			return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__SOURCE_EDGES:
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__TARGET_EDGES:
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__PERSISTED_CHILDREN:
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__STYLES:
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__TRANSIENT_CHILDREN:
			return false;
		default:
			return eIsSetGen(featureID);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT_CDO
	 */
	public boolean eIsSetGen(int featureID) {
		switch (featureID) {
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__EANNOTATIONS:
			return eAnnotations != null && !eAnnotations.isEmpty();
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__VISIBLE:
			return ((eFlags & VISIBLE_EFLAG) != 0) != VISIBLE_EDEFAULT;
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__MUTABLE:
			return ((eFlags & MUTABLE_EFLAG) != 0) != MUTABLE_EDEFAULT;
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__SOURCE_EDGES:
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__TARGET_EDGES:
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__PERSISTED_CHILDREN:
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__STYLES:
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__TRANSIENT_CHILDREN:
			return false;
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__ELEMENT:
			return isSetElement();
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__DIAGRAM:
			return basicGetDiagram() != null;
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__LAYOUT_CONSTRAINT:
			return layoutConstraint != null;
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__COLLAPSED:
			return ((eFlags & COLLAPSED_EFLAG) != 0) != COLLAPSED_EDEFAULT;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == Style.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == DrawerStyle.class) {
			switch (derivedFeatureID) {
			case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__COLLAPSED:
				return NotationPackage.DRAWER_STYLE__COLLAPSED;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == Style.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == DrawerStyle.class) {
			switch (baseFeatureID) {
			case NotationPackage.DRAWER_STYLE__COLLAPSED:
				return NotationPackage.BASIC_SEMANTIC_COMPARTMENT__COLLAPSED;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (collapsed: "); //$NON-NLS-1$
		result.append((eFlags & COLLAPSED_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__EANNOTATIONS:
			return ((InternalEList) getEAnnotations()).basicRemove(otherEnd, msgs);
		case NotationPackage.BASIC_SEMANTIC_COMPARTMENT__LAYOUT_CONSTRAINT:
			return basicSetLayoutConstraint(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	public LayoutConstraint createLayoutConstraint(EClass eClass) {
		LayoutConstraint newLayoutConstraint = (LayoutConstraint) eClass.getEPackage().getEFactoryInstance()
				.create(eClass);
		setLayoutConstraint(newLayoutConstraint);
		return newLayoutConstraint;
	}

	public void setLayoutConstraint(LayoutConstraint newLayoutConstraint) {
		if (newLayoutConstraint != layoutConstraint) {
			NotificationChain msgs = null;
			if (layoutConstraint != null)
				msgs = ((InternalEObject) layoutConstraint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - NotationPackage.NODE__LAYOUT_CONSTRAINT, null, msgs);
			if (newLayoutConstraint != null)
				msgs = ((InternalEObject) newLayoutConstraint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - NotationPackage.NODE__LAYOUT_CONSTRAINT, null, msgs);
			msgs = basicSetLayoutConstraint(newLayoutConstraint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.NODE__LAYOUT_CONSTRAINT,
					newLayoutConstraint, newLayoutConstraint));
	}

	public NotificationChain basicSetLayoutConstraint(LayoutConstraint newLayoutConstraint, NotificationChain msgs) {
		LayoutConstraint oldLayoutConstraint = layoutConstraint;
		layoutConstraint = newLayoutConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					NotationPackage.NODE__LAYOUT_CONSTRAINT, oldLayoutConstraint, newLayoutConstraint);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	public LayoutConstraint getLayoutConstraint() {
		return layoutConstraint;
	}

} // BasicSemanticCompartmentImpl
