package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Prueba {

    public TextField txtIdentidad;
    public Button btnValidar;
    public Label lblTexto1;
    public Label lblTexto2;
    public Label lblTexto3;

    public void validarIdentidad(ActionEvent actionEvent) {

        String identidad = txtIdentidad.getText();
        if (identidad.length()==13){
            String validar = Validardepto.validar(identidad);
            String validar2 = Ano.ano(identidad);
            if ((validar == null)& (validar2==null)){
                lblTexto1.setText("Los primeros 4 digitos de la indentidad son invalidos");
                lblTexto2.setText("Los digitos del anio no son validos");
                lblTexto3.setText("En pocas palabras la identidad es invalida");
            }else{
                lblTexto1.setText(validar);
                lblTexto2.setText(validar2);
            }
        }else{
            lblTexto1.setText("El numero de identidad tiene que ser de 13 caracteres");
        }



//        Connection con = Database.getInstancia().getConexion();
//
//        try {
//            Statement sentencia = con.createStatement();
//            String demu;
//            String ano, folio, city, name;
//            int validar = 1;
//            String identidad = txtIdentidad.getText();
//            //separa los digitos
//            demu = identidad.substring(0,4);
//            ano = identidad.substring(4,8);
//            folio = identidad.substring(8,13);
//            //hace la consulta a la base de datos
//            String sql = "select identidad.ciudad, departamentos.nombre, departamentos.validacion from identidad"+
//                    " inner join departamentos on departamentos.id_depto = identidad.depto"+
//            " where identidad.cod = " + demu;
//            ResultSet resultado = sentencia.executeQuery(sql);
//            //aqui se valida los primeros 4 digitos de la identidad
//
//            if (resultado.next()){
//                city = resultado.getString("ciudad");
//                name = resultado.getString("nombre");
//
//                lblTexto1.setText("Los primeros 4 digitos de la identidad son validos");
//                lblTexto2.setText("El departamento de la identidad peretenece a: "+city);
//                lblTexto3.setText("La comunidad de la identidad pertenece a: "+name);
//
//            }else{
//                lblTexto1.setText("Los primeros 4 digitos no son validos");
//            }
//
//
//        }catch (Exception e){
//
//        }

    }
}
