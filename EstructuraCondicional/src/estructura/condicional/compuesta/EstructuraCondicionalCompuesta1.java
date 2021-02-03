package estructura.condicional.compuesta;

import java.util.Scanner;

public class EstructuraCondicionalCompuesta1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("Ingrese el primer valor:");
		num1 = teclado.nextInt();
		System.out.println("Ingrese el segundo valor:");
		num2 = teclado.nextInt();
		
		if ( num1 > num2 ) {
			System.out.println("El mayor es " + num1);
		} else {
			System.out.println("El mayor es " + num2);
		}
			

	}

}
