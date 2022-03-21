package ejercicio09;

import java.util.ArrayList;
import java.util.Scanner;

public class Control {

	/*
	 * Hacer un porgrama para calcular el área de poligonos (Triangulos y
	 * rectangulos) el programa debe de ser capaz de almancenar un arreglo de N
	 * triangulos y rectangulos al final mostrar el area y datos de cada uno
	 * 
	 * Para ello se tendrá Una super clase llamada poligono una sub clase llamada
	 * rectangulo una sub clase llamada triangulo
	 */

	static ArrayList<Poligono> poligonos = new ArrayList<>();
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		llenarPoligono();
		mostrarResultados();

	}
	
	public static void llenarPoligono() {
		int opcion;
		char respuesta;
		do {
			do {
				System.out.println("Escribe el poligono que desea");
				System.out.println("1. Triangulo");
				System.out.println("2. Rectangulo");
				System.out.println("Escriba la opción:");
				opcion = teclado.nextInt();
				
			} while(opcion < 1 || opcion > 2);
			
			System.out.println("");
			switch(opcion) {
				case 1:
					// triangulo
					System.out.println("1. Triangulo");
					llenarTriangulo();
					break;	
				case 2:
					// rectangulo
					System.out.println("2. Rectangulo");
					llenarRectangulo();
					break;	
			}
			
			System.out.println("Desea introducir otro poligono (s/n)");
			respuesta = teclado.next().charAt(0);
			System.out.println("");
		} while(respuesta == 's' || respuesta == 'S');
	}
	
	public static void llenarTriangulo() {
		double lado1, lado2, lado3;
		
		System.out.println("Escriba el lado1 del triangulo:");
		lado1 = teclado.nextDouble();
		System.out.println("Escriba el lado2 del triangulo:");
		lado2 = teclado.nextDouble();
		System.out.println("Escriba el lado3 del triangulo:");
		lado3 = teclado.nextDouble();
		System.out.println("");
		
		Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
		poligonos.add(triangulo);
	}
	
	public static void llenarRectangulo() {
		double lado1, lado2;
		
		System.out.println("Escriba el lado1 del rectangulo:");
		lado1 = teclado.nextDouble();
		System.out.println("Escriba el lado2 del rectangulo:");
		lado2 = teclado.nextDouble();
		System.out.println("");
		
		Rectangulo rectangulo = new Rectangulo(lado1, lado2);
		poligonos.add(rectangulo);
	}
	
	public static void mostrarResultados() {
		for(Poligono poli: poligonos) {
			System.out.println(poli.toString());
			System.out.println("Area: " + poli.area());
			System.out.println("");
		}
		
	}

}
