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
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.gmf.runtime.notation.Filtering;
import org.eclipse.gmf.runtime.notation.FilteringStyle;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.ListCompartment;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Sorting;
import org.eclipse.gmf.runtime.notation.SortingStyle;
import org.eclipse.gmf.runtime.notation.TitleStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Compartment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ListCompartmentImpl#getSorting <em>Sorting</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ListCompartmentImpl#getSortingKeys <em>Sorting Keys</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ListCompartmentImpl#getSortedObjects <em>Sorted Objects</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ListCompartmentImpl#getFiltering <em>Filtering</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ListCompartmentImpl#getFilteringKeys <em>Filtering Keys</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ListCompartmentImpl#getFilteredObjects <em>Filtered Objects</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ListCompartmentImpl#isShowTitle <em>Show Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 * @since 1.2
 */
public class ListCompartmentImpl extends BasicCompartmentImpl implements ListCompartment {
	/**
	 * The default value of the '{@link #getSorting() <em>Sorting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSorting()
	 * @generated
	 * @ordered
	 */
	protected static final Sorting SORTING_EDEFAULT = Sorting.NONE_LITERAL;

	/**
	 * The offset of the flags representing the value of the '{@link #getSorting() <em>Sorting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int SORTING_EFLAG_OFFSET = 12;

	/**
	 * The flags representing the default value of the '{@link #getSorting() <em>Sorting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int SORTING_EFLAG_DEFAULT = Sorting.VALUES.indexOf(SORTING_EDEFAULT) << SORTING_EFLAG_OFFSET;

	/**
	 * The array of enumeration values for '{@link Sorting Sorting}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	private static final Sorting[] SORTING_EFLAG_VALUES = (Sorting[])Sorting.VALUES.toArray(new Sorting[Sorting.VALUES.size()]);

	/**
	 * The flags representing the value of the '{@link #getSorting() <em>Sorting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSorting()
	 * @generated
	 * @ordered
	 */
	protected static final int SORTING_EFLAG = 0x3 << SORTING_EFLAG_OFFSET;

	/**
	 * The default value of the '{@link #getSortingKeys() <em>Sorting Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingKeys()
	 * @generated NOT
	 * @ordered
	 */
	protected static final Map SORTING_KEYS_EDEFAULT = Collections.EMPTY_MAP;

	/**
	 * The cached value of the '{@link #getSortingKeys() <em>Sorting Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingKeys()
	 * @generated
	 * @ordered
	 */
	protected Map sortingKeys = SORTING_KEYS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSortedObjects() <em>Sorted Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortedObjects()
	 * @generated
	 * @ordered
	 */
	protected EList sortedObjects;

	/**
	 * The default value of the '{@link #getFiltering() <em>Filtering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiltering()
	 * @generated
	 * @ordered
	 */
	protected static final Filtering FILTERING_EDEFAULT = Filtering.NONE_LITERAL;

	/**
	 * The offset of the flags representing the value of the '{@link #getFiltering() <em>Filtering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int FILTERING_EFLAG_OFFSET = 14;

	/**
	 * The flags representing the default value of the '{@link #getFiltering() <em>Filtering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int FILTERING_EFLAG_DEFAULT = Filtering.VALUES.indexOf(FILTERING_EDEFAULT) << FILTERING_EFLAG_OFFSET;

	/**
	 * The array of enumeration values for '{@link Filtering Filtering}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	private static final Filtering[] FILTERING_EFLAG_VALUES = (Filtering[])Filtering.VALUES.toArray(new Filtering[Filtering.VALUES.size()]);

	/**
	 * The flags representing the value of the '{@link #getFiltering() <em>Filtering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiltering()
	 * @generated
	 * @ordered
	 */
	protected static final int FILTERING_EFLAG = 0x3 << FILTERING_EFLAG_OFFSET;

	/**
	 * The default value of the '{@link #getFilteringKeys() <em>Filtering Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilteringKeys()
	 * @generated NOT
	 * @ordered
	 */
	protected static final List FILTERING_KEYS_EDEFAULT = Collections.EMPTY_LIST;

