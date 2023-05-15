/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploequipo;

/**
 *
 * @author Jaime
 */
public class Directivo extends Persona{
    private String cargo;

    public Directivo(String cargo, String cedula, String nombres, String apellidos) {
        super(cedula, nombres, apellidos);
        this.cargo = cargo;
    }
    public void mostrar(){
        super.mostrarPersona();
        System.out.println("Cargo: "+cargo);
    }
    
    
}
