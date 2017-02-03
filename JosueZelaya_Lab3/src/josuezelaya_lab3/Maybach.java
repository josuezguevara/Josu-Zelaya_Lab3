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
public class Maybach extends Carro{
    private String llantas_respuesto;

    public Maybach() {
        super();
    }

    public Maybach(String llantas_respuesto, int serie, Date fecha, Color color, String marca_llantas, String polarizado, int velocidad_max, int km_galon, int precio_venta) {
        super(serie, fecha, color, marca_llantas, polarizado, velocidad_max, km_galon, precio_venta);
        this.llantas_respuesto = llantas_respuesto;
    }

    public String getLlantas_respuesto() {
        return llantas_respuesto;
    }

    public void setLlantas_respuesto(String llantas_respuesto) {
        this.llantas_respuesto = llantas_respuesto;
    }

    @Override
    public String toString() {
        return super.toString()+ "Maybach{" + "llantas_respuesto=" + llantas_respuesto + '}';
    }
    
    
}
