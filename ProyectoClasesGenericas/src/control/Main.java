package control;

public class Main {

	/**
	 * Implementar una clase Pila que administre cualquier tipo de datos mediante 
	 * el concepto de gen�ricos.

		Crear luego 4 objetos de la clase Pila 
		y almacenar en la primer pila objetos de la clase Persona, 
		en la segunda objetos de la clase Carta, 
		en la tercera objetos de la clase String 
		y finalmente en la cuarta objetos de la clase Integer.
	 * @param args
	 */
	public static void main(String[] args) {
		Pila<Persona> pila1 = new Pila<Persona>();
        pila1.insertar(new Persona("Juan", 33));
        pila1.insertar(new Persona("Ana", 45));
        pila1.insertar(new Persona("Carlos", 33));
        System.out.println("Extraemos el primer elemento de la pila de personas:");
        Persona ultimaPersona = pila1.extraer();
        ultimaPersona.imprimir();

        Pila<Carta> pila2 = new Pila<Carta>();
        pila2.insertar(new Carta(1, "Coraz�n"));
        pila2.insertar(new Carta(2, "Coraz�n"));
        pila2.insertar(new Carta(1, "Trebol"));
        pila2.insertar(new Carta(2, "Trebol"));
        System.out.println("Extraemos el primer elemento de la pila de cartas:");
        Carta ultimaCarta = pila2.extraer();
        ultimaCarta.imprimir();

        Pila<String> pila3 = new Pila<String>();
        pila3.insertar("cadena 1");
        pila3.insertar("cadena 2");
        pila3.insertar("cadena 3");
        pila3.insertar("cadena 4");
        System.out.println("Extraemos el primer elemento de la pila de String:");
        String ultimoString = pila3.extraer();
        System.out.println(ultimoString);

        Pila<Integer> pila4 = new Pila<Integer>();
        pila4.insertar(1);
        pila4.insertar(2);
        pila4.insertar(3);
        pila4.insertar(4);
        System.out.println("Extraemos el primer elemento de la pila de Integer:");
        Integer entero = pila4.extraer();
        System.out.println(entero);

	}

}
