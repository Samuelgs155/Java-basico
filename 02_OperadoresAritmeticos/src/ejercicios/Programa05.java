package ejercicios;

import java.util.Scanner;

public class Programa05 {

	public static void main(String[] args) {
		
		float part, primerParcial, segundoParcial, examenFinal;
		float resultado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("La calificación final de un estudiante de Informática se calcula ");
		System.out.println("en base a: ");
		System.out.println("Participación (10%)");
		System.out.println("Primer examen parcial (25%)");
		System.out.println("Segundo examen parcial (35%)");
		System.out.println("Examen final (40%)");
		System.out.println("");
		System.out.println("Escriba las notas de la participación");
		part = teclado.nextFloat();
		System.out.println("Escriba las notas del primer parcial");
		primerParcial = teclado.nextFloat();
		System.out.println("Escriba las notas del primer parcial");
		segundoParcial = teclado.nextFloat();
		System.out.println("Escriba las notas del examen final");
		examenFinal = teclado.nextFloat();
		System.out.println("");
		resultado = (part * 0.10f) + (primerParcial * 0.25f) + (segundoParcial * 0.25f) + (examenFinal * 0.40f);
		System.out.println("Resultado : " + resultado);
		if(resultado < 5) {
			System.out.println("Suspenso");
		} else if(resultado >= 5 && resultado < 6) {
			System.out.println("Suficiente");
		} else if(resultado >= 6 && resultado < 7) {
			System.out.println("Bien");
		} else if(resultado >= 7 && resultado < 9) {
			System.out.println("Notable");
		} else {
			System.out.println("Sobresaliente");
		}
		
	}
}
