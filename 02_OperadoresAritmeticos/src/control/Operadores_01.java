package control;

import java.util.Scanner;

public class Operadores_01 {

	public static void main(String[] args) {
		
		float num1;
		float num2; 
		float suma, resta, mult, div, resto;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba dos números: ");
		num1 = teclado.nextFloat();
		num2 = teclado.nextFloat();
		
		suma = num1 + num2;
		resta = num1 - num2;
		mult = num1 * num2;
		div = num1 / num2;
		resto = num1 % num2;
		
		System.out.println("La suma de ellos es: " + suma);
		System.out.println("La resta de ellos es: " + resta);
		System.out.println("La multiplicación de ellos es: " + mult);
		System.out.println("La división de ellos es: " + div);
		System.out.println("El resto de ellos es: " + resto);

	}

}
