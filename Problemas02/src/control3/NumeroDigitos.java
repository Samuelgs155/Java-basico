package control3;

import java.util.Scanner;

public class NumeroDigitos {

	/**
	 * Se ingresa por teclado un n�mero positivo de uno o dos d�gitos (1..99) 
	 * mostrar un mensaje indicando si el n�mero tiene uno o dos d�gitos.
		(Tener en cuenta que condici�n debe cumplirse para tener dos d�gitos, 
		un n�mero entero)
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
    	int num;
    	System.out.print("Ingrese un valor entero de 1 o 2 d�gitos:");
    	num=teclado.nextInt();
    	if (num<10) {
    	    System.out.print("Tiene un d�gito");
    	} else {
    	    System.out.print("Tiene dos d�gitos");
    	}
		
	}
}
