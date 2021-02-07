package control;

import beans.Banco;

public class MainBanco {

	
	/**
	 * Un banco tiene 3 clientes que pueden hacer dep�sitos y extracciones. 
	 * Tambi�n el banco requiere que al final del d�a calcule la cantidad de dinero 
	 * que hay depositada.
Lo primero que hacemos es identificar las clases:
	Podemos identificar la clase Cliente y la clase Banco.
	Luego debemos definir los atributos y los m�todos de cada clase:
Cliente		
    atributos
        nombre
        monto
    m�todos
        constructor
        depositar
        extraer
        retornarMonto

Banco
    atributos
        3 Cliente (3 objetos de la clase Cliente)
    m�todos
        constructor
        operar
        depositosTotales

	 * @param args
	 */
	public static void main(String[] args) {
		Banco banco1=new Banco();
        banco1.operar();
        banco1.depositosTotales();

	}

}
