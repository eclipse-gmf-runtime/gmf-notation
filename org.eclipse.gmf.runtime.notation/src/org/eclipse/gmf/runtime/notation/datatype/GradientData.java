/******************************************************************************
 * Copyright (c) 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.runtime.notation.datatype;

import org.eclipse.gmf.runtime.notation.GradientStyle;


/**
 * Class defining gradient data
 * 
 * @author lgrahek
 * @since 1.2
 *
 */
public class GradientData {
	protected static final int GRADIENT_COLOR1_DEFFAULT = 8421504; //dark grey
	
	protected static final int GRADIENT_COLOR2_DEFFAULT = 16777215; // white
	
	protected static final int GRADIENT_STYLE_DEFAULT = GradientStyle.VERTICAL;			
	
	private int gradientColor1 = GRADIENT_COLOR1_DEFFAULT;
	
	private int gradientColor2 = GRADIENT_COLOR2_DEFFAULT;
	
	private int gradientStyle = GRADIENT_STYLE_DEFAULT;
	
	private static final GradientData defaultGradientData = 
		new GradientData(GRADIENT_COLOR1_DEFFAULT, GRADIENT_COLOR2_DEFFAULT, GRADIENT_STYLE_DEFAULT);
	
	
	public GradientData() {
		super();
	}
	
	public GradientData(int color1, int color2, int style) {
		gradientColor1 = color1;
		gradientColor2 = color2;
		//TEMP code: temporarily commented; replace when new notation is in place
		//if (GradientStyle.get(style) != null) {
			gradientStyle = style;
		//}
	}
	
	public GradientData(GradientData data) {
		if (data != null) {
			gradientColor1 = data.getGradientColor1();
			gradientColor2 = data.getGradientColor2();
			gradientStyle = data.getGradientStyle();
		}
	}
	
	public static GradientData getDefaultGradientData() {
		return defaultGradientData;
	}
		
	/**
	 * @return the gradientColor1
	 */
	public int getGradientColor1() {
		return gradientColor1;
	}

	/**
	 * @param gradientColor1 the gradientColor1 to set
	 */
	public void setGradientColor1(int gradientColor1) {
		this.gradientColor1 = gradientColor1;
	}

	/**
	 * @return the gradientColor2
	 */
	public int getGradientColor2() {
		return gradientColor2;
	}

	/**
	 * @param gradientColor2 the gradientColor2 to set
	 */
	public void setGradientColor2(int gradientColor2) {
		this.gradientColor2 = gradientColor2;
	}

	/**
	 * @return the gradientStyle true is for vertical, false is for horizontal
	 */
	public int getGradientStyle() {
		return gradientStyle;
	}

	/**
	 * @param gradientStyle the gradientStyle to set. true is for vertical, false is for horizontal 
	 */
	public void setGradientStyle(int gradientStyle) {
		//TEMP code: temporarily commented; replace when new notation is in place 
		//if (GradientStyle.get(gradientStyle) != null) {
			this.gradientStyle = gradientStyle;
		//}
	}
		
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (gradientColor1: "); //$NON-NLS-1$
		result.append(gradientColor1);
		result.append(", gradientColor2: ");
		result.append(gradientColor2);
		result.append(", gradientStyle: ");
		result.append(gradientStyle);
		result.append(')');
		return result.toString();
	}
}

