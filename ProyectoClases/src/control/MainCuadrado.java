package control;

import beans.Cuadrado;

public class MainCuadrado {

	/**
	 * Desarrollar una clase que represente un Cuadrado y tenga los siguientes
	 * m�todos: cargar el valor de su lado, imprimir su per�metro y su superficie.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Cuadrado cuadrado1;
		cuadrado1 = new Cuadrado();
		cuadrado1.inicializar();
		cuadrado1.imprimirPerimetro();
		cuadrado1.imprimirSuperficie();

	}

}
