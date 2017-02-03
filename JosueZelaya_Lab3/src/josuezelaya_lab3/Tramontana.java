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
public class Tramontana extends Carro {
    private double peso;
    private double transmision;

    public Tramontana() {
        super();
    }

   
    public Tramontana(double peso, double transmision, int serie, Date fecha, Color color, String marca_llantas, String polarizado, double velocidad_max, double km_galon, double precio_venta) {
        super(serie, fecha, color, marca_llantas, polarizado, velocidad_max, km_galon, precio_venta);
        this.peso = peso;
        this.transmision= transmision;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso>=1276 && peso<=1376){
            this.peso = peso;
        }
        
    }

    public double getTransmision() {
        return transmision;
    }

    public void setTransmision(double transmision) {
        if (transmision>=6 && transmision<=7){
            this.transmision = transmision;
        }
        
    }

    @Override
    public String toString() {
        return super.toString()+"Tramontana{" + "peso=" + peso + ", transmision=" + transmision + '}';
    }
    
    
}
