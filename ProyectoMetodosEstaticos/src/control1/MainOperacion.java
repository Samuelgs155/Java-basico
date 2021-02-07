package control1;

public class MainOperacion {

	/**
	 * Implementar una clase llamada Operacion. 
	 * Definir dos métodos estáticos que permitan sumar y restar dos valores enteros.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("La suma de 2+4 es ");
        System.out.println(Operacion.sumar(2, 4));
        System.out.print("La resta de 6-2 es ");
        System.out.println(Operacion.restar(6, 2));

	}

}
