/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploequipo;

/**
 *
 * @author Jaime
 */
public class Utileria extends Persona {
    private String ocupacion;

    public Utileria(String ocupacion, String cedula, String nombres, String apellidos) {
        super(cedula, nombres, apellidos);
        this.ocupacion = ocupacion;
    }
    
    public void mostrar(){
        super.mostrarPersona();
        System.out.println("OCUPACION:"+ocupacion);
    }
    
    
}
