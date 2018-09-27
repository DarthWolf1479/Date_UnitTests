import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adolfo on 26/09/2018.
 */


@RunWith(value = Parameterized.class)
public class TestMainDate_Mounth_Negative {

    MainDateShared date;

    @Before
    public void before(){
        //System.out.println("before");
        date = new MainDateShared();
    }

    @After
    public void after(){
        //System.out.println("after");
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getData(){

        List<Object[]> obj = new ArrayList<Object[]>();
        //obj.add(new Object[]{5,"gg",1998, "6/abril/1998"});
        obj.add(new Object[]{31,"DICIEMBRE",2018, "1/ENERO/2019"});
        obj.add(new Object[]{31,"marzo",2018, "1/abril/2018"});
        obj.add(new Object[]{25,"Hola",2019, "IllegalArgumentException()"});
        return obj;
    }

    private int d,a;
    private String m, exp;
    public TestMainDate_Mounth_Negative(int d, String m, int a, String exp){
        this.d = d;
        this.m = m;
        this.a = a;
        this.exp = exp;
    }

    @Test
    public void dateTest(){
        System.out.println("test date mounth -");
        String act = date.sumaDia(this.d, this.m, this.a);
        Assert.assertEquals("ERROR", this.exp, act);
    }
/*
    @Test (expected = IllegalArgumentException.class)
    public void dateTest(){
        System.out.println("test date mounth -");
        String act = date.sumaDia(this.d, this.m, this.a);
        Assert.assertEquals("ERROR", exp, act);
    }*/

}
