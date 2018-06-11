/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;
import vista.Consulta;

/**
 *
 * @author Nelson
 */
public class Inventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
       Consulta c = new Consulta();
        c.setVisible(true);
      // FiltroDao f = new FiltroDao();
       
        /*;
        if(f.update(new Filtro(1,"90915-03001", "Fram",105 ,true)))
        {
            System.out.println("Actualizado con exito");
        }*/
      /*  ArrayList<Filtro> filtros = f.readAll();
        for(Filtro fi : filtros)
        {
            System.out.println(fi.toString());
        }
        Filtro f2 = f.read(1);
        System.out.println(f2.toString());*/
    }
    
}
