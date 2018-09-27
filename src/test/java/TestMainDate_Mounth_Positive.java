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
public class TestMainDate_Mounth_Positive {

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
      /*  obj.add(new Object[]{30,"Septiembre",2018, "1/Octubre/2018"});
        obj.add(new Object[]{31,"Octubre",2018, "1/Noviembre/2018"});
        obj.add(new Object[]{28,"Febrero",2018, "1/Marzo/2018"});*/
        obj.add(new Object[]{32,"gg",2019, "IllegalArgumentException()"});
        return obj;
    }

    private int d,a;
    private String m, exp;
    public TestMainDate_Mounth_Positive(int d, String m, int a, String exp){
        this.d = d;
        this.m = m;
        this.a = a;
        this.exp = exp;
    }
/*
    @Test
    public void dateTest(){
        System.out.println("test date mounth");
        String act = date.sumaDia(this.d, this.m, this.a);
        Assert.assertEquals("ERROR", this.exp, act);
    }
*/
    @Test (expected = IllegalArgumentException.class)
    public void errorTest(){
        System.out.println("test error");
        String act = date.sumaDia(this.d, this.m, this.a);
        Assert.assertEquals("ERROR", exp, act);
    }


}
