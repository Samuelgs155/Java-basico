package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		/*
		 * Leer 10 n�meros enteros, guardarlo en un arreglo
		 * y mostrarlos as�
		 * el primero, el �ltimo, el segundo, el pen�ltimo
		 */
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		
		System.out.println("Escriba 10 n�meros");
		for(int i=0;i<10;i++) {
			System.out.print("Escriba el n�mero " + (i+1) + ": ");
			numeros[i] = teclado.nextInt();
		}
		System.out.println("\nLos n�meros alternados son");
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
