package problemas;

import java.util.Scanner;

public class Problema3 {

	private Scanner teclado;
	private String clave;

	/**
	 * esarrollar un programa que solicite la carga de una clave. La clase debe
	 * tener dos métodos uno para la carga y otro que muestre si la clave es la
	 * correcta (la clave a comparar es "123abc")
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Problema3 cad=new Problema3();
        cad.verificarClave();

	}

	public Problema3() {
        teclado=new Scanner(System.in);
        System.out.print("Ingrese clave:");
        clave=teclado.nextLine();
    }

	public void verificarClave() {
		if (clave.equals("123abc") == true) {
			System.out.println("Se ingresó la clave en forma correcta");
		} else {
			System.out.println("No se ingresó la clave en forma correcta");
		}
	}
}
