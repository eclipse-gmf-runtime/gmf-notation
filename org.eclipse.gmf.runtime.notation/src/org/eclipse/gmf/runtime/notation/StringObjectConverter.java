/**
 * <copyright>
 * </copyright>
 *
 * $Id: StringObjectConverter.java,v 1.1 2007/05/17 16:26:50 aboyko Exp $
 */
package org.eclipse.gmf.runtime.notation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Object Converter</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getStringObjectConverter()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface StringObjectConverter extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getStringFromObject(Object objectValue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Object getObjectFromString(String stringValue);

} // StringObjectConverter
