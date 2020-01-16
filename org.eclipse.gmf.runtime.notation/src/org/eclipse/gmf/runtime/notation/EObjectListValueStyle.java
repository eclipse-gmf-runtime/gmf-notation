/******************************************************************************
 * Copyright (c) 2007 IBM Corporation and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/
package org.eclipse.gmf.runtime.notation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EObject
 * List Value Style</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.gmf.runtime.notation.EObjectListValueStyle#getEObjectListValue
 * <em>EObject List Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getEObjectListValueStyle()
 * @model
 * @generated
 */
public interface EObjectListValueStyle extends NamedStyle {

	/**
	 * Returns the value of the '<em><b>EObject List Value</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EObject List Value</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>EObject List Value</em>' reference list.
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getEObjectListValueStyle_EObjectListValue()
	 * @model type="org.eclipse.emf.ecore.EObject"
	 * @generated
	 */
	EList getEObjectListValue();

} // EObjectListValueStyle
