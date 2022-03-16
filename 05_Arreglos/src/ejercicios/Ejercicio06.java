package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		/*
		 * Leer 10 numeros enteros y mezclarlos en una tercera de la forma
		 * el 1º de A
		 * el 1º de B
		 * el 2º de A
		 * el 2º de B
		 */
		Scanner teclado = new Scanner(System.in);
		int[] a = new int[12];
		int[] b = new int[12];
		int[] c = new int[24];
		
		System.out.println("Escriba el primer arreglo");
		for(int i=0;i<12;i++) {
			System.out.print("Escriba el número " + (i+1) + ": ");
			a[i] = teclado.nextInt();
		}
		System.out.println("");
		System.out.println("Escriba el segundo arreglo");
		for(int i=0;i<12;i++) {
			System.out.print("Escriba el número " + (i+1) + ": ");
			b[i] = teclado.nextInt();
		}
		System.out.println("");
		int i = 0;
		int j = 0;
		while(i<12) {
			// copiar los 3 elementos de a
			for(int k=0;k<3;k++) {
				c[j] = a[i+k];
				j++;
			}
			//copiar los 3 elementos de b
			for(int k=0;k<3;k++) {
				c[j] = b[i+k];
				j++;
			}
			i += 3;
		}
		System.out.println("");
		System.out.println("El tercer arreglo es:");
		for(int k=0;k<24;k++) {
			System.out.print(c[k]+ "-");
		}
	}

}
