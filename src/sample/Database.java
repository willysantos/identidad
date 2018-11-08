package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    static private Database instancia;
    private Connection conexion;
    private Database(){}

    public Connection getConexion() {
        return conexion;
    }

    public static Database  getInstancia() {
        if (instancia == null) {
            instancia = new Database();
            try {
                instancia.conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/identidades",
                        "root", "w1234567890d");
                System.out.print("se conecto");
            } catch (SQLException e) {
                System.err.println("La conexion fallo : " + e.getMessage());
            }
        }
        return instancia;
    }
}