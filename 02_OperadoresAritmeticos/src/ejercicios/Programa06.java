package ejercicios;

import java.util.Scanner;

public class Programa06 {

	public static void main(String[] args) {
		
		int horasTotales, semanas, dias, horas;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Programa que dado el total de horas devuelve el número de semanas, días y horas equivalente ");
		System.out.println("");
		/* 1000 horas es El equivalente es 5 semanas, 6 dias, 16 horas*/
		
		System.out.println("Escriba el número de horas");
		horasTotales = teclado.nextInt();
		
		semanas = horasTotales / 168;
		dias = (horasTotales % 168) / 24;
		horas = horasTotales % 24;
		System.out.println("El equivalente es " + semanas + " semanas, " + dias + " dias, " + horas + " horas");
	}
}
