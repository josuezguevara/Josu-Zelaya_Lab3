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
    private double velocidad_max;
    private double km_galon;
    private double precio_venta;

    public Carro() {
    }

    public Carro(int serie, Date fecha, Color color, String marca_llantas, String polarizado, double velocidad_max, double km_galon, double precio_venta) {
        this.serie = serie;
        this.fecha = fecha;
        this.color = color;
        this.marca_llantas = marca_llantas;
        this.polarizado = polarizado;
        this.velocidad_max = velocidad_max;
        this.km_galon = km_galon;
        this.precio_venta = precio_venta;
    }

    public double getSerie() {
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

    public double getVelocidad_max() {
        return velocidad_max;
    }

    public void setVelocidad_max(double velocidad_max) {
        this.velocidad_max = velocidad_max;
    }

    public double getKm_galon() {
        return km_galon;
    }

    public void setKm_galon(double km_galon) {
        this.km_galon = km_galon;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    @Override
    public String toString() {
        return "Carro{" + "serie=" + serie + ", fecha=" + fecha + ", color=" + color + ", marca_llantas=" + marca_llantas + ", polarizado=" + polarizado + ", velocidad_max=" + velocidad_max + ", km_galon=" + km_galon + ", precio_venta=" + precio_venta + '}';
    }
    
}
