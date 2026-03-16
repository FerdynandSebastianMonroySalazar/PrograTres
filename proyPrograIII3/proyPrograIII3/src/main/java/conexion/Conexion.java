//Ferdynand & Anthony marzo 2026
package conexion;

import java.sql.Connection;
import java.sql.DriverManager; //imports para la conexión de la BD

public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/seguridad3"; //url de nuestra BD en PHPMyAdmin
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {

        Connection conn = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (Exception e) {

            System.out.println("Error de conexion: " + e.getMessage());

        }

        return conn; //retorna la conexion

    }

}