package problemas.control;

import problemas.beans.Operaciones;

public class MainOperaciones {

	public static void main(String[] args) {
		Operaciones opera;
        opera=new Operaciones();
        opera.inicializar();
        opera.sumar();
        opera.restar();
        opera.multiplicar();
        opera.dividir();

	}

}
