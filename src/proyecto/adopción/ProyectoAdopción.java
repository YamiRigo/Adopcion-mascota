/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.adopción;

import proyecto.adopción.Perros;
import proyecto.adopción.Persona;
/**
 *
 * @author yamila
 */
public class ProyectoAdopción {

    
    public static void main(String[] args) {
       Perros m1 = new Perros("Loki", "Mestizo", 6, "Mediano");
       Perros m2 = new Perros("Tomas", "Dogo", 8, "Grande");
        
       Persona p1=new Persona("Cristian", "Condori", 25, 39086894, m2);
       Persona p2=new Persona("Lucia", "Sanchez", 23, 40764908, m1);
        
       System.out.println(p1.toString());
       System.out.println(p2.toString());
    }   

}
    

