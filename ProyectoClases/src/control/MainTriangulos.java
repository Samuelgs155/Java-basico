package control;

import beans.Triangulo;

public class MainTriangulos {

	/**
	 * Desarrollar un programa que cargue los lados de un triángulo e implemente los
	 * siguientes métodos: inicializar los atributos, imprimir el valor del lado
	 * mayor y otro método que muestre si es equilátero o no.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Triangulo triangulo = new Triangulo();
		triangulo.inicializar();
		triangulo.imprimirLadoMayor();
		triangulo.esEquilatero();
	}
}
