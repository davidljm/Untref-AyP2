package guia00;

public class Ej2 {

	public int n;
	public int suma;

	public int sumaMultiplos(int n) {

		for (int i = 1; i < n; i++) {

			if ((n % 3 == 0) || (n % 5 == 0)) 
				suma =+ n;
			

		} return suma;
	}

	public static void main(String[] args) {

		Ej2 nu = new Ej2();
		System.out.println(nu.sumaMultiplos(16));
	}

}
