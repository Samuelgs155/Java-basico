package problemas;

import java.util.Scanner;

public class Problema2 {

	private Scanner teclado;
    private String cad;
	
	/**
	 * Cargar un String por teclado e implementar los siguientes m�todos:
a) Imprimir la primera mitad de los caracteres de la cadena.
b) Imprimir el �ltimo caracter.
c) Imprimirlo en forma inversa.
d) Imprimir cada caracter del String separado con un gui�n.
e) Imprimir la cantidad de vocales almacenadas.
f) Implementar un m�todo que verifique si la cadena se lee 
igual de izquierda a derecha tanto como de derecha a izquierda 
(ej. neuquen se lee igual en las dos direcciones) 
	 * @param args
	 */
	public static void main(String[] args) {
		Problema2 cad=new Problema2();
        cad.primerMitad();
        cad.ultimoCaracter();
        cad.formaInversa();
        cad.conGuion();
        cad.cantidadVocales();
        cad.esCapicua();

	}
	
	public Problema2() {
        teclado=new Scanner(System.in);
        System.out.print("Ingrese una cadena:");
        cad=teclado.nextLine();
    }

    public void primerMitad() {
    	String parte;
    	parte=cad.substring(0,cad.length()/2);
        System.out.println("Primer mitad de caraceres:"+parte);
    }
    
    public void ultimoCaracter() {
    	char ultimo=cad.charAt(cad.length()-1);
        System.out.println("Ultimo caracter:"+ultimo);
    }
    
    public void formaInversa() {
    	System.out.println("Impresi�n en forma inversa:");
        for(int f=cad.length()-1;f>=0;f--) {
            System.out.print(cad.charAt(f));
        }
        System.out.println();
    }
    
    public void conGuion() {
        System.out.println("Separado por guiones:");
        for(int f=0;f<cad.length();f++) {
            System.out.print(cad.charAt(f)+"-");
        }
        System.out.println();
    }
    
    public void cantidadVocales() {
        int cant=0;
        for(int f=0;f<cad.length();f++) {
            if (cad.charAt(f)=='a' || cad.charAt(f)=='e' || 
                cad.charAt(f)=='i' || cad.charAt(f)=='o' || 
                cad.charAt(f)=='u' || cad.charAt(f)=='A' || 
                cad.charAt(f)=='E' || cad.charAt(f)=='I' || 
                cad.charAt(f)=='O'|| cad.charAt(f)=='U') {
            	cant++;
            }
        }
        System.out.println("Cantidad de vocales:"+cant);
    }
    
    public void esCapicua() {
        int cant=0;
        for(int f=0;f<cad.length()/2;f++) {
            if (cad.charAt(f)==cad.charAt(cad.length()-1-f)) {
                cant++;
            }            	
        }
        if (cant==cad.length()/2) {
            System.out.println("Es capic�a la cadena "+cad);
        } else {
            System.out.println("No es capic�a la cadena "+cad);        
        }
    }

}
