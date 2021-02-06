package problemas;

import java.util.Scanner;

public class Problema3 {

	Scanner teclado;
	int[] claseA;
	int[] claseB;
	
	/**
	 * Se tienen las notas del primer parcial de los alumnos de dos cursos, el curso A y el curso B,
	 *  cada curso cuenta con 5 alumnos.
		Realizar un programa que muestre el curso que obtuvo el mayor promedio general.
	 * @param args
	 */
	public static void main(String[] args) {
		Problema3 p3 = new Problema3();
		p3.calcularMejorPromedioNotas();

	}
	
	public void calcularMejorPromedioNotas() {
		teclado = new Scanner(System.in);
		claseA = new int[5];
		claseB = new int[5];
		for(int i=0; i<2; i++) {
			for(int j=0; j<5; j++) {
				System.out.println("Ingrese la nota del alumno " + j + " de la clase " + i + ": ");
				if(i==0) {
					claseA[j] = teclado.nextInt();
				} else {
					claseB[j] = teclado.nextInt();
				}
			}
		}
		this.imprimirMayor(this.calcularPromedio(claseA),this.calcularPromedio(claseB));
		
	}
	
	public double calcularPromedio(int[] vector) {		
		double promedio = 0;
		double suma = 0;
		for(int i=0; i<vector.length; i++) {
			suma += vector[i];
		}		
		promedio = (double) suma/vector.length;		
		return promedio;
	}
	
	public void imprimirMayor(double valor1, double valor2) {
		if(valor1 > valor2) {
			System.out.println("La clase 1 ha tenido el mayor promedio: " + valor1);
		} else if (valor1 < valor2) {
			System.out.println("La clase 2 ha tenido el mayor promedio: " + valor2);
		} else {
			System.out.println("Ambas clases tienen el mismo promedio: " + valor1);
		}
	}

}
