package problemas;

import java.util.Scanner;

public class NumeroParesImpares {

	/**
	 * Desarrollar un programa que permita cargar n n�meros enteros y 
	 * luego nos informe cu�ntos valores fueron pares y cu�ntos impares.
		Emplear el operador % en la condici�n de la estructura condicional:
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
        int n,x,valor,pares,impares;
        x=1;
        pares=0;
        impares=0;
        System.out.print("Cuantos n�meros ingresar�:");
        n=teclado.nextInt();
        while (x<=n) {
            System.out.print("Ingrese el valor:");
            valor=teclado.nextInt();
            if (valor%2==0) {
                pares=pares + 1;
            } else {
                impares=impares + 1;
            }
            x=x + 1;
        }
        System.out.print("Cantadad de pares:");
        System.out.println(pares);
        System.out.print("Cantidad de impares:");
        System.out.print(impares);

	}

}
