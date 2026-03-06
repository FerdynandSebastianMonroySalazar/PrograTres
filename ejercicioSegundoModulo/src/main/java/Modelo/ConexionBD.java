//Ferdynand Monroy Marzo 2026
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author ferito
 */
public class ConexionBD { //aqui se encuentra la conexión a al base de datos en MySQL
 private static final String URL = "jdbc:mysql://localhost:3306/umg";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection conectar() {
        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.out.println("Error de conexion: " + e);
        }

        return conn;
    }   
}
