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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EModelElementImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.runtime.notation.BasicDecorationNode;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.NamedStyle;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Style;
import org.eclipse.gmf.runtime.notation.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Decoration Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated NOT
 * @since 1.2
 */
public class BasicDecorationNodeImpl extends EModelElementImpl implements BasicDecorationNode {
	
    protected static final boolean VISIBLE_EDEFAULT = true;

    protected static final int VISIBLE_EFLAG = 1 << 8;

    protected static final String TYPE_EDEFAULT = ""; //$NON-NLS-1$

    protected String type = TYPE_EDEFAULT;

    protected static final boolean MUTABLE_EDEFAULT = false;

    protected static final int MUTABLE_EFLAG = 1 << 9;

    protected EObject element;

	protected static final int ELEMENT_ESETFLAG = 1 << 10; 

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BasicDecorationNodeImpl() {
		super();
		eFlags |= VISIBLE_EFLAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.BASIC_DECORATION_NODE;
	}

    // EATM
    // private EContentsEList allChildren = null;

    protected static final EStructuralFeature[] childrenFeatures = new EStructuralFeature[] {
        NotationPackage.Literals.VIEW__PERSISTED_CHILDREN,
        NotationPackage.Literals.VIEW__TRANSIENT_CHILDREN};

    public boolean isVisible() {
		return (eFlags & VISIBLE_EFLAG) != 0;
	}

