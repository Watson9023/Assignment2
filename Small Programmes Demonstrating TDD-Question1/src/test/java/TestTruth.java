
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Long on 3/17/2017.
 */
public class TestTruth {

    Truth myTruth;
    @Before
    public void Arrange() throws Exception {
        myTruth = new Truth();

    }

    @After
    public void breakDownWard() throws Exception {


    }

    @Test
    public void testName() throws Exception {

        boolean age = myTruth.myAge();
        Assert.assertTrue("Is it true",age);
    }
}
