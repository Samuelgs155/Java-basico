package control1;

import java.util.Scanner;

public class PerimetroCuadrado {

	/**
	 * Realizar la carga del lado de un cuadrado, 
	 * mostrar por pantalla el perímetro del mismo 
	 * (El perímetro de un cuadrado se calcula multiplicando el valor del lado por cuatro)
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);		
		int lado;
		int perimetro;		
		System.out.println("Ingrese el lado del cuadrado:");
		lado = teclado.nextInt();
		perimetro = 4 * lado;
		System.out.println("El perimetro del cuadrado es:");
		System.out.println(perimetro);
	}

}
