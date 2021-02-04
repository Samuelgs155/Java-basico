package control;

import java.util.Scanner;

public class Multiplos3Multiplos5 {
	
	
	/**
	 * Escribir un programa que lea 10 números enteros 
	 * y luego muestre cuántos valores ingresados fueron múltiplos de 3 
	 * y cuántos de 5. 
	 * Debemos tener en cuenta que hay números que son múltiplos de 3 y de 5 a la vez.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num;
		
		int multiploTres = 0;
		int multiploCinco = 0;
		
		for(int i=0; i < 10; i++) {
			System.out.print("Ingrese un número entero: ");
			num = teclado.nextInt();
			
			if(num % 3 == 0) {
				multiploTres++;
			}
			if(num % 5 == 0) {
				multiploCinco++;
			}			
		}
		
		System.out.println("Se han introducido " + multiploTres + " números que son múltiplos de 3.");
		System.out.println("Se han introducido " + multiploCinco + " números que son múltiplos de 5.");
	}

}
