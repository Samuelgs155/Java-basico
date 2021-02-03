package problemas;

import java.util.Scanner;

public class ValoresIguales {

	
	/**
	 * Se ingresan tres valores por teclado, si todos son iguales 
	 * se imprime la suma del primero con el segundo 
	 * y a este resultado se lo multiplica por el tercero.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		
		int resultado;
		
		System.out.println("Ingrese el primer valor");
		num1=teclado.nextInt();
		System.out.println("Ingrese el segundo valor");
		num2=teclado.nextInt();
		System.out.println("Ingrese el tercer valor");
		num3=teclado.nextInt();
		
		if((num1 == num2) && (num2 == num3)) {
			System.out.println("Los tres números son iguales");
			resultado = (num1 + num2) * num3;
			System.out.println(resultado);
		} else {
			System.out.println("Los tres números son distintos.");
		}
		

	}

}
