package problemas;

import java.util.Scanner;

public class Problema5 {
	
	private Scanner teclado;
    private String oracion;

	/**
	 * Codifique un programa que permita cargar una oraci�n por teclado, 
	 * luego mostrar cada palabra ingresada en una l�nea distinta. 
		Por ejemplo si cargo: 
		  La ma�ana est� fr�a. 
		Debe aparecer:		 
		La 
		ma�ana 
		est� 
		fr�a. 

	 * @param args
	 */
	public static void main(String[] args) {
		Problema5 cad=new Problema5();
        cad.imprimir();

	}

	public Problema5() {
        teclado=new Scanner(System.in);
        System.out.print("Ingrese oraci�n:");
        oracion=teclado.nextLine();
   }
   
   public void imprimir() {
       for(int f=0;f<oracion.length();f++) {
           if (oracion.charAt(f)==' ') {
               System.out.println();
           } else {
               System.out.print(oracion.charAt(f));
           }
       }
   }
}
