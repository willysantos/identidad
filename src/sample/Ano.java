package sample;

import java.time.LocalDate;
import java.util.Calendar;

public class Ano {
    public static String resultado;
    public static String ano(String identidad){
        Calendar cal= Calendar.getInstance();
        int year= cal.get(Calendar.YEAR);
        int anio = Integer.parseInt(identidad.substring(4,8));
        if (anio > year){
            resultado = "El anio de la identidad no es valido";
            return resultado;
        }else{

            return "El anio de la identidad es valido";
        }

    }

}
