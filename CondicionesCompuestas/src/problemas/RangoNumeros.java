package problemas;

import java.util.Scanner;

public class RangoNumeros {

	/**
	 * Escribir un programa en el cual: dada una lista de tres valores numéricos distintos 
	 * se calcule e informe su rango de variación 
	 * (debe mostrar el mayor y el menor de ellos) 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("Ingrese el primer valor");
		num1 = teclado.nextInt();
		System.out.println("Ingrese el segundo valor");
		num2 = teclado.nextInt();
		System.out.println("Ingrese el tercer valor");
		num3 = teclado.nextInt();
		
		if ((num1 < num2) && (num1 < num3)) {
            System.out.print(num1);
        } else {
            if (num2 < num3) {
                System.out.print(num2);
            } else {
                System.out.print(num3);
            }
        }
        System.out.print("-");
        if (num1 > num2 && num1 > num3) {
            System.out.print(num1);
        } else {
            if (num2 > num3) {
                System.out.print(num2);
            } else {
                System.out.print(num3);
            }
        }
		

	}

}
