package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*
		 * Leer 10 números enteros, guardarlo en un arreglo
		 * y desplazar el arreglo N posiciones
		 */
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		
		System.out.println("Escriba 10 números");
		for(int i=0;i<10;i++) {
			System.out.print("Escriba el número " + (i+1) + ": ");
			numeros[i] = teclado.nextInt();
		}
		System.out.println("");
		
		System.out.println("Escribe la cantidad de posiciones a desplazar");
		int n_posiciones = teclado.nextInt();
		int ultimo;
		for(int vuelta=0;vuelta<=n_posiciones;vuelta++) {
			ultimo = numeros[9];
			for(int i=8;i>=0;i--) {
				numeros[i+1] = numeros[i];
			}
			numeros[0] = ultimo;
		}		
		
		
		System.out.println("");
		System.out.println("El nuevo arreglo es");
		for(int i=0;i<numeros.length;i++) {
			System.out.println("En la posición " + i + " está: " + numeros[i]);
		}
	}

}
