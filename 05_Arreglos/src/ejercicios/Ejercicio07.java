package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		/*
		 * Leer 10 números enteros, guardarlo en un arreglo
		 * y decir si están en forma creciente, decreciente o desordenados
		 */
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		boolean decreciente = false;
		boolean creciente = false;
		
		
		System.out.println("Escriba 10 números");
		for(int i=0;i<10;i++) {
			System.out.print("Escriba el número " + (i+1) + ": ");
			numeros[i] = teclado.nextInt();
		}
		System.out.println("");

		for(int i=0;i<9;i++) {
			if(numeros[i] < numeros[i+1]) {
				creciente = true;
			}
			if(numeros[i] > numeros[i+1]) {
				 decreciente = true;
			}
		}
		
		if(creciente == true && decreciente == false) {
			System.out.println("La serie es creciente.");
		}
		if(creciente == false && decreciente == true) {
			System.out.println("La serie es decreciente.");
		}
		if(creciente == true && decreciente == true) {
			System.out.println("La serie está desordenada.");
		}
		if(creciente == false && decreciente == false) {
			System.out.println("Todos son iguales.");
		}
	}

}
