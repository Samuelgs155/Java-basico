package ejercicios;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		/*
		 * Leer 10 n�meros enteros, guardarlo en un arreglo
		 * y los desplace una posici�n hacia abajo
		 * el primero ser� el segundo, el segundo el tercero,..., el �ltimo el primero
		 */
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		
		System.out.println("Escriba 10 n�meros");
		for(int i=0;i<10;i++) {
			System.out.print("Escriba el n�mero " + (i+1) + ": ");
			numeros[i] = teclado.nextInt();
		}
		System.out.println("");
		int ultimo = numeros[9];
		for(int i=8;i>=0;i--) {
			numeros[i+1] = numeros[i];
		}
		numeros[0] = ultimo;
		System.out.println("");
		System.out.println("El nuevo arreglo es");
		for(int i=0;i<numeros.length;i++) {
			System.out.println("En la posici�n " + i + " est�: " + numeros[i]);
		}

		
		

	}

}
