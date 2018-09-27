import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Adolfo on 25/09/2018.
 */
@RunWith(value = Parameterized.class)
public class TestParameter {

    Calculadora calculadora;

    @Before
    public void before(){
        System.out.println("before");
        calculadora = new Calculadora();
    }

    @After
    public void after(){
        System.out.println("after");
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getData(){

        List<Object[]> obj = new ArrayList<Object[]>();
        obj.add(new Object[]{1,1,2});
        obj.add(new Object[]{2,2,4});
        obj.add(new Object[]{1,4,5});

        return obj;
    }

    private int a,b,exp;
    public TestParameter(int a, int b, int exp){
        this.a = a;
        this.b = b;
        this.exp = exp;
    }

    @Test
    public void sumaTest(){
        System.out.println("test suma");
        int act = calculadora.sumar(this.a, this.b);
        Assert.assertEquals("ERROR", this.exp, act);
    }

    //Ejecuta 3 veces la suma
}
