import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Long on 3/17/2017.
 */
public class TestFailing {

        Failing fail;
        @Before
        public void Arrange() throws Exception {
            fail = new Failing();
        }

        @After
        public void breakDownWard() throws Exception {

        }

        @Test
        public void TestFailing() throws Exception {

            String answer = fail.name();
            Assert.assertNotSame("Is not the same",answer);

        }
}
