/**
 * <copyright>
 * </copyright>
 *
 * $Id: HintedDiagramLinkStyle.java,v 1.1 2007/05/17 16:26:50 aboyko Exp $
 */
package org.eclipse.gmf.runtime.notation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hinted Diagram Link Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.HintedDiagramLinkStyle#getHint <em>Hint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getHintedDiagramLinkStyle()
 * @model
 * @generated
 */
public interface HintedDiagramLinkStyle extends DiagramLinkStyle, Style {
	/**
	 * Returns the value of the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hint</em>' attribute.
	 * @see #setHint(String)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getHintedDiagramLinkStyle_Hint()
	 * @model
	 * @generated
	 */
	String getHint();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.HintedDiagramLinkStyle#getHint <em>Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hint</em>' attribute.
	 * @see #getHint()
	 * @generated
	 */
	void setHint(String value);

} // HintedDiagramLinkStyle
