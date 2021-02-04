package problemas;

import java.util.Scanner;

public class LadosTriangulos {
	
	
	/**
	 * Realizar un programa que lea los lados de n tri�ngulos, e informar:
		a) De cada uno de ellos, qu� tipo de tri�ngulo es: equil�tero (tres lados iguales), 
		is�sceles (dos lados iguales), o escaleno (ning�n lado igual)
		b) Cantidad de tri�ngulos de cada tipo.
		c) Tipo de tri�ngulo que posee menor cantidad.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int numTriangulos;
		int numTriangulosEq = 0;
		int numTriangulosEsc = 0;
		int numTriangulosIsos = 0;
		
		double lado1;
		double lado2;
		double lado3;
		
		System.out.print("Ingrese el n�mero de tri�ngulos: ");
		numTriangulos = teclado.nextInt();
		System.out.println("");
		
		for(int i=0; i<numTriangulos; i++) {
			System.out.println("Ingrese los datos del tri�ngulo " + (i+1) + ": ");
			System.out.print("Lado 1: ");
			lado1 = teclado.nextDouble();
			System.out.print("Lado 2: ");
			lado2 = teclado.nextDouble();
			System.out.print("Lado 3: ");
			lado3 = teclado.nextDouble();
			
			if((lado1 == lado2) && (lado2 == lado3)) {
				System.out.println("El tri�ngulo es equilatero.");
				numTriangulosEq++;
			} else if((lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3)) {
				System.out.println("El tri�ngulo es escaleno.");
				numTriangulosEsc++;
			} else {
				System.out.println("El tri�ngulo es is�sceles.");
				numTriangulosIsos++;
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("El n�mero de tri�ngulos equilateros es de " + numTriangulosEq);
		System.out.println("El n�mero de tri�ngulos escalenos es de " + numTriangulosEsc);
		System.out.println("El n�mero de tri�ngulos is�sceles es de " + numTriangulosIsos);
		System.out.println("");
		if((numTriangulosEq > numTriangulosEsc) && (numTriangulosEq > numTriangulosIsos)) {
			System.out.println("Los tri�ngulos en su mayor�a son EQUILATEROS");
		} else {
			if(numTriangulosEsc > numTriangulosIsos) {
				System.out.println("Los tri�ngulos en su mayor�a son ESCALENOS.");
			} else {
				System.out.println("Los tri�ngulos en su mayor�a son IS�SCELES.");
			}
		}
		
	}

}
