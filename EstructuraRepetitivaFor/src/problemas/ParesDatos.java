package problemas;

import java.util.Scanner;

public class ParesDatos {

	/**
	 * Confeccionar un programa que lea n pares de datos, 
	 * cada par de datos corresponde a la medida de la base y la altura de un triángulo. 
	 * El programa deberá informar:
		a) De cada triángulo la medida de su base, su altura y su superficie.
		b) La cantidad de triángulos cuya superficie es mayor a 12.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numPares;
		double base;
		double altura;
		double[] bases;
		double[] alturas;
		double[] superficies;
		int numTriangulosSupmayorA12 = 0;
		
		System.out.print("Ingrese el número de pares de datos a introducir: ");
		numPares = teclado.nextInt();
		bases = new double[numPares];
		alturas = new double[numPares];
		superficies = new double[numPares];
		
		for(int i = 0; i < numPares; i++) {
			System.out.println("Par de datos número: " + (i+1));
			System.out.print("Ingrese la base del triángulo: ");
			base = teclado.nextDouble();
			System.out.print("Ingrese la altura del triángulo: ");
			altura = teclado.nextDouble();
			bases[i] = base;
			alturas[i] = altura;
			superficies[i] = (double) (0.5 * base * altura);
			if( superficies[i] > 12) {
				numTriangulosSupmayorA12++;
			}
		}
		System.out.println("");
		for(int i = 0; i < numPares; i++) {
			System.out.println("Triángulo " + (i+1) + ": ");
			System.out.println("Base: " + bases[i] + ", Altura: " + alturas[i] + ", Superficie: " + superficies[i]);
		}
		
		System.out.println("\n# triángulos con superficie mayor a 12: " + numTriangulosSupmayorA12);
		
		
	}

}