    public void setVisible(boolean newVisible) {
		boolean oldVisible = (eFlags & VISIBLE_EFLAG) != 0;
		if (newVisible) eFlags |= VISIBLE_EFLAG; else eFlags &= ~VISIBLE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.VIEW__VISIBLE, oldVisible, newVisible));
	}

    public String getType() {
		return type;
	}

    public void setType(String newType) {
        String oldType = type;
        type = (newType == null) ? null
            : newType.intern();
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                NotationPackage.VIEW__TYPE, oldType, type));
    }

    public boolean isMutable() {
		return (eFlags & MUTABLE_EFLAG) != 0;
	}

    public void setMutable(boolean newMutable) {
		boolean oldMutable = (eFlags & MUTABLE_EFLAG) != 0;
		if (newMutable) eFlags |= MUTABLE_EFLAG; else eFlags &= ~MUTABLE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.VIEW__MUTABLE, oldMutable, newMutable));
	}

    public EList getSourceEdges() {
        return new EcoreEList.UnmodifiableEList(this, NotationPackage.eINSTANCE.getView_SourceEdges(), 0, null);
	}

    public EList getTargetEdges() {
        return new EcoreEList.UnmodifiableEList(this, NotationPackage.eINSTANCE.getView_TargetEdges(), 0, null);
	}

    public EList getPersistedChildren() {
        return new EcoreEList.UnmodifiableEList(this, NotationPackage.eINSTANCE.getView_PersistedChildren(), 0, null);
	}

    public EList getChildren() {
        return ECollections.emptyEList();
    }

    public EList getStyles() {
        return new EcoreEList.UnmodifiableEList(this, NotationPackage.eINSTANCE.getView_TransientChildren(), 0, null);
	}

    public EObject getElement() {
        if (!isSetElement()) {
            EObject container = eContainer();
            if (container instanceof View) {
                View view = (View) container;
                element = view.getElement();
            }
        }
        if (element != null && element.eIsProxy()) {
            EObject oldElement = element;
            element = eResolveProxy((InternalEObject) element);
            if (element != oldElement) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                        NotationPackage.VIEW__ELEMENT, oldElement, element));
            }
        }

        return element;
    }

    public EObject basicGetElement() {
		return element;
	}

    public void setElement(EObject newElement) {
		EObject oldElement = element;
		element = newElement;
		boolean oldElementESet = (eFlags & ELEMENT_ESETFLAG) != 0;
		eFlags |= ELEMENT_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.VIEW__ELEMENT, oldElement, element, !oldElementESet));
	}

	public void unsetElement() {
		EObject oldElement = element;
		boolean oldElementESet = (eFlags & ELEMENT_ESETFLAG) != 0;
		element = null;
		eFlags &= ~ELEMENT_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NotationPackage.VIEW__ELEMENT, oldElement, null, oldElementESet));
	}

	public boolean isSetElement() {
		return (eFlags & ELEMENT_ESETFLAG) != 0;
	}

    public Diagram getDiagram() {
		Diagram diagram = basicGetDiagram();
		return diagram != null && diagram.eIsProxy() ? (Diagram)eResolveProxy((InternalEObject)diagram) : diagram;
	}

    public Diagram basicGetDiagram() {
        for (EObject parent = this; parent != null; parent = ((InternalEObject)parent)
            .eInternalContainer())
            if (NotationPackage.Literals.DIAGRAM.isSuperTypeOf(
                parent.eClass()))
                return (Diagram) parent;
        return null;
    }

    public EList getTransientChildren() {
        return new EcoreEList.UnmodifiableEList(this, NotationPackage.eINSTANCE.getView_TransientChildren(), 0, null);
	}

    public Style getStyle(EClass eClass) {
    	if (eClass != null && NotationPackage.eINSTANCE.getStyle().isSuperTypeOf(eClass)) {
    		EClass thisEClass = eClass(); 
    		if (eClass.isSuperTypeOf(thisEClass) || eClass == thisEClass) {
    			return (Style) this;
    		}
            if (eIsSet(NotationPackage.Literals.VIEW__STYLES)) {
                for (Iterator i = getStyles().iterator(); i.hasNext();) {
                    Style style = (Style) i.next();
                    if (style.eClass() == eClass || eClass.isInstance(style))
                        return style;
                }
            }    		
    	}
        return null;
    }

    public Node createChild(EClass eClass) {
        Node newChild = (Node) eClass.getEPackage().getEFactoryInstance()
            .create(eClass);
        getPersistedChildren().add(newChild);
        return newChild;
    }

    public Style createStyle(EClass eClass) {
        Style newStyle = (Style) eClass.getEPackage().getEFactoryInstance()
            .create(eClass);
        getStyles().add(newStyle);
        return newStyle;
    }

	public NamedStyle getNamedStyle(EClass eClass, String name) {
        if (eClass != null
                && eIsSet(NotationPackage.Literals.VIEW__STYLES)
                && NotationPackage.eINSTANCE.getNamedStyle().isSuperTypeOf(eClass)) {
                for (Iterator i = getStyles().iterator(); i.hasNext();) {
                    Style style = (Style) i.next();
                    if (style.eClass() == eClass || eClass.isInstance(style))
                        if (style.eGet(NotationPackage.eINSTANCE.getNamedStyle_Name()).equals(name))
                        	return (NamedStyle)style;
                }
            }
            return null;
	}

    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NotationPackage.BASIC_DECORATION_NODE__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NotationPackage.BASIC_DECORATION_NODE__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.BASIC_DECORATION_NODE__EANNOTATIONS:
				return getEAnnotations();
			case NotationPackage.BASIC_DECORATION_NODE__VISIBLE:
				return isVisible() ? Boolean.TRUE : Boolean.FALSE;
			case NotationPackage.BASIC_DECORATION_NODE__TYPE:
				return getType();
			case NotationPackage.BASIC_DECORATION_NODE__MUTABLE:
				return isMutable() ? Boolean.TRUE : Boolean.FALSE;
			case NotationPackage.BASIC_DECORATION_NODE__SOURCE_EDGES:
				return getSourceEdges();
			case NotationPackage.BASIC_DECORATION_NODE__TARGET_EDGES:
				return getTargetEdges();
			case NotationPackage.BASIC_DECORATION_NODE__PERSISTED_CHILDREN:
				return getPersistedChildren();
			case NotationPackage.BASIC_DECORATION_NODE__STYLES:
				return getStyles();
			case NotationPackage.BASIC_DECORATION_NODE__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
			case NotationPackage.BASIC_DECORATION_NODE__DIAGRAM:
				if (resolve) return getDiagram();
				return basicGetDiagram();
			case NotationPackage.BASIC_DECORATION_NODE__TRANSIENT_CHILDREN:
				return getTransientChildren();
			case NotationPackage.BASIC_DECORATION_NODE__LAYOUT_CONSTRAINT:
				return getLayoutConstraint();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NotationPackage.BASIC_DECORATION_NODE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case NotationPackage.BASIC_DECORATION_NODE__VISIBLE:
				setVisible(((Boolean)newValue).booleanValue());
				return;
			case NotationPackage.BASIC_DECORATION_NODE__TYPE:
				setType((String)newValue);
				return;
			case NotationPackage.BASIC_DECORATION_NODE__MUTABLE:
				setMutable(((Boolean)newValue).booleanValue());
				return;
			case NotationPackage.BASIC_DECORATION_NODE__SOURCE_EDGES:
			case NotationPackage.BASIC_DECORATION_NODE__TARGET_EDGES:
			case NotationPackage.BASIC_DECORATION_NODE__PERSISTED_CHILDREN:
			case NotationPackage.BASIC_DECORATION_NODE__STYLES:
			case NotationPackage.BASIC_DECORATION_NODE__TRANSIENT_CHILDREN:
			case NotationPackage.BASIC_DECORATION_NODE__LAYOUT_CONSTRAINT:
				return;
			case NotationPackage.BASIC_DECORATION_NODE__ELEMENT:
				setElement((EObject)newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

    public void eUnset(int featureID) {
		switch (featureID) {
			case NotationPackage.BASIC_DECORATION_NODE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case NotationPackage.BASIC_DECORATION_NODE__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case NotationPackage.BASIC_DECORATION_NODE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case NotationPackage.BASIC_DECORATION_NODE__MUTABLE:
				setMutable(MUTABLE_EDEFAULT);
				return;
			case NotationPackage.BASIC_DECORATION_NODE__SOURCE_EDGES:
			case NotationPackage.BASIC_DECORATION_NODE__TARGET_EDGES:
			case NotationPackage.BASIC_DECORATION_NODE__PERSISTED_CHILDREN:
			case NotationPackage.BASIC_DECORATION_NODE__STYLES:
			case NotationPackage.BASIC_DECORATION_NODE__TRANSIENT_CHILDREN:
			case NotationPackage.BASIC_DECORATION_NODE__LAYOUT_CONSTRAINT:
				return;
			case NotationPackage.BASIC_DECORATION_NODE__ELEMENT:
				unsetElement();
				return;
		}
		eDynamicUnset(featureID);
	}

    public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NotationPackage.BASIC_DECORATION_NODE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case NotationPackage.BASIC_DECORATION_NODE__VISIBLE:
				return ((eFlags & VISIBLE_EFLAG) != 0) != VISIBLE_EDEFAULT;
			case NotationPackage.BASIC_DECORATION_NODE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case NotationPackage.BASIC_DECORATION_NODE__MUTABLE:
				return ((eFlags & MUTABLE_EFLAG) != 0) != MUTABLE_EDEFAULT;
			case NotationPackage.BASIC_DECORATION_NODE__SOURCE_EDGES:
			case NotationPackage.BASIC_DECORATION_NODE__TARGET_EDGES:
			case NotationPackage.BASIC_DECORATION_NODE__PERSISTED_CHILDREN:
			case NotationPackage.BASIC_DECORATION_NODE__STYLES:
			case NotationPackage.BASIC_DECORATION_NODE__TRANSIENT_CHILDREN:
			case NotationPackage.BASIC_DECORATION_NODE__LAYOUT_CONSTRAINT:
				return false;
			case NotationPackage.BASIC_DECORATION_NODE__ELEMENT:
				return isSetElement();
			case NotationPackage.BASIC_DECORATION_NODE__DIAGRAM:
				return basicGetDiagram() != null;
		}
		return eDynamicIsSet(featureID);
	}

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    public void persistChildren() {
        if (eIsSet(NotationPackage.eINSTANCE.getView_TransientChildren())) {
            getPersistedChildren().addAll(getTransientChildren());
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    public void insertChild(View child) {
        persistChildren();
        getPersistedChildren().add(child);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    public void insertChildAt(View child, int index) {
        persistChildren();
        if (getPersistedChildren().size() >= index) {
            getPersistedChildren().add(index, child);
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    public void insertChild(View child, boolean persisted) {
        List children = null;
        if (persisted)
            children = getPersistedChildren();
        else
            children = getTransientChildren();
        children.add(child);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
	public void removeChild(View child) {
		if (child.eContainingFeature() == NotationPackage.Literals.VIEW__TRANSIENT_CHILDREN) {
			if (eIsSet(NotationPackage.Literals.VIEW__TRANSIENT_CHILDREN)) {
				getTransientChildren().remove(child);
			}
		} else if (child.eContainingFeature() == NotationPackage.Literals.VIEW__PERSISTED_CHILDREN) {
			if (eIsSet(NotationPackage.Literals.VIEW__PERSISTED_CHILDREN)) {
				getPersistedChildren().remove(child);
			}
		}
	}

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    public void persist() {
        EStructuralFeature eContaingFeature = eContainingFeature();
        if (eContainer() != null && eContaingFeature != null
            && eContainer() instanceof View && eContaingFeature.isTransient()) {
            View vContainer = (View) eContainer();
            vContainer.persistChildren();
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    public EList getVisibleChildren() {
    	boolean hasPersistedChildren = eIsSet(NotationPackage.Literals.VIEW__PERSISTED_CHILDREN);
    	boolean hasTransientChildren = eIsSet(NotationPackage.Literals.VIEW__TRANSIENT_CHILDREN); 
        if (!hasPersistedChildren && !hasTransientChildren) {
            return ECollections.EMPTY_ELIST;
        }

        List _children = new ArrayList();
        
        if (hasPersistedChildren) {
        	for (Iterator it = getPersistedChildren().iterator(); it.hasNext();) {
				Node node = (Node) it.next();
				if (node.isVisible())
                    _children.add(node);
			}
        }

        if (hasTransientChildren) {
        	for (Iterator it = getTransientChildren().iterator(); it.hasNext();) {
				Node node = (Node) it.next();
				if (node.isVisible())
                    _children.add(node);
			}
        }       
        
        return new BasicEList.UnmodifiableEList(_children.size(), _children
            .toArray());
    }

	public LayoutConstraint createLayoutConstraint(EClass eClass) {
		LayoutConstraint newLayoutConstraint = (LayoutConstraint) eClass.getEPackage().getEFactoryInstance().create(eClass);
		setLayoutConstraint(newLayoutConstraint);
		return newLayoutConstraint;
	}
	
	public void setLayoutConstraint(LayoutConstraint newLayoutConstraint) {
    	throw new UnsupportedOperationException("BasicDecorationNodeImpl#setLayoutConstraint(LayoutConstraint newLayoutConstraint)"); //$NON-NLS-1$
	}

	public NotificationChain basicSetLayoutConstraint(LayoutConstraint newLayoutConstraint, NotificationChain msgs) {
		return msgs;
	}

	public LayoutConstraint getLayoutConstraint() {
		return null;
	}

} //BasicDecorationNodeImpl
