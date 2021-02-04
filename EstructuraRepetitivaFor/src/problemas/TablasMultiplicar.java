package problemas;

import java.util.Scanner;

public class TablasMultiplicar {
	
	
	/**
	 * Confeccionar un programa que permita ingresar un valor del 1 al 10 
	 * y nos muestre la tabla de multiplicar del mismo (los primeros 12 términos)
		Ejemplo: Si ingreso 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 36.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int valor;
		
		System.out.print("Ingrese un número entero del 1 al 10: ");
		valor = teclado.nextInt();
		
		System.out.println("La tabla de multiplicar del " + valor + " es:");
		for(int i=0; i<=12;i++) {
			System.out.println(valor + " * " + i + " = " + (valor*i));
		}
		
	}

}
