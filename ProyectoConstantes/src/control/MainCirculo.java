package control;

public class MainCirculo {

	
	
	/**
	 * Implementar una clase llamada Circulo. 
	 * Definir una constante donde se debe almacenar el valor de PI 
	 * (relación entre la longitud de una circunferencia y su diámetro). 
	 * Además definir otro atributo donde almacenar el radio del círculo.
Al constructor debe llegar el radio y otro método debe retornar el perímetro.
	 * @param args
	 */
	public static void main(String[] args) {
		Circulo circulo1 = new Circulo(5);
        System.out.println(circulo1.retornarPerimetro());

	}

}
