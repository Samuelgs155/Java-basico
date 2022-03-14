package ejercicios;

import java.util.Scanner;

public class Programa03 {
	

	public static void main(String[] args) {
		float dineroGuillermo;
		float dineroLuis;
		float dineroJuan;
		float total;
		
		Scanner teclado = new Scanner(System.in);		
		System.out.println("Guillermo tiene N dólares");
		System.out.println("Luis tiene la mitad de lo que posee Guillermo");
		System.out.println("Juan tiene la mitad de lo que posee Luis y Guillermo juntos");
		
		System.out.println("");
		System.out.println("Programa que calcula el dinero que tienen entre los tres");
		
		System.out.println("Escriba la cantidad de dinero que tiene Guillermo:");
		dineroGuillermo = teclado.nextFloat();
		dineroLuis = dineroGuillermo/2;
		dineroJuan = (dineroGuillermo + dineroLuis)/2;
		total = dineroGuillermo + dineroLuis + dineroJuan;
		System.out.println("");
		System.out.println("El total es: " + total);
		
	}

}
