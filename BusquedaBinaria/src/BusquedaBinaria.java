
public class BusquedaBinaria {

	
	public static final int NO_ENCONTRADO = -1;
	
	
	
	public static int busquedaBinaria(int[] array, int x) {
	    return busquedaBinaria(array, 0, array.length - 1, x);
	}

	private static int busquedaBinaria(int[] array, int inicio, int fin, int x) {
	    if (inicio > fin) return NO_ENCONTRADO;

	    int medio = (inicio + fin) / 2;

	    if (array[medio] > x)
	        return busquedaBinaria(array, inicio, medio - 1, x);
	    else if (array[medio] < x)
	        return busquedaBinaria(array, medio + 1, fin, x);

	    return medio;
	}

}
