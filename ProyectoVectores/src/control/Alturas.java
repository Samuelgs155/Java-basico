package control;

import java.util.Scanner;

public class Alturas {
	private Scanner teclado;
    private float[] alturas;
    private float promedio;
    
    /**
	 * Definir un vector de 5 componentes de tipo float que representen las alturas de 5 personas.
		Obtener el promedio de las mismas. 
		Contar cuántas personas son más altas que el promedio y cuántas más bajas.
	 * @param ar
	 */
    public static void main(String[] ar) {
    	Alturas alturas = new Alturas();
    	alturas.cargar();
    	alturas.calcularPromedio();
    	alturas.mayoresMenores();
    }

    public void cargar() {
        teclado=new Scanner(System.in);
        alturas=new float[5];
        for(int f=0;f<5;f++) {
            System.out.print("Ingrese la altura de la persona:");
            alturas[f]=teclado.nextFloat();
        }
    }
	
    public void calcularPromedio() {
        float suma;
        suma=0;
        for(int f=0;f<5;f++) {
            suma=suma+alturas[f];
        }
        promedio=suma/5;
        System.out.println("Promedio de alturas:"+promedio);
    }
	
    public void mayoresMenores() {
        int may,men;
        may=0;
        men=0;
        for(int f=0;f<5;f++) {
            if (alturas[f]>promedio) {
	        may++;
            } else {
                if (alturas[f]<promedio) {
                    men++;
                }
        }
    }
    System.out.println("Cantidad de personas mayores al promedio:"+may);
    System.out.println("Cantidad de personas menores al promedio:"+men);
}
	
}
