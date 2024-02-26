package pb4;

public class Temperatura {

	// Atributos
	
		public final byte CELSIUS = 0;
		public final byte FARENHEIT = 1;
		public final byte KELVIN = 2;
		private double valor;
		
		// Constructores
		
		public Temperatura(double valor) {
			this.valor = valor;
		}
		
		public void setValor(double valor) {
			this.valor = valor;
		}
		
		public void setValor(double valor, byte unidad) {
			this.valor = valor;
			switch(unidad) {
			case 1: // conversion celsius a farenheit
				this.valor = (valor*9/5)+32;
				break;
			case 2: // conversion celsius a kelvin
				this.valor = valor+273.15;
			default:
				break;
			}
		}
		
		public double getValor() {
			return this.valor;
		}
}
