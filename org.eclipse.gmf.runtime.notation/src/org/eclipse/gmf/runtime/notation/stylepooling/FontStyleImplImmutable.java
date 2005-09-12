/******************************************************************************
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.runtime.notation.stylepooling;



/**
 * FontStyleImplImmutable is used by FontStyleImplImmutable in order to share 
 * common data among the various  FontStyleImpl created in the notation.
 * 
 * @author affrantz@us.ibm.com
 *
 */
public class FontStyleImplImmutable extends AbstractStyleImmutable{
	public static int FONT_NONE 		= 0x00;
	public static int FONT_BOLD 		= 0x01;
	public static int FONT_ITALIC 		= 0x02;
	public static int FONT_UNDERLINE	= 0x04;
	public static int FONT_STRIKETHRU	= 0x08;

	/** Style cache */
	protected static StylePoolContainer myStylePool = new StylePoolContainer();

	
	private String theName;
	private Integer theHeight;
	private Integer theColor;
	private int theFlags;

	/**
	 * 
	 */
	private FontStyleImplImmutable()
	{
		super();
	}
	public FontStyleImplImmutable(String name, int height, int color, boolean bStrike , boolean bUnder, boolean bItalic, boolean bBold)
	{
		theName 	= name;
		theHeight	= new Integer(height);
		theColor	= new Integer(color);

		theFlags	= FontStyleImplImmutable.getFlagsAsInt(bStrike, bUnder, bItalic, bBold);
	}
	/** get a style from the cache if it exists or create one if it does not*/
	static public FontStyleImplImmutable getFontStyle(String sNm, int height, int color, boolean bStrike , boolean bUnder, boolean bItalic, boolean bBold)
	{
		Integer myKey = new Integer(FontStyleImplImmutable.getFontKey(sNm, height, color,  bStrike ,  bUnder,  bItalic,  bBold));
		
		if(myStylePool.containsKey(myKey))
		{
			return ((FontStyleImplImmutable) myStylePool.get(myKey));
			
		}
		else
		{
			
			FontStyleImplImmutable myValue = new FontStyleImplImmutable(sNm, height, color, bStrike, bUnder, bItalic, bBold);
			myStylePool.put(myKey, myValue);
			return myValue;
		}		
	}
	/**
	 * @param name
	 * @param height
	 * @param color
	 * @param flags
	 * @return
	 */
	static public int getFontKey(String name, int height, int color, boolean bStrike , boolean bUnder, boolean bItalic, boolean bBold)
	{
		int flags = getFlagsAsInt(bStrike , bUnder, bItalic, bBold);
		StringBuffer theBuffer = new StringBuffer();
		theBuffer.append(name);
		theBuffer.append(":");//$NON-NLS-1$
		theBuffer.append(height);
		theBuffer.append(":");//$NON-NLS-1$
		theBuffer.append(color);
		theBuffer.append(":");//$NON-NLS-1$
		theBuffer.append(flags);
		
		return theBuffer.toString().hashCode();
		
	}	
	static private int getFlagsAsInt(boolean bStrike , boolean bUnder, boolean bItalic, boolean bBold)
	{
		int myInt = FontStyleImplImmutable.FONT_NONE;
		if(bStrike) myInt|=FontStyleImplImmutable.FONT_STRIKETHRU;
		if(bUnder) myInt|=FontStyleImplImmutable.FONT_UNDERLINE;
		if(bItalic) myInt|=FontStyleImplImmutable.FONT_ITALIC;
		if(bBold) myInt|=FontStyleImplImmutable.FONT_BOLD;
		
		return myInt;
		
	}
	/**
	 * @return Returns the theColor.
	 */
	public Integer getColor() {
		return theColor;
	}
	/**
	 * @return Returns the theFlags.
	 */
	public int getTheFlags() {
		return theFlags;
	}
	/**
	 * @return Returns the theHeight.
	 */
	public Integer getHeight() {
		return theHeight;
	}
	/**
	 * @return Returns the theName.
	 */
	public String getName() {
		return theName;
	}
	public boolean getBold()
	{
		return (( (getTheFlags() & FontStyleImplImmutable.FONT_BOLD)>0) ? true : false);
	}
	public boolean getItalic()
	{
		return (( (getTheFlags() & FontStyleImplImmutable.FONT_ITALIC)>0) ? true : false);
	}
	public boolean getUnderline()
	{
		return (((getTheFlags() & FontStyleImplImmutable.FONT_UNDERLINE)>0) ? true : false);
	}
	public boolean getStrikethru()
	{
		return (((getTheFlags() & FontStyleImplImmutable.FONT_STRIKETHRU)>0) ? true : false);
	}    
	  

}
