//Ferdynand Monroy marzo 2026
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosegundomodulo;
import Controlador.AlumnoDAO;
import Modelo.Alumno;
import Vista.FormAlumno;
import Controlador.JornadaDAO;
import Modelo.Jornada;
/**
 *
 * @author ferito
 */
public class EjercicioSegundoModulo { //aquí se encuentra la vista Principal
    public static void main(String[] args) {
    //esto corre la ventana FormAlumno
    FormAlumno formulario = new FormAlumno();
    formulario.setVisible(true);    
    
    AlumnoDAO alumnodao = new AlumnoDAO();

    //INSERT
    //Alumno alumno = new Alumno("Carlos", "Zona 12", "Activo");
    //alumnodao.insert(alumno);

    //QUERY que lee al alumno
    Alumno alumnoBuscar = new Alumno();
    alumnoBuscar.setCodigoAlumno(1);
    alumnoBuscar = alumnodao.query(alumnoBuscar);
    System.out.println(alumnoBuscar);

    //UPDATE
    //Alumno alumnoActualizar = new Alumno("Anthony", "Zona 1", "Inactivo");
    //alumnoActualizar.setCodigoAlumno(4);
    //alumnodao.update(alumnoActualizar);

    //DELETE
    //Alumno alumnoEliminar = new Alumno();
    //alumnoEliminar.setCodigoAlumno(4);
    //alumnodao.delete(alumnoEliminar);
       
    //nuevo CRUD para jornada
    JornadaDAO jornadadao = new JornadaDAO();

        // INSERT
        Jornada jornada = new Jornada("Matutina");
        jornadadao.insert(jornada);

        // QUERY
        Jornada jornadaBuscar = new Jornada();
        jornadaBuscar.setCodigoJornada(1);
        jornadaBuscar = jornadadao.query(jornadaBuscar);
        System.out.println(jornadaBuscar);

        // UPDATE
        //Jornada jornadaActualizar = new Jornada("Vespertina");
        //jornadaActualizar.setCodigoJornada(2);
        //jornadadao.update(jornadaActualizar);

        // DELETE
        //Jornada jornadaEliminar = new Jornada();
        //jornadaEliminar.setCodigoJornada(3);
        //jornadadao.delete(jornadaEliminar);
    }
    
}
