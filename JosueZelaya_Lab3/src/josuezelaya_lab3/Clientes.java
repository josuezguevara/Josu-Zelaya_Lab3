/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josuezelaya_lab3;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Clientes extends Personas{
    private int dinero;
    private ArrayList<Carro> carros=new ArrayList();

    public Clientes() {
        super();
    }

    public Clientes(int dinero, String nombre, double id, double edad, double altura, double peso) {
        super(nombre, id, edad, altura, peso);
        this.dinero = dinero;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }

    @Override
    public String toString() {
        return super.toString()+ "Clientes{" + "dinero=" + dinero + ", carros=" + carros + '}';
    }
    
}
