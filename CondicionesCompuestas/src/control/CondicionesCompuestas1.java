package control;

import java.util.Scanner;

public class CondicionesCompuestas1 {

	/**
	 * Confeccionar un programa que lea por teclado tres números distintos 
	 * y nos muestre el mayor.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
        int num1;
        int num2;
        int num3;
        
        System.out.print("Ingrese primer valor:");
        num1=teclado.nextInt();
        System.out.print("Ingrese segundo valor:");
        num2=teclado.nextInt();
        System.out.print("Ingrese tercer valor:");
        num3=teclado.nextInt();
        
        if ( (num1 > num2) && (num1 > num3)) {
            System.out.print("El número mayor es: " + num1);
        } else {
            if (num2>num3) {
            	System.out.print("El número mayor es: " + num2);
            }else {
            	System.out.print("El número mayor es: " + num3);
            }
        }

	}

}
