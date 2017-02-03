/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josuezelaya_lab3;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author usuario
 */
public class Fisker_Automotive extends Carro {

    private String tipo;
    private String convertible;

    public Fisker_Automotive() {
        super();
    }


    public Fisker_Automotive(String tipo, String convertible, int serie, Date fecha, Color color, String marca_llantas, String polarizado, double velocidad_max, double km_galon, double precio_venta) {
        super(serie, fecha, color, marca_llantas, polarizado, velocidad_max, km_galon, precio_venta);
        this.tipo = tipo;
        this.convertible = convertible;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getConvertible() {
        return convertible;
    }

    public void setConvertible(String convertible) {
        this.convertible = convertible;
    }

    @Override
    public String toString() {
        return super.toString() + "Fisker_Automotive{" + "tipo=" + tipo + ", convertible=" + convertible + '}';
    }

}
