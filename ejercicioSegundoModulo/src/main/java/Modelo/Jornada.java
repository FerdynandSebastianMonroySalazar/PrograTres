//Ferdynand Monroy marzo 2026
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ferito
 */
public class Jornada { //variables como los elementos y llaves de la tabla
     private int CodigoJornada;
    private String NombreJornada;

    public Jornada() {
    }

    public Jornada(String NombreJornada) {
        this.NombreJornada = NombreJornada;
    }

    public int getCodigoJornada() {
        return CodigoJornada;
    }

    public void setCodigoJornada(int CodigoJornada) {
        this.CodigoJornada = CodigoJornada;
    }

    public String getNombreJornada() {
        return NombreJornada;
    }

    public void setNombreJornada(String NombreJornada) {
        this.NombreJornada = NombreJornada;
    }

    @Override
    public String toString() {
        return "Jornada{" +
                "CodigoJornada=" + CodigoJornada +
                ", NombreJornada=" + NombreJornada +
                '}';
    }
}
