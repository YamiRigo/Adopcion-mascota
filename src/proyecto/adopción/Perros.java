/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.adopción;

/**
 *
 * @author yamila
 */
public class Perros {
    private String nombre;
    private String raza;
    private Integer edad;
    private String tamanio;

    public Perros(String nombre, String raza, Integer edad, String tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTamano() {
        return tamanio;
    }

    public void setTamano(String tamano) {
        this.tamanio = tamano;
    }
    
    @Override
    public String toString() {
        return "Perro{" + "nombre = " + nombre + ", raza = " + raza + ", edad = " + edad + ", tamaño = " + tamanio + '}';
    }  


}
