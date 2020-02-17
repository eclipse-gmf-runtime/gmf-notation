/******************************************************************************
 * Copyright (c) 2009 IBM Corporation and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation
 *    Mariot Chauvin <mariot.chauvin@obeo.fr> - Bug 270170
 ****************************************************************************/

package org.eclipse.gmf.runtime.notation.datatype;

import org.eclipse.gmf.runtime.notation.GradientStyle;


/**
 * Class defining gradient data
 * 
 * @author lgrahek
 * @since 1.2
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
		if (GradientStyle.get(style) != null) {
			gradientStyle = style;
		}
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
		result.append(", gradientColor2: "); //$NON-NLS-1$
		result.append(gradientColor2);
		result.append(", gradientStyle: "); //$NON-NLS-1$
		result.append(gradientStyle);
		result.append(')');
		return result.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + gradientColor1;
		result = prime * result + gradientColor2;
		result = prime * result + gradientStyle;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GradientData other = (GradientData) obj;
		if (gradientColor1 != other.gradientColor1)
			return false;
		if (gradientColor2 != other.gradientColor2)
			return false;
		if (gradientStyle != other.gradientStyle)
			return false;
		return true;
	}
	
	
}

