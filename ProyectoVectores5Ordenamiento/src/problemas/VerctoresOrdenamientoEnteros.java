package problemas;

import java.util.Scanner;

public class VerctoresOrdenamientoEnteros {
	private Scanner teclado;
    private int[] vec;
    
    public static void main(String[] ar) {
    	VerctoresOrdenamientoEnteros pv=new VerctoresOrdenamientoEnteros();
        pv.cargar();
        pv.ordenar();
        pv.imprimir();
    }
    
    public void cargar() {
        teclado=new Scanner(System.in);
        System.out.print("Cuantos elementos tendr� el vector:");
         int cant;
        cant=teclado.nextInt();
        vec=new int[cant];
	    for(int f=0;f<vec.length;f++) {
            System.out.print("Ingrese elemento:");
            vec[f]=teclado.nextInt();
	    }
	}
	
    public void ordenar() {
        for(int k=0;k<vec.length;k++) {
            for(int f=0;f<vec.length-1-k;f++) {
                if (vec[f]>vec[f+1]) {
                    int aux;
                    aux=vec[f];
                    vec[f]=vec[f+1];
                    vec[f+1]=aux;
                }
            }
        }
    }
	
    public void imprimir() {
	    System.out.println("Vector ordenados de menor a mayor.");
        for(int f=0;f<vec.length;f++) {
            System.out.println(vec[f]);
        }
    }
}
