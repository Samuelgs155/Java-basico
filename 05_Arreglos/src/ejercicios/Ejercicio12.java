package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		/*
		 * Leer 10 números enteros, guardarlo en un arreglo
		 * y eliminar el elemento de una posición sin dejar huecos
		 */
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		int posicion;
		
		System.out.println("Escriba 10 números");
		for(int i=0;i<10;i++) {
			System.out.print("Escriba el número " + (i+1) + ": ");
			numeros[i] = teclado.nextInt();
		}
		do {
			System.out.println("\nEscriba una posición del arreglo (0-9):");
			posicion = teclado.nextInt();
			
		} while(posicion < 0 || posicion > 9);

		for(int i=posicion;i<9;i++) {
			numeros[i] = numeros[i + 1];
		}
		
		System.out.println("");
		System.out.println("El nuevo arreglo es");
		for(int i=0;i<9;i++) {
			System.out.print(numeros[i] + "-");
		}
	}

}
