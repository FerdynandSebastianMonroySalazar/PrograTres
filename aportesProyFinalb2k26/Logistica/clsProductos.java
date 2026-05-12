//Ferdynand Monroy abril 2026
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Logistica;

/**
 *
 * @author ferito
 */
public class clsProductos {
    private int Prodid;
    private String Prodnombre;
    private int Prodpuntoreorden;
    
    //constructor vacio
    public clsProductos(){
    }

    //constructor con parametros
    public clsProductos(int Prodid, String Prodnombre, int Prodpuntoreorden) {
        this.Prodid = Prodid;
        this.Prodnombre = Prodnombre;
        this.Prodpuntoreorden = Prodpuntoreorden;
    }
    //getters y setters
    public int getProdid() {
        return Prodid;
    }

    public void setProdid(int Prodid) {
        this.Prodid = Prodid;
    }

    public String getProdnombre() {
        return Prodnombre;
    }

    public void setProdnombre(String Prodnombre) {
        this.Prodnombre = Prodnombre;
    }

    public int getProdpuntoreorden() {
        return Prodpuntoreorden;
    }

    public void setProdpuntoreorden(int Prodpuntoreorden) {
        this.Prodpuntoreorden = Prodpuntoreorden;
    }

    @Override
    public String toString() {
        return "clsProductos{" + "Prodid=" + Prodid + ", Prodnombre=" + Prodnombre + ", Prodpuntoreorden=" + Prodpuntoreorden + '}';
    }
   
}
