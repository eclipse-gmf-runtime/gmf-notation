/**
 * <copyright>
 * </copyright>
 *
 * $Id: MultiDiagramLinkStyle.java,v 1.2 2007/05/22 19:10:13 aboyko Exp $
 */
package org.eclipse.gmf.runtime.notation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Diagram Link Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.MultiDiagramLinkStyle#getDiagramLinks <em>Diagram Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getMultiDiagramLinkStyle()
 * @model
 * @generated
 */
public interface MultiDiagramLinkStyle extends Style {
	/**
	 * Returns the value of the '<em><b>Diagram Links</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmf.runtime.notation.Diagram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Links</em>' reference list.
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getMultiDiagramLinkStyle_DiagramLinks()
	 * @model type="org.eclipse.gmf.runtime.notation.Diagram" resolveProxies="false"
	 * @generated
	 */
	EList getDiagramLinks();

} // MultiDiagramLinkStyle
