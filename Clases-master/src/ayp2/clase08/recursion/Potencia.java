package ayp2.clase08.recursion;

public class Potencia {
	
		public double potencia_v1(double x, int n) {		
			//if (n == 1) return x;
			//if (n == 0) return 1;
			
			//return potencia_v1(x, n/2) * potencia_v1(x, n-n/2);
			double resultado = 1;
			for (int i = 1 ; i <= n; i++) {
				resultado = resultado * x;	
			}
			return resultado;
		}
		
		public double potencia_v2(double x, int n) {
			double aux;
			
			if(n == 1) return x;
			if(n == 0) return 1;
			
			aux = potencia_v2(x, n/2);
			
			if(n % 2 == 0) {
				return aux * aux;
			} else {
				return aux * aux * x;
			}
		}
}


