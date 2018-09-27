/**
 * Created by Adolfo on 24/09/2018.
 */
public class Calculadora {
    private int ultimoResultado;

    public int sumar(int a, int b){
        ultimoResultado = a+b;
        return ultimoResultado;
    }

    public int resta(int a, int b){
        ultimoResultado = a-b;
        return ultimoResultado;
    }

    public int multi(int a, int b){
        ultimoResultado = a*b;
        return ultimoResultado;
    }

    public int div(int a, int b) {
        if(b == 0){
            throw new ArithmeticException("No permite division entre 0");
        }
        ultimoResultado = a / b;
        return ultimoResultado;
    }

    public void clear(){
        ultimoResultado = 0;
    }
}
