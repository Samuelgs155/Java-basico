package control;

import java.util.Scanner;

public class SumaProductoNumeros {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int num1;
		int num2;
		int suma;
		int producto;
		
		System.out.println("Ingrese el primer n�mero:");
		num1 = teclado.nextInt();
		
		System.out.println("Ingrese el segundo n�mero:");
		num2 = teclado.nextInt();
		
		suma = num1 + num2;
		producto = num1 * num2;
		
		System.out.println("La suma de los dos n�meros es");
		System.out.println(suma);
		System.out.println("El producto de los dos n�meros es");
		System.out.println(producto);
		

	}

}
