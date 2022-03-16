package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		/*
		 * Leer 10 números enteros, guardarlo en un arreglo
		 * y mostrarlos así
		 * el primero, el último, el segundo, el penúltimo
		 */
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		
		System.out.println("Escriba 10 números");
		for(int i=0;i<10;i++) {
			System.out.print("Escriba el número " + (i+1) + ": ");
			numeros[i] = teclado.nextInt();
		}
		System.out.println("\nLos números alternados son");
		int inicioArray = 0;
		int finalArray = numeros.length - 1;
		
		do {
			System.out.println(numeros[inicioArray]);
			System.out.println(numeros[finalArray]);
			inicioArray++;
			finalArray--;
		} while(inicioArray <= finalArray);

	}

}
