package ejercicio10;

import java.util.ArrayList;
import java.util.Scanner;

public class Control {
	
	/*
	 * Crear un programa para simular un equipo de futbol
	 * futbolista, entrenador y doctor
	 * 
	 * Una super clase Persona: nombre, apellido, edad
	 * una sub clase Futbolista: dorsal y posici�n
	 * una sub clase Entrenador: estrategia
	 * una sub clase Doctor: titulacion y a�os de experiencia
	 * 
	 * Hacer un menu donde se tengan las opciones
	 * Viajes de equipo, entrenamiento, partido de futbol,
	 * planificar entrenamiento, entrevista y curar lesi�n
	 */

	static ArrayList<Persona> personas = new ArrayList<Persona>();
	static Scanner teclado = new Scanner(System.in);
	
	static Persona futbolista1 = new Futbolista("Higuain", "Gonzalo", 29, 9, "Delantero");
	static Persona futbolista2 = new Futbolista("Paulo", "Dybala", 23, 21, "Delantero");
	static Persona entrenador = new Entrenador("Maximiliano", "Allegri", 49, "Defensiva");
	static Persona doctor = new Doctor("Alex", "Marroni", 39, "Licenciado en Fisioterapia", 20);
	
	public static void main(String[] args) {
		personas.add(futbolista1);
		personas.add(futbolista2);
		personas.add(entrenador);
		personas.add(doctor);
		menu();

	}
	
	public static void menu() {
		int opcion;
		do {
			System.out.println("\t:MENU:");
			System.out.println("1. Viaje de equipo");
			System.out.println("2. Entrenamiento");
			System.out.println("3. Partido de f�tbol");
			System.out.println("4. Planificar entrenamiento");
			System.out.println("5. Entrevista");
			System.out.println("6. Curar lesi�n");
			System.out.println("7. SALIR");
			opcion = teclado.nextInt();
			System.out.println("");
			
			switch(opcion) {
				case 1:
					System.out.println("1. Viaje de equipo");
					viajarEquipo();
					break;
				case 2:
					System.out.println("2. Entrenamiento");
					entrenarEquipo();
					break;
				case 3:
					System.out.println("3. Partido de f�tbol");
					partidoFutbol();
					break;
				case 4:
					System.out.println("4. Planificar entrenamiento");
					planificarEntrenamiento();
					break;
				case 5:
					System.out.println("5. Entrevista");
					entrevistas();
					break;
				case 6:
					System.out.println("6. Curar lesi�n");
					curaLesiones();
					break;
				case 7:
					System.out.println("Sali�");
					break;
				default:
					System.out.println("Opci�n err�nea");
					break;
			}
		} while(opcion != 7);
	}

	private static void curaLesiones() {
		for(Persona equipo: personas) {
			if(equipo instanceof Doctor) {
				System.out.println(equipo.getNombre() + " " + equipo.getApellidos() + " ->");
				((Doctor) equipo).curarLesion();
			}			
		}
		System.out.println("");
		
	}

	private static void entrevistas() {
		for(Persona equipo: personas) {
			if(equipo instanceof Futbolista) {
				System.out.println(equipo.getNombre() + " " + equipo.getApellidos() + " ->");
				((Futbolista) equipo).entrevista();
			}			
		}
		System.out.println("");
	}

	private static void planificarEntrenamiento() {
		for(Persona equipo: personas) {
			if(equipo instanceof Entrenador) {
				System.out.println(equipo.getNombre() + " " + equipo.getApellidos() + " ->");
				((Entrenador) equipo).planificarEntrenamiento();
			}			
		}
		System.out.println("");
		
	}

	private static void partidoFutbol() {
		for(Persona equipo: personas) {
			System.out.println(equipo.getNombre() + " " + equipo.getApellidos() + " ->");
			equipo.partidoFutbol();
		}
		System.out.println("");			
	}

	private static void entrenarEquipo() {
		for(Persona equipo: personas) {
			System.out.println(equipo.getNombre() + " " + equipo.getApellidos() + " ->");
			equipo.entrenamiento();
		}
		System.out.println("");	
		
	}

	private static void viajarEquipo() {
		for(Persona equipo: personas) {
			System.out.println(equipo.getNombre() + " " + equipo.getApellidos() + " ->");
			equipo.viajar();
		}
		System.out.println("");		
	}

}
