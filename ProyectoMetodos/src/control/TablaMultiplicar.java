package control;

import java.util.Scanner;

public class TablaMultiplicar {
	
	/**
	 * Confeccionar una clase que permita ingresar valores enteros por teclado 
	 * y nos muestre la tabla de multiplicar de dicho valor. 
	 * Finalizar el programa al ingresar el -1.
	 * @param args
	 */
	public static void main(String[] args) {
		TablaMultiplicar tm = new TablaMultiplicar();
		tm.cargarValor();
	}
	
	public void cargarValor() {
		Scanner teclado = new Scanner(System.in);
		int valor;
		
		do {
			System.out.print("Ingrese un valor: (salir con -1) ");
			valor = teclado.nextInt();
			
			if(valor != -1) {
				calcular(valor);
				System.out.println("");
			} else {
				System.out.println("Saliendo....");
			}
			
		}while(valor != -1);
	}

	public void calcular(int valor) {
		for(int i=1; i<= 10; i++) {
			System.out.println(valor + " * " + i + " = " + (valor*i));
		}
	}
}
