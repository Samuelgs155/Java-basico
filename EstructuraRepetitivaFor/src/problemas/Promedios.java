package problemas;

import java.util.Scanner;

public class Promedios {

	/**
	 * Se cuenta con la siguiente informaci�n:
		Las edades de 50 estudiantes del turno ma�ana.
		Las edades de 60 estudiantes del turno tarde.
		Las edades de 110 estudiantes del turno noche.
		Las edades de cada estudiante deben ingresarse por teclado.
			a) Obtener el promedio de las edades de cada turno (tres promedios)
			b) Imprimir dichos promedios (promedio de cada turno)
			c) Mostrar por pantalla un mensaje que indique cual de los tres turnos 
			tiene un promedio de edades menor. 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
        int f,edad,suma1,suma2,suma3,pro1,pro2,pro3;
        suma1=0;
        suma2=0;
        suma3=0;
        for(f=1;f<=50;f++) {
            System.out.print("Ingrese edad:");
            edad=teclado.nextInt();
            suma1=suma1+edad;
        }
        pro1=suma1/50;
        System.out.print("Promedio de edades del turno ma�ana:");
        System.out.println(pro1);
        for(f=1;f<=60;f++) {
            System.out.print("Ingrese edad:");
            edad=teclado.nextInt();
            suma2=suma2+edad;
        }
        pro2=suma2/60;
        System.out.print("Promedio de edades del turno tarde:");
        System.out.println(pro2);
        for(f=1;f<=110;f++) {
            System.out.print("Ingrese edad:");
            edad=teclado.nextInt();
            suma3=suma3+edad;
        }
        pro3=suma3/110;
        System.out.print("Promedio de edades del turno noche:");
        System.out.println(pro3);
        if (pro1<pro2 && pro1<pro3) {
            System.out.print("El turno ma�ana tiene un promedio menor de edades.");
        } else {
            if (pro2<pro3) {
                System.out.print("El turno tarde tiene un promedio menor de edades.");                
            } else {
                System.out.print("El turno noche tiene un promedio menor de edades.");
            }
        }

	}

}
