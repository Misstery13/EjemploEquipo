/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploequipo;

/**
 *
 * @author Jaime
 */
public class Tecnico extends Persona {
   private String nacionalidad;
   private String cargo;

    public Tecnico(String nacionalidad, String cargo, String cedula, String nombres, String apellidos) {
        super(cedula, nombres, apellidos);
        this.nacionalidad = nacionalidad;
        this.cargo = cargo;
    }
   
    public void mostrar(){
        super.mostrarPersona();
        System.out.println("NACIONALIDAD: "+nacionalidad);
        System.out.println("CARGO: "+cargo);
    }
   
}
