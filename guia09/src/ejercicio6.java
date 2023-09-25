
public class ejercicio6 {

	public static int maxComunDiv(int a, int b) {

		if (b == 0) {

			return a;

		}

		return maxComunDiv(b, a % b);
	}

	public static void main(String[] args) {
		int a = 50;
		int b = 120;
		System.out.println(maxComunDiv(a, b));
	}
}
