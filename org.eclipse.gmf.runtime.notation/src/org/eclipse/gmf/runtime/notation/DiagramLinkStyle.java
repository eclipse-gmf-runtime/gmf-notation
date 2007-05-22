/**
 * <copyright>
 * </copyright>
 *
 * $Id: DiagramLinkStyle.java,v 1.2 2007/05/22 19:10:13 aboyko Exp $
 */
package org.eclipse.gmf.runtime.notation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Link Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.DiagramLinkStyle#getDiagramLink <em>Diagram Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getDiagramLinkStyle()
 * @model
 * @generated
 */
public interface DiagramLinkStyle extends Style {
	/**
	 * Returns the value of the '<em><b>Diagram Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Link</em>' reference.
	 * @see #setDiagramLink(Diagram)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getDiagramLinkStyle_DiagramLink()
	 * @model resolveProxies="false"
	 * @generated
	 */
	Diagram getDiagramLink();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.DiagramLinkStyle#getDiagramLink <em>Diagram Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Link</em>' reference.
	 * @see #getDiagramLink()
	 * @generated
	 */
	void setDiagramLink(Diagram value);

} // DiagramLinkStyle
