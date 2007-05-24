/**
 * <copyright>
 * </copyright>
 *
 * $Id: FontStyleValidator.java,v 1.1 2007/05/17 16:26:49 aboyko Exp $
 */
package org.eclipse.gmf.runtime.notation.validation;


/**
 * A sample validator interface for {@link org.eclipse.gmf.runtime.notation.FontStyle}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FontStyleValidator {
	boolean validate();

	boolean validateFontColor(int value);
	boolean validateFontName(String value);
	boolean validateFontHeight(int value);
	boolean validateBold(boolean value);
	boolean validateItalic(boolean value);
	boolean validateUnderline(boolean value);
	boolean validateStrikeThrough(boolean value);
}