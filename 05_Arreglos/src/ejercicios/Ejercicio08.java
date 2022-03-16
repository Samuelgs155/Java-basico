package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		/*
		 * Leer 10 números enteros, guardarlo en un arreglo
		 * Leer mediante el teclado 8 números
		 * pedir un número y una posición
		 * insertarlo en esa posición y desplazar al resto
		 * 
		 */
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		
		System.out.println("Escriba 10 números");
		for(int i=0;i<8;i++) {
			System.out.print("Escriba el número " + (i+1) + ": ");
			numeros[i] = teclado.nextInt();
		}
		System.out.println("");
		System.out.println("Escriba un número");
		int num = teclado.nextInt();
		System.out.println("Escriba una posición");
		int pos = teclado.nextInt();
		
		// Mover todos
		for(int i=7;i>=pos;i--) {
			numeros[i+1] = numeros[i];
		}
		numeros[pos] = num;
		System.out.println("");
		System.out.println("El nuevo arreglo es");
		for(int i=0;i<numeros.length;i++) {
			System.out.println("En la posición " + i + " está: " + numeros[i]);
		}

	}

}
