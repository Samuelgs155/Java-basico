package problemas;

public class MultiplosDeOcho {
	
	/**
	 * Mostrar los múltiplos de 8 hasta el valor 500. 
	 * Debe aparecer en pantalla 8 - 16 - 24, etc
	 * @param args
	 */
	public static void main(String[] args) {
		
		int valor = 8;
		while(valor <= 500) {
			System.out.print(valor + "-");
			valor += 8;
		}
	}

}
