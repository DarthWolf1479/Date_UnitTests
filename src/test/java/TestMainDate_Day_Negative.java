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
public class TestMainDate_Day_Negative {

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
        obj.add(new Object[]{35,"Enero",2018, "36/Enero/2018"});
        obj.add(new Object[]{-5,"Enero",2018, "-4/Enero/2018"});
        return obj;
    }

    private int d,a;
    private String m, exp;
    public TestMainDate_Day_Negative(int d, String m, int a, String exp){
        this.d = d;
        this.m = m;
        this.a = a;
        this.exp = exp;
    }

    @Test
    public void dateTest(){
        System.out.println("test date day -");
        String act = date.sumaDia(this.d, this.m, this.a);
        Assert.assertEquals("ERROR",exp, act);
    }


}
