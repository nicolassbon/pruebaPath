package pb3;

public class Ascensor {

	private final int PISO_MINIMO;
	private final int PISO_MAXIMO;

	private final double PESO_MAXIMO;
	private final int CAPACIDAD_MAXIMA;

	private boolean puertaAbierta;
	private static int pisoActual;
	private double pesoActual;
	private int capacidadActual;

	public Ascensor(double PESO_MAXIMO, int CAPACIDAD_MAXIMA, int PISO_MINIMO, int PISO_MAXIMO) {

		this.PESO_MAXIMO = PESO_MAXIMO;
		this.CAPACIDAD_MAXIMA = CAPACIDAD_MAXIMA;
		this.PISO_MINIMO = PISO_MINIMO;
		this.PISO_MAXIMO = PISO_MAXIMO;
		
		this.inicializarOtrasVariables();
	}

	public void ingresar(double peso) {

		if (laPuertaEstaAbierta()) {
			this.pesoActual += peso;
			this.capacidadActual++;

		}
	}

	public void salir(double peso) {

		if (laPuertaEstaAbierta()) {
			this.pesoActual -= peso;
			this.capacidadActual--;

		}
	}

	public void abrirPuerta() {

		if (sePuedeAbrirLaPuerta()) {
			this.puertaAbierta = true;
		} else {
			this.puertaAbierta = false;
		}
	}

	public void cerrarPuerta() {

		if (sePuedeCerrarLaPuerta()) {
			this.puertaAbierta = false;
		} else {
			this.puertaAbierta = true;
		}
	}

	public void subirPiso() {
		if (!this.laPuertaEstaAbierta() && sePuedeSubirElPiso()) {
			pisoActual++;
		}
	}

	public void bajarPiso() {
		if (!this.laPuertaEstaAbierta() && sePuedeBajarElPiso()) {
			pisoActual--;
		}
	}
	
	public void irAlPiso(int pisoDeseado) {
		if(!this.laPuertaEstaAbierta() && pisoDeseado < PISO_MAXIMO && pisoDeseado > PISO_MINIMO) {
			while (pisoActual < pisoDeseado) {
				pisoActual++;
			}
			while (pisoActual > pisoDeseado) {
				pisoActual--;
			}
		}
	}

	private boolean sePuedeCerrarLaPuerta() {

		boolean datosValidos = this.pesoActual <= PESO_MAXIMO && this.capacidadActual <= CAPACIDAD_MAXIMA;
		return datosValidos;
	}

	private boolean sePuedeAbrirLaPuerta() {

		boolean datosValidos = this.pesoActual <= PESO_MAXIMO && this.capacidadActual <= CAPACIDAD_MAXIMA;
		return datosValidos;
	}

	public boolean sePuedeSubirElPiso() {
		return this.getPiso_maximo() > getPisoActual();
	}

	public boolean sePuedeBajarElPiso() {
		return this.getPiso_minimo() < getPisoActual();
	}

	public boolean laPuertaEstaAbierta() {

		return this.puertaAbierta;
	}

	public int getPiso_minimo() {
		return this.PISO_MINIMO;
	}

	public int getPiso_maximo() {
		return this.PISO_MAXIMO;
	}

	public static int getPisoActual() {
		return pisoActual;
	}

	private void inicializarOtrasVariables() {
		this.puertaAbierta = true;
		pisoActual = 0;
		this.pesoActual = 0;
		this.capacidadActual = 0;
	}

	@Override
	public String toString() {
		return "Ascensor [puertaAbierta=" + puertaAbierta + ", pesoActual=" + pesoActual + ", capacidadActual="
				+ capacidadActual + "]";
	}
	
	
}
