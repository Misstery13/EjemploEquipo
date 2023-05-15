/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploequipo;

import java.util.ArrayList;

/**
 *
 * @author Jaime
 */
public class Equipo {

    private String nombreEq;
    private String ciudad;
    private String estado;
    private ArrayList<Utileria> personalutileria = new ArrayList<Utileria>();
    private ArrayList<Directivo> directivos = new ArrayList<Directivo>();
    private ArrayList<Tecnico> tecnicos = new ArrayList<Tecnico>();
    private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    //  private ArrayList<Utileria>personal;

    public Equipo(String nombreEq, String ciudad, String estado) {
        this.nombreEq = nombreEq;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    public String getNombreEq() {
        return nombreEq;
    }

    public void setNombreEq(String nombreEq) {
        this.nombreEq = nombreEq;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Utileria> getPersonalutileria() {
        return personalutileria;
    }

    public void setPersonalutileria(ArrayList<Utileria> personalutileria) {
        this.personalutileria = personalutileria;
    }

    public ArrayList<Directivo> getDirectivos() {
        return directivos;
    }

    public void setDirectivos(ArrayList<Directivo> directivos) {
        this.directivos = directivos;
    }

    public ArrayList<Tecnico> getTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(ArrayList<Tecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    /*
    public void addPesinalUtileria(Utileria objPU){
        this.personalutileria.add(objPU);
    }*/

    public void mostrarPersonalU() {
        System.out.println("***PERSONAL DE UTILERIA*****");
        for (int i = 0; i < personalutileria.size(); i++) {
            personalutileria.get(i).mostrar();
        }
    }

    public void mostrarDirectivos() {
        System.out.println("***PERSONAL DIRECTIVOS*****");
        for (int i = 0; i < directivos.size(); i++) {
            directivos.get(i).mostrar();
        }
    }

    public void mostrarTecnico() {
        System.out.println("***PERSONAL TECNICO*****");
        for (int i = 0; i < tecnicos.size(); i++) {
            tecnicos.get(i).mostrar();
        }
    }

    public void mostrarJugadores() {
        System.out.println("***PERSONAL JUGADORES*****");
        for (int i = 0; i < jugadores.size(); i++) {
            jugadores.get(i).mostrar();
        }
    }

}
