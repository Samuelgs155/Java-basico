package control;

public class MainCirculo {

	
	
	/**
	 * Implementar una clase llamada Circulo. 
	 * Definir una constante donde se debe almacenar el valor de PI 
	 * (relaci�n entre la longitud de una circunferencia y su di�metro). 
	 * Adem�s definir otro atributo donde almacenar el radio del c�rculo.
Al constructor debe llegar el radio y otro m�todo debe retornar el per�metro.
	 * @param args
	 */
	public static void main(String[] args) {
		Circulo circulo1 = new Circulo(5);
        System.out.println(circulo1.retornarPerimetro());

	}

}
