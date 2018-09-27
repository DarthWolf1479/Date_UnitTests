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
public class TestMainDate {

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
        //obj.add(new Object[]{25,"enero",1998, "26/enero/1998"});
        //obj.add(new Object[]{28,"febrero",2020, "29/febrero/2020"});
        obj.add(new Object[]{32,"gg",2019, "IllegalArgumentException()"});
        //obj.add(new Object[]{31,"marzo",2019, "1/abril/2019"});
        //obj.add(new Object[]{30,"septiembre",2018, "1/octubre/2018"});
        return obj;
    }

    private int d,a;
    private String m, exp;
    public TestMainDate(int d, String m, int a, String exp){
        this.d = d;
        this.m = m;
        this.a = a;
        this.exp = exp;
    }
/*
    @Test
    public void dateTest(){
        System.out.println("test date");
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
