package problemas;

import java.util.Scanner;

public class SumaAcumulada {

	/**
	 * Realizar un programa que acumule (sume) 
	 * valores ingresados por teclado hasta ingresar el 9999 
	 * (no sumar dicho valor, indica que ha finalizado la carga). 
	 * Imprimir el valor acumulado e informar si dicho valor es cero, mayor a cero o menor a cero
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double valor;
		double sumaAcumulada = 0;
		
		do {
			System.out.print("Ingrese un valor: (Salir con 9999): ");
			valor = teclado.nextDouble();
			
			if(valor != 9999) {
				sumaAcumulada += valor;
			}
		} while( valor != 9999);
		
		System.out.println("");
		System.out.println("La suma acumulada es: " + sumaAcumulada);
		
		if(sumaAcumulada > 0) {
			System.out.println("El valor es mayor que 0");
		} else if (sumaAcumulada < 0) {
			System.out.println("El valor es menor que 0");
		} else {
			System.out.println("El valor es igual a 0");
		}	

	}

}
