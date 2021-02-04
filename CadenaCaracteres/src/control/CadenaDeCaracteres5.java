package control;

import java.util.Scanner;

public class CadenaDeCaracteres5 {

	
	/**
	 * Solicitar el ingreso de dos apellidos. 
	 * Mostrar un mensaje si son iguales o distintos.
	 * @param args
	 */
	public static void main(String[] args) {
		
Scanner teclado=new Scanner(System.in);
		
        String apellido1;
        String apellido2;
        
        System.out.print("Ingrese primer apellido:");
        apellido1=teclado.next();
        System.out.print("Ingrese segundo apellido:");
        apellido2=teclado.next();
        
        if (apellido1.equalsIgnoreCase(apellido2)) {
            System.out.print("Los apellidos son iguales sin tener en cuenta mayúsculas y minúsculas");
        } else {
            System.out.print("Los apellidos son distintos sin tener en cuenta mayúsculas y minúsculass");
        }

	}

}
