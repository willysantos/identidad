package sample;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Controller {
    public Button btnValidar;
    public TextField txtIdentidad;
public void validarIdentidad(ActionEvent actionEvent){
    String parte1;
    String parte2;
    String parte3;

    String identidad = txtIdentidad.getText();
    System.out.print("  "+identidad);
}
}
