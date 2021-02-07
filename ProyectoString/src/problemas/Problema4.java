package problemas;

import java.util.Scanner;

public class Problema4 {

	private Scanner teclado;
	private String[] nombres;
	private String[] mail;

	/**
	 * Confeccionar un programa que permita cargar los nombres de 5 personas y sus
	 * mail, luego implementar los siguientes métodos: a) Mostrar por pantalla los
	 * datos. b) Consulta del mail ingresando su nombre. c) Mostrar los mail que no
	 * tienen el carácter @.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Problema4 cad=new Problema4();
        cad.listar();
        cad.consultaMail();
        cad.sinArroba();

	}

	public Problema4() {
        teclado=new Scanner(System.in);
        nombres=new String[5];
        mail=new String[5];
        for(int f=0;f<nombres.length;f++) {
            System.out.print("Ingrese nombre:");
            nombres[f]=teclado.nextLine();
            System.out.print("Ingrese mail");
            mail[f]=teclado.nextLine();
        }
   }

	public void listar() {
		for (int f = 0; f < nombres.length; f++) {
			System.out.println(nombres[f] + " - " + mail[f]);
		}
	}

	public void consultaMail() {
		String aux;
		System.out.print("Ingrese el nombre de la persona:");
		aux = teclado.nextLine();
		boolean existe = false;
		for (int f = 0; f < nombres.length; f++) {
			if (aux.equals(nombres[f])) {
				System.out.println("Mail de la persona:" + mail[f]);
				existe = true;
			}
		}
		if (existe == false) {
			System.out.println("No existe una persona con ese nombre.");
		}
	}

	public void sinArroba() {
		for (int f = 0; f < mail.length; f++) {
			boolean tiene = false;
			for (int k = 0; k < mail[f].length(); k++) {
				if (mail[f].charAt(k) == '@') {
					tiene = true;
				}
			}
			if (tiene == false) {
				System.out.println(mail[f] + " no tiene @");
			}
		}
	}

}
