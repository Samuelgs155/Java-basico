package control2;

public class MainPersona {

	/**
	 * Declarar una clase Persona con los atributos nombre y edad. 
	 * Definir un método estático que reciba como parámetros dos objetos de la clase Persona y 
	 * me retorne la que tiene una edad mayor,
	 *  si son iguales retorne cualquiera de las dos.
	 * @param args
	 */
	public static void main(String[] args) {
		Persona persona1 = new Persona("Juan", 33);
        Persona persona2 = new Persona("Ana", 50);
        persona1.imprimir();
        persona2.imprimir();
        Persona personaMayor = Persona.edadMayor(persona1, persona2);
        System.out.println("Persona con mayor edad");
        personaMayor.imprimir();

	}

	
	
}
