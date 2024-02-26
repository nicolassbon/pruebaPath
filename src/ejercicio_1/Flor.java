package ejercicio_1;

public class Flor extends Planta {

	private String colorPetalos;
	private int cantPetalos;
	private String colorPistilo;
	private String variedad;
	private String estacion;

	public Flor() {

	}

	public Flor(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal, String colorPetalos,
			int cantPetalos, String colorPistilo, String variedad, String estacion) {
		super(nombre, altoTallo, tieneHojas, climaIdeal);
		this.colorPetalos = colorPetalos;
		this.cantPetalos = cantPetalos;
		this.colorPistilo = colorPistilo;
		this.variedad = variedad;
		this.estacion = estacion;
	}

	public String getColorPetalos() {
		return colorPetalos;
	}

	public void setColorPetalos(String colorPetalos) {
		this.colorPetalos = colorPetalos;
	}

	public int getCantPetalos() {
		return cantPetalos;
	}

	public void setCantPetalos(int cantPetalos) {
		this.cantPetalos = cantPetalos;
	}

	public String getColorPistilo() {
		return colorPistilo;
	}

	public void setColorPistilo(String colorPistilo) {
		this.colorPistilo = colorPistilo;
	}

	public String getVariedad() {
		return variedad;
	}

	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}

	public String getEstacion() {
		return estacion;
	}

	public void setEstacion(String estacion) {
		this.estacion = estacion;
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("Hola, soy una flor");
	}
}
