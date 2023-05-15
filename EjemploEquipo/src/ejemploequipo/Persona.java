/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploequipo;

/**
 *
 * @author Jaime
 */
public class Persona {

    private String cedula;
    private String nombres;
    private String apellidos;

    public Persona() {
    }

    public Persona(String cedula, String nombres, String apellidos) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void mostrarPersona() {
        System.out.println("CEDULA:" + cedula);
        System.out.println("NOMBRES:" + nombres);
        System.out.println("APELLIDOS:" + apellidos);
    }

}
