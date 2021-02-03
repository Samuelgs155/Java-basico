package control5;

import java.util.Scanner;

public class EstructuraControl {

	/**
	 * Un postulante a un empleo, realiza un test de capacitación, 
	 * se obtuvo la siguiente información: 
	 * cantidad total de preguntas que se le realizaron 
	 * y la cantidad de preguntas que contestó correctamente. 
	 * Se pide confeccionar un programa que ingrese los dos datos por teclado 
	 * e informe el nivel del mismo según el porcentaje de respuestas correctas 
	 * que ha obtenido, y sabiendo que:

	Nivel máximo:	Porcentaje>=90%.
	Nivel medio:	Porcentaje>=75% y <90%.
	Nivel regular:	Porcentaje>=50% y <75%.
	Fuera de nivel:	Porcentaje<50%.

	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int totalPreguntas;
		int totalPreguntasAcertadas;
		
		double resultado;
		
		System.out.println("Ingrese el número total de preguntas");
		totalPreguntas = teclado.nextInt();
		System.out.println("Ingrese el número total de preguntas acertadas");
		totalPreguntasAcertadas = teclado.nextInt();
		
		resultado = (double) totalPreguntasAcertadas / totalPreguntas;
		
		if(resultado >= 0.9) {
			System.out.println("Nivel máximo");
		} else {
			if(resultado >= 0.75) {
				System.out.println("Nivel medio");
			} else {
				if(resultado >= 0.5) {
					System.out.println("Nivel regular");
				} else {
					System.out.println("Fuera de nivel");
				}
			}
		}
		
	}

}
