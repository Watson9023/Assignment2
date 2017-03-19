package com.Watson.Test;

import Watson.runExceptions;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by Long on 3/17/2017.
 */
public class TestExceptions extends TestCase {

    private runExceptions re;
    private boolean thrown = false;
    public void testException() throws Exception {
        try {
            re = new runExceptions();
            re.divideByZero();
            fail("Exception not thrown");

        }catch (Exception e)
        {
            thrown = true;
        }
        org.junit.Assert.assertTrue(thrown);
       // Assert.assertTrue(thrown);
    }
}
