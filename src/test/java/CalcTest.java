import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Adolfo on 24/09/2018.
 */
public class CalcTest {

    @Test
    public void testSuma(){
        int expected = 10;
        int actual = Calc.suma(5,5);

        Assert.assertEquals("ERROR !!! La suma es incorrecta", expected, actual);
    }

    @Test
    public void testResta(){
        int expected = 10;
        int actual = Calc.resta(15,5);

        Assert.assertEquals("ERROR !!! La resta es incorrecta", expected, actual);
    }

}
