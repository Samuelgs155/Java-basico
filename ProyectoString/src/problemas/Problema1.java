package problemas;

import java.util.Scanner;

public class Problema1 {

	private Scanner teclado;
    private String mail;
	
	/**
	 * Realizar una clase, que permita cargar una dirección de mail en el constructor, 
	 * luego en otro método mostrar un mensaje si contiene el caracter '@'. 
	 * @param args
	 */
	public static void main(String[] args) {
		Problema1 cad=new Problema1();
        cad.verificarArroba();

	}
	
	public Problema1() {
        teclado=new Scanner(System.in);
        System.out.print("Ingrese un mail:");
        mail=teclado.nextLine();
    }
    
    public void verificarArroba() {
        boolean existe=false;
        for(int f=0;f<mail.length();f++) {
            if (mail.charAt(f)=='@') {
                existe=true;
            }
        }
        if (existe==true) {
            System.out.println(mail+" contiene el caracter @");
        } else {
            System.out.println(mail+" no contiene el caracter @");        
        }
    }

}
