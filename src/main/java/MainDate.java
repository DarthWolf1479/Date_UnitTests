/**
 * Created by Adolfo on 25/09/2018.
 */
public class MainDate {

    public static void main(String[]args){
        MainDate x = new MainDate();
        x.sumaDia(29,"febrero",2020);
    }

    public String sumaDia(int d, String m, int a){
        if(d<1||d>31)
            return "error";
        if(a%1000==0){
            return "error";
        }
        if(!(m.equals("enero")||
                m.equals("febrero")||
                m.equals("marzo")||
                m.equals("abril")||
                m.equals("mayo")||
                m.equals("junio")||
                m.equals("julio")||
                m.equals("agosto")||
                m.equals("septiembre")||
                m.equals("octubre")||
                m.equals("noviembre")||
                m.equals("diciembre")
        ))
            return "error";
        boolean bi = (a%100)%4==0;
        //System.out.println(bi);
        if(d == 29){
            if(m.toLowerCase().equals("febrero")&&bi){
                d=1;
                m="marzo";
            }else if(m.toLowerCase().equals("febrero")&&!bi){
                return "error";
            }else{
                d++;
            }
        }else if(d==31){

            if (m.equals("enero")) {
                d = 1;
                m = "febrero";

            } else if (m.equals("marzo")) {
                d = 1;
                m = "abril";

            } else if (m.equals("mayo")) {
                d = 1;
                m = "junio";

            } else if (m.equals("julio")) {
                d = 1;
                m = "agosto";

            } else if (m.equals("agosto")) {
                d = 1;
                m = "septiembre";

            } else if (m.equals("octubre")) {
                d = 1;
                m = "noviembre";

            } else if (m.equals("diciembre")) {
                d = 1;
                m = "enero";
                a++;

            } else {
                return "error";
            }
        }else if(d==30){
            d++;
            if(m.equals("abril")) {
                d=1;
                m="mayo";
            }else if(m.equals("junio")){
                d=1;
                m="julio";
            }else if(m.equals("septiembre")) {
                d=1;
                m="octubre";
            }else if(m.equals("noviembre")){
                d=1;
                m="diciembre";
            }else if(m.equals("febrero")){
                return "error";
            }
        }else if(d<=28){
            if(m.equals("febrero")&&!bi){
                d=1;
                m="marzo";
            }else
            d++;
        }else{
            return "error";
        }
        return d+"/"+m+"/"+a;
    }


}
