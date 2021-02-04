package beans;

import java.util.Scanner;

public class Persona {
	
	private Scanner teclado;
	private String nombre;
	private int edad;
	
	
	public void inicializar() {
		teclado = new Scanner(System.in);
		System.out.println("Escriba el nombre de la persona");
		this.nombre = teclado.next();
		System.out.println("Escriba la edad de la persona");
		this.edad = teclado.nextInt();
	}
	
	public void imprimir() {
        System.out.println("Nombre:"+nombre);
        System.out.println("Edad:"+edad);
    }
    
    public void esMayorEdad() {
        if (edad>=18) {
            System.out.print(nombre+" es mayor de edad.");
        } else {
            System.out.print(nombre+" no es mayor de edad.");
        }
    }
	

}
