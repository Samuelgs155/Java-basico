package control;

public class SueldosEmpleados2 {

	public static void main(String[] args) {
		int[] sueldos = { 2000, 6000, 7000, 4300 };
		
        for (int monto : sueldos)
            System.out.println("Sueldo: " + monto);
        
        int gastos = 0;
        for (int monto : sueldos)
            gastos += monto;
        System.out.println("Gasto total en sueldos de la empresa: " + gastos);

	}

}
