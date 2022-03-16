package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		/*
		 * Leer 10 números enteros en dos series, guardarlo en un arreglo
		 * ordenado creciente
		 * Copiarlos en una tercera que esté ordenada
		 */
		Scanner teclado = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[20];
		boolean creciente = false;
		
		System.out.println("Escriba 10 números para el primer arreglo");
		
		do {
			for(int i=0;i<10;i++) {
				System.out.print("Escriba el número " + (i+1) + ": ");
				a[i] = teclado.nextInt();
			}
			// comprobar que está ordenado
			for(int i=0;i<9;i++) {
				if(a[i] < a[i+1]) { // creciente
					creciente = true;
				}
				if(a[i] > a[i+1]) { // creciente
					creciente = true;
					break;
				}
			}			
			if(creciente == false) {
				System.out.println("\nEl arreglo no está ordenado en forma creciente, vuelva a escribir.\n");
			}
		} while(creciente == false);
		System.out.println("");
		System.out.println("Escriba 10 números para el segundo arreglo");
		do {
			for(int i=0;i<10;i++) {
				System.out.print("Escriba el número " + (i+1) + ": ");
				b[i] = teclado.nextInt();
			}
			// comprobar que está ordenado
			for(int i=0;i<9;i++) {
				if(b[i] < b[i+1]) { // creciente
					creciente = true;
				}
				if(b[i] > b[i+1]) { // creciente
					creciente = true;
					break;
				}
			}			
			if(creciente == false) {
				System.out.println("\nEl arreglo no está ordenado en forma creciente, vuelva a escribir.\n");
			}
		} while(creciente == false);
		System.out.println("");
		
		int i = 0; // para a
		int j = 0; // para b
		int k = 0; // para c
		while(i<10 && j<10) {
			if(a[i] < b[j]) { // si el elelmento de a es mejor que b
				c[k] = a[i];  // copiamos el elemento de a
				i++;  // avanzamos una posición de a				
			} else {
				c[k] = b[j];  // copiamos el elemento de a
				j++;  // avanzamos una posición de a
			}
			k++;			
		}
		
		// cuando salimos del while es porque un arreglo (a o b) se ha copiado completamente
		if(i == 10) { // copiamos todo el arreglo a, falta el b
			while(j < 10 ) {
				c[k] = b[j];
				j++;
				k++;				
			}
		} else if(j == 10) { // copiamos todo el arreglo b, falta el a
			while(i < 10 ) {
				c[k] = a[i];
				i++;
				k++;				
			}
		}
		
		System.out.println("");
		System.out.println("El nuevo arreglo es");
		for(int x=0;x<20;x++) {
			System.out.print(c[x] + "-");
		}
	}

}
