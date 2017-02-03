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
public class Morgan_Aero8 extends Carro {

    private String convertible;
    private String cabina;

    public Morgan_Aero8() {
        super();
    }

    
    public Morgan_Aero8(String convertible, String cabina, int serie, Date fecha, Color color, String marca_llantas, String polarizado, int velocidad_max, int km_galon, int precio_venta) {
        super(serie, fecha, color, marca_llantas, polarizado, velocidad_max, km_galon, precio_venta);
        this.convertible = convertible;
        this.cabina = cabina;
    }

    public String getConvertible() {
        return convertible;
    }

    public void setConvertible(String convertible) {
        this.convertible = convertible;
    }

    public String getCabina() {
        return cabina;
    }

    public void setCabina(String cabina) {
        this.cabina = cabina;
    }

    @Override
    public String toString() {
        return super.toString() + "Morgan_Aero8{" + "convertible=" + convertible + ", cabina=" + cabina + '}';
    }

}
