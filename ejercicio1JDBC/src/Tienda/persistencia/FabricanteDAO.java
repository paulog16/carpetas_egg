/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda.persistencia;

import Tienda.entidades.Fabricante;

/**
 *
 * @author pguid
 */
public final  class FabricanteDAO extends DAO {
    
      public void guardarFabricante(Fabricante fabricante) throws Exception{
           try {
            if (fabricante == null) {
                throw new Exception("Fabricante incorrecto");

            }
            String sql = "INSERT INTO (Codigo,nombre)"
                    + "VALUES ( " + fabricante.getCodigo() + "," + fabricante.getNombre() + ");";
                   
                 
            modificarInsertarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }
    }
      
      
//    public void modificarProducto(){
//        
//    }
//    public void eliminarProducto(){
//        
//    }
    
      
}
