package problemas;

public class ImprimirTerminos {

	/**
	 * Realizar un programa que imprima 25 términos 
	 * de la serie 11 - 22 - 33 - 44, etc. 
	 * (No se ingresan valores por teclado)
	 * @param args
	 */
	public static void main(String[] args) {		
		int contador = 1;		
		while(contador < 25) {
			System.out.print((contador * 11) + "-");
			contador++;
		}
	}

}
