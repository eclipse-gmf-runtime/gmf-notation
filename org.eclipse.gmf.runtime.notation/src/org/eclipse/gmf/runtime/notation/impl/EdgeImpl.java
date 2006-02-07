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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmf.runtime.notation.Anchor;
import org.eclipse.gmf.runtime.notation.Bendpoints;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.EdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.EdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.EdgeImpl#getBendpoints <em>Bendpoints</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.EdgeImpl#getSourceAnchor <em>Source Anchor</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.EdgeImpl#getTargetAnchor <em>Target Anchor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public class EdgeImpl extends ViewImpl implements Edge {
    /**
     * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
	protected View source = null;

    /**
     * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
	protected View target = null;

    /**
     * The cached value of the '{@link #getBendpoints() <em>Bendpoints</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBendpoints()
     * @generated
     * @ordered
     */
	protected Bendpoints bendpoints = null;

    /**
     * The cached value of the '{@link #getSourceAnchor() <em>Source Anchor</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSourceAnchor()
     * @generated
     * @ordered
     */
	protected Anchor sourceAnchor = null;

    /**
     * The cached value of the '{@link #getTargetAnchor() <em>Target Anchor</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTargetAnchor()
     * @generated
     * @ordered
     */
	protected Anchor targetAnchor = null;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected EdgeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected EClass eStaticClass() {
        return NotationPackage.Literals.EDGE;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public View getSource() {
        return source;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetSource(View newSource, NotificationChain msgs) {
        View oldSource = source;
        source = newSource;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NotationPackage.EDGE__SOURCE, oldSource, newSource);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSource(View newSource) {
        if (newSource != source) {
            NotificationChain msgs = null;
            if (source != null)
                msgs = ((InternalEObject)source).eInverseRemove(this, NotationPackage.VIEW__SOURCE_EDGES, View.class, msgs);
            if (newSource != null)
                msgs = ((InternalEObject)newSource).eInverseAdd(this, NotationPackage.VIEW__SOURCE_EDGES, View.class, msgs);
            msgs = basicSetSource(newSource, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.EDGE__SOURCE, newSource, newSource));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public View getTarget() {
        return target;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetTarget(View newTarget, NotificationChain msgs) {
        View oldTarget = target;
        target = newTarget;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NotationPackage.EDGE__TARGET, oldTarget, newTarget);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTarget(View newTarget) {
        if (newTarget != target) {
            NotificationChain msgs = null;
            if (target != null)
                msgs = ((InternalEObject)target).eInverseRemove(this, NotationPackage.VIEW__TARGET_EDGES, View.class, msgs);
            if (newTarget != null)
                msgs = ((InternalEObject)newTarget).eInverseAdd(this, NotationPackage.VIEW__TARGET_EDGES, View.class, msgs);
            msgs = basicSetTarget(newTarget, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.EDGE__TARGET, newTarget, newTarget));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Bendpoints getBendpoints() {
        return bendpoints;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetBendpoints(Bendpoints newBendpoints, NotificationChain msgs) {
        Bendpoints oldBendpoints = bendpoints;
        bendpoints = newBendpoints;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NotationPackage.EDGE__BENDPOINTS, oldBendpoints, newBendpoints);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBendpoints(Bendpoints newBendpoints) {
        if (newBendpoints != bendpoints) {
            NotificationChain msgs = null;
            if (bendpoints != null)
                msgs = ((InternalEObject)bendpoints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NotationPackage.EDGE__BENDPOINTS, null, msgs);
            if (newBendpoints != null)
                msgs = ((InternalEObject)newBendpoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NotationPackage.EDGE__BENDPOINTS, null, msgs);
            msgs = basicSetBendpoints(newBendpoints, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.EDGE__BENDPOINTS, newBendpoints, newBendpoints));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Anchor getSourceAnchor() {
        return sourceAnchor;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetSourceAnchor(Anchor newSourceAnchor, NotificationChain msgs) {
        Anchor oldSourceAnchor = sourceAnchor;
        sourceAnchor = newSourceAnchor;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NotationPackage.EDGE__SOURCE_ANCHOR, oldSourceAnchor, newSourceAnchor);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSourceAnchor(Anchor newSourceAnchor) {
        if (newSourceAnchor != sourceAnchor) {
            NotificationChain msgs = null;
            if (sourceAnchor != null)
                msgs = ((InternalEObject)sourceAnchor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NotationPackage.EDGE__SOURCE_ANCHOR, null, msgs);
            if (newSourceAnchor != null)
                msgs = ((InternalEObject)newSourceAnchor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NotationPackage.EDGE__SOURCE_ANCHOR, null, msgs);
            msgs = basicSetSourceAnchor(newSourceAnchor, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.EDGE__SOURCE_ANCHOR, newSourceAnchor, newSourceAnchor));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Anchor getTargetAnchor() {
        return targetAnchor;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetTargetAnchor(Anchor newTargetAnchor, NotificationChain msgs) {
        Anchor oldTargetAnchor = targetAnchor;
        targetAnchor = newTargetAnchor;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NotationPackage.EDGE__TARGET_ANCHOR, oldTargetAnchor, newTargetAnchor);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTargetAnchor(Anchor newTargetAnchor) {
        if (newTargetAnchor != targetAnchor) {
            NotificationChain msgs = null;
            if (targetAnchor != null)
                msgs = ((InternalEObject)targetAnchor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NotationPackage.EDGE__TARGET_ANCHOR, null, msgs);
            if (newTargetAnchor != null)
                msgs = ((InternalEObject)newTargetAnchor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NotationPackage.EDGE__TARGET_ANCHOR, null, msgs);
            msgs = basicSetTargetAnchor(newTargetAnchor, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.EDGE__TARGET_ANCHOR, newTargetAnchor, newTargetAnchor));
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Bendpoints createBendpoints(EClass eClass) {
		Bendpoints newBendpoints = (Bendpoints) eClass.getEPackage().getEFactoryInstance().create(eClass);
		setBendpoints(newBendpoints);
		return newBendpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Anchor createSourceAnchor(EClass eClass) {
		Anchor newAnchor = (Anchor) eClass.getEPackage().getEFactoryInstance().create(eClass);
		setSourceAnchor(newAnchor);
		return newAnchor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Anchor createTargetAnchor(EClass eClass) {
		Anchor newAnchor = (Anchor) eClass.getEPackage().getEFactoryInstance().create(eClass);
		setTargetAnchor(newAnchor);
		return newAnchor;
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case NotationPackage.EDGE__SOURCE:
                if (source != null)
                    msgs = ((InternalEObject)source).eInverseRemove(this, NotationPackage.VIEW__SOURCE_EDGES, View.class, msgs);
                return basicSetSource((View)otherEnd, msgs);
            case NotationPackage.EDGE__TARGET:
                if (target != null)
                    msgs = ((InternalEObject)target).eInverseRemove(this, NotationPackage.VIEW__TARGET_EDGES, View.class, msgs);
                return basicSetTarget((View)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case NotationPackage.EDGE__SOURCE:
                return basicSetSource(null, msgs);
            case NotationPackage.EDGE__TARGET:
                return basicSetTarget(null, msgs);
            case NotationPackage.EDGE__BENDPOINTS:
                return basicSetBendpoints(null, msgs);
            case NotationPackage.EDGE__SOURCE_ANCHOR:
                return basicSetSourceAnchor(null, msgs);
            case NotationPackage.EDGE__TARGET_ANCHOR:
                return basicSetTargetAnchor(null, msgs);
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
            case NotationPackage.EDGE__SOURCE:
                return getSource();
            case NotationPackage.EDGE__TARGET:
                return getTarget();
            case NotationPackage.EDGE__BENDPOINTS:
                return getBendpoints();
            case NotationPackage.EDGE__SOURCE_ANCHOR:
                return getSourceAnchor();
            case NotationPackage.EDGE__TARGET_ANCHOR:
                return getTargetAnchor();
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
            case NotationPackage.EDGE__SOURCE:
                setSource((View)newValue);
                return;
            case NotationPackage.EDGE__TARGET:
                setTarget((View)newValue);
                return;
            case NotationPackage.EDGE__BENDPOINTS:
                setBendpoints((Bendpoints)newValue);
                return;
            case NotationPackage.EDGE__SOURCE_ANCHOR:
                setSourceAnchor((Anchor)newValue);
                return;
            case NotationPackage.EDGE__TARGET_ANCHOR:
                setTargetAnchor((Anchor)newValue);
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
            case NotationPackage.EDGE__SOURCE:
                setSource((View)null);
                return;
            case NotationPackage.EDGE__TARGET:
                setTarget((View)null);
                return;
            case NotationPackage.EDGE__BENDPOINTS:
                setBendpoints((Bendpoints)null);
                return;
            case NotationPackage.EDGE__SOURCE_ANCHOR:
                setSourceAnchor((Anchor)null);
                return;
            case NotationPackage.EDGE__TARGET_ANCHOR:
                setTargetAnchor((Anchor)null);
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
            case NotationPackage.EDGE__SOURCE:
                return source != null;
            case NotationPackage.EDGE__TARGET:
                return target != null;
            case NotationPackage.EDGE__BENDPOINTS:
                return bendpoints != null;
            case NotationPackage.EDGE__SOURCE_ANCHOR:
                return sourceAnchor != null;
            case NotationPackage.EDGE__TARGET_ANCHOR:
                return targetAnchor != null;
        }
        return super.eIsSet(featureID);
    }

} //EdgeImpl
