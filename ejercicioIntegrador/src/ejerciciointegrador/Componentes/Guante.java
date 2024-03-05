/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointegrador.Componentes;

/**
 *
 * @author pguid
 */
public class Guante  extends Componente{

    public Guante() {
    }

    public Guante(int consumoenergetico) {
        super(consumoenergetico);
    }

  
    @Override
    protected void asignarConsumo() {
        super.asignarConsumo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    @Override
  public int usar(int intensidad, int tiempo) {
        int gastoEnergetico=0;
       gastoEnergetico=intensidad*tiempo;
       return gastoEnergetico;
    }

    
   
    
    
}
