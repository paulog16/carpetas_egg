/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenar.por.nombre;

/**
 *
 * @author pguid
 */
public class Productos {
  private String productosNombre;
private Double precios;

    public Productos(String productosNombre, Double precios) {
        this.productosNombre = productosNombre;
        this.precios = precios;
    }

    public Productos() {
    }

    public String getProductosNombre() {
        return productosNombre;
    }

    public void setProductosNombre(String productosNombre) {
        this.productosNombre = productosNombre;
    }

    public Double getPrecios() {
        return precios;
    }

    public void setPrecios(Double precios) {
        this.precios = precios;
    }

    @Override
    public String toString() {
        return "Productos{" + "productosNombre=" + productosNombre + ", precios=" + precios + '}';
    }
 

  
  
}
