import org.junit.Assert;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

/**
 * Created by Long on 3/17/2017.
 */
public class TestObjectIdentity {

    ObjectIdentity myObject;
    @Before
    public void Arrange() throws Exception {

        myObject = new ObjectIdentity();
    }

    @After
    public void breakDownWard() throws Exception {


    }

    @Test
    public void testName() throws Exception {

        Assert.assertNotSame(myObject.objectA(),myObject.objectB());
    }
}
