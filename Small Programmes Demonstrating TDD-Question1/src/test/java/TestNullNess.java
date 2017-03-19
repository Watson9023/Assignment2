
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Long on 3/17/2017.
 */
public class TestNullNess {

        NullNess Wat;

        @Before
        public void setUp() throws Exception {
            Wat = new NullNess();
        }

        @After
        public void tearDown() throws Exception {

        }

        @Test
        public void testName() throws Exception {

            String Wendy = Wat.Names();

            Assert.assertNull("Watson",Wendy);

        }
}
