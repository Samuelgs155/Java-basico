package ejercicio05;

import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
		/*
		 * Programa para trabajar con triangulos is�sceles Defina los atributos
		 * necesarios Haga m�todos de consulta un m�todo constructor cree metodos para
		 * el calcular el per�metro y �rea de un tri�ngulo cree un m�todo para que
		 * devuelva el �rea del tri�ngulo de mayor superficie
		 */
		TrianguloIsosceles[] triangulos;
		int numTriangulos;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba cuantos tri�ngulos is�sceles va a ingresar:");
		numTriangulos = teclado.nextInt();
		triangulos = new TrianguloIsosceles[numTriangulos];
		System.out.println("");

		for (int i = 0; i < numTriangulos; i++) {
			System.out.println("Escriba las caracter�sticas del tri�ngulo is�sceles " + (i + 1) + ":");
			System.out.println("Escriba el lado del tri�ngulo");
			double lado = teclado.nextDouble();
			System.out.println("Escriba la base del tri�ngulo");
			double base = teclado.nextDouble();
			triangulos[i] = new TrianguloIsosceles(base, lado);
			System.out.println("");
		}

		for (int i = 0; i < numTriangulos; i++) {
			System.out.println("El �rea del tri�ngulo is�sceles " + (i + 1) + " es " + triangulos[i].obtenerArea());
			System.out.println(
					"El per�metro del tri�ngulo is�sceles " + (i + 1) + " es " + triangulos[i].obtenerPerimetro());
			System.out.println("");
		}

		int indiceMasGrande = indiceTrianguloMasGrande(triangulos);
		System.out.println("");
		System.out.println("Datos del tri�ngulos is�sceles m�s grande es:");
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
