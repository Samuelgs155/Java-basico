package control;

import java.util.Scanner;

public class CondicionesCompuestas2 {

	/**
	 * e carga una fecha (d�a, mes y a�o) por teclado. 
	 * Mostrar un mensaje si corresponde al primer trimestre del a�o 
	 * (enero, febrero o marzo) Cargar por teclado el valor num�rico del d�a, mes y a�o.
		Ejemplo: dia:10 mes:1 a�o:2010.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
        int dia;
        int mes;
        int a�o;
        
        System.out.print("Ingrese # de d�a:");
        dia=teclado.nextInt();
        System.out.print("Ingrese # de mes:");
        mes=teclado.nextInt();
        System.out.print("Ingrese # de a�o:");
        a�o=teclado.nextInt();
        if (mes==1 || mes==2 || mes==3) {
            System.out.print("Corresponde al primer trimestre");
        }

	}

}
