/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2004.  All Rights Reserved.                    |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package org.eclipse.gmf.runtime.notation.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;
import org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relative Bendpoints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.RelativeBendpointsImpl#getPoints <em>Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public class RelativeBendpointsImpl extends EObjectImpl implements RelativeBendpoints {
	/**
	 * The default value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated NOT
	 * @ordered
	 */
	protected static final List POINTS_EDEFAULT = Collections.EMPTY_LIST;

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected List points = POINTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelativeBendpointsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.eINSTANCE.getRelativeBendpoints();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List getPoints() {
		return Collections.unmodifiableList(points);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setPoints(List newPoints) {
		List oldPoints = points;
		
		if (newPoints == null )
			throw new NullPointerException("the 'newPoints' parameter is null"); //$NON-NLS-1$
		else if (newPoints.isEmpty())
			points = POINTS_EDEFAULT;
		else {
			List tempList = new ArrayList(newPoints.size());
			for (Iterator i = newPoints.iterator(); i.hasNext();) {
				Object point = i.next();
				if (!(point instanceof RelativeBendpoint))
					throw new IllegalArgumentException("One or more objects in the list is not of type org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint"); //$NON-NLS-1$
				tempList.add(point);
			}
			points = tempList;
		}

		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.RELATIVE_BENDPOINTS__POINTS, Collections.unmodifiableList(oldPoints), Collections.unmodifiableList(points)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case NotationPackage.RELATIVE_BENDPOINTS__POINTS:
				return getPoints();
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
			case NotationPackage.RELATIVE_BENDPOINTS__POINTS:
				setPoints((List)newValue);
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
			case NotationPackage.RELATIVE_BENDPOINTS__POINTS:
				setPoints(POINTS_EDEFAULT);
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
			case NotationPackage.RELATIVE_BENDPOINTS__POINTS:
				return POINTS_EDEFAULT == null ? points != null : !POINTS_EDEFAULT.equals(points);
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
		result.append(" (points: "); //$NON-NLS-1$
		result.append(points);
		result.append(')');
		return result.toString();
	}

} //RelativeBendpointsImpl
