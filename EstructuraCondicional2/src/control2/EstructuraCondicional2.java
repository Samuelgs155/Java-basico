package control2;

import java.util.Scanner;

public class EstructuraCondicional2 {

	/**
	 * Se cargan por teclado tres n�meros distintos. Mostrar por pantalla el mayor
	 * de ellos.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("Ingrese el primer n�mero:");
		num1 = teclado.nextInt();
		System.out.println("Ingrese el segundo n�mero:");
		num2 = teclado.nextInt();
		System.out.println("Ingrese el tercer n�mero:");
		num3 = teclado.nextInt();
		
		if((num1 > num2) && (num1 > num3)) {
			System.out.println("El n�mero mayor es: " + num1);
		} else {
			if(num2 > num3) {				
				System.out.println("El n�mero mayor es: " + num2);				
			} else {
				System.out.println("El n�mero mayor es: " + num3);
			}
		}

	}

}
