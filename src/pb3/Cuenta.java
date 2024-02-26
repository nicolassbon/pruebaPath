package pb3;

public class Cuenta {
	
	private static final int CERO = 0;
	private String titular;
	private double saldo;
	
	public Cuenta(String titular) {
		
		this.titular = titular;
		this.saldo = CERO;
	}
	
	public Cuenta(String titular, double saldoInicial) {
		
		this.titular = titular;
		this.saldo = saldoInicial;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
	public void depositar(double cantidad) {
		
		this.saldo += cantidad;
	}
	
	public void retirar(double cantidad) {
		if(cantidad <= this.saldo) {
			this.saldo -= cantidad;
		} else {
			System.err.println("No se puede retirar esa cantidad!");
		}
	}

	@Override
	public String toString() {
		return "Titular=" + titular + ", saldo=" + saldo;
	}
	
	
}
