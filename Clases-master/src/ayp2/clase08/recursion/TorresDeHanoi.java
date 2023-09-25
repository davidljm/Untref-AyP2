package ayp2.clase08.recursion;

public class TorresDeHanoi {

	public static void main(String[] args) {
		int n = 3;
		mover(n, 'A', 'B', 'C');
	}

	public static void mover(int n, char origen, char aux, char destino) {
		if (n == 1) {
			System.out.println("mover disco " + n + " de " + origen + " a " + destino);
		} else {
			mover(n - 1, origen, destino, aux);
			System.out.println("mover disco " + n + " de " + origen + " a " + destino);
			mover(n - 1, aux, origen, destino);
		}
	}
}