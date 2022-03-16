package ejercicios;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		/*
		 * buscar en un arreglo ordenado de 10 enteros buscar un elemento
		 * y mostrarlo y si no que diga que no 
		 */
		
		Scanner teclado = new Scanner(System.in);
		int[] arreglo = new int[10];
		boolean creciente = false;
		
		System.out.println("Escriba 10 n�meros para el primer arreglo");		
		do {
			for(int i=0;i<10;i++) {
				System.out.print("Escriba el n�mero " + (i+1) + ": ");
				arreglo[i] = teclado.nextInt();
			}
			// comprobar que est� ordenado
			for(int i=0;i<9;i++) {
				if(arreglo[i] < arreglo[i+1]) { // creciente
					creciente = true;
				}
				if(arreglo[i] > arreglo[i+1]) { // creciente
					creciente = true;
					break;
				}
			}			
			if(creciente == false) {
				System.out.println("\nEl arreglo no est� ordenado en forma creciente, vuelva a escribir.\n");
			}
		} while(creciente == false);
		
		System.out.println("");
		System.out.println("Escriba el n�mero a buscar:");
		int numero = teclado.nextInt();
		
		int i = 0;
		
		while(i<10 && arreglo[i] < numero) {
			i++;
			
		}
		
		if(i==10) { // hemos recorrido todo el arreglo y no hemos encontrado nada
			System.out.println("\nN�mero no encontrado");
			
		} else {
			if(arreglo[i] == numero) {
				System.out.println("\nN�mero encontrado, en la posici�n " + i);
			} else {
				System.out.println("\nN�mero no encontrado");
			}
		}

	}

}
