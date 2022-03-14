package ejercicios;

import java.util.Scanner;

public class Programa02 {
	

	public static void main(String[] args) {
		double horasSemanales;
		float salarioPorHora;
		float salario;
		
		Scanner teclado = new Scanner(System.in);		
		System.out.println("Crear un programa que calcule el salario semanal de un empleado");
		System.out.println("a partir de sus horas semanales y su salario por hora:");
		
		System.out.println("Horas semanales:");		
		horasSemanales = teclado.nextDouble();
		System.out.println("Salario por hora");
		salarioPorHora = teclado.nextFloat();
		
		System.out.println("");
		
		salario = (float) (horasSemanales * salarioPorHora);
		System.out.println("Su salario semanal es : " + salario);

	}

}
