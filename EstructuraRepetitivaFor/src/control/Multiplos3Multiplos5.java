package control;

import java.util.Scanner;

public class Multiplos3Multiplos5 {
	
	
	/**
	 * Escribir un programa que lea 10 n�meros enteros 
	 * y luego muestre cu�ntos valores ingresados fueron m�ltiplos de 3 
	 * y cu�ntos de 5. 
	 * Debemos tener en cuenta que hay n�meros que son m�ltiplos de 3 y de 5 a la vez.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num;
		
		int multiploTres = 0;
		int multiploCinco = 0;
		
		for(int i=0; i < 10; i++) {
			System.out.print("Ingrese un n�mero entero: ");
			num = teclado.nextInt();
			
			if(num % 3 == 0) {
				multiploTres++;
			}
			if(num % 5 == 0) {
				multiploCinco++;
			}			
		}
		
		System.out.println("Se han introducido " + multiploTres + " n�meros que son m�ltiplos de 3.");
		System.out.println("Se han introducido " + multiploCinco + " n�meros que son m�ltiplos de 5.");
	}

}
