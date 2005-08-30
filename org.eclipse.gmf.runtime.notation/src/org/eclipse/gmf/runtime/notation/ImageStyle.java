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
 * A representation of the model object '<em><b>Image Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.ImageStyle#getAntiAlias <em>Anti Alias</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.ImageStyle#getMaintainAspectRatio <em>Maintain Aspect Ratio</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.ImageStyle#getCropBound <em>Crop Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getImageStyle()
 * @model 
 * @generated
 */
/*
 * @canBeSeenBy org.eclipse.gmf.runtime.notation.*
 */
public interface ImageStyle extends Style{
	/**
	 * Returns the value of the '<em><b>Anti Alias</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anti Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anti Alias</em>' attribute.
	 * @see #setAntiAlias(Boolean)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getImageStyle_AntiAlias()
	 * @model default="true"
	 * @generated
	 */
	Boolean getAntiAlias();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.ImageStyle#getAntiAlias <em>Anti Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anti Alias</em>' attribute.
	 * @see #getAntiAlias()
	 * @generated
	 */
	void setAntiAlias(Boolean value);

	/**
	 * Returns the value of the '<em><b>Maintain Aspect Ratio</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maintain Aspect Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maintain Aspect Ratio</em>' attribute.
	 * @see #setMaintainAspectRatio(Boolean)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getImageStyle_MaintainAspectRatio()
	 * @model default="true"
	 * @generated
	 */
	Boolean getMaintainAspectRatio();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.ImageStyle#getMaintainAspectRatio <em>Maintain Aspect Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maintain Aspect Ratio</em>' attribute.
	 * @see #getMaintainAspectRatio()
	 * @generated
	 */
	void setMaintainAspectRatio(Boolean value);

	/**
	 * Returns the value of the '<em><b>Crop Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crop Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crop Bound</em>' containment reference.
	 * @see #setCropBound(Bounds)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getImageStyle_CropBound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Bounds getCropBound();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.ImageStyle#getCropBound <em>Crop Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crop Bound</em>' containment reference.
	 * @see #getCropBound()
	 * @generated
	 */
	void setCropBound(Bounds value);

} // ImageStyle
