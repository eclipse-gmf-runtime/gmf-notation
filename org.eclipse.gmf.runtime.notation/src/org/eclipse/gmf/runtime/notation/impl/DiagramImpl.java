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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
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
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.DiagramImpl#getName <em>Name</em>}</li>
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
public class DiagramImpl extends ViewImpl implements Diagram {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
	protected static final String NAME_EDEFAULT = ""; //$NON-NLS-1$

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPersistedEdges()
     * @generated
     * @ordered
     */
	protected EList persistedEdges = null;

    /**
     * The cached value of the '{@link #getTransientEdges() <em>Transient Edges</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTransientEdges()
     * @generated
     * @ordered
     */
	protected EList transientEdges = null;
	

	private EContentsEList allEdges = null;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected DiagramImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected EClass eStaticClass() {
        return NotationPackage.Literals.DIAGRAM;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
     * <!-- begin-user-doc -->
     * Set the Measurement Unit for this Diagram, the Measure ment unit can be set only 
     * once, the set method will not set the value if it was already set
     * <!-- end-user-doc -->
     */
    public void setMeasurementUnit(MeasurementUnit newMeasurementUnit) {
        if (!isSetMeasurementUnit()){
            MeasurementUnit oldMeasurementUnit = measurementUnit;
            measurementUnit = newMeasurementUnit == null ? MEASUREMENT_UNIT_EDEFAULT : newMeasurementUnit;
            boolean oldMeasurementUnitESet = (eFlags & MEASUREMENT_UNIT_ESETFLAG) != 0;
            eFlags |= MEASUREMENT_UNIT_ESETFLAG;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.DIAGRAM__MEASUREMENT_UNIT, oldMeasurementUnit, measurementUnit, !oldMeasurementUnitESet));
        } else
            throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList getEdges() {
		if (allEdges == null){
			allEdges =  new EContentsEList(this, 
				new EStructuralFeature[] {
					NotationPackage.eINSTANCE.getDiagram_PersistedEdges(),
					NotationPackage.eINSTANCE.getDiagram_TransientEdges()});
		}
		return allEdges;
	}

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList getPersistedEdges() {
        if (persistedEdges == null) {
            persistedEdges = new EObjectContainmentEList(Edge.class, this, NotationPackage.DIAGRAM__PERSISTED_EDGES);
        }
        return persistedEdges;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList getTransientEdges() {
        if (transientEdges == null) {
            transientEdges = new EObjectContainmentEList(Edge.class, this, NotationPackage.DIAGRAM__TRANSIENT_EDGES);
        }
        return transientEdges;
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Edge createEdge(EClass eClass) {
		Edge newEdge = (Edge) eClass.getEPackage().getEFactoryInstance().create(eClass);
		getEdges().add(newEdge);
		return newEdge;
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case NotationPackage.DIAGRAM__PERSISTED_EDGES:
                return ((InternalEList)getPersistedEdges()).basicRemove(otherEnd, msgs);
            case NotationPackage.DIAGRAM__TRANSIENT_EDGES:
                return ((InternalEList)getTransientEdges()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case NotationPackage.DIAGRAM__NAME:
                return getName();
            case NotationPackage.DIAGRAM__MEASUREMENT_UNIT:
                return getMeasurementUnit();
            case NotationPackage.DIAGRAM__PERSISTED_EDGES:
                return getPersistedEdges();
            case NotationPackage.DIAGRAM__TRANSIENT_EDGES:
                return getTransientEdges();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
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
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eUnset(int featureID) {
        switch (featureID) {
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
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case NotationPackage.DIAGRAM__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case NotationPackage.DIAGRAM__MEASUREMENT_UNIT:
                return isSetMeasurementUnit();
            case NotationPackage.DIAGRAM__PERSISTED_EDGES:
                return persistedEdges != null && !persistedEdges.isEmpty();
            case NotationPackage.DIAGRAM__TRANSIENT_EDGES:
                return transientEdges != null && !transientEdges.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void insertEdge(Edge edge){
		persistEdges();
		getPersistedEdges().add(edge);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void insertEdgeAt(Edge edge, int index){
		persistEdges();
		if (getPersistedEdges().size()>=index){
			getPersistedEdges().add(index,edge);
		}
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void insertEdge(Edge edge,boolean persisted){
		List edges = null;
		if (persisted)
			edges = getPersistedEdges();
		else
			edges = getTransientEdges();
		edges.add(edge);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void persistEdges(){
		if (transientEdges!=null &&
			transientEdges.size()>0){
			List edges = new ArrayList(transientEdges);
			getPersistedEdges().addAll(transientEdges);
			for (Iterator iterator = edges.iterator();
				 iterator.hasNext();){
				Edge edge = (Edge)iterator.next();
				View sourceView = edge.getSource();
				View targetView = edge.getTarget();
				if (sourceView!=null)
					sourceView.persist();
				if (targetView!=null)
					targetView.persist();
			}
		}
	}
	
	 /**
	  * <!-- begin-user-doc -->
	  * <!-- end-user-doc -->
	  */
	  public void removeEdge(Edge edge){
	  	if (edge.eContainingFeature() == 
			NotationPackage.eINSTANCE.getDiagram_TransientEdges()){
			if (transientEdges!=null && 
			    transientEdges.size()>0){
				transientEdges.remove(edge);
			}
		} else if (edge.eContainingFeature() == 
			NotationPackage.eINSTANCE.getDiagram_PersistedEdges()){
			if (persistedEdges!=null && 
				persistedEdges.size()>0){
				persistedEdges.remove(edge);
			}
		}
	  	
	  }

} //DiagramImpl
