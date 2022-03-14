package ejercicios;

import java.util.Scanner;

public class Programa04 {
	

	public static void main(String[] args) {
		float salarioMensual = 1000;
		float numeroCochesVendidos;
		float plusCocheVendido;
		float total = 0;
		
		Scanner teclado = new Scanner(System.in);		
		System.out.println("Una compañía de venta de coches paga a sus empleados de ventas");
		System.out.println("1000 euros mensuales, más 150 por coche vendido, más el 5% del valor del coche");
		System.out.println("Juan tiene la mitad de lo que posee Luis y Guillermo juntos");
		
		System.out.println("");
		System.out.println("Programa que calcula el salario mensual de un vendedor");
		
		System.out.println("Escriba cuántos coches vendió:");
		numeroCochesVendidos = teclado.nextFloat();
		
		plusCocheVendido = 150 * numeroCochesVendidos;
		
		for(int i=0;i<numeroCochesVendidos;i++) {
			System.out.println("Escriba el precio del coche nº" + (i+1));
			float precioCoche = teclado.nextFloat();
			float comision = 0.05f * precioCoche;
			total = total + comision;
		}
		total = total + plusCocheVendido + salarioMensual;
		System.out.println("");
		System.out.println("El total es: " + total);
		
	}

}
