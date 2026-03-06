//Ferdynand Monroy marzo 2026
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.Alumno;
import Modelo.ConexionBD;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ferito
 */
public class AlumnoDAO { //aqui se encuentra el CRUD para la tabla en MySQL
  private static final String SQL_SELECT =
            "SELECT CodigoAlumno, NombreAlumno, DireAlumno, EstatusAlumno FROM alumno";

    private static final String SQL_INSERT =
            "INSERT INTO alumno(NombreAlumno, DireAlumno, EstatusAlumno) VALUES(?,?,?)";

    private static final String SQL_UPDATE =
            "UPDATE alumno SET NombreAlumno=?, DireAlumno=?, EstatusAlumno=? WHERE CodigoAlumno=?";

    private static final String SQL_DELETE =
            "DELETE FROM alumno WHERE CodigoAlumno=?";

    private static final String SQL_QUERY =
            "SELECT CodigoAlumno, NombreAlumno, DireAlumno, EstatusAlumno FROM alumno WHERE CodigoAlumno=?";

    public List<Alumno> select() {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Alumno alumno = null;
        List<Alumno> alumnos = new ArrayList<>();

        try {

            conn = ConexionBD.conectar();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {

                int codigo = rs.getInt("CodigoAlumno");
                String nombre = rs.getString("NombreAlumno");
                String direccion = rs.getString("DireAlumno");
                String estatus = rs.getString("EstatusAlumno");

                alumno = new Alumno();
                alumno.setCodigoAlumno(codigo);
                alumno.setNombreAlumno(nombre);
                alumno.setDireAlumno(direccion);
                alumno.setEstatusAlumno(estatus);

                alumnos.add(alumno);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

        return alumnos;
    }

    public int insert(Alumno alumno) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {

            conn = ConexionBD.conectar();
            stmt = conn.prepareStatement(SQL_INSERT);

            stmt.setString(1, alumno.getNombreAlumno());
            stmt.setString(2, alumno.getDireAlumno());
            stmt.setString(3, alumno.getEstatusAlumno());

            System.out.println("Ejecutando query: " + SQL_INSERT);

            rows = stmt.executeUpdate();

            System.out.println("Registros insertados: " + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

        return rows;
    }

    public int update(Alumno alumno) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {

            conn = ConexionBD.conectar();
            stmt = conn.prepareStatement(SQL_UPDATE);

            stmt.setString(1, alumno.getNombreAlumno());
            stmt.setString(2, alumno.getDireAlumno());
            stmt.setString(3, alumno.getEstatusAlumno());
            stmt.setInt(4, alumno.getCodigoAlumno());

            System.out.println("Ejecutando query: " + SQL_UPDATE);

            rows = stmt.executeUpdate();

            System.out.println("Registros actualizados: " + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

        return rows;
    }

    public int delete(Alumno alumno) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {

            conn = ConexionBD.conectar();
            stmt = conn.prepareStatement(SQL_DELETE);

            stmt.setInt(1, alumno.getCodigoAlumno());

            System.out.println("Ejecutando query: " + SQL_DELETE);

            rows = stmt.executeUpdate();

            System.out.println("Registros eliminados: " + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

        return rows;
    }

    public Alumno query(Alumno alumno) {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {

            conn = ConexionBD.conectar();
            stmt = conn.prepareStatement(SQL_QUERY);

            stmt.setInt(1, alumno.getCodigoAlumno());

            rs = stmt.executeQuery();

            while (rs.next()) {

                int codigo = rs.getInt("CodigoAlumno");
                String nombre = rs.getString("NombreAlumno");
                String direccion = rs.getString("DireAlumno");
                String estatus = rs.getString("EstatusAlumno");

                alumno = new Alumno();

                alumno.setCodigoAlumno(codigo);
                alumno.setNombreAlumno(nombre);
                alumno.setDireAlumno(direccion);
                alumno.setEstatusAlumno(estatus);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

        return alumno;
    }    
}
