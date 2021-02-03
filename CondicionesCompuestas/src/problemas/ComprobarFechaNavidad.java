package problemas;

import java.util.Scanner;

public class ComprobarFechaNavidad {
	
	/**
	 * Realizar un programa que pida cargar una fecha cualquiera, 
	 * luego verificar si dicha fecha corresponde a Navidad.
	 * @param args
	 * @return
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int dia;
		int mes;
		int anyo;
		
		System.out.println("ingrese el # de dia");
		dia = teclado.nextInt();
		System.out.println("ingrese el # de mes");
		mes = teclado.nextInt();
		System.out.println("ingrese el # de año");
		anyo = teclado.nextInt();
		
		if((dia == 25) && (mes == 12)) {
			System.out.println("FELICIDADES ES NAVIDAD");
			System.out.println("Fecha: " + dia + "-" + mes + "-" + anyo);
		} else {
			System.out.println("Fecha: " + dia + "-" + mes + "-" + anyo);
		}
	}

}
