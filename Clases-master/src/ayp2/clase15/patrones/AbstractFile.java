package ayp2.clase15.patrones;

/*
 * Clase abstracta que puede representar tanto a un archivo como a un directorio
 */
public interface AbstractFile {
	/*** g_ident es un buffer para imprimir directorios y archivos anidados ***/
	static StringBuffer g_indent = new StringBuffer();
	
	/*
	 * Método común para listar un archivo o directorio
	 */
	public void ls();
}
