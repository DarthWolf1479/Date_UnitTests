import junit.framework.Assert;
import org.junit.*;

/**
 * Created by Adolfo on 24/09/2018.
 */
public class CalculadoraTest {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After Class");
    }

    @Before
    public void before(){
        System.out.println("before");
        Calculadora calculadora = new Calculadora();
    }

    @After
    public void after(){
        System.out.println("after");
    }

    //@Test (timeout = 1000)
    //@Test (expected = ArithmeticException.class)
    @Test (timeout = 1000)
    public void sumaTest(){
        System.out.println("test suma");
        Calculadora calculadora = new Calculadora();
        int esp = 10;
        int act = calculadora.sumar(5, 5);
        Assert.assertEquals("ERROR",esp, act);
        calculadora.clear();
    }

    @Test
    public void restaTest(){
        System.out.println("test resta");
        Calculadora calculadora = new Calculadora();
        int esp = 0;
        int act = calculadora.resta(5, 5);
        Assert.assertEquals("ERROR",esp, act);
        calculadora.clear();
    }

    @Test
    public void multTest(){
        System.out.println("test mult");
        Calculadora calculadora = new Calculadora();
        int esp = 25;
        int act = calculadora.multi(5, 5);
        Assert.assertEquals("ERROR",esp, act);
        calculadora.clear();
    }

    @Test (expected = ArithmeticException.class)
    public void divTest(){
        System.out.println("test div");
        Calculadora calculadora = new Calculadora();
        int esp = 1;
        int act = calculadora.div(5, 0);
        Assert.assertEquals("ERROR",esp, act);
        //calculadora.clear();
    }
}
