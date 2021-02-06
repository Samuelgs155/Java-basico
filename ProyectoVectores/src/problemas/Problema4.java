package problemas;

import java.util.Scanner;

public class Problema4 {

	/**
	 * Cargar un vector de 10 elementos 
	 * y verificar posteriormente si el mismo está ordenado de menor a mayor.
	 * @param args
	 */
	public static void main(String[] args) {
		Problema4 pv=new Problema4();
        pv.cargar();
        pv.verificarOrdenado();

	}

	private Scanner teclado;
    private int[] vec;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        vec=new int[10];
        for(int f=0;f<10;f++) {
            System.out.print("Ingrese elemento:");
            vec[f]=teclado.nextInt();
        }
    }
    
    public void verificarOrdenado() {
        int orden=1;
        for(int f=0;f<9;f++) {
            if (vec[f+1]<vec[f]) {
                orden=0;
            }
        }
        if (orden==1) {
            System.out.println("Esta ordenado de menor a mayor");
        } else {
            System.out.println("No esta ordenado de menor a mayor");
        }
    }
}
