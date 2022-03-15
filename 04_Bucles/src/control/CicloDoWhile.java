package control;

import java.util.Scanner;

public class CicloDoWhile {

public static void main(String[] args) {
		
		int i = 1;
		int contador;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe cuántos números quieres mostrar:");
		contador = teclado.nextInt();		
		do {
			System.out.println(i);
			i++;
		} while(i <= contador);
	}
}
