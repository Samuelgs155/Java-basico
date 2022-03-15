package control;

import java.util.Scanner;

public class CicloWhile {
	
	public static void main(String[] args) {
		
		int i = 1;
		int contador;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe cuántos números quieres mostrar:");
		contador = teclado.nextInt();		
		while(i <= contador) {			
			System.out.println(i);
			i++;
		}
	}

}
