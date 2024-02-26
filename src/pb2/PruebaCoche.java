package pb2;

public final class PruebaCoche {

	public static void main(String[] args) {
		
		Coche renault = new Coche("Renault", "Clio", 15000);
		
		Coche fiat = new Coche("Fiat", "Focus", 250000, 2010, 30000);

		System.out.println(renault);
		
		System.out.println(fiat);
		
		renault.setKilometros(150000);
		System.out.println("\nKilometros primer coche: " + renault.getKilometros());
		
		int antiguedad = fiat.calcularAntiguedad();
		
		System.out.println("\nLa antiguedad del coche fiat es de " + antiguedad + " años");
		
		System.out.println(Coche.getCantidadCoches());
		
		System.out.println("1." + 2%3);
	}

}
