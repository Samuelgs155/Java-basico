package control;

import java.util.Scanner;

public class NotasAlumnos {

	/**
	 * Escribir un programa que lea 10 notas de alumnos 
	 * y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double nota;
		int notasSuperioresA7 = 0;
		int notasMenoresA7 = 0;
		
		for(int i=0; i < 10; i++) {
			System.out.print("Ingrese la nota del alumno " + (i+1) +": ");
			nota = teclado.nextDouble();
			if(nota >= 7) {
				notasSuperioresA7++;
			} else {
				notasMenoresA7++;
			}
		}
		
		System.out.println("Hay " + notasSuperioresA7 + " notas superiores a 7.");
		System.out.println("Hay " + notasMenoresA7 + " notas inferiores a 7.");

	}

}
