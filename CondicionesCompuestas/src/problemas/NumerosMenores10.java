package problemas;

import java.util.Scanner;

public class NumerosMenores10 {

	/**
	 * Se ingresan por teclado tres n�meros, 
	 * si todos los valores ingresados son menores a 10, 
	 * imprimir en pantalla la leyenda "Todos los n�meros son menores a diez". 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("Ingrese el primer n�mero: ");
		num1 = teclado.nextInt();
		System.out.println("Ingrese el segundo n�mero: ");
		num2 = teclado.nextInt();
		System.out.println("Ingrese el tercer n�mero: ");
		num3 = teclado.nextInt();
		
		if((num1 < 10) && (num2 < 10) && (num3 < 10)) {
			System.out.println("Todos los n�meros son menores a diez");
		} else {
			System.out.println("Alg�n n�mero es mayor a diez");
		}

	}

}
