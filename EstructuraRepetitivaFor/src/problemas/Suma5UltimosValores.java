package problemas;

import java.util.Scanner;

public class Suma5UltimosValores {

	/**
	 * Desarrollar un programa que solicite la carga de 10 números 
	 * e imprima la suma de los últimos 5 valores ingresados
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double numero;
		double suma = 0;
		
		
		System.out.println("Ingrese 10 números enteros.");
		
		for(int i=0; i < 10; i++) {
			System.out.print("Ingrese el número " + (i+1) + ": ");
			numero = teclado.nextDouble();
			if(i > 4) {
				suma += numero;
			}			
		}
		
		System.out.println("La suma de los 5 últimos números es " + suma);

	}

}
