package beans;

import java.util.Scanner;

public class Coordenadas {
	
	private Scanner teclado;
    int x,y;
    
    public void inicializar() {
        teclado=new Scanner(System.in);
        System.out.print("Ingrese coordenada x :");
        x=teclado.nextInt();
        System.out.print("Ingrese coordenada y :");
        y=teclado.nextInt();
    }
    
    public void imprimirCuadrante() {
        if (x>0 && y>0) {
            System.out.print("Se encuentra en el primer cuadrante.");
        } else {
            if (x<0 && y>0) {
                System.out.print("Se encuentra en el segundo cuadrante.");
            } else {
                if (x<0 && y<0) {
                    System.out.print("Se encuentra en el tercer cuadrante.");
                } else {
                    if (x>0 && y<0) {
                        System.out.print("Se encuentra en el cuarto cuadrante.");
                    } else {
                        System.out.print("El punto no está en un cuadrante.");
                    }
                }
            }
        }
    }

}
