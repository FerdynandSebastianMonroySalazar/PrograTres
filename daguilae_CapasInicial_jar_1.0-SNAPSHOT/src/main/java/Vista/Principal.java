/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Empresa;
import Modelo.EmpresaDAO;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Soporte
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //empresa 1
        Empresa empresa = new Empresa("Universidad UPANA"); //crea el objeto
        System.out.println(empresa.toString()); //lo imprime
        EmpresaDAO empresadao = new EmpresaDAO(); //se crea el DAO
        //Empresa empresa = new Empresa();
        empresa.setCodigoEmpresa(3); //código de la empresa en la que se trabaja
        //empresadao.delete(empresa); //borra un dato de la tabla
        //empresadao.update(empresa); //actualiza los datos de la tabla
        empresa = empresadao.query(empresa);
        System.out.println(empresa.toString()); //para imprimir el objeto
        //empresadao.insert(empresa); //crea la base de datos
        
        
    }
    
}
