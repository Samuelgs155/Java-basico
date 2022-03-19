package ejercicio02;

import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
		/*
		 * Programa que dirija el movimiento de objeto en un objeto.
		 * Actualice su posicion en el mismo.
		 * Movimientos posibles, arriba, abajo, izquierda, derecha
		 * tras elegir un movimiento se mostrará la dirección elegida y las nuevas coordenadas
		 */
		Scanner teclado = new Scanner(System.in);
		Tablero tablero;
		int x;
		int y;
		int opcion;
		int incremento = 0;
		
		System.out.println("Escriba la coordenada inicial x: ");
		x= teclado.nextInt();
		System.out.println("Escriba la coordenada inicial y: ");
		y= teclado.nextInt();
		
		tablero = new Tablero(x, y);
		
		do {
			System.out.println("\n\t :MENU:.");
			System.out.println("1. Mover hacia ARRIBA");
			System.out.println("2. Mover hacia ABAJO");
			System.out.println("3. Mover hacia IZQUIERDA");
			System.out.println("4. Mover hacia DERECHA");
			System.out.println("5. SALIR");
			System.out.println("Escriba la opción");
			opcion = teclado.nextInt();
			
			if(opcion != 5) {
				System.out.println("Escribe cuántos espacios te vas a mover:");
				incremento = teclado.nextInt();
			}
			
			switch(opcion) {
				case 1:
					tablero.moverArriba(incremento);
					break;
				case 2:
					tablero.moverAbajo(incremento);
					break;
				case 3:
					tablero.moverIzquierda(incremento);
					break;
				case 4:
					tablero.moverDerecha(incremento);
					break;
				default:
					System.out.println("Opción errónea");
					break;
			}
			
			System.out.println("\nPosición actual (X,Y): (" + tablero.getX() + "," + tablero.getY() + ")");
			
			
		} while(opcion != 5);
		

	}

}
