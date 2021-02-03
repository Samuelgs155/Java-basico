package control2;

import java.util.Scanner;

public class NotasAlumno {

	/**
	 * Se ingresan tres notas de un alumno, 
	 * si el promedio es mayor o igual a siete 
	 * mostrar un mensaje "Promocionado". 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double nota1;
		double nota2;
		double nota3;
		
		double promedio;
		
		System.out.println("Ingrese la nota 1 del alumno:");
		nota1 = teclado.nextDouble();
		System.out.println("Ingrese la nota 2 del alumno:");
		nota2 = teclado.nextDouble();
		System.out.println("Ingrese la nota 3 del alumno:");
		nota3 = teclado.nextDouble();
		
		promedio = (double) (nota1 + nota2 + nota3) / 3;
		
		if(promedio > 7) {
			System.out.println("EL alumno ha PROMOCIONADO");
		} else {
			System.out.println("EL alumno NO ha PROMOCIONADO");
		}
		
	}
}
