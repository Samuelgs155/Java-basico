package problemas;

import java.util.Scanner;

public class SueldoOperario {

	/**
	 * De un operario se conoce su sueldo y los a�os de antig�edad. 
	 * Se pide confeccionar un programa que lea los datos de entrada e informe:
a) Si el sueldo es inferior a 500 y su antig�edad es igual o superior a 10 a�os, 
	otorgarle un aumento del 20 %, mostrar el sueldo a pagar.
b)Si el sueldo es inferior a 500 pero su antig�edad es menor a 10 a�os, 
	otorgarle un aumento de 5 %.
c) Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int anyosAntiguedad;
		double sueldoOperario;
		
		System.out.println("Ingrese los a�os de antig�edad del operario:");
		anyosAntiguedad = teclado.nextInt();
		System.out.println("Ingrese el sueldo del operario:");
		sueldoOperario = teclado.nextDouble();
		
		if(sueldoOperario < 500) {
			if(anyosAntiguedad >= 10) {
				sueldoOperario = sueldoOperario * 1.20;
				System.out.println("el sueldo del operario es: " + sueldoOperario);
			} else {
				sueldoOperario = sueldoOperario * 1.05;
				System.out.println("el sueldo del operario es: " + sueldoOperario);
			}
			
		} else {
			System.out.println("el sueldo del operario es: " + sueldoOperario);
		}

	}

}
