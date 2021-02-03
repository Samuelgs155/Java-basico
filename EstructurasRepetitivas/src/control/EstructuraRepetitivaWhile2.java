package control;

import java.util.Scanner;

public class EstructuraRepetitivaWhile2 {

	/**
	 * Escribir un programa que solicite la carga de un valor positivo y 
	 * nos muestre desde 1 hasta el valor ingresado de uno en uno.
	Ejemplo: Si ingresamos 30 se debe mostrar en pantalla los números del 1 al 30.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
        int n;
        int x;
        System.out.print("Ingrese el valor final:");
        n=teclado.nextInt();
        x=1;
        while (x<=n) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        }

	}

}
