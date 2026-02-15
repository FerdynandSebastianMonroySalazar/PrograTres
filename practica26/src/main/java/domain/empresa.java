/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author ferito
 */
public class empresa {
    int CodigoEmpresa;
    String NombreEmpresa; //atributos privados
//constructor
    public empresa (int codigo){
        CodigoEmpresa=codigo;
    }
    public empresa(int CodigoEmpresa, String NombreEmpresa) {
        this.CodigoEmpresa = CodigoEmpresa;
        this.NombreEmpresa = NombreEmpresa;
    }

    public int getCodigoEmpresa() {
        return CodigoEmpresa;
    }

    public void setCodigoEmpresa(int CodigoEmpresa) {
        this.CodigoEmpresa = CodigoEmpresa;
    }

    public String getNombreEmpresa() {
        return NombreEmpresa;
    }

    public void setNombreEmpresa(String NombreEmpresa) {
        this.NombreEmpresa = NombreEmpresa;
    }

    @Override
    public String toString() {
        return "empresa{" + "CodigoEmpresa=" + CodigoEmpresa + ", NombreEmpresa=" + NombreEmpresa + '}';
    }

    

}
