package control;

import beans.Persona;

public class Main {

	/**
	 * Confeccionar una clase que permita carga el nombre y la edad de una persona.
	 * Mostrar los datos cargados. Imprimir un mensaje si es mayor de edad
	 * (edad>=18)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Persona persona = new Persona();		
		persona.inicializar();
		persona.imprimir();
		persona.esMayorEdad();
	}

}
