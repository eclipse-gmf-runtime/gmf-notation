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

/**
 * @author affrantz@us.ibm.com
 * used internally to probe memory usage
 */
public class ShapeProfiler {


    private final Runtime s_runtime = Runtime.getRuntime ();
	long startMemory = 0;
	long endMemory = 0;
	long startTime = 0;
	long endTime = 0;
			
	private long usedMemory()
    {
        return s_runtime.totalMemory () - s_runtime.freeMemory ();
    }
	private void runGC ()// throws Exception
    {
        // It helps to call Runtime.gc()
		for (int r = 0; r < 4; ++ r) s_runtime.gc ();
    }

   
	private void initProfile()
	{
		startMemory = 0;
		endMemory = 0;
		startTime = 0;
		endTime = 0;
	}

    public void profileStart()
	{
		initProfile();
        runGC();
        startMemory = usedMemory();
        startTime = System.currentTimeMillis();

	}
    public void profileEnd()
	{
        endTime = System.currentTimeMillis();

        runGC();
        endMemory = usedMemory();

	}
    public void printStats()
	{
        long difference = ( endMemory -  startMemory );
        long timeDiff = ( endTime -  startTime);


        System.out.println( "bytes=" + //$NON-NLS-1$
        	difference + 
			"	tim ms=" + timeDiff);//$NON-NLS-1$
	}


   

}


