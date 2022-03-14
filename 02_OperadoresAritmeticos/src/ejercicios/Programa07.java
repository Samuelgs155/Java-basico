package ejercicios;

import java.util.Scanner;

public class Programa07 {

	public static void main(String[] args) {
		
		double num1, num2;
		double resultado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Programa que calcule el cuadrado de una suma ");
		System.out.println("(a+b)^2 = a^2 + b^2 + 2ab ");
		System.out.println("");
		System.out.println("Escriba el número 1");
		num1 = teclado.nextDouble();
		System.out.println("Escriba el número 2");
		num2 = teclado.nextDouble();
		System.out.println("");
		resultado = Math.pow(num1, 2) + Math.pow(num2, 2) + 2*num1*num2;
		System.out.println("El resultado es : " + resultado);
		
	}
}
