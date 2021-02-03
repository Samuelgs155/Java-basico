package control2;

import java.util.Scanner;

public class SumaProductoNumeros {

	/**
	 * Escribir un programa en el cual se ingresen cuatro números, 
	 * calcular e informar la suma de los dos primeros y 
	 * el producto del tercero y el cuarto. 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		int num4;
		
		int suma;
		int producto;
		
		System.out.println("Ingrese el primer numero:");
		num1 = teclado.nextInt();
		System.out.println("Ingrese el segundo numero:");
		num2 = teclado.nextInt();
		System.out.println("Ingrese el tercer numero:");
		num3 = teclado.nextInt();
		System.out.println("Ingrese el cuarto numero:");
		num4 = teclado.nextInt();
		
		suma = num1 + num2; 
		producto = num3 * num4;
		
		System.out.println("La suma de los dos primeros números es:");
		System.out.println(suma);
		System.out.println("El producto de los dos últimos números es:");
		System.out.println(producto);


	}

}
