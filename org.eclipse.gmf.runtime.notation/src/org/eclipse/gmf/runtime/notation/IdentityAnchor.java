/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2004.  All Rights Reserved.                    |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package org.eclipse.gmf.runtime.notation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity Anchor</b></em>'.
 * <p>
 * The identity anchor is an anchor constraint which has a unique string id within its defining view
 * </p>
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.IdentityAnchor#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getIdentityAnchor()
 * @model 
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public interface IdentityAnchor extends Anchor {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"anchor"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The id is user-define
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getIdentityAnchor_Id()
	 * @model default="anchor"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.IdentityAnchor#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The id is user-define
	 * </p>
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // IdentityAnchor
