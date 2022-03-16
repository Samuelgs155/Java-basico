package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		/*
		 * Leer 10 numeros enteros y mezclarlos en una tercera de la forma
		 * el 1º de A
		 * el 1º de B
		 * el 2º de A
		 * el 2º de B
		 */
		Scanner teclado = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[20];
		
		System.out.println("Escriba el primer arreglo");
		for(int i=0;i<10;i++) {
			System.out.print("Escriba el número " + (i+1) + ": ");
			a[i] = teclado.nextInt();
		}
		System.out.println("");
		System.out.println("Escriba el segundo arreglo");
		for(int i=0;i<10;i++) {
			System.out.print("Escriba el número " + (i+1) + ": ");
			b[i] = teclado.nextInt();
		}
		System.out.println("");
		int j = 0;
		for(int i=0;i<10;i++) {
			if(i % 2 == 0) {
				c[j] = a[i];
				j++;
				c[j] = b[i];
				j++;
			}
		}
		System.out.println("");
		System.out.println("El tercer arreglo es:");
		for(int i=0;i<10;i++) {
			System.out.print(c[i]+ " ");
		}
	}

}
