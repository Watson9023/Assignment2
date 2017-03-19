
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Long on 3/17/2017.
 */
public class TestNonNullNess {

    NonNullNess y;
    @Before
    public void arrange() throws Exception {

        y = new NonNullNess();

    }

    @After
    public void breakDownWard() throws Exception {


    }

    @Test
    public void testSurname() throws Exception {

        Assert.assertNotNull(y.intergers());

    }


}
