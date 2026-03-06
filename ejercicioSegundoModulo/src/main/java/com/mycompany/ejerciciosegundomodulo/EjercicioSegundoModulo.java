//Ferdynand Monroy marzo 2026
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosegundomodulo;
import Controlador.AlumnoDAO;
import Modelo.Alumno;
import Vista.FormAlumno;
/**
 *
 * @author ferito
 */
public class EjercicioSegundoModulo { //aquí se encuentra Principal
    public static void main(String[] args) {
    //esto corre la venta FormAlumno
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
    }
}
