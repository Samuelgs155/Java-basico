package control;

import java.util.Scanner;

public class CicloFor {

	public static void main(String[] args) {
		int i = 1;
		int contador;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe cuántos números quieres mostrar:");
		contador = teclado.nextInt();	
		
		for(int j=i; j<=contador;j++) {
			System.out.println(j);
		}

	}

}
