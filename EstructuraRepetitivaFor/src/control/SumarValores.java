package control;

import java.util.Scanner;

public class SumarValores {

	/**
	 * Desarrollar un programa que permita la carga de 10 valores por teclado 
	 * y nos muestre posteriormente la suma de los valores ingresados y su promedio.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double suma = 0;
		double promedio = 0;
		double valor;
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("Ingrese un número: ");
			valor = teclado.nextDouble();
			suma += valor;
		}
		
		promedio = (double) (suma / 10);
		System.out.println("La suma de los números es: " + suma);
		System.out.println("El promedio de los números es: " + promedio);

	}

}
