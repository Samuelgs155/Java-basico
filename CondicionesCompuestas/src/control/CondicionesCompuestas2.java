package control;

import java.util.Scanner;

public class CondicionesCompuestas2 {

	/**
	 * e carga una fecha (día, mes y año) por teclado. 
	 * Mostrar un mensaje si corresponde al primer trimestre del año 
	 * (enero, febrero o marzo) Cargar por teclado el valor numérico del día, mes y año.
		Ejemplo: dia:10 mes:1 año:2010.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
        int dia;
        int mes;
        int año;
        
        System.out.print("Ingrese # de día:");
        dia=teclado.nextInt();
        System.out.print("Ingrese # de mes:");
        mes=teclado.nextInt();
        System.out.print("Ingrese # de año:");
        año=teclado.nextInt();
        if (mes==1 || mes==2 || mes==3) {
            System.out.print("Corresponde al primer trimestre");
        }

	}

}
