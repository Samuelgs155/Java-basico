package control3;

public class MainPersona {

	
	/**
	 * Plantear una clase Persona con los atributos nombre y edad. 
	 * Implementar un m�todo que retorne si es mayor de edad 
	 * (almacenar en una constante est�tica el valor 18 que representa la mayor�a de edad)
	 * @param args
	 */
	public static void main(String[] args) {
		Persona persona1 = new Persona("Juan", 23);
        if (persona1.esMayor())
            System.out.println("Es mayor de edad " + persona1.retornarNombre());
        else
            System.out.println("No es mayor de edad " + persona1.retornarNombre());

	}

}
