package pb2;

public class PruebaPersona {

	public static void main(String[] args) {

		Persona sofia = new Persona("Sofía", "Mujer", 38432153, 2.8, 0.50);

		System.out.println(sofia);

		System.out.println("\nAltura " + sofia.getAltura());

		System.out.println("\nPeso " + sofia.getPeso());

		sofia.alimentar(1.0);

		sofia.crecer(0.5);

		sofia.cumplirAnios();

		System.out.println("\nAltura " + sofia.getAltura());

		System.out.println("\nPeso " + sofia.getPeso());


	}

}
