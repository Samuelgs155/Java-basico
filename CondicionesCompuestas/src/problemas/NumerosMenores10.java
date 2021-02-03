package problemas;

import java.util.Scanner;

public class NumerosMenores10 {

	/**
	 * Se ingresan por teclado tres números, 
	 * si todos los valores ingresados son menores a 10, 
	 * imprimir en pantalla la leyenda "Todos los números son menores a diez". 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("Ingrese el primer número: ");
		num1 = teclado.nextInt();
		System.out.println("Ingrese el segundo número: ");
		num2 = teclado.nextInt();
		System.out.println("Ingrese el tercer número: ");
		num3 = teclado.nextInt();
		
		if((num1 < 10) && (num2 < 10) && (num3 < 10)) {
			System.out.println("Todos los números son menores a diez");
		} else {
			System.out.println("Algún número es mayor a diez");
		}

	}

}
