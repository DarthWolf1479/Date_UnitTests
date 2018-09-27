/**
 * Created by Adolfo on 26/09/2018.
 */
public class MainDateShared {

    public static String sumaDia(int dia, String mes, int gestion) {
        if (dia > 0 && dia < 32 && gestion > 0 || (mes == "Enero" || mes == "Febrero" || mes == "Marzo" || mes == "Abril" || mes == "Mayo" || mes == "Junio" || mes == "Julio" || mes == "Agosto" || mes == "Septiembre" || mes == "Octubre" || mes == "Noviembre" || mes == "Diciembre")) {
            int nuevoDia = dia + 1;
            if (dia == 31 && (mes == "enero" || mes == "Enero")) {
                mes = "Febrero";
                nuevoDia = 1;
            } else if ((dia == 28 && (mes == "febrero" || mes == "Febrero"))
                    || (dia == 29 && (mes == "febrero" || mes == "Febrero"))) {
                if (gestion % 4 == 0 && dia == 28 && (mes == "febrero" || mes == "Febrero")) {
                    nuevoDia = 29;
                } else {
                    nuevoDia = 1;
                    mes = "Marzo";
                }

            } else if (dia == 31 && (mes == "Marzo" || mes == "marzo")) {
                mes = "Abril";
                nuevoDia = 1;

            } else if (dia == 30 && (mes == "Abril" || mes == "abril")) {
                mes = "Mayo";
                nuevoDia = 1;
            } else if (dia == 31 && (mes == "Mayo" || mes == "mayo")) {
                mes = "Junio";
                nuevoDia = 1;
            } else if (dia == 30 && (mes == "Junio" || mes == "junio")) {
                mes = "Julio";
                nuevoDia = 1;
            } else if (dia == 31 && (mes == "Julio" || mes == "julio")) {
                mes = "Agosto";
                nuevoDia = 1;
            } else if (dia == 31 && (mes == "Agosto" || mes == "agosto")) {
                mes = "Septiembre";
                nuevoDia = 1;
            } else if (dia == 30 && (mes == "Septiembre" || mes == "septiembre")) {
                mes = "Octubre";
                nuevoDia = 1;
            } else if (dia == 31 && (mes == "Octubre" || mes == "octubre")) {
                mes = "Noviembre";
                nuevoDia = 1;
            } else if (dia == 30 && (mes == "Noviembre" || mes == "noviembre")) {
                mes = "Diciembre";
                nuevoDia = 1;
            } else if (dia == 31 && (mes == "Diciembre" || mes == "diciembre")) {
                mes = "Enero";
                nuevoDia = 1;
                gestion = gestion + 1;
            }
            return  nuevoDia + "/" + mes + "/" + gestion;
        } else {
            throw new IllegalArgumentException() ;
        }
    }


}
