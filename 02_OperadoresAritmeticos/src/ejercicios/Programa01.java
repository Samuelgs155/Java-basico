package ejercicios;

import java.util.Scanner;

public class Programa01 {
	

	public static void main(String[] args) {
		float nota1;
		float nota2;
		float nota3;
		float resultado;
		
		Scanner teclado = new Scanner(System.in);		
		System.out.println("Crear un programa que calcule la suma de 3 notas");
		System.out.println("nota 1 :");
		nota1 = teclado.nextFloat();
		System.out.println("nota 2 :");
		nota2 = teclado.nextFloat();
		System.out.println("nota 3 :");
		nota3 = teclado.nextFloat();
		System.out.println("");
		
		resultado = nota1 + nota2 + nota3;
		System.out.println("La suma de las tres notas es : " + resultado);

	}

}
