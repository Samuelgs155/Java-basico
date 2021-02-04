package problemas.control;

import problemas.beans.Empleado;

public class MainEmpleado {

	/**
	 * Confeccionar una clase que represente un empleado. Definir como atributos su
	 * nombre y su sueldo. Confeccionar los métodos para la carga, otro para
	 * imprimir sus datos y por último uno que imprima un mensaje si debe pagar
	 * impuestos (si el sueldo supera a 3000)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Empleado empleado1;
		empleado1 = new Empleado();
		empleado1.inicializar();
		empleado1.debePagarImpuestos();
	}

}
