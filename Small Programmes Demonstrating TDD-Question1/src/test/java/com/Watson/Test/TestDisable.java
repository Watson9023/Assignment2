package com.Watson.Test;
import Watson.runDisable;
import org.junit.*;
import junit.framework.Assert;

/**
 * Created by Long on 3/17/2017.
 */
public class TestDisable {
    private boolean runTest = false;
    private runDisable rd = new runDisable();

    @Test @Ignore
    public void divisionTest() throws Exception
    {
        try {
            rd.divide();
            runTest = true;
        }catch (Exception e)
        {

        }
    }

    @After
    public void testDisabled() throws Exception {
        //Assert.assertFalse(runTest);
        org.junit.Assert.assertTrue(runTest);

    }

}
