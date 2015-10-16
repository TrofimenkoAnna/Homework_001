package com.atrofimenko.hometask_1;

import junit.framework.TestCase;

/**
 * Created by Anna_T on 16.10.2015.
 */
public class test_HM2Fibonacci extends TestCase {
    public void testFibonacci() throws Exception
    {
        assertEquals(8, Homework2_Activity.fibonacci(6));
        assertEquals(1, Homework2_Activity.fibonacci(2));
    }
}
