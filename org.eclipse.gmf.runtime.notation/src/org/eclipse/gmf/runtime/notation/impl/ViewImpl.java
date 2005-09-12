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
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EModelElementImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Style;
import org.eclipse.gmf.runtime.notation.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ViewImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ViewImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ViewImpl#isMutable <em>Mutable</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ViewImpl#getSourceEdges <em>Source Edges</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ViewImpl#getTargetEdges <em>Target Edges</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ViewImpl#getPersistedChildren <em>Persisted Children</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ViewImpl#getStyles <em>Styles</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ViewImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ViewImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ViewImpl#getTransientChildren <em>Transient Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
/*
 * @canBeSeenBy org.eclipse.gmf.runtime.notation.*
 */
public abstract class ViewImpl extends EModelElementImpl implements View {
	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = true;

	/**
	 * The flag representing the value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final int VISIBLE_EFLAG = 1 << 8;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMutable() <em>Mutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMutable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUTABLE_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isMutable() <em>Mutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMutable()
	 * @generated
	 * @ordered
	 */
	protected static final int MUTABLE_EFLAG = 1 << 9;

	/**
	 * The cached value of the '{@link #getSourceEdges() <em>Source Edges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceEdges()
	 * @generated
	 * @ordered
	 */
	protected EList sourceEdges = null;

	/**
	 * The cached value of the '{@link #getTargetEdges() <em>Target Edges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetEdges()
	 * @generated
	 * @ordered
	 */
	protected EList targetEdges = null;

	/**
	 * The cached value of the '{@link #getPersistedChildren() <em>Persisted Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistedChildren()
	 * @generated
	 * @ordered
	 */
	protected EList persistedChildren = null;

	/**
	 * The cached value of the '{@link #getStyles() <em>Styles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyles()
	 * @generated
	 * @ordered
	 */
	protected EList styles = null;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EObject element = null;

