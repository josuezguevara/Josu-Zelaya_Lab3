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
public class Personas {
    private String nombre;
    private int id;
    private int edad;
    private int altura;
    private int peso;

    public Personas() {
    }

    public Personas(String nombre, int id, int edad, int altura, int peso) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad>=18){
            this.edad = edad;
        }
        
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if (altura>=1.55){
        this.altura = altura;
        }
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", id=" + id + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + '}';
    }

    
}
