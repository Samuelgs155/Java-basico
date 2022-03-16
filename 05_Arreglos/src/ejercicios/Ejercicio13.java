package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		/*
		 * Leer 10 números enteros, guardarlo en un arreglo
		 * y guardar en otra los elementos pares y luego los impares
		 */
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		int numPares = 0;
		int numImpares = 0;
		
		
		System.out.println("Escriba 10 números");
		for(int i=0;i<10;i++) {
			System.out.print("Escriba el número " + (i+1) + ": ");
			numeros[i] = teclado.nextInt();
			if(numeros[i] % 2 == 0) {
				numPares++;
			} else {
				numImpares++;
			}
		}
		
		int[] numerosPares = new int[numPares];
		int[] numerosImpares = new int[numImpares];
		int keyPar = 0;
		int keyImpar = 0;
		for(int i=0;i<10;i++) {
			if(numeros[i] % 2 == 0) {
				numerosPares[keyPar] = numeros[i];
				keyPar++;
			} else {
				numerosImpares[keyImpar] = numeros[i];
				keyImpar++;
			}
		}
		
		System.out.println("");
		System.out.println("Arreglo numeros pares");
		for(int i=0;i<numerosPares.length;i++) {
			System.out.print(numerosPares[i]+"-");
		}
		System.out.println("");
		System.out.println("Arreglo numeros immpares");
		for(int i=0;i<numerosImpares.length;i++) {
			System.out.print(numerosImpares[i]+"-");
		}
	}

}
