package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		/*
		 * Leer 5 números, guardarlos en un arreglo y mostrarlos en el orden inverso
		 */
		Scanner teclado = new Scanner(System.in);
		
		float[] numeros = new float[5];
		
		System.out.println("Escriba 5 números");
		for(int i=0;i<5;i++) {
			System.out.print("Escriba el número " + (i+1) + ": ");
			numeros[i] = teclado.nextFloat();
		}
		System.out.println("\nLos números introducidos en orden inverso fueron: ");
		for(int i=numeros.length-1;i>=0;i--) {
			System.out.print(numeros[i] + ", ");
		}
	}

}
