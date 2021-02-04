package problemas;

import java.util.Scanner;

public class LadosTriangulos {
	
	
	/**
	 * Realizar un programa que lea los lados de n triángulos, e informar:
		a) De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales), 
		isósceles (dos lados iguales), o escaleno (ningún lado igual)
		b) Cantidad de triángulos de cada tipo.
		c) Tipo de triángulo que posee menor cantidad.
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
		
		System.out.print("Ingrese el número de triángulos: ");
		numTriangulos = teclado.nextInt();
		System.out.println("");
		
		for(int i=0; i<numTriangulos; i++) {
			System.out.println("Ingrese los datos del triángulo " + (i+1) + ": ");
			System.out.print("Lado 1: ");
			lado1 = teclado.nextDouble();
			System.out.print("Lado 2: ");
			lado2 = teclado.nextDouble();
			System.out.print("Lado 3: ");
			lado3 = teclado.nextDouble();
			
			if((lado1 == lado2) && (lado2 == lado3)) {
				System.out.println("El triángulo es equilatero.");
				numTriangulosEq++;
			} else if((lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3)) {
				System.out.println("El triángulo es escaleno.");
				numTriangulosEsc++;
			} else {
				System.out.println("El triángulo es isósceles.");
				numTriangulosIsos++;
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("El número de triángulos equilateros es de " + numTriangulosEq);
		System.out.println("El número de triángulos escalenos es de " + numTriangulosEsc);
		System.out.println("El número de triángulos isósceles es de " + numTriangulosIsos);
		System.out.println("");
		if((numTriangulosEq > numTriangulosEsc) && (numTriangulosEq > numTriangulosIsos)) {
			System.out.println("Los triángulos en su mayoría son EQUILATEROS");
		} else {
			if(numTriangulosEsc > numTriangulosIsos) {
				System.out.println("Los triángulos en su mayoría son ESCALENOS.");
			} else {
				System.out.println("Los triángulos en su mayoría son ISÓSCELES.");
			}
		}
		
	}

}
