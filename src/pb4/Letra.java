package pb4;

public class Letra {

	// Atributos
		private char letra;
		
		// Constructor
		public Letra() {
			
		}
		
		public Letra(char letra) {
			this.letra = letra;
		}
		
		// Metodos
		public char getLetra() {
			return letra;
		}
		
		public void setLetra(char letra) {
			this.letra = letra;
		}

		public boolean esVocal() {
			boolean esVocal = false;
			
			switch (letra) {
			
			case 'a','e','i','o','u':
				esVocal = true;
			
			case 'A','E','I','O','U':
				esVocal = true;
			}
			
			return esVocal;	
		}
}
