/******************************************************************************
 * Copyright (c) 2004, 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.runtime.notation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font Style</b></em>'.
 * <p>
 * The font style is a style to be installed on views with text
 * </p>
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.FontStyle#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.FontStyle#getFontName <em>Font Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.FontStyle#getFontHeight <em>Font Height</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.FontStyle#isBold <em>Bold</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.FontStyle#isItalic <em>Italic</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.FontStyle#isUnderline <em>Underline</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.FontStyle#isStrikeThrough <em>Strike Through</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getFontStyle()
 * @model 
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public interface FontStyle extends Style {
    /**
     * Returns the value of the '<em><b>Font Name</b></em>' attribute.
     * The default value is <code>"Tahoma"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * The fontName property specified the font typeface name
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Font Name</em>' attribute.
     * @see #setFontName(String)
     * @see org.eclipse.gmf.runtime.notation.NotationPackage#getFontStyle_FontName()
     * @model default="Tahoma"
     * @generated
     */
	String getFontName();

    /**
     * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.FontStyle#getFontName <em>Font Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * The fontName property specifies the font typeface name
	 * </p>
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Font Name</em>' attribute.
     * @see #getFontName()
     * @generated
     */
	void setFontName(String value);

    /**
     * Returns the value of the '<em><b>Font Height</b></em>' attribute.
     * The default value is <code>"9"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * The fontHeight property specifies the font size
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Font Height</em>' attribute.
     * @see #setFontHeight(int)
     * @see org.eclipse.gmf.runtime.notation.NotationPackage#getFontStyle_FontHeight()
     * @model default="9"
     * @generated
     */
	int getFontHeight();

    /**
     * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.FontStyle#getFontHeight <em>Font Height</em>}' attribute.
     * <!-- begin-user-doc -->
	 * The fontHeight property specifies the font size
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Font Height</em>' attribute.
     * @see #getFontHeight()
     * @generated
     */
	void setFontHeight(int value);

    /**
     * Returns the value of the '<em><b>Bold</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Bold</em>' attribute.
     * @see #setBold(boolean)
     * @see org.eclipse.gmf.runtime.notation.NotationPackage#getFontStyle_Bold()
     * @model default="false"
     * @generated
     */
	boolean isBold();

    /**
     * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.FontStyle#isBold <em>Bold</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bold</em>' attribute.
     * @see #isBold()
     * @generated
     */
	void setBold(boolean value);

    /**
     * Returns the value of the '<em><b>Italic</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Italic</em>' attribute.
     * @see #setItalic(boolean)
     * @see org.eclipse.gmf.runtime.notation.NotationPackage#getFontStyle_Italic()
     * @model default="false"
     * @generated
     */
	boolean isItalic();

    /**
     * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.FontStyle#isItalic <em>Italic</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Italic</em>' attribute.
     * @see #isItalic()
     * @generated
     */
	void setItalic(boolean value);

    /**
     * Returns the value of the '<em><b>Underline</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Underline</em>' attribute.
     * @see #setUnderline(boolean)
     * @see org.eclipse.gmf.runtime.notation.NotationPackage#getFontStyle_Underline()
     * @model default="false"
     * @generated
     */
	boolean isUnderline();

    /**
     * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.FontStyle#isUnderline <em>Underline</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Underline</em>' attribute.
     * @see #isUnderline()
     * @generated
     */
	void setUnderline(boolean value);

    /**
     * Returns the value of the '<em><b>Strike Through</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Strike Through</em>' attribute.
     * @see #setStrikeThrough(boolean)
     * @see org.eclipse.gmf.runtime.notation.NotationPackage#getFontStyle_StrikeThrough()
     * @model default="false"
     * @generated
     */
	boolean isStrikeThrough();

    /**
     * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.FontStyle#isStrikeThrough <em>Strike Through</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Strike Through</em>' attribute.
     * @see #isStrikeThrough()
     * @generated
     */
	void setStrikeThrough(boolean value);

    /**
     * Returns the value of the '<em><b>Font Color</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * The font color is the color used in painting the texts inside node visuals
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Font Color</em>' attribute.
     * @see #setFontColor(int)
     * @see org.eclipse.gmf.runtime.notation.NotationPackage#getFontStyle_FontColor()
     * @model default="0"
     * @generated
     */
	int getFontColor();

    /**
     * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.FontStyle#getFontColor <em>Font Color</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * The font color is the color used in painting the texts inside node visuals
	 * </p>
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Font Color</em>' attribute.
     * @see #getFontColor()
     * @generated
     */
	void setFontColor(int value);

} // FontStyle
