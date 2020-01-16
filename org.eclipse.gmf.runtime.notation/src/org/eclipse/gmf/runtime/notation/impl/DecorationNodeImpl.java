/******************************************************************************
 * Copyright (c) 2008, 2010 IBM Corporation and others.
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
import org.eclipse.emf.ecore.util.EContentsEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.runtime.notation.DecorationNode;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Style;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Decoration Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated NOT
 * @since 1.2
 */
public class DecorationNodeImpl extends BasicDecorationNodeImpl implements DecorationNode {

	protected LayoutConstraint layoutConstraint;

	protected EList persistedChildren;

	protected EList styles;

	protected EList transientChildren;

	// EATM
	// private EContentsEList allChildren = null;

	protected DecorationNodeImpl() {
		super();
	}

	protected EClass eStaticClass() {
		return NotationPackage.Literals.DECORATION_NODE;
	}

	public EList getPersistedChildren() {
		if (persistedChildren == null) {
			persistedChildren = new EObjectContainmentEList(Node.class, this, NotationPackage.VIEW__PERSISTED_CHILDREN);
		}
		return persistedChildren;
	}

	public EList getChildren() {
		return new EContentsEList(this, childrenFeatures);
		// if (allChildren == null) {
		// allChildren = new EContentsEList(this, childrenFeatures);
		// }
		// return allChildren;
	}

	public EList getStyles() {
		if (styles == null) {
			styles = new EObjectContainmentEList(Style.class, this, NotationPackage.VIEW__STYLES);
		}
		return styles;
	}

