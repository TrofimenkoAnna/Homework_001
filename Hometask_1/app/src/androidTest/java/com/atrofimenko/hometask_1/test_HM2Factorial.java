package com.atrofimenko.hometask_1;

import junit.framework.TestCase;

/**
 * Created by Anna_T on 16.10.2015.
 */
public class test_HM2Factorial extends TestCase {
    public  void testFactorial() throws Exception
    {
        assertEquals(120, Homework2_Activity.factorial(5));
        assertEquals(1, Homework2_Activity.factorial(0));
    }
}
