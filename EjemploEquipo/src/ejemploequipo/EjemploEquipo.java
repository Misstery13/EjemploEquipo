/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploequipo;

import java.util.ArrayList;
import java.util.Scanner;


public class EjemploEquipo {

    public static ArrayList<Equipo> equipos = new ArrayList<Equipo>();
    public static Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        // TODO code application logic here
        int op;
        do {
            op = menu();
            operaciones(op);
            System.out.println("Desea registrar otro Equipo si(1)");
            op = scan.nextInt();
        } while (op == 1);

    }

    public static int menu() {
        int respuesta;
        do {
            System.out.println("1: Registrar");
            System.out.println("2: Listar");
            System.out.println("Elija la operación: ");
            respuesta = scan.nextInt();
        } while (respuesta < 1 || respuesta > 2);
        return respuesta;
    }

    public static void operaciones(int op) {
        String nombreEq, ciudad, estado;
        ArrayList<Utileria> Auxpersonalutileria=new ArrayList<Utileria>();
        ArrayList<Directivo> Auxdirectivos =new ArrayList<Directivo>();
        ArrayList<Tecnico> Auxtecnicos=new ArrayList<Tecnico> ();
        ArrayList<Jugador> Auxjugadores=new ArrayList<Jugador>();
        String cedula, nombres ,apellidos,ocupacion,cargo,nacionalidad,posicion;
        int edad;
        float peso;
        switch (op) {
            case 1:
                scan.nextLine();
                System.out.println("Ingrese el nombre del Equipo: ");
                nombreEq = scan.nextLine();
                System.out.println("Ingrese la ciudad del Equipo: ");
                ciudad = scan.nextLine();
                estado = "A";

                Equipo objEq = new Equipo(nombreEq, ciudad, estado);
                System.out.println(" REGISTRO PERSONAL UTILERIA");
                do {
 
                    System.out.println("Ingrese la cédula:");
                    cedula=scan.nextLine();
                    System.out.println("Ingrese el nombre:");
                    nombres=scan.nextLine();
                    System.out.println("Ingrese el apellido:");
                    apellidos=scan.nextLine();
                    System.out.println("Ingrese la ocupación:");
                    ocupacion=scan.nextLine();
                    Utileria objU=new Utileria(ocupacion,cedula,nombres,apellidos);
                    Auxpersonalutileria.add(objU);
                    System.out.println("Desea registrar otro personal si(1)");
                    op=scan.nextInt();
                    scan.nextLine();
                }while(op==1);
                objEq.setPersonalutileria(Auxpersonalutileria);
                //fin registro personal de utileria
                //crear directivos
                System.out.println("REGISTRO DE DIRECTIVOS");
                do{
                   // Directivo( ci, nombres, apellidos, cargo), 
                    System.out.println("Ingrese la cédula: ");
                    cedula=scan.nextLine();
                    System.out.println("Ingrese el nombre:");
                    nombres=scan.nextLine();
                    System.out.println("Ingrese los apellidos:");
                    apellidos=scan.nextLine();
                    System.out.println("Ingrese el cargo");
                    cargo=scan.nextLine();
                    Directivo objD=new Directivo(cedula,nombres,apellidos,cargo);
                    Auxdirectivos.add(objD);
                    System.out.println("Desea registrar otro directivo si(1)");
                    op=scan.nextInt();
                    scan.nextLine();
                }while(op==1);
                objEq.setDirectivos(Auxdirectivos);
                //fin crear directivos
                //crear tecnicos
                System.out.println("REGISTRO DE TECNICOS");
                do{
                    System.out.println("Ingrese la nacionalidad: ");
                    nacionalidad=scan.nextLine();
                    System.out.println("Ingrese el cargo:");
                    cargo=scan.nextLine();
                    System.out.println("Ingrese la cedula:");
                    cedula=scan.nextLine();
                    System.out.println("Ingrese los nombres");
                    nombres=scan.nextLine();
                    System.out.println("Ingrese los apellidos");
                    apellidos=scan.nextLine();
                    Tecnico objT=new Tecnico(nacionalidad,cargo,cedula,nombres,apellidos);
                    Auxtecnicos.add(objT);
                    System.out.println("Desea registrar otro directivo si(1)");
                    op=scan.nextInt();
                    scan.nextLine();
                }while(op==1);
                objEq.setTecnicos(Auxtecnicos);
                //fin crear tecnicos
                //crear jugadores
                    System.out.println("REGISTRO DE JUGADORES");
                do{
                    System.out.println("Ingrese la posicion: ");
                    posicion=scan.nextLine();
                    System.out.println("Ingrese la edad:");
                    edad=scan.nextInt();
                    System.out.println("Ingrese el peso:");
                    peso=scan.nextFloat();
                    scan.nextLine();
                    System.out.println("Ingrese la cedula:");
                    cedula=scan.nextLine();
                    System.out.println("Ingrese los nombres");
                    nombres=scan.nextLine();
                    System.out.println("Ingrese los apellidos");
                    apellidos=scan.nextLine();
                    Jugador objJ=new Jugador(posicion,edad,peso,cedula,nombres,apellidos);
                    Auxjugadores.add(objJ);
                    System.out.println("Desea registrar otro jugador? si(1)");
                    op=scan.nextInt();
                    scan.nextLine();
                }while(op==1);
                objEq.setJugadores(Auxjugadores);
                equipos.add(objEq);
                break;
            case 2:
                System.out.println("datos del equipo");
                for (int i = 0; i <equipos.size(); i++) {
                    System.out.println("Equipo:"+equipos.get(i).getNombreEq()); 
                    equipos.get(i).mostrarPersonalU();
                    equipos.get(i).mostrarDirectivos();
                    equipos.get(i).mostrarTecnico();
                    equipos.get(i).mostrarJugadores();
                }
                break;
                
        }
    }

}
