package control2;

public class MainPersona {

	/**
	 * Definir un atributo estático que almacene la cantidad de objetos creados de dicha clase.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Valor del atributo estático cantidad:" + Persona.cantidad);
        Persona per1 = new Persona("Juan", 30);
        per1.imprimir();
        System.out.println("Valor del atributo estático cantidad:" + Persona.cantidad);
        Persona per2 = new Persona("Ana", 20);
        per2.imprimir();
        System.out.println("Valor del atributo estático cantidad:" + Persona.cantidad);
        Persona per3 = new Persona("Luis", 10);
        per3.imprimir();
        System.out.println("Valor del atributo estático cantidad:" + Persona.cantidad);

	}

}
