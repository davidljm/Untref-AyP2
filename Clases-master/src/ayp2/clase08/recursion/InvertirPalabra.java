package ayp2.clase08.recursion;

public class InvertirPalabra {
	public static String invertir(String palabra) {
		
		if(palabra.length()<=1) {
			return palabra;
		}
		
		char ultimaLetra = palabra.charAt(palabra.length()-1);
		
		return ultimaLetra + invertir(palabra.substring(0,palabra.length()-1));
		
	}
	
	public static void main(String[] args) {
		System.out.println(InvertirPalabra.invertir("la casa esta vacia"));
	}

}
