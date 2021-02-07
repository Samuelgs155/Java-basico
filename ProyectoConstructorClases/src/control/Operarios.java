package control;

import java.util.Scanner;

public class Operarios {

	Scanner teclado;
	int[] sueldos;
	
	/**
	 * Se desea guardar los sueldos de 5 operarios en un vector. 
	 * Realizar la creación y carga del vector en el constructor.
	 * @param args
	 */
	public static void main(String[] args) {
		Operarios op=new Operarios();
        op.imprimir();

	}
	
	public Operarios() {
		this.teclado = new Scanner(System.in);
        this.sueldos = new int[5];
        
        for(int i=0; i < 5; i++) {
            System.out.print("Ingrese el sueldo del operario: ");
            sueldos[i]=teclado.nextInt();
        }
	}

	public void imprimir() {
        for(int i=0;i<5;i++) {
            System.out.println(sueldos[i]);
        }
    }
}
