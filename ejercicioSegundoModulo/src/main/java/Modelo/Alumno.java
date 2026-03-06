//Ferdynand Monroy Marzo 2026
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ferito
 */
public class Alumno {
    private int CodigoAlumno;
    private String NombreAlumno;
    private String DireAlumno;
    private String EstatusAlumno;

    public Alumno() {
    }

    public Alumno(String NombreAlumno, String DireAlumno, String EstatusAlumno) {
        this.NombreAlumno = NombreAlumno;
        this.DireAlumno = DireAlumno;
        this.EstatusAlumno = EstatusAlumno;
    }

    public int getCodigoAlumno() {
        return CodigoAlumno;
    }

    public void setCodigoAlumno(int CodigoAlumno) {
        this.CodigoAlumno = CodigoAlumno;
    }

    public String getNombreAlumno() {
        return NombreAlumno;
    }

    public void setNombreAlumno(String NombreAlumno) {
        this.NombreAlumno = NombreAlumno;
    }

    public String getDireAlumno() {
        return DireAlumno;
    }

    public void setDireAlumno(String DireAlumno) {
        this.DireAlumno = DireAlumno;
    }

    public String getEstatusAlumno() {
        return EstatusAlumno;
    }

    public void setEstatusAlumno(String EstatusAlumno) {
        this.EstatusAlumno = EstatusAlumno;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "CodigoAlumno=" + CodigoAlumno +
                ", NombreAlumno=" + NombreAlumno +
                ", DireAlumno=" + DireAlumno +
                ", EstatusAlumno=" + EstatusAlumno +
                '}';
    }   
}
