//Ferdynand Monroy marzo 2026
package domain;
//clase Aplicaciones donde se representan entidadesde la BD
//Atributos de la aplicacion y sus métodos
//getters, setters y toString
public class Aplicaciones {

    private int aplCodigo; //llave primaria de la BD
    private String aplNombre; //nombre de la aplicacion
    private String aplEstado; //estado de la aplicacion

    public Aplicaciones() { //constructor vacio
    }

    public Aplicaciones(int aplCodigo, String aplNombre, String aplEstado) { //Constructor con parámetros
        //Permite crear un objeto Aplicaciones con todos sus atributos
        this.aplCodigo = aplCodigo;
        this.aplNombre = aplNombre;
        this.aplEstado = aplEstado;
    }

    public int getAplCodigo() { //obtiene el codigo de la aplicacion
        return aplCodigo;
    }

    public void setAplCodigo(int aplCodigo) { //establece el codigo de la aplicacion
        this.aplCodigo = aplCodigo;
    }

    public String getAplNombre() { //obtiene el nombre de la aplicacion
        return aplNombre;
    }

    public void setAplNombre(String aplNombre) { //establece el nombre de la aplicacion
        this.aplNombre = aplNombre;
    }

    public String getAplEstado() { //obtiene el estado de la aplicacion
        return aplEstado;
    }

    public void setAplEstado(String aplEstado) { //establece el estado de la aplicacion
        this.aplEstado = aplEstado;
    }
@Override
    public String toString() { //método que devuelve una representación en texto del objeto
        return "Aplicaciones{" + "aplCodigo=" + aplCodigo + ", aplNombre=" + aplNombre + ", aplEstado=" + aplEstado + '}';
    }
}