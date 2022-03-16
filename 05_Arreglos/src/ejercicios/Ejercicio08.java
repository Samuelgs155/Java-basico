package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		/*
		 * Leer 10 n�meros enteros, guardarlo en un arreglo
		 * Leer mediante el teclado 8 n�meros
		 * pedir un n�mero y una posici�n
		 * insertarlo en esa posici�n y desplazar al resto
		 * 
		 */
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		
		System.out.println("Escriba 10 n�meros");
		for(int i=0;i<8;i++) {
			System.out.print("Escriba el n�mero " + (i+1) + ": ");
			numeros[i] = teclado.nextInt();
		}
		System.out.println("");
		System.out.println("Escriba un n�mero");
		int num = teclado.nextInt();
		System.out.println("Escriba una posici�n");
		int pos = teclado.nextInt();
		
		// Mover todos
		for(int i=7;i>=pos;i--) {
			numeros[i+1] = numeros[i];
		}
		numeros[pos] = num;
		System.out.println("");
		System.out.println("El nuevo arreglo es");
		for(int i=0;i<numeros.length;i++) {
			System.out.println("En la posici�n " + i + " est�: " + numeros[i]);
		}

	}

}
