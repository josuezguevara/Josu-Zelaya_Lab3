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
public class Carro {
    private int serie;
    private Date fecha;
    private Color color;
    private String marca_llantas;
    private String polarizado;
    private int velocidad_max;
    private int km_galon;
    private int precio_venta;

    public Carro() {
    }

    public Carro(int serie, Date fecha, Color color, String marca_llantas, String polarizado, int velocidad_max, int km_galon, int precio_venta) {
        this.serie = serie;
        this.fecha = fecha;
        this.color = color;
        this.marca_llantas = marca_llantas;
        this.polarizado = polarizado;
        this.velocidad_max = velocidad_max;
        this.km_galon = km_galon;
        this.precio_venta = precio_venta;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMarca_llantas() {
        return marca_llantas;
    }

    public void setMarca_llantas(String marca_llantas) {
        this.marca_llantas = marca_llantas;
    }

    public String getPolarizado() {
        return polarizado;
    }

    public void setPolarizado(String polarizado) {
        this.polarizado = polarizado;
    }

    public int getVelocidad_max() {
        return velocidad_max;
    }

    public void setVelocidad_max(int velocidad_max) {
        this.velocidad_max = velocidad_max;
    }

    public int getKm_galon() {
        return km_galon;
    }

    public void setKm_galon(int km_galon) {
        this.km_galon = km_galon;
    }

    public int getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(int precio_venta) {
        this.precio_venta = precio_venta;
    }

    @Override
    public String toString() {
        return "Carro{" + "serie=" + serie + ", fecha=" + fecha + ", color=" + color + ", marca_llantas=" + marca_llantas + ", polarizado=" + polarizado + ", velocidad_max=" + velocidad_max + ", km_galon=" + km_galon + ", precio_venta=" + precio_venta + '}';
    }
    
}
