package problemas;

import java.util.Scanner;

public class Coordenadas {
	
	
	/**
	 * Escribir un programa que pida ingresar coordenadas (x,y) que representan puntos en el plano.
		Informar cu�ntos puntos se han ingresado en el primer, segundo, tercer y cuarto cuadrante. 
		Al comenzar el programa se pide que se ingrese la cantidad de puntos a procesar. 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
        int n;
        int x;
        int y;
        int cant1;
        int cant2;
        int cant3;
        int cant4;
        
        cant1=0;
        cant2=0;
        cant3=0;
        cant4=0;
        
        System.out.print("Cantidad de puntos:");
        n=teclado.nextInt();
        
        for(int j = 1; j <= n; j++) {
            System.out.print("Ingrese coordenada x:");
            x = teclado.nextInt();
            System.out.print("Ingrese coordenada y:");
            y = teclado.nextInt();
            
            if (x > 0 && y > 0) {
                cant1++;
            } else {
                if (x < 0 && y > 0) {
                    cant2++;
                } else {
                    if (x < 0 && y < 0) {
                        cant3++;
                    } else {
                        if (x > 0 && y < 0) {
                        	cant4++;
                        }
                    }
                }
            }
        }
        System.out.print("Cantidad de puntos en el primer cuadrante:");
        System.out.println(cant1);
        System.out.print("Cantidad de puntos en el segundo cuadrante:");
        System.out.println(cant2);
        System.out.print("Cantidad de puntos en el tercer cuadrante:");
        System.out.println(cant3);
        System.out.print("Cantidad de puntos en el cuarto cuadrante:");
        System.out.println(cant4);
	}

}
