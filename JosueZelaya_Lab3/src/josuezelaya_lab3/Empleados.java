/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josuezelaya_lab3;

/**
 *
 * @author usuario
 */
public class Empleados extends Personas {

    private int hora_trabajadas;
    private Clientes cliente;

    public Empleados() {
        super();
    }

    public Empleados(int hora_trabajadas, Clientes cliente, String nombre, double id, double edad, double altura, double peso) {
        super(nombre, id, edad, altura, peso);
        this.hora_trabajadas = hora_trabajadas;
        this.cliente = cliente;
    }

    public int getHora_trabajadas() {
        return hora_trabajadas;
    }

    public void setHora_trabajadas(int hora_trabajadas) {
        this.hora_trabajadas = hora_trabajadas;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleados{" + "hora_trabajadas=" + hora_trabajadas + ", cliente=" + cliente + '}';
    }

}
