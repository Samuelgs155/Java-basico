package problemas;

import java.util.Scanner;

public class Problema5 {
	
	private Scanner teclado;
    private String oracion;

	/**
	 * Codifique un programa que permita cargar una oración por teclado, 
	 * luego mostrar cada palabra ingresada en una línea distinta. 
		Por ejemplo si cargo: 
		  La mañana está fría. 
		Debe aparecer:		 
		La 
		mañana 
		está 
		fría. 

	 * @param args
	 */
	public static void main(String[] args) {
		Problema5 cad=new Problema5();
        cad.imprimir();

	}

	public Problema5() {
        teclado=new Scanner(System.in);
        System.out.print("Ingrese oración:");
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
