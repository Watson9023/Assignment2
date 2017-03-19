
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Long on 3/17/2017.
 */
public class TestObjectEquality {

    private ObjectEquality Wat;

    @Before
    public void Arrange() throws Exception {
        Wat = new ObjectEquality();
    }

    @After
    public void breakDownWard() throws Exception {

    }

    @Test
    public void testObjects(){
        String var = Wat.name1();
        String hisName = Wat.name2();

        Assert.assertEquals(var,hisName);

    }

}
