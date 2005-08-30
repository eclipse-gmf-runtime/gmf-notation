/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2004.  All Rights Reserved.                    |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package org.eclipse.gmf.runtime.notation.stylepooling;

import java.util.HashMap;


/**
 * The container type used by the cached styles as part of the style caching performance tuning optimization.
 * Consider having a threshold and when we reach a threshold
 * we could remove infrequently accessed styles, by ovveriding
 * get to increment a cache hit cnt when get succeeds.
 *  
 * 	Remember if we are to use a weakHash the key is weak not the value.
 * 
 * @author affrantz@us.ibm.com
 *
 */
public class StylePoolContainer extends HashMap {



	
	public StylePoolContainer()
	{
		super();
	}
	
	/**
	 * @see java.util.Map#put(java.lang.Object, java.lang.Object)
	 */
	public Object put(Object key, Object value) {
		return super.put(key, value);
	}
}
