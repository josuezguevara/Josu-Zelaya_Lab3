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
    private int peso;
    private int transmision;

    public Tramontana() {
        super();
    }

   
    public Tramontana(int peso, int transmision, int serie, Date fecha, Color color, String marca_llantas, String polarizado, int velocidad_max, int km_galon, int precio_venta) {
        super(serie, fecha, color, marca_llantas, polarizado, velocidad_max, km_galon, precio_venta);
        this.peso = peso;
        this.transmision= transmision;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        if (peso>=1276 && peso<=1376){
            this.peso = peso;
        }
        
    }

    public int getTransmision() {
        return transmision;
    }

    public void setTransmision(int transmision) {
        if (transmision>=6 && transmision<=7){
            this.transmision = transmision;
        }
        
    }

    @Override
    public String toString() {
        return "Tramontana{" + "peso=" + peso + ", transmision=" + transmision + '}';
    }
    
    
}
