package ejercicioCadena;

public class invertir {

	
		public static void main(String[] args) {
			String cadena = "Programando en Java desde parzibyte.me";
			// Crear un StringBuilder a partir de la cadena
			StringBuilder stringBuilder = new StringBuilder(cadena);
			// Y llamar al método reverse de StringBuilder (lo convertimos a cadena con toString)
			String invertida = stringBuilder.reverse().toString();
			System.out.println("Cadena original: " + cadena);
			System.out.println("Cadena invertida: " + invertida);

		}
		
		
		
		public static String invertir2(String cadena) {
			String aux=cadena;
			if(cadena.length()>1) {
				aux=invertir2(cadena.substring(1)).concat(cadena.substring(0,1));
			}
			return aux;
		}
		
		
		public int divisionRestoRecursiva(int a, int b) {
			if(a<b)
				return a;
			return divisionRestoRecursiva(a-b, b);
			
		}
		
		public int multiRecursiva(int a, int b) {
			if(b==0 || a == 0)
				return 0;
			if(b==1)
				return a;
			return a+multiRecursiva(a, b-1);
		}               
		
		
		
		
		
		
		
	}

