package problemas;

import java.util.Scanner;

public class Coordenadas {

	/**
	 * Escribir un programa que pida ingresar la coordenada de un punto en el plano, 
	 * es decir dos valores enteros x e y (distintos a cero).
		Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto. 
		(1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, etc.)
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		double coordenadaX;
		double coordenadaY;
		
		System.out.println("Ingrese la coordenada X:");
		coordenadaX = teclado.nextDouble();
		System.out.println("Ingrese la coordenada Y:");
		coordenadaY = teclado.nextDouble();
		
		if((coordenadaX != 0) && (coordenadaY != 0)) {
			if((coordenadaX > 0) && (coordenadaY > 0)) {
				System.out.println("El punto está en el 1 cuadrante.");
			} else if ((coordenadaX < 0) && (coordenadaY > 0)) {
				System.out.println("El punto está en el 2 cuadrante.");
			} else if ((coordenadaX < 0) && (coordenadaY < 0)) {
				System.out.println("El punto está en el 3 cuadrante.");
			} else if ((coordenadaX < 0) && (coordenadaY > 0)) {
				System.out.println("El punto está en el 4 cuadrante.");
			} else if ((coordenadaX == 0) && (coordenadaY > 0)) {
				System.out.println("El punto está sobre el eje y positivo.");
			} else if ((coordenadaX == 0) && (coordenadaY < 0)) {
				System.out.println("El punto está sobre el eje y negativo.");
			} else if ((coordenadaX > 0) && (coordenadaY == 0)) {
				System.out.println("El punto está sobre el eje x positivo.");
			}else if ((coordenadaX < 0) && (coordenadaY == 0)) {
				System.out.println("El punto está sobre el eje x negativo.");
			}			
		} else {
			System.out.println("El punto está en el centro del eje de coordenadas.");
		}
		
		
	}

}