	public EList getTransientChildren() {
		if (transientChildren == null) {
			transientChildren = new EObjectContainmentEList(Node.class, this, NotationPackage.VIEW__TRANSIENT_CHILDREN);
		}
		return transientChildren;
	}

	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case NotationPackage.DECORATION_NODE__EANNOTATIONS:
			return ((InternalEList) getEAnnotations()).basicRemove(otherEnd, msgs);
		case NotationPackage.DECORATION_NODE__SOURCE_EDGES:
			return ((InternalEList) getSourceEdges()).basicRemove(otherEnd, msgs);
		case NotationPackage.DECORATION_NODE__TARGET_EDGES:
			return ((InternalEList) getTargetEdges()).basicRemove(otherEnd, msgs);
		case NotationPackage.DECORATION_NODE__PERSISTED_CHILDREN:
			return ((InternalEList) getPersistedChildren()).basicRemove(otherEnd, msgs);
		case NotationPackage.DECORATION_NODE__STYLES:
			return ((InternalEList) getStyles()).basicRemove(otherEnd, msgs);
		case NotationPackage.DECORATION_NODE__TRANSIENT_CHILDREN:
			return ((InternalEList) getTransientChildren()).basicRemove(otherEnd, msgs);
		case NotationPackage.DECORATION_NODE__LAYOUT_CONSTRAINT:
			return basicSetLayoutConstraint(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NotationPackage.DECORATION_NODE__EANNOTATIONS:
			return getEAnnotations();
		case NotationPackage.DECORATION_NODE__VISIBLE:
			return isVisible() ? Boolean.TRUE : Boolean.FALSE;
		case NotationPackage.DECORATION_NODE__TYPE:
			return getType();
		case NotationPackage.DECORATION_NODE__MUTABLE:
			return isMutable() ? Boolean.TRUE : Boolean.FALSE;
		case NotationPackage.DECORATION_NODE__SOURCE_EDGES:
			return getSourceEdges();
		case NotationPackage.DECORATION_NODE__TARGET_EDGES:
			return getTargetEdges();
		case NotationPackage.DECORATION_NODE__PERSISTED_CHILDREN:
			return getPersistedChildren();
		case NotationPackage.DECORATION_NODE__STYLES:
			return getStyles();
		case NotationPackage.DECORATION_NODE__ELEMENT:
			if (resolve)
				return getElement();
			return basicGetElement();
		case NotationPackage.DECORATION_NODE__DIAGRAM:
			if (resolve)
				return getDiagram();
			return basicGetDiagram();
		case NotationPackage.DECORATION_NODE__TRANSIENT_CHILDREN:
			return getTransientChildren();
		case NotationPackage.DECORATION_NODE__LAYOUT_CONSTRAINT:
			return getLayoutConstraint();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case NotationPackage.DECORATION_NODE__EANNOTATIONS:
			getEAnnotations().clear();
			getEAnnotations().addAll((Collection) newValue);
			return;
		case NotationPackage.DECORATION_NODE__VISIBLE:
			setVisible(((Boolean) newValue).booleanValue());
			return;
		case NotationPackage.DECORATION_NODE__TYPE:
			setType((String) newValue);
			return;
		case NotationPackage.DECORATION_NODE__MUTABLE:
			setMutable(((Boolean) newValue).booleanValue());
			return;
		case NotationPackage.DECORATION_NODE__SOURCE_EDGES:
		case NotationPackage.DECORATION_NODE__TARGET_EDGES:
			return;
		case NotationPackage.DECORATION_NODE__PERSISTED_CHILDREN:
			getPersistedChildren().clear();
			getPersistedChildren().addAll((Collection) newValue);
			return;
		case NotationPackage.DECORATION_NODE__STYLES:
			getStyles().clear();
			getStyles().addAll((Collection) newValue);
			return;
		case NotationPackage.DECORATION_NODE__ELEMENT:
			setElement((EObject) newValue);
			return;
		case NotationPackage.DECORATION_NODE__TRANSIENT_CHILDREN:
			getTransientChildren().clear();
			getTransientChildren().addAll((Collection) newValue);
			return;
		case NotationPackage.DECORATION_NODE__LAYOUT_CONSTRAINT:
			setLayoutConstraint((LayoutConstraint) newValue);
			return;
		}
		eDynamicSet(featureID, newValue);
	}

	public void eUnset(int featureID) {
		switch (featureID) {
		case NotationPackage.DECORATION_NODE__EANNOTATIONS:
			getEAnnotations().clear();
			return;
		case NotationPackage.DECORATION_NODE__VISIBLE:
			setVisible(VISIBLE_EDEFAULT);
			return;
		case NotationPackage.DECORATION_NODE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case NotationPackage.DECORATION_NODE__MUTABLE:
			setMutable(MUTABLE_EDEFAULT);
			return;
		case NotationPackage.DECORATION_NODE__SOURCE_EDGES:
		case NotationPackage.DECORATION_NODE__TARGET_EDGES:
			return;
		case NotationPackage.DECORATION_NODE__PERSISTED_CHILDREN:
			getPersistedChildren().clear();
			return;
		case NotationPackage.DECORATION_NODE__STYLES:
			getStyles().clear();
			return;
		case NotationPackage.DECORATION_NODE__ELEMENT:
			unsetElement();
			return;
		case NotationPackage.DECORATION_NODE__TRANSIENT_CHILDREN:
			getTransientChildren().clear();
			return;
		case NotationPackage.DECORATION_NODE__LAYOUT_CONSTRAINT:
			setLayoutConstraint((LayoutConstraint) null);
			return;
		}
		eDynamicUnset(featureID);
	}

	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case NotationPackage.DECORATION_NODE__EANNOTATIONS:
			return eAnnotations != null && !eAnnotations.isEmpty();
		case NotationPackage.DECORATION_NODE__VISIBLE:
			return ((eFlags & VISIBLE_EFLAG) != 0) != VISIBLE_EDEFAULT;
		case NotationPackage.DECORATION_NODE__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case NotationPackage.DECORATION_NODE__MUTABLE:
			return ((eFlags & MUTABLE_EFLAG) != 0) != MUTABLE_EDEFAULT;
		case NotationPackage.DECORATION_NODE__SOURCE_EDGES:
			return false;
		case NotationPackage.DECORATION_NODE__TARGET_EDGES:
			return false;
		case NotationPackage.DECORATION_NODE__PERSISTED_CHILDREN:
			return persistedChildren != null && !persistedChildren.isEmpty();
		case NotationPackage.DECORATION_NODE__STYLES:
			return styles != null && !styles.isEmpty();
		case NotationPackage.DECORATION_NODE__ELEMENT:
			return isSetElement();
		case NotationPackage.DECORATION_NODE__DIAGRAM:
			return basicGetDiagram() != null;
		case NotationPackage.DECORATION_NODE__TRANSIENT_CHILDREN:
			return transientChildren != null && !transientChildren.isEmpty();
		case NotationPackage.DECORATION_NODE__LAYOUT_CONSTRAINT:
			return layoutConstraint != null;
		}
		return eDynamicIsSet(featureID);
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
		result.append(" (visible: "); //$NON-NLS-1$
		result.append((eFlags & VISIBLE_EFLAG) != 0);
		result.append(", type: "); //$NON-NLS-1$
		result.append(type);
		result.append(", mutable: "); //$NON-NLS-1$
		result.append((eFlags & MUTABLE_EFLAG) != 0);
		result.append(')');
		return result.toString();
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
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.DECORATION_NODE__LAYOUT_CONSTRAINT,
					newLayoutConstraint, newLayoutConstraint));
	}

	public NotificationChain basicSetLayoutConstraint(LayoutConstraint newLayoutConstraint, NotificationChain msgs) {
		LayoutConstraint oldLayoutConstraint = layoutConstraint;
		layoutConstraint = newLayoutConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					NotationPackage.DECORATION_NODE__LAYOUT_CONSTRAINT, oldLayoutConstraint, newLayoutConstraint);
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

} // DecorationNodeImpl
