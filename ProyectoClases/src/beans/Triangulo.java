package beans;

import java.util.Scanner;

public class Triangulo {
	
	Scanner teclado;
	double lado1;
	double lado2;
	double lado3;
	
	public void inicializar() {
		teclado = new Scanner(System.in);
		System.out.println("Ingrese el lado 1 del triángulo:");
		this.lado1 = teclado.nextDouble();
		System.out.println("Ingrese el lado 2 del triángulo:");
		this.lado2 = teclado.nextDouble();
		System.out.println("Ingrese el lado 3 del triángulo:");
		this.lado3 = teclado.nextDouble();
	}
	
	public void imprimirLadoMayor() {
		
		if((lado1 >= lado2) && (lado1 >= lado3)) {
			System.out.println("El lado mayor del triángulo vale: " + lado1);
		} else {
			if(lado2 >= lado3) {
				System.out.println("El lado mayor del triángulo vale: " + lado2);
			} else {
				System.out.println("El lado mayor del triángulo vale: " + lado3);
			}
		}
	}
	
	public void esEquilatero() {
		if(lado1 == lado2 && lado2 == lado3) {
			System.out.println("El triángulo es equilátero.");
		} else {
			System.out.println("El triángulo NO es equilátero.");
		}
	}

}
