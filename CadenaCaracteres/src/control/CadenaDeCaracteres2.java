package control;

import java.util.Scanner;

public class CadenaDeCaracteres2 {

	/**
	 * Solicitar el ingreso del apellido, nombre y edad de dos personas. 
	 * Mostrar el nombre de la persona con mayor edad. 
	 * Realizar la carga del apellido y nombre en una variable de tipo String.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
        String apenom1,apenom2;
        int edad1,edad2;
        System.out.print("Ingrese el apellido y el nombre:");
        apenom1=teclado.nextLine();
        System.out.print("Ingrese edad:");
        edad1=teclado.nextInt();
        System.out.print("Ingrese el apellido y el nombre:");
        teclado.nextLine();
        apenom2=teclado.nextLine();
        System.out.print("Ingrese edad:");
        edad2=teclado.nextInt();
        System.out.print("La persona de mayor edad es:");
        if (edad1>edad2) {
            System.out.print(apenom1);
        } else {
            System.out.print(apenom2);
        }

	}

}
