/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploequipo;

/**
 *
 * @author Jaime
 */
public class Jugador extends Persona {
   private String posicion;
   private int edad;
   private float peso;

    public Jugador(String posicion, int edad, float peso, String cedula, String nombres, String apellidos) {
        super(cedula, nombres, apellidos);
        this.posicion = posicion;
        this.edad = edad;
        this.peso = peso;
    }
   
    public void mostrar(){
        super.mostrarPersona();
        System.out.println("POSICION: "+posicion);
        System.out.println("EDAD: "+edad);
        System.out.println("PESO:"+peso);
    }
   
}
