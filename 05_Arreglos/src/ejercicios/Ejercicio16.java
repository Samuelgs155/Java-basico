package ejercicios;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		/*
		 * Aplicacion que gestiona las notas de un centro educativo
		 * Cada grupo tiene 5 alumnos
		 * leer las notas del 1, 2 y 3 trimestre de un grupo
		 * Mostrar la nota media de cada trimestre y la media del alumno en la posición N
		 *
		 */
		Scanner teclado = new Scanner(System.in);
		
		float[] primer = new float[5];
		float[] segundo = new float[5];
		float[] tercer = new float[5];
		
		float sumaPrimer = 0;
		float sumaSegundo = 0;
		float sumaTecer = 0;
		
		System.out.println("Escriba las notas del primer trimestre");
		for(int i=0;i<5;i++) {
			System.out.print("Escriba la nota del alumno (" + (i+1) + "): ");
			primer[i] = teclado.nextInt();
			sumaPrimer = sumaPrimer + primer[i];
		}
		System.out.println("Escriba las notas del segundo trimestre");
		for(int i=0;i<5;i++) {
			System.out.print("Escriba la nota del alumno (" + (i+1) + "): ");
			segundo[i] = teclado.nextInt();
			sumaSegundo = sumaSegundo + segundo[i];
		}
		System.out.println("Escriba las notas del tercer trimestre");
		for(int i=0;i<5;i++) {
			System.out.print("Escriba la nota del alumno (" + (i+1) + "): ");
			tercer[i] = teclado.nextInt();
			sumaTecer = sumaTecer + tercer[i];
		}
		// promedio del alumno N
		System.out.println("");
		int posicion;
		do {
			System.out.println("Escriba la posición del alumno para sacar el promedio (0-4)");
			posicion = teclado.nextInt();
		} while(posicion<0 || posicion>4);
		
		// sacamos el promedio
		float promedioPrimer = sumaPrimer / 5;
		float promedioSegundo = sumaSegundo / 5;
		float promedioTecer = sumaTecer / 5;
		System.out.println("");
		System.out.println("La media del primer trimestre es " + promedioPrimer);
		System.out.println("La media del segundo trimestre es " + promedioSegundo);
		System.out.println("La media del tercer trimestre es " + promedioTecer);
		System.out.println("");		
		float sumaAlumno = primer[posicion] +  segundo[posicion] +  tercer[posicion];
		float promedioAlumno = sumaAlumno / 3;
		System.out.println("");
		System.out.println("La media del alumno (" + posicion + ") es: " + promedioAlumno);

	}

}
