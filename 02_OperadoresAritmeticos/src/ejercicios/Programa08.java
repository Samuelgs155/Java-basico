package ejercicios;

import java.util.Scanner;

public class Programa08 {

	public static void main(String[] args) {

		System.out.println("Ecuaci�n: x^2 - 5x + 6"); // dos soluciones
	    double resultados[] = ecuacion2Grado(1, -5, 6);
	 
	    if (resultados == null) {
	        System.out.println("No tiene solucion");
	    } else {
	        for (int i = 0; i < resultados.length; i++) {
	            System.out.println(resultados[i]);
	        }
	    }
	 
	    System.out.println("Ecuaci�n: x^2 - 2x + 1"); // una solucion
	    resultados = ecuacion2Grado(1, -2, 1);
	 
	    if (resultados == null) {
	        System.out.println("No tiene solucion");
	    } else {
	        for (int i = 0; i < resultados.length; i++) {
	            System.out.println(resultados[i]);
	        }
	    }
	 
	    System.out.println("Ecuaci�n: x^2 - x + 1"); // sin solucion
	    resultados = ecuacion2Grado(1, 1, 1);
	 
	    if (resultados == null) {
	        System.out.println("No tiene solucion");
	    } else {
	        for (int i = 0; i < resultados.length; i++) {
	            System.out.println(resultados[i]);
	        }
	    }

	}

	public static double[] ecuacion2Grado(int a, int b, int c) {

		double discriminante = (Math.pow(b, 2) - (4 * a * c));
		if (discriminante >= 0) {
			double soluciones[];
			// Una solucion
			if (discriminante == 0) {
				soluciones = new double[1];
				soluciones[0] = ((-b) - (4 * a * c)) / (2 * a);
				// Dos soluciones
			} else {
				soluciones = new double[2];
				soluciones[0] = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
				soluciones[1] = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
			}
			return soluciones;
		} else {
			// Sin solucion
			return null;
		}

	}
}
