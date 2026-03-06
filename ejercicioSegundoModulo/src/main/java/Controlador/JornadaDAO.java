//Ferdyand Monroy marzo 2026
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Jornada;
import Modelo.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ferito
 */
public class JornadaDAO { //conexión de la BD 
 private static final String SQL_SELECT =
            "SELECT jor_codigo, jor_nombre FROM Jornadas";

    private static final String SQL_INSERT =
            "INSERT INTO Jornadas(jor_nombre) VALUES(?)";

    private static final String SQL_UPDATE =
            "UPDATE Jornadas SET jor_nombre=? WHERE jor_codigo=?";

    private static final String SQL_DELETE =
            "DELETE FROM Jornadas WHERE jor_codigo=?";

    private static final String SQL_QUERY =
            "SELECT jor_codigo, jor_nombre FROM Jornadas WHERE jor_codigo=?";

    public List<Jornada> select() {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Jornada jornada = null;
        List<Jornada> jornadas = new ArrayList<>();

        try {

            conn = ConexionBD.conectar();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {

                int codigo = rs.getInt("jor_codigo");
                String nombre = rs.getString("jor_nombre");

                jornada = new Jornada();
                jornada.setCodigoJornada(codigo);
                jornada.setNombreJornada(nombre);

                jornadas.add(jornada);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

        return jornadas;
    }

    public int insert(Jornada jornada) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {

            conn = ConexionBD.conectar();
            stmt = conn.prepareStatement(SQL_INSERT);

            stmt.setString(1, jornada.getNombreJornada());

            System.out.println("Ejecutando query: " + SQL_INSERT);

            rows = stmt.executeUpdate();

            System.out.println("Registros insertados: " + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

        return rows;
    }

    public int update(Jornada jornada) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {

            conn = ConexionBD.conectar();
            stmt = conn.prepareStatement(SQL_UPDATE);

            stmt.setString(1, jornada.getNombreJornada());
            stmt.setInt(2, jornada.getCodigoJornada());

            System.out.println("Ejecutando query: " + SQL_UPDATE);

            rows = stmt.executeUpdate();

            System.out.println("Registros actualizados: " + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

        return rows;
    }

    public int delete(Jornada jornada) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {

            conn = ConexionBD.conectar();
            stmt = conn.prepareStatement(SQL_DELETE);

            stmt.setInt(1, jornada.getCodigoJornada());

            System.out.println("Ejecutando query: " + SQL_DELETE);

            rows = stmt.executeUpdate();

            System.out.println("Registros eliminados: " + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

        return rows;
    }

    public Jornada query(Jornada jornada) {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {

            conn = ConexionBD.conectar();
            stmt = conn.prepareStatement(SQL_QUERY);

            stmt.setInt(1, jornada.getCodigoJornada());

            rs = stmt.executeQuery();

            if (rs.next()) {

                int codigo = rs.getInt("jor_codigo");
                String nombre = rs.getString("jor_nombre");

                jornada = new Jornada();
                jornada.setCodigoJornada(codigo);
                jornada.setNombreJornada(nombre);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

        return jornada;
    }
}
