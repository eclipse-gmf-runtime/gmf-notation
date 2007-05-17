/**
 * <copyright>
 * </copyright>
 *
 * $Id: EObjectListValueStyle.java,v 1.1 2007/05/17 16:26:50 aboyko Exp $
 */
package org.eclipse.gmf.runtime.notation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EObject List Value Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.EObjectListValueStyle#getEObjectListValue <em>EObject List Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getEObjectListValueStyle()
 * @model
 * @generated
 */
public interface EObjectListValueStyle extends NamedStyle {

	/**
	 * Returns the value of the '<em><b>EObject List Value</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EObject List Value</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EObject List Value</em>' reference list.
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getEObjectListValueStyle_EObjectListValue()
	 * @model type="org.eclipse.emf.ecore.EObject"
	 * @generated
	 */
	EList getEObjectListValue();

} // EObjectListValueStyle
