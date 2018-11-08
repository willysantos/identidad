package sample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Validardepto {
    public static String repuesta;
    public static String validar(String identidad){
        Connection con = Database.getInstancia().getConexion();

        try {
            Statement sentencia = con.createStatement();
            String demu;
            String city, name;
            demu = identidad.substring(0,4);
            String sql = "select identidad.ciudad, departamentos.nombre, departamentos.validacion from identidad"+
                    " inner join departamentos on departamentos.id_depto = identidad.depto"+
                    " where identidad.cod = " + demu;
            ResultSet resultado = sentencia.executeQuery(sql);
            if (resultado.next()){
                city = resultado.getString("ciudad");
                name = resultado.getString("nombre");
                repuesta = "Esta identidad pertenece al municipio: "+city+
                        ", y al departemento: "+name;
            }else{
                repuesta = "Los primeros 4 digitos no son validos";
            }


        }catch (Exception e){
            System.out.print("Algo fallo");
        }
        return repuesta;
    }
}
