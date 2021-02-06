package control;

import java.util.Scanner;

public class VectoresParalelos {

	Scanner teclado;
	String[] nombres;
	int[] edades;
	
	/**
	 * Desarrollar un programa que permita cargar 5 nombres de personas 
	 * y sus edades respectivas. 
	 * Luego de realizar la carga por teclado de todos los datos imprimir 
	 * los nombres de las personas mayores de edad (mayores o iguales a 18 años)
	 */
	public static void main(String[] args) {
		VectoresParalelos vp = new VectoresParalelos();
		vp.cargarValores();
		vp.imprimirMayoresEdad();

	}
	
	public void cargarValores() {
		teclado = new Scanner(System.in);
		nombres = new String[5];
		edades = new int[5];
		
		for(int i=0; i< nombres.length; i++) {
			System.out.print("Ingrese el nombre de la persona " + (i+1) + ": ");
			nombres[i] = teclado.next();
			System.out.print("Ingrese la edad de la persona " + (i+1) + ": ");
			edades[i] = teclado.nextInt();
			
		}
	}
	
	public void imprimirMayoresEdad() {
		System.out.println("");
		for(int i=0; i< nombres.length; i++) {
			if(edades[i] >= 18) {
				System.out.println(nombres[i] + " tiene " + edades[i]);
			}
		}
	}

}
