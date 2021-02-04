package control;

import beans.Coordenadas;

public class MainCoordendas {

	/**
	 * Desarrollar una clase que represente un punto en el plano y 
	 * tenga los siguientes métodos: cargar los valores de x e y, 
	 * imprimir en que cuadrante se encuentra dicho punto 
	 * (concepto matemático, primer cuadrante si x e 
	 * y son positivas, si x<0 e y>0 segundo cuadrante, etc.)
	 * @param args
	 */
	public static void main(String[] args) {

		Coordenadas punto1 = new Coordenadas();
		punto1.inicializar();
		punto1.imprimirCuadrante();

	}

}
