package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		/*
		 * Leer 5 números enteros ordenados creciente, guardarlo en un arreglo
		 * y leer un numero N y colocarlo para dejarlo ordenado
		 */
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		boolean creciente = false;
		
		System.out.println("Escriba 10 números");
		do {
			for(int i=0;i<5;i++) {
				System.out.print("Escriba el número " + (i+1) + ": ");
				numeros[i] = teclado.nextInt();
			}			
			// comprobar que está ordenado
			for(int i=0;i<4;i++) {
				if(numeros[i] < numeros[i+1]) { // creciente
					creciente = true;
				}
				if(numeros[i] > numeros[i+1]) { // creciente
					creciente = true;
					break;
				}
			}			
			if(creciente == false) {
				System.out.println("\nEl arreglo no está ordenado en forma creciente, vuelva a escribir.\n");
			}			
		} while(creciente == false);
		
		
		System.out.println("");
		System.out.println("Escribe un número a insertar");
		int num = teclado.nextInt();
		int sitio_num = 0;
		int j = 0;
		while(numeros[j] < num && j < 5) {
			sitio_num++;
			j++;
		}

		// trasladamos el arreglo
		for(int i=4;i>=sitio_num;i--) {
			numeros[i+1] = numeros[i];
		}
		
		numeros[sitio_num] = num;
		
		System.out.println("");
		System.out.println("El nuevo arreglo es");
		for(int i=0;i<6;i++) {
			System.out.print(numeros[i] + "-");
		}
	}

}
