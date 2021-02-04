package problemas;

import java.util.Scanner;

public class CargaValores {

	/**
	 * Se realiza la carga de 10 valores enteros por teclado. Se desea conocer:
		a) La cantidad de valores ingresados negativos.
		b) La cantidad de valores ingresados positivos.
		c) La cantidad de múltiplos de 15.
		d) El valor acumulado de los números ingresados que son pares.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double valor;
		
		int numValoresPositivos = 0;
		int numValoresNegativos = 0;
		int numValoresMult15 = 0;
		double valorAcumuladoNumPares = 0;
		
		for(int i=0; i < 10; i++) {
			System.out.print("Ingrese el valor " + (i+1) + ": ");
			valor = teclado.nextDouble();
			
			if(valor > 0) {
				numValoresPositivos++;
			} else {
				numValoresNegativos++;
			}
			
			if(valor % 15 == 0) {
				numValoresMult15++;
			}
			
			if(valor %2 == 0) {
				valorAcumuladoNumPares += valor;
			}			
		}
		
		System.out.println("El número de valores positivos ingresado es de " + numValoresPositivos);
		System.out.println("El número de valores negativos ingresado es de " + numValoresNegativos);
		System.out.println("El número de valores múltiplos de 15 ingresado es de " + numValoresMult15);
		System.out.println("El valor acumulado de los números pares ingresados es de " + valorAcumuladoNumPares);

	}

}
