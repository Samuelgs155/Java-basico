package control;

import beans.Triangulo;

public class MainTriangulos {

	/**
	 * Desarrollar un programa que cargue los lados de un tri�ngulo e implemente los
	 * siguientes m�todos: inicializar los atributos, imprimir el valor del lado
	 * mayor y otro m�todo que muestre si es equil�tero o no.
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
