/******************************************************************************
 * Copyright (c) 2004, 2007 IBM Corporation and others.
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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EContentsEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.MeasurementUnit;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.DiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.DiagramImpl#getMeasurementUnit <em>Measurement Unit</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.DiagramImpl#getPersistedEdges <em>Persisted Edges</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.DiagramImpl#getTransientEdges <em>Transient Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public class DiagramImpl
    extends ViewImpl
    implements Diagram {

    /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected static final String NAME_EDEFAULT = ""; //$NON-NLS-1$

    /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected String name = NAME_EDEFAULT;

    /**
	 * The default value of the '{@link #getMeasurementUnit() <em>Measurement Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementUnit()
	 * @generated
	 * @ordered
	 */
	protected static final MeasurementUnit MEASUREMENT_UNIT_EDEFAULT = MeasurementUnit.HIMETRIC_LITERAL;

				/**
	 * The cached value of the '{@link #getMeasurementUnit() <em>Measurement Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementUnit()
	 * @generated
	 * @ordered
	 */
	protected MeasurementUnit measurementUnit = MEASUREMENT_UNIT_EDEFAULT;

				/**
	 * The flag representing whether the Measurement Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int MEASUREMENT_UNIT_ESETFLAG = 1 << 11;

				/**
	 * The cached value of the '{@link #getPersistedEdges() <em>Persisted Edges</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPersistedEdges()
	 * @generated
	 * @ordered
	 */
    protected EList persistedEdges;

    /**
	 * The cached value of the '{@link #getTransientEdges() <em>Transient Edges</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTransientEdges()
	 * @generated
	 * @ordered
	 */
    protected EList transientEdges;

    private EContentsEList allEdges = null;

    protected static final EStructuralFeature[] edgesFeatures = new EStructuralFeature[] {
        NotationPackage.Literals.DIAGRAM__PERSISTED_EDGES,
        NotationPackage.Literals.DIAGRAM__TRANSIENT_EDGES};

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    protected DiagramImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    protected EClass eStaticClass() {
		return NotationPackage.Literals.DIAGRAM;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public String getName() {
		return name;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.DIAGRAM__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementUnit getMeasurementUnit() {
		return measurementUnit;
	}

				/**
     * <!-- begin-user-doc --> Set the Measurement Unit for this Diagram, the
     * Measure ment unit can be set only once, the set method will not set the
     * value if it was already set <!-- end-user-doc -->
     */
    public void setMeasurementUnit(MeasurementUnit newMeasurementUnit) {
        if (!isSetMeasurementUnit()) {
            MeasurementUnit oldMeasurementUnit = measurementUnit;
            measurementUnit = newMeasurementUnit == null ? MEASUREMENT_UNIT_EDEFAULT
                : newMeasurementUnit;
            boolean oldMeasurementUnitESet = (eFlags & MEASUREMENT_UNIT_ESETFLAG) != 0;
            eFlags |= MEASUREMENT_UNIT_ESETFLAG;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET,
                    NotationPackage.DIAGRAM__MEASUREMENT_UNIT,
                    oldMeasurementUnit, measurementUnit,
                    !oldMeasurementUnitESet));
        } else
            throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    public void unsetMeasurementUnit() {
        throw new UnsupportedOperationException();
    }

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMeasurementUnit() {
		return (eFlags & MEASUREMENT_UNIT_ESETFLAG) != 0;
	}

				/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    public EList getEdges() {
        if (allEdges == null) {
            allEdges = new EContentsEList(this, edgesFeatures);
        }
        return allEdges;
    }

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public EList getPersistedEdges() {
		if (persistedEdges == null) {
			persistedEdges = new EObjectContainmentEList(Edge.class, this, NotationPackage.DIAGRAM__PERSISTED_EDGES);
		}
		return persistedEdges;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public EList getTransientEdges() {
		if (transientEdges == null) {
			transientEdges = new EObjectContainmentEList(Edge.class, this, NotationPackage.DIAGRAM__TRANSIENT_EDGES);
		}
		return transientEdges;
	}

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    public Edge createEdge(EClass eClass) {
        Edge newEdge = (Edge) eClass.getEPackage().getEFactoryInstance()
            .create(eClass);
        getPersistedEdges().add(newEdge);
        return newEdge;
    }

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NotationPackage.DIAGRAM__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case NotationPackage.DIAGRAM__SOURCE_EDGES:
				return ((InternalEList)getSourceEdges()).basicRemove(otherEnd, msgs);
			case NotationPackage.DIAGRAM__TARGET_EDGES:
				return ((InternalEList)getTargetEdges()).basicRemove(otherEnd, msgs);
			case NotationPackage.DIAGRAM__PERSISTED_CHILDREN:
				return ((InternalEList)getPersistedChildren()).basicRemove(otherEnd, msgs);
			case NotationPackage.DIAGRAM__STYLES:
				return ((InternalEList)getStyles()).basicRemove(otherEnd, msgs);
			case NotationPackage.DIAGRAM__TRANSIENT_CHILDREN:
				return ((InternalEList)getTransientChildren()).basicRemove(otherEnd, msgs);
			case NotationPackage.DIAGRAM__PERSISTED_EDGES:
				return ((InternalEList)getPersistedEdges()).basicRemove(otherEnd, msgs);
			case NotationPackage.DIAGRAM__TRANSIENT_EDGES:
				return ((InternalEList)getTransientEdges()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.DIAGRAM__EANNOTATIONS:
				return getEAnnotations();
			case NotationPackage.DIAGRAM__VISIBLE:
				return isVisible() ? Boolean.TRUE : Boolean.FALSE;
			case NotationPackage.DIAGRAM__TYPE:
				return getType();
			case NotationPackage.DIAGRAM__MUTABLE:
				return isMutable() ? Boolean.TRUE : Boolean.FALSE;
			case NotationPackage.DIAGRAM__SOURCE_EDGES:
				return getSourceEdges();
			case NotationPackage.DIAGRAM__TARGET_EDGES:
				return getTargetEdges();
			case NotationPackage.DIAGRAM__PERSISTED_CHILDREN:
				return getPersistedChildren();
			case NotationPackage.DIAGRAM__STYLES:
				return getStyles();
			case NotationPackage.DIAGRAM__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
			case NotationPackage.DIAGRAM__DIAGRAM:
				if (resolve) return getDiagram();
				return basicGetDiagram();
			case NotationPackage.DIAGRAM__TRANSIENT_CHILDREN:
				return getTransientChildren();
			case NotationPackage.DIAGRAM__NAME:
				return getName();
			case NotationPackage.DIAGRAM__MEASUREMENT_UNIT:
				return getMeasurementUnit();
			case NotationPackage.DIAGRAM__PERSISTED_EDGES:
				return getPersistedEdges();
			case NotationPackage.DIAGRAM__TRANSIENT_EDGES:
				return getTransientEdges();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NotationPackage.DIAGRAM__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case NotationPackage.DIAGRAM__VISIBLE:
				setVisible(((Boolean)newValue).booleanValue());
				return;
			case NotationPackage.DIAGRAM__TYPE:
				setType((String)newValue);
				return;
			case NotationPackage.DIAGRAM__MUTABLE:
				setMutable(((Boolean)newValue).booleanValue());
				return;
			case NotationPackage.DIAGRAM__SOURCE_EDGES:
				getSourceEdges().clear();
				getSourceEdges().addAll((Collection)newValue);
				return;
			case NotationPackage.DIAGRAM__TARGET_EDGES:
				getTargetEdges().clear();
				getTargetEdges().addAll((Collection)newValue);
				return;
			case NotationPackage.DIAGRAM__PERSISTED_CHILDREN:
				getPersistedChildren().clear();
				getPersistedChildren().addAll((Collection)newValue);
				return;
			case NotationPackage.DIAGRAM__STYLES:
				getStyles().clear();
				getStyles().addAll((Collection)newValue);
				return;
			case NotationPackage.DIAGRAM__ELEMENT:
				setElement((EObject)newValue);
				return;
			case NotationPackage.DIAGRAM__TRANSIENT_CHILDREN:
				getTransientChildren().clear();
				getTransientChildren().addAll((Collection)newValue);
				return;
			case NotationPackage.DIAGRAM__NAME:
				setName((String)newValue);
				return;
			case NotationPackage.DIAGRAM__MEASUREMENT_UNIT:
				setMeasurementUnit((MeasurementUnit)newValue);
				return;
			case NotationPackage.DIAGRAM__PERSISTED_EDGES:
				getPersistedEdges().clear();
				getPersistedEdges().addAll((Collection)newValue);
				return;
			case NotationPackage.DIAGRAM__TRANSIENT_EDGES:
				getTransientEdges().clear();
				getTransientEdges().addAll((Collection)newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public void eUnset(int featureID) {
		switch (featureID) {
			case NotationPackage.DIAGRAM__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case NotationPackage.DIAGRAM__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case NotationPackage.DIAGRAM__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case NotationPackage.DIAGRAM__MUTABLE:
				setMutable(MUTABLE_EDEFAULT);
				return;
			case NotationPackage.DIAGRAM__SOURCE_EDGES:
				getSourceEdges().clear();
				return;
			case NotationPackage.DIAGRAM__TARGET_EDGES:
				getTargetEdges().clear();
				return;
			case NotationPackage.DIAGRAM__PERSISTED_CHILDREN:
				getPersistedChildren().clear();
				return;
			case NotationPackage.DIAGRAM__STYLES:
				getStyles().clear();
				return;
			case NotationPackage.DIAGRAM__ELEMENT:
				unsetElement();
				return;
			case NotationPackage.DIAGRAM__TRANSIENT_CHILDREN:
				getTransientChildren().clear();
				return;
			case NotationPackage.DIAGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NotationPackage.DIAGRAM__MEASUREMENT_UNIT:
				unsetMeasurementUnit();
				return;
			case NotationPackage.DIAGRAM__PERSISTED_EDGES:
				getPersistedEdges().clear();
				return;
			case NotationPackage.DIAGRAM__TRANSIENT_EDGES:
				getTransientEdges().clear();
				return;
		}
		eDynamicUnset(featureID);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NotationPackage.DIAGRAM__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case NotationPackage.DIAGRAM__VISIBLE:
				return ((eFlags & VISIBLE_EFLAG) != 0) != VISIBLE_EDEFAULT;
			case NotationPackage.DIAGRAM__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case NotationPackage.DIAGRAM__MUTABLE:
				return ((eFlags & MUTABLE_EFLAG) != 0) != MUTABLE_EDEFAULT;
			case NotationPackage.DIAGRAM__SOURCE_EDGES:
				return sourceEdges != null && !sourceEdges.isEmpty();
			case NotationPackage.DIAGRAM__TARGET_EDGES:
				return targetEdges != null && !targetEdges.isEmpty();
			case NotationPackage.DIAGRAM__PERSISTED_CHILDREN:
				return persistedChildren != null && !persistedChildren.isEmpty();
			case NotationPackage.DIAGRAM__STYLES:
				return styles != null && !styles.isEmpty();
			case NotationPackage.DIAGRAM__ELEMENT:
				return isSetElement();
			case NotationPackage.DIAGRAM__DIAGRAM:
				return basicGetDiagram() != null;
			case NotationPackage.DIAGRAM__TRANSIENT_CHILDREN:
				return transientChildren != null && !transientChildren.isEmpty();
			case NotationPackage.DIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NotationPackage.DIAGRAM__MEASUREMENT_UNIT:
				return isSetMeasurementUnit();
			case NotationPackage.DIAGRAM__PERSISTED_EDGES:
				return persistedEdges != null && !persistedEdges.isEmpty();
			case NotationPackage.DIAGRAM__TRANSIENT_EDGES:
				return transientEdges != null && !transientEdges.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", measurementUnit: "); //$NON-NLS-1$
		if ((eFlags & MEASUREMENT_UNIT_ESETFLAG) != 0) result.append(measurementUnit); else result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    public void insertEdge(Edge edge) {
        persistEdges();
        getPersistedEdges().add(edge);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    public void insertEdgeAt(Edge edge, int index) {
        persistEdges();
        if (getPersistedEdges().size() >= index) {
            getPersistedEdges().add(index, edge);
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    public void insertEdge(Edge edge, boolean persisted) {
        List edges = null;
        if (persisted)
            edges = getPersistedEdges();
        else
            edges = getTransientEdges();
        edges.add(edge);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    public void persistEdges() {
        if (transientEdges != null && transientEdges.size() > 0) {
            List edges = new ArrayList(transientEdges);
            getPersistedEdges().addAll(transientEdges);
            for (Iterator iterator = edges.iterator(); iterator.hasNext();) {
                Edge edge = (Edge) iterator.next();
                View sourceView = edge.getSource();
                View targetView = edge.getTarget();
                if (sourceView != null)
                    persistCompleteHierarchy(sourceView);
                if (targetView != null)
                    persistCompleteHierarchy(targetView);
            }
        }
    }

    /**
     * Persist the view passed in and all its parent views if they are
     * transient.
     * 
     * @param view
     *            the view to persist
     */
    private void persistCompleteHierarchy(View view) {
        view.persist();
        EObject container = view.eContainer();
        while (container instanceof View) {
            // if already persisted, quit
            EStructuralFeature sFeature = container.eContainingFeature();
            if (sFeature != null && !sFeature.isTransient()) {
                break;
            }

            ((View) container).persist();
            container = container.eContainer();
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    public void removeEdge(Edge edge) {
        if (edge.eContainingFeature() == NotationPackage.Literals
            .DIAGRAM__TRANSIENT_EDGES) {
            if (transientEdges != null && transientEdges.size() > 0) {
                transientEdges.remove(edge);
            }
        } else if (edge.eContainingFeature() == NotationPackage.Literals
                .DIAGRAM__PERSISTED_EDGES) {
            if (persistedEdges != null && persistedEdges.size() > 0) {
                persistedEdges.remove(edge);
            }
        }

    }

} // DiagramImpl
