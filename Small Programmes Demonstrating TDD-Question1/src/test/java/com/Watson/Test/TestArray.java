package com.Watson.Test;

import Watson.runArray;
import junit.framework.TestCase;

import java.util.Arrays;

/**
 * Created by Long on 3/17/2017.
 */
public class TestArray extends TestCase{

    runArray arr = new runArray();
    public void testArrayContent() throws Exception
    {
        assertTrue(Arrays.equals(arr.array1, arr.array2));
    }
}
