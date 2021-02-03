package control1;

import java.util.Scanner;

public class EstructuraCondicional01 {

	/**
	 * Realizar un programa que lea por teclado dos n�meros, 
	 * si el primero es mayor al segundo informar su suma y diferencia, 
	 * en caso contrario informar el producto y la divisi�n del primero respecto 
	 * al segundo. 
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
			
			int num1;
			int num2;
			
			int suma;
			int diferencia;
			int producto;
			double division;
			
			System.out.println("Ingrese el primer n�mero:");
			num1 = teclado.nextInt();
			System.out.println("Ingrese el segundo n�mero:");
			num2 = teclado.nextInt();
			
			if(num1 > num2) {
				suma = num1 + num2;
				diferencia = num1 - num2;
				System.out.println("La suma de los n�meros es");
				System.out.println(suma);
				System.out.println("La diferencia de los n�meros es");
				System.out.println(diferencia);
			} else {
				producto = num1 * num2;
				division = (double) num1 / num2;
				System.out.println("El producto de los n�meros es");
				System.out.println(producto);
				System.out.println("La division de los n�meros es");
				System.out.println(division);
			}

	}

}
