package control;

import java.util.Scanner;

public class MayorMenor {
	
	/**
	 * Confeccionar una clase que permita ingresar tres valores por teclado. 
	 * Luego mostrar el mayor y el menor.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		
		int mayor;
		int menor;
		MayorMenor mm = new MayorMenor();
		
		System.out.print("Ingrese el número 1: ");
		num1 = teclado.nextInt();
		System.out.print("Ingrese el número 2: ");
		num2 = teclado.nextInt();
		System.out.print("Ingrese el número 3: ");
		num3 = teclado.nextInt();
		
		mayor = mm.calularMayor(num1, num2, num3);
		menor = mm.calularMenor(num1, num2, num3);
		
		System.out.println("El valor mayor es: " + mayor);
		System.out.println("El valor menor es: " + menor);
	}
	
	public int calularMayor(int num1, int num2, int num3) {
		if((num1 > num2) && (num1 > num3)) {
			return num1;
		} else {
			if(num2 > num3) {
				return num2;
			} else {
				return num3;
			}
		}
	}
	
	public int calularMenor(int num1, int num2, int num3) {
		if((num1 < num2) && (num1 < num3)) {
			return num1;
		} else {
			if(num2 < num3) {
				return num2;
			} else {
				return num3;
			}
		}
	}

}
