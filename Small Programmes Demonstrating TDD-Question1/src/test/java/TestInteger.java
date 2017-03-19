/**
 * Created by Watson on 3/16/2017.
 */
import org.junit.Assert;
import org.junit.Test;

public class TestInteger
{
    Intergers fg = new Intergers();

    @Test(timeout =100)
    public void testAdd() throws Exception {


        int var = fg.addIntegers(5,5);

        Assert.assertEquals(10,var);

    }
}
