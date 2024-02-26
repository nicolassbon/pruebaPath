package pb3;

public class Cerradura {

	private final int CANTIDAD_MAXIMA_INTENTOS;
	private int claveDeApertura;
	private int cantidadDeFallos;
	private boolean estaAbierta;
	private boolean seBloquea;

	public Cerradura(int claveDeApertura, int cantidadMaximaDeIntentos) {
		this.claveDeApertura = claveDeApertura;
		CANTIDAD_MAXIMA_INTENTOS = cantidadMaximaDeIntentos;
		this.inicializarOtrasVariables();
	}

	public void abrir(int clave) {
		if (!this.seBloquea()) { 
			
			if (this.claveDeApertura == clave) {
				this.seAbre();
				System.out.println("Contraseña correcta");
			} else {
				this.cantidadDeFallos++;
				this.seBloquea = false;
				System.out.println("Contraseña incorrecta");
			}
		} else {
			this.seBloquea = true;
			System.out.println("La cerradura fue bloqueada ya que se paso la cantidad maxima de intentos.");
		}
	}

	public boolean estaAbierta() {
		return this.estaAbierta;
	}

	public void cerrar() {
		if (estaAbierta()) {
			this.estaAbierta = false;
		}
	}
	
	private void seAbre() {
		this.estaAbierta = true;
	}


	public boolean fueBloqueada() {
		return this.seBloquea;
	}
	
	private boolean seBloquea() {
		return this.cantidadDeFallos >= CANTIDAD_MAXIMA_INTENTOS;
	}
	
	private void inicializarOtrasVariables() {
		this.estaAbierta = false;
		this.cantidadDeFallos = 0;
	}

}

