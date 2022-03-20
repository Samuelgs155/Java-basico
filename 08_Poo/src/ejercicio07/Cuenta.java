package ejercicio07;

public class Cuenta {
	
	private int numeroCuenta;
	private double saldo;
	
	public Cuenta(int numeroCuenta, double saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void ingresarDinero(double cantidad) {
		saldo += cantidad;
	}
	
	public void retirarDinero(double cantidad) {
		saldo -= cantidad;
	}

}
