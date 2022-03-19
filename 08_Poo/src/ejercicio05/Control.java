package ejercicio05;

import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
		/*
		 * Programa para trabajar con triangulos isósceles Defina los atributos
		 * necesarios Haga métodos de consulta un método constructor cree metodos para
		 * el calcular el perímetro y área de un triángulo cree un método para que
		 * devuelva el área del triángulo de mayor superficie
		 */
		TrianguloIsosceles[] triangulos;
		int numTriangulos;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba cuantos triángulos isósceles va a ingresar:");
		numTriangulos = teclado.nextInt();
		triangulos = new TrianguloIsosceles[numTriangulos];
		System.out.println("");

		for (int i = 0; i < numTriangulos; i++) {
			System.out.println("Escriba las características del triángulo isósceles " + (i + 1) + ":");
			System.out.println("Escriba el lado del triángulo");
			double lado = teclado.nextDouble();
			System.out.println("Escriba la base del triángulo");
			double base = teclado.nextDouble();
			triangulos[i] = new TrianguloIsosceles(base, lado);
			System.out.println("");
		}

		for (int i = 0; i < numTriangulos; i++) {
			System.out.println("El área del triángulo isósceles " + (i + 1) + " es " + triangulos[i].obtenerArea());
			System.out.println(
					"El perímetro del triángulo isósceles " + (i + 1) + " es " + triangulos[i].obtenerPerimetro());
			System.out.println("");
		}

		int indiceMasGrande = indiceTrianguloMasGrande(triangulos);
		System.out.println("");
		System.out.println("Datos del triángulos isósceles más grande es:");
		System.out.println(triangulos[indiceMasGrande].mostrarDatos());
	}

	public static int indiceTrianguloMasGrande(TrianguloIsosceles[] triangulos) {
		double area;
		int indice = 0;
		area = triangulos[0].obtenerArea();
		for (int i = 0; i < triangulos.length; i++) {
			if (area > triangulos[i].obtenerArea()) {
				area = triangulos[i].obtenerArea();
				indice = i;
			}
		}
		return indice;
	}

}