	/**
	 * The flag representing whether the Element reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int ELEMENT_ESETFLAG = 1 << 10;

	/**
	 * The cached value of the '{@link #getTransientChildren() <em>Transient Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransientChildren()
	 * @generated
	 * @ordered
	 */
	protected EList transientChildren = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewImpl() {
		super();
		eFlags |= VISIBLE_EFLAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.eINSTANCE.getView();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {
		return (eFlags & VISIBLE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean newVisible) {
		boolean oldVisible = (eFlags & VISIBLE_EFLAG) != 0;
		if (newVisible) eFlags |= VISIBLE_EFLAG; else eFlags &= ~VISIBLE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.VIEW__VISIBLE, oldVisible, newVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setType(String newType) {
		String oldType = type;
		type = (newType == null)?null:newType.intern();
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.VIEW__TYPE, oldType, type));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMutable() {
		return (eFlags & MUTABLE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMutable(boolean newMutable) {
		boolean oldMutable = (eFlags & MUTABLE_EFLAG) != 0;
		if (newMutable) eFlags |= MUTABLE_EFLAG; else eFlags &= ~MUTABLE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.VIEW__MUTABLE, oldMutable, newMutable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSourceEdges() {
		if (sourceEdges == null) {
			sourceEdges = new EObjectWithInverseEList(Edge.class, this, NotationPackage.VIEW__SOURCE_EDGES, NotationPackage.EDGE__SOURCE);
		}
		return sourceEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargetEdges() {
		if (targetEdges == null) {
			targetEdges = new EObjectWithInverseEList(Edge.class, this, NotationPackage.VIEW__TARGET_EDGES, NotationPackage.EDGE__TARGET);
		}
		return targetEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPersistedChildren() {
		if (persistedChildren == null) {
			persistedChildren = new EObjectContainmentEList(Node.class, this, NotationPackage.VIEW__PERSISTED_CHILDREN);
		}
		return persistedChildren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList getChildren() {
		List children = new ArrayList();	
		if (persistedChildren!=null &&
			persistedChildren.size()>0){
			children.addAll(getPersistedChildren());
		}
		
		if (transientChildren!=null&&
			transientChildren.size()>0){
			children.addAll(getTransientChildren());
		}
		
		return new BasicEList.UnmodifiableEList(children.size(), children.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getStyles() {
		if (styles == null) {
			styles = new EObjectContainmentEList(Style.class, this, NotationPackage.VIEW__STYLES);
		}
		return styles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EObject getElement() {
		if (!isSetElement()){
			EObject container = eContainer();
			if (container instanceof View){
				View view = (View)container;
				element = view.getElement();
			}
		}
		if (element != null && element.eIsProxy()) {
			EObject oldElement = element;
			element = eResolveProxy((InternalEObject)element);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NotationPackage.VIEW__ELEMENT, oldElement, element));
			}
		}
		
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(EObject newElement) {
		EObject oldElement = element;
		element = newElement;
		boolean oldElementESet = (eFlags & ELEMENT_ESETFLAG) != 0;
		eFlags |= ELEMENT_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.VIEW__ELEMENT, oldElement, element, !oldElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElement() {
		EObject oldElement = element;
		boolean oldElementESet = (eFlags & ELEMENT_ESETFLAG) != 0;
		element = null;
		eFlags &= ~ELEMENT_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NotationPackage.VIEW__ELEMENT, oldElement, null, oldElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElement() {
		return (eFlags & ELEMENT_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram getDiagram() {
		Diagram diagram = basicGetDiagram();
		return diagram == null ? null : (Diagram)eResolveProxy((InternalEObject)diagram);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Diagram basicGetDiagram() {
		for (EObject parent = this; parent != null; parent = parent.eContainer())
			if (parent.eClass() == NotationPackage.eINSTANCE.getDiagram())
				return (Diagram) parent;
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTransientChildren() {
		if (transientChildren == null) {
			transientChildren = new EObjectContainmentEList(Node.class, this, NotationPackage.VIEW__TRANSIENT_CHILDREN);
		}
		return transientChildren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Style getStyle(EClass eClass) {
		if (eClass != null && eIsSet(NotationPackage.eINSTANCE.getView_Styles())) {
			for (Iterator i = getStyles().iterator(); i.hasNext();) {
				Style style = (Style) i.next();
				if (style.eClass() == eClass || eClass.isInstance(style))
					return style;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Node createChild(EClass eClass) {
		Node newChild = (Node) eClass.getEPackage().getEFactoryInstance().create(eClass);
		getPersistedChildren().add(newChild);
		return newChild;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Style createStyle(EClass eClass) {
		Style newStyle = (Style) eClass.getEPackage().getEFactoryInstance().create(eClass);
		getStyles().add(newStyle);
		return newStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case NotationPackage.VIEW__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case NotationPackage.VIEW__SOURCE_EDGES:
					return ((InternalEList)getSourceEdges()).basicAdd(otherEnd, msgs);
				case NotationPackage.VIEW__TARGET_EDGES:
					return ((InternalEList)getTargetEdges()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case NotationPackage.VIEW__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case NotationPackage.VIEW__SOURCE_EDGES:
					return ((InternalEList)getSourceEdges()).basicRemove(otherEnd, msgs);
				case NotationPackage.VIEW__TARGET_EDGES:
					return ((InternalEList)getTargetEdges()).basicRemove(otherEnd, msgs);
				case NotationPackage.VIEW__PERSISTED_CHILDREN:
					return ((InternalEList)getPersistedChildren()).basicRemove(otherEnd, msgs);
				case NotationPackage.VIEW__STYLES:
					return ((InternalEList)getStyles()).basicRemove(otherEnd, msgs);
				case NotationPackage.VIEW__TRANSIENT_CHILDREN:
					return ((InternalEList)getTransientChildren()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case NotationPackage.VIEW__EANNOTATIONS:
				return getEAnnotations();
			case NotationPackage.VIEW__VISIBLE:
				return isVisible() ? Boolean.TRUE : Boolean.FALSE;
			case NotationPackage.VIEW__TYPE:
				return getType();
			case NotationPackage.VIEW__MUTABLE:
				return isMutable() ? Boolean.TRUE : Boolean.FALSE;
			case NotationPackage.VIEW__SOURCE_EDGES:
				return getSourceEdges();
			case NotationPackage.VIEW__TARGET_EDGES:
				return getTargetEdges();
			case NotationPackage.VIEW__PERSISTED_CHILDREN:
				return getPersistedChildren();
			case NotationPackage.VIEW__STYLES:
				return getStyles();
			case NotationPackage.VIEW__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
			case NotationPackage.VIEW__DIAGRAM:
				if (resolve) return getDiagram();
				return basicGetDiagram();
			case NotationPackage.VIEW__TRANSIENT_CHILDREN:
				return getTransientChildren();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case NotationPackage.VIEW__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case NotationPackage.VIEW__VISIBLE:
				setVisible(((Boolean)newValue).booleanValue());
				return;
			case NotationPackage.VIEW__TYPE:
				setType((String)newValue);
				return;
			case NotationPackage.VIEW__MUTABLE:
				setMutable(((Boolean)newValue).booleanValue());
				return;
			case NotationPackage.VIEW__SOURCE_EDGES:
				getSourceEdges().clear();
				getSourceEdges().addAll((Collection)newValue);
				return;
			case NotationPackage.VIEW__TARGET_EDGES:
				getTargetEdges().clear();
				getTargetEdges().addAll((Collection)newValue);
				return;
			case NotationPackage.VIEW__PERSISTED_CHILDREN:
				getPersistedChildren().clear();
				getPersistedChildren().addAll((Collection)newValue);
				return;
			case NotationPackage.VIEW__STYLES:
				getStyles().clear();
				getStyles().addAll((Collection)newValue);
				return;
			case NotationPackage.VIEW__ELEMENT:
				setElement((EObject)newValue);
				return;
			case NotationPackage.VIEW__TRANSIENT_CHILDREN:
				getTransientChildren().clear();
				getTransientChildren().addAll((Collection)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case NotationPackage.VIEW__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case NotationPackage.VIEW__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case NotationPackage.VIEW__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case NotationPackage.VIEW__MUTABLE:
				setMutable(MUTABLE_EDEFAULT);
				return;
			case NotationPackage.VIEW__SOURCE_EDGES:
				getSourceEdges().clear();
				return;
			case NotationPackage.VIEW__TARGET_EDGES:
				getTargetEdges().clear();
				return;
			case NotationPackage.VIEW__PERSISTED_CHILDREN:
				getPersistedChildren().clear();
				return;
			case NotationPackage.VIEW__STYLES:
				getStyles().clear();
				return;
			case NotationPackage.VIEW__ELEMENT:
				unsetElement();
				return;
			case NotationPackage.VIEW__TRANSIENT_CHILDREN:
				getTransientChildren().clear();
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case NotationPackage.VIEW__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case NotationPackage.VIEW__VISIBLE:
				return ((eFlags & VISIBLE_EFLAG) != 0) != VISIBLE_EDEFAULT;
			case NotationPackage.VIEW__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case NotationPackage.VIEW__MUTABLE:
				return ((eFlags & MUTABLE_EFLAG) != 0) != MUTABLE_EDEFAULT;
			case NotationPackage.VIEW__SOURCE_EDGES:
				return sourceEdges != null && !sourceEdges.isEmpty();
			case NotationPackage.VIEW__TARGET_EDGES:
				return targetEdges != null && !targetEdges.isEmpty();
			case NotationPackage.VIEW__PERSISTED_CHILDREN:
				return persistedChildren != null && !persistedChildren.isEmpty();
			case NotationPackage.VIEW__STYLES:
				return styles != null && !styles.isEmpty();
			case NotationPackage.VIEW__ELEMENT:
				return isSetElement();
			case NotationPackage.VIEW__DIAGRAM:
				return basicGetDiagram() != null;
			case NotationPackage.VIEW__TRANSIENT_CHILDREN:
				return transientChildren != null && !transientChildren.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void persistChildren(){
		if (transientChildren!=null &&
			transientChildren.size()>0){
			getPersistedChildren().addAll(transientChildren);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void insertChild(View child){
		persistChildren();
		getPersistedChildren().add(child);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void insertChildAt(View child, int index){
		persistChildren();
		if (getPersistedChildren().size()>=index){
			getPersistedChildren().add(index,child);
		}
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void insertChild(View child,boolean persisted){
		List children = null;
		if (persisted)
			children = getPersistedChildren();
		else
			children = getTransientChildren();
		children.add(child);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void removeChild(View child){
		if (child.eContainingFeature() == 
			NotationPackage.eINSTANCE.getView_TransientChildren()){
			if (transientChildren!=null && 
			    transientChildren.size()>0){
				transientChildren.remove(child);
			}
		} else if (child.eContainingFeature() == 
			NotationPackage.eINSTANCE.getView_PersistedChildren()){
			if (persistedChildren!=null && 
				persistedChildren.size()>0){
				persistedChildren.remove(child);
			}
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void persist(){
		EStructuralFeature eContaingFeature = eContainingFeature();
		if (eContainer!=null &&
			eContaingFeature!=null &&
			eContainer instanceof View &&
			eContaingFeature.isTransient()){
			View vContainer = (View)eContainer;
			vContainer.persistChildren();
		}
	}
} //ViewImpl
