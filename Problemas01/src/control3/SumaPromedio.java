package control3;

import java.util.Scanner;

public class SumaPromedio {

	/**
	 * Realizar un programa que lea cuatro valores numéricos 
	 * e informar su suma y promedio. 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		int num4;
		
		int suma;
		float promedio;
		
		System.out.println("Ingrese el primer numero:");
		num1 = teclado.nextInt();
		System.out.println("Ingrese el segundo numero:");
		num2 = teclado.nextInt();
		System.out.println("Ingrese el tercer numero:");
		num3 = teclado.nextInt();
		System.out.println("Ingrese el cuarto numero:");
		num4 = teclado.nextInt();
		
		suma = num1 + num2 + num3 + num4;
		promedio = suma / 4;
		
		System.out.println("La suma de todos los números es:");
		System.out.println(suma);
		System.out.println("El promedio de los números es:");
		System.out.println(promedio);

	}

}
