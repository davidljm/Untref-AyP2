package ej1;

public class ej1 {
	
	public static void main(String[] args) {
		
	}
	int n ;	
	
	public static int sumarNumeros (int n) {
		
		if (n==0) {
			return 0;
		}
		
		return n + sumarNumeros(n-1);
		
	}

}
