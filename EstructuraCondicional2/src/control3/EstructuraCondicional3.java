package control3;

import java.util.Scanner;

public class EstructuraCondicional3 {
	
	
	/**
	 * Se ingresa por teclado un valor entero, 
	 * mostrar una leyenda que indique si el n�mero es positivo, nulo o negativo.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double num;
		
		System.out.println("Ingrese un n�mero");
		num = teclado.nextDouble();
		
		if(num > 0) {
			System.out.println("El n�mero es positivo.");
		} else {
			if (num == 0) {
				System.out.println("El n�mero es nulo.");
			} else {
				System.out.println("El n�mero es negativo.");
			}
		}
		
	}

}
