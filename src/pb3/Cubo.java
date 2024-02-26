package pb3;

public class Cubo {

	private static final int CERO = 0;
	private static final int CARAS_DEL_CUBO = 6;
	private float longitudLado;
	
	public Cubo(float lado) {
		
		if(lado < CERO) {
			this.longitudLado = CERO;
		} else {
			this.longitudLado = lado;
		}
	}

	public float getLongitudLado() {
		return longitudLado;
	}

	public void setLongitudLado(float longitudLado) {
		
		if(longitudLado < CERO) {
			this.longitudLado = CERO;
		} else {
			this.longitudLado = longitudLado;
		}
	}
	
	public float getSuperficieCara() {
		float resultado = CARAS_DEL_CUBO*(float)(Math.pow(getLongitudLado(), 2));
		if(resultado < CERO) {
			return CERO;
		} else {
			return resultado;
		}
	}
	
	public float getVolumen() {
		float resultado = (float)(Math.pow(getLongitudLado(), 3));
		if(resultado < CERO) {
			return CERO;
		} else {
			return resultado;
		}
	}
}
