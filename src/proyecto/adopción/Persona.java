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
public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer dni;
    private Perros mascota;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, Integer dni, Perros mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.mascota = mascota;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Perros getMascota() {
        return mascota;
    }

    public void setMascota(Perros mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre = " + nombre + ", apellido = " + apellido + ", edad = " + edad + ", dni = " + dni + ", mascota = " + mascota + '}';
    }


}
