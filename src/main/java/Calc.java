/**
 * Created by Adolfo on 24/09/2018.
 */
public class Calc {

    public static int suma(int a, int b){
        return a + b;
    }

    public static int resta(int a, int b){
        return a - b;
    }

    public static void main(String []args){
        int esperado = 10;
        if(suma(5, 5) == 10){
            System.out.print("Suma Correcta");
        }else{
            System.out.print("Suma Incorrecta");
        }
    }
}
