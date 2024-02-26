package pb2;

public class Calculadora {

	private double operador1;
	private double operador2;
	private double resultado;

	public Calculadora() {
		operador1 = 0;
		operador2 = 0;
		resultado = 0;
	}

	public Calculadora(double operador1, double operador2) {
		this.operador1 = operador1;
		this.operador2 = operador2;
		resultado = 0;
	}

	public double sumar() {
		resultado = this.operador1 + this.operador2;
		return resultado;
	}

	public double sumar(double operador1, double operador2) {
		resultado = operador1 + operador2;
		return resultado;
	}

	public double restar() {
		resultado = this.operador1 - this.operador2;
		return resultado;
	}

	public double restar(double operador1, double operador2) {
		resultado = operador1 - operador2;
		return resultado;
	}

	public double multiplicar() {
		resultado = this.operador1 * this.operador2;
		return resultado;
	}
	
	public double dividir() {
		
		this.resultado = 0;
		
		if(this.operador2 != 0) {
			resultado = this.operador1 / this.operador2;
		} 
		
		return resultado;
	}

	public double dividir(double numerador, double divisor) {
		
		this.resultado = 0;
		
		if(divisor != 0) {
			resultado = numerador / divisor;
		} 
		
		return resultado;
	}
	
	public double calcularAreaDeUnCirculo(double radio) {
		return  Math.PI*(Math.pow(radio, 2));
	}
	
	public boolean esPositivo(double numero) {
		if(numero >0) {
			return true;
		} else {
			return false;
		}
	}
}
