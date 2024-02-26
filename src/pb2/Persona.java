package pb2;

public class Persona {

	private String nombre;
	private String genero;
	private long dni;
	private double peso;
	private double altura;
	private int edad;
	private boolean viva;
	
	public Persona(String nombre,String genero,long dni,double peso, double altura) {
		
		this.nombre = nombre;
		this.genero = genero;
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;
		this.viva = true;
	}
	
	public void alimentar(double kilos) {
		if(this.viva) {
			this.peso += kilos;
		} 
		
	}
	
	public void crecer (double metros) {
		if(this.viva) {
			this.altura += metros;
		}
		
	}
	
	public void cumplirAnios() {
	
		this.edad++;
	}
	
	public void morir() {
		
		this.viva = false;
	}
	
	public double pesar() {
		
		return this.peso;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}
	
	public boolean esMayorDeEdad() {
		
		if(this.edad >=18) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Persona: nombre= " + nombre + ", genero= " + genero + ", dni= " + dni + ", peso= " + peso + ", altura= "
				+ altura + ", edad= " + edad + ", viva= " + viva;
	}
	
	
	
	
	
	
	
}
