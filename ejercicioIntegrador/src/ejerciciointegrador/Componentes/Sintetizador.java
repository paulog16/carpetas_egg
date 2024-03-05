/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointegrador.Componentes;

/**
 *
 * @author pguid
 */
public class Sintetizador extends Componente{

    public Sintetizador() {
    }

    public Sintetizador(int consumoenergetico) {
        super(consumoenergetico);
    }

  

    @Override
    public int usar(int intensidad, int tiempo) {
         int gastoEnergetico=0;
       gastoEnergetico=intensidad*tiempo;
       return gastoEnergetico;
    }
    
}
