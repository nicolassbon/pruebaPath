package pb2;

public class Coche {

	 //private final int CERO_KM = 0;
	 private final int ANIO_ACTUAL = 2023;
	private static int cantidadCoches;
	private String marca;
	private String modelo;
	private int kilometros;
	private int anio;
	private double precio;
	
	public Coche(String marca , String modelo, double precio){
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		cantidadCoches++;
	}
	
	public Coche(String marca, String modelo, int kilometros, int anio, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.kilometros = kilometros;
		this.anio = anio;
		this.precio = precio;
		cantidadCoches++;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public static int getCantidadCoches() {
		return cantidadCoches;
	}
	
	public int calcularAntiguedad() {
		return ANIO_ACTUAL - this.anio;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", kilometros=" + kilometros + ", anio=" + anio
				+ ", precio=" + precio + "]";
	}
	
	
}