	/**
	 * The cached value of the '{@link #getFilteringKeys() <em>Filtering Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilteringKeys()
	 * @generated
	 * @ordered
	 */
	protected List filteringKeys = FILTERING_KEYS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFilteredObjects() <em>Filtered Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilteredObjects()
	 * @generated
	 * @ordered
	 */
	protected EList filteredObjects;

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
	protected static final int SHOW_TITLE_EFLAG = 1 << 16;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListCompartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.LIST_COMPARTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sorting getSorting() {
		return SORTING_EFLAG_VALUES[(eFlags & SORTING_EFLAG) >>> SORTING_EFLAG_OFFSET];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSorting(Sorting newSorting) {
		Sorting oldSorting = SORTING_EFLAG_VALUES[(eFlags & SORTING_EFLAG) >>> SORTING_EFLAG_OFFSET];
		if (newSorting == null) newSorting = SORTING_EDEFAULT;
		eFlags = eFlags & ~SORTING_EFLAG | Sorting.VALUES.indexOf(newSorting) << SORTING_EFLAG_OFFSET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.LIST_COMPARTMENT__SORTING, oldSorting, newSorting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getSortingKeys() {
		return sortingKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingKeys(Map newSortingKeys) {
		Map oldSortingKeys = sortingKeys;
		sortingKeys = newSortingKeys;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.LIST_COMPARTMENT__SORTING_KEYS, oldSortingKeys, sortingKeys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSortedObjects() {
		if (sortedObjects == null) {
			sortedObjects = new EObjectResolvingEList(EObject.class, this, NotationPackage.LIST_COMPARTMENT__SORTED_OBJECTS);
		}
		return sortedObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filtering getFiltering() {
		return FILTERING_EFLAG_VALUES[(eFlags & FILTERING_EFLAG) >>> FILTERING_EFLAG_OFFSET];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiltering(Filtering newFiltering) {
		Filtering oldFiltering = FILTERING_EFLAG_VALUES[(eFlags & FILTERING_EFLAG) >>> FILTERING_EFLAG_OFFSET];
		if (newFiltering == null) newFiltering = FILTERING_EDEFAULT;
		eFlags = eFlags & ~FILTERING_EFLAG | Filtering.VALUES.indexOf(newFiltering) << FILTERING_EFLAG_OFFSET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.LIST_COMPARTMENT__FILTERING, oldFiltering, newFiltering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getFilteringKeys() {
		return filteringKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilteringKeys(List newFilteringKeys) {
		List oldFilteringKeys = filteringKeys;
		filteringKeys = newFilteringKeys;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.LIST_COMPARTMENT__FILTERING_KEYS, oldFilteringKeys, filteringKeys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFilteredObjects() {
		if (filteredObjects == null) {
			filteredObjects = new EObjectResolvingEList(EObject.class, this, NotationPackage.LIST_COMPARTMENT__FILTERED_OBJECTS);
		}
		return filteredObjects;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.LIST_COMPARTMENT__SHOW_TITLE, oldShowTitle, newShowTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.LIST_COMPARTMENT__EANNOTATIONS:
				return getEAnnotations();
			case NotationPackage.LIST_COMPARTMENT__VISIBLE:
				return isVisible() ? Boolean.TRUE : Boolean.FALSE;
			case NotationPackage.LIST_COMPARTMENT__TYPE:
				return getType();
			case NotationPackage.LIST_COMPARTMENT__MUTABLE:
				return isMutable() ? Boolean.TRUE : Boolean.FALSE;
			case NotationPackage.LIST_COMPARTMENT__SOURCE_EDGES:
				return getSourceEdges();
			case NotationPackage.LIST_COMPARTMENT__TARGET_EDGES:
				return getTargetEdges();
			case NotationPackage.LIST_COMPARTMENT__PERSISTED_CHILDREN:
				return getPersistedChildren();
			case NotationPackage.LIST_COMPARTMENT__STYLES:
				return getStyles();
			case NotationPackage.LIST_COMPARTMENT__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
			case NotationPackage.LIST_COMPARTMENT__DIAGRAM:
				if (resolve) return getDiagram();
				return basicGetDiagram();
			case NotationPackage.LIST_COMPARTMENT__TRANSIENT_CHILDREN:
				return getTransientChildren();
			case NotationPackage.LIST_COMPARTMENT__LAYOUT_CONSTRAINT:
				return getLayoutConstraint();
			case NotationPackage.LIST_COMPARTMENT__COLLAPSED:
				return isCollapsed() ? Boolean.TRUE : Boolean.FALSE;
			case NotationPackage.LIST_COMPARTMENT__SORTING:
				return getSorting();
			case NotationPackage.LIST_COMPARTMENT__SORTING_KEYS:
				return getSortingKeys();
			case NotationPackage.LIST_COMPARTMENT__SORTED_OBJECTS:
				return getSortedObjects();
			case NotationPackage.LIST_COMPARTMENT__FILTERING:
				return getFiltering();
			case NotationPackage.LIST_COMPARTMENT__FILTERING_KEYS:
				return getFilteringKeys();
			case NotationPackage.LIST_COMPARTMENT__FILTERED_OBJECTS:
				return getFilteredObjects();
			case NotationPackage.LIST_COMPARTMENT__SHOW_TITLE:
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
			case NotationPackage.LIST_COMPARTMENT__SOURCE_EDGES:
			case NotationPackage.LIST_COMPARTMENT__TARGET_EDGES:
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
			case NotationPackage.LIST_COMPARTMENT__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case NotationPackage.LIST_COMPARTMENT__VISIBLE:
				setVisible(((Boolean)newValue).booleanValue());
				return;
			case NotationPackage.LIST_COMPARTMENT__TYPE:
				setType((String)newValue);
				return;
			case NotationPackage.LIST_COMPARTMENT__MUTABLE:
				setMutable(((Boolean)newValue).booleanValue());
				return;
			case NotationPackage.LIST_COMPARTMENT__SOURCE_EDGES:
				getSourceEdges().clear();
				getSourceEdges().addAll((Collection)newValue);
				return;
			case NotationPackage.LIST_COMPARTMENT__TARGET_EDGES:
				getTargetEdges().clear();
				getTargetEdges().addAll((Collection)newValue);
				return;
			case NotationPackage.LIST_COMPARTMENT__PERSISTED_CHILDREN:
				getPersistedChildren().clear();
				getPersistedChildren().addAll((Collection)newValue);
				return;
			case NotationPackage.LIST_COMPARTMENT__STYLES:
				getStyles().clear();
				getStyles().addAll((Collection)newValue);
				return;
			case NotationPackage.LIST_COMPARTMENT__ELEMENT:
				setElement((EObject)newValue);
				return;
			case NotationPackage.LIST_COMPARTMENT__TRANSIENT_CHILDREN:
				getTransientChildren().clear();
				getTransientChildren().addAll((Collection)newValue);
				return;
			case NotationPackage.LIST_COMPARTMENT__LAYOUT_CONSTRAINT:
				setLayoutConstraint((LayoutConstraint)newValue);
				return;
			case NotationPackage.LIST_COMPARTMENT__COLLAPSED:
				setCollapsed(((Boolean)newValue).booleanValue());
				return;
			case NotationPackage.LIST_COMPARTMENT__SORTING:
				setSorting((Sorting)newValue);
				return;
			case NotationPackage.LIST_COMPARTMENT__SORTING_KEYS:
				setSortingKeys((Map)newValue);
				return;
			case NotationPackage.LIST_COMPARTMENT__SORTED_OBJECTS:
				getSortedObjects().clear();
				getSortedObjects().addAll((Collection)newValue);
				return;
			case NotationPackage.LIST_COMPARTMENT__FILTERING:
				setFiltering((Filtering)newValue);
				return;
			case NotationPackage.LIST_COMPARTMENT__FILTERING_KEYS:
				setFilteringKeys((List)newValue);
				return;
			case NotationPackage.LIST_COMPARTMENT__FILTERED_OBJECTS:
				getFilteredObjects().clear();
				getFilteredObjects().addAll((Collection)newValue);
				return;
			case NotationPackage.LIST_COMPARTMENT__SHOW_TITLE:
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
			case NotationPackage.LIST_COMPARTMENT__SOURCE_EDGES:
			case NotationPackage.LIST_COMPARTMENT__TARGET_EDGES:
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
			case NotationPackage.LIST_COMPARTMENT__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case NotationPackage.LIST_COMPARTMENT__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case NotationPackage.LIST_COMPARTMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case NotationPackage.LIST_COMPARTMENT__MUTABLE:
				setMutable(MUTABLE_EDEFAULT);
				return;
			case NotationPackage.LIST_COMPARTMENT__SOURCE_EDGES:
				getSourceEdges().clear();
				return;
			case NotationPackage.LIST_COMPARTMENT__TARGET_EDGES:
				getTargetEdges().clear();
				return;
			case NotationPackage.LIST_COMPARTMENT__PERSISTED_CHILDREN:
				getPersistedChildren().clear();
				return;
			case NotationPackage.LIST_COMPARTMENT__STYLES:
				getStyles().clear();
				return;
			case NotationPackage.LIST_COMPARTMENT__ELEMENT:
				unsetElement();
				return;
			case NotationPackage.LIST_COMPARTMENT__TRANSIENT_CHILDREN:
				getTransientChildren().clear();
				return;
			case NotationPackage.LIST_COMPARTMENT__LAYOUT_CONSTRAINT:
				setLayoutConstraint((LayoutConstraint)null);
				return;
			case NotationPackage.LIST_COMPARTMENT__COLLAPSED:
				setCollapsed(COLLAPSED_EDEFAULT);
				return;
			case NotationPackage.LIST_COMPARTMENT__SORTING:
				setSorting(SORTING_EDEFAULT);
				return;
			case NotationPackage.LIST_COMPARTMENT__SORTING_KEYS:
				setSortingKeys(SORTING_KEYS_EDEFAULT);
				return;
			case NotationPackage.LIST_COMPARTMENT__SORTED_OBJECTS:
				getSortedObjects().clear();
				return;
			case NotationPackage.LIST_COMPARTMENT__FILTERING:
				setFiltering(FILTERING_EDEFAULT);
				return;
			case NotationPackage.LIST_COMPARTMENT__FILTERING_KEYS:
				setFilteringKeys(FILTERING_KEYS_EDEFAULT);
				return;
			case NotationPackage.LIST_COMPARTMENT__FILTERED_OBJECTS:
				getFilteredObjects().clear();
				return;
			case NotationPackage.LIST_COMPARTMENT__SHOW_TITLE:
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
			case NotationPackage.LIST_COMPARTMENT__SOURCE_EDGES:
			case NotationPackage.LIST_COMPARTMENT__TARGET_EDGES:
				return false;
			default:
				return eIsSetGen(featureID);
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT_CDO
	 */
	public boolean eIsSetGen(int featureID) {
		switch (featureID) {
			case NotationPackage.LIST_COMPARTMENT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case NotationPackage.LIST_COMPARTMENT__VISIBLE:
				return ((eFlags & VISIBLE_EFLAG) != 0) != VISIBLE_EDEFAULT;
			case NotationPackage.LIST_COMPARTMENT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case NotationPackage.LIST_COMPARTMENT__MUTABLE:
				return ((eFlags & MUTABLE_EFLAG) != 0) != MUTABLE_EDEFAULT;
			case NotationPackage.LIST_COMPARTMENT__SOURCE_EDGES:
			case NotationPackage.LIST_COMPARTMENT__TARGET_EDGES:
				return false;
			case NotationPackage.LIST_COMPARTMENT__PERSISTED_CHILDREN:
				return persistedChildren != null && !persistedChildren.isEmpty();
			case NotationPackage.LIST_COMPARTMENT__STYLES:
				return styles != null && !styles.isEmpty();
			case NotationPackage.LIST_COMPARTMENT__ELEMENT:
				return isSetElement();
			case NotationPackage.LIST_COMPARTMENT__DIAGRAM:
				return basicGetDiagram() != null;
			case NotationPackage.LIST_COMPARTMENT__TRANSIENT_CHILDREN:
				return transientChildren != null && !transientChildren.isEmpty();
			case NotationPackage.LIST_COMPARTMENT__LAYOUT_CONSTRAINT:
				return layoutConstraint != null;
			case NotationPackage.LIST_COMPARTMENT__COLLAPSED:
				return ((eFlags & COLLAPSED_EFLAG) != 0) != COLLAPSED_EDEFAULT;
			case NotationPackage.LIST_COMPARTMENT__SORTING:
				return (eFlags & SORTING_EFLAG) != SORTING_EFLAG_DEFAULT;
			case NotationPackage.LIST_COMPARTMENT__SORTING_KEYS:
				return SORTING_KEYS_EDEFAULT == null ? sortingKeys != null : !SORTING_KEYS_EDEFAULT.equals(sortingKeys);
			case NotationPackage.LIST_COMPARTMENT__SORTED_OBJECTS:
				return sortedObjects != null && !sortedObjects.isEmpty();
			case NotationPackage.LIST_COMPARTMENT__FILTERING:
				return (eFlags & FILTERING_EFLAG) != FILTERING_EFLAG_DEFAULT;
			case NotationPackage.LIST_COMPARTMENT__FILTERING_KEYS:
				return FILTERING_KEYS_EDEFAULT == null ? filteringKeys != null : !FILTERING_KEYS_EDEFAULT.equals(filteringKeys);
			case NotationPackage.LIST_COMPARTMENT__FILTERED_OBJECTS:
				return filteredObjects != null && !filteredObjects.isEmpty();
			case NotationPackage.LIST_COMPARTMENT__SHOW_TITLE:
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
		if (baseClass == SortingStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.LIST_COMPARTMENT__SORTING: return NotationPackage.SORTING_STYLE__SORTING;
				case NotationPackage.LIST_COMPARTMENT__SORTING_KEYS: return NotationPackage.SORTING_STYLE__SORTING_KEYS;
				case NotationPackage.LIST_COMPARTMENT__SORTED_OBJECTS: return NotationPackage.SORTING_STYLE__SORTED_OBJECTS;
				default: return -1;
			}
		}
		if (baseClass == FilteringStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.LIST_COMPARTMENT__FILTERING: return NotationPackage.FILTERING_STYLE__FILTERING;
				case NotationPackage.LIST_COMPARTMENT__FILTERING_KEYS: return NotationPackage.FILTERING_STYLE__FILTERING_KEYS;
				case NotationPackage.LIST_COMPARTMENT__FILTERED_OBJECTS: return NotationPackage.FILTERING_STYLE__FILTERED_OBJECTS;
				default: return -1;
			}
		}
		if (baseClass == TitleStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.LIST_COMPARTMENT__SHOW_TITLE: return NotationPackage.TITLE_STYLE__SHOW_TITLE;
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
		if (baseClass == SortingStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.SORTING_STYLE__SORTING: return NotationPackage.LIST_COMPARTMENT__SORTING;
				case NotationPackage.SORTING_STYLE__SORTING_KEYS: return NotationPackage.LIST_COMPARTMENT__SORTING_KEYS;
				case NotationPackage.SORTING_STYLE__SORTED_OBJECTS: return NotationPackage.LIST_COMPARTMENT__SORTED_OBJECTS;
				default: return -1;
			}
		}
		if (baseClass == FilteringStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.FILTERING_STYLE__FILTERING: return NotationPackage.LIST_COMPARTMENT__FILTERING;
				case NotationPackage.FILTERING_STYLE__FILTERING_KEYS: return NotationPackage.LIST_COMPARTMENT__FILTERING_KEYS;
				case NotationPackage.FILTERING_STYLE__FILTERED_OBJECTS: return NotationPackage.LIST_COMPARTMENT__FILTERED_OBJECTS;
				default: return -1;
			}
		}
		if (baseClass == TitleStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.TITLE_STYLE__SHOW_TITLE: return NotationPackage.LIST_COMPARTMENT__SHOW_TITLE;
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
		result.append(" (sorting: "); //$NON-NLS-1$
		result.append(SORTING_EFLAG_VALUES[(eFlags & SORTING_EFLAG) >>> SORTING_EFLAG_OFFSET]);
		result.append(", sortingKeys: "); //$NON-NLS-1$
		result.append(sortingKeys);
		result.append(", filtering: "); //$NON-NLS-1$
		result.append(FILTERING_EFLAG_VALUES[(eFlags & FILTERING_EFLAG) >>> FILTERING_EFLAG_OFFSET]);
		result.append(", filteringKeys: "); //$NON-NLS-1$
		result.append(filteringKeys);
		result.append(", showTitle: "); //$NON-NLS-1$
		result.append((eFlags & SHOW_TITLE_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

} //ListCompartmentImpl
