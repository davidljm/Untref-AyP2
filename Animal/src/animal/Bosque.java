package animal;

public class Bosque {

	public static void main(String[] args) {
		Animal unAnimal = new Leon();
//		Leon unLeon = new Animal();	ANIMAL NO ES UN LEON, ES AL REVES LA HERENCIA
//		Planta unaPlanta = new Planta(); ES ABSTRACTA NO SE PUEDE INSTANCIAR
		Leon otroLeon = new Leon();
		otroLeon.nombre = "Timba";
//		otroLeon.peso = 58; PESO ES UNA VARIABLE PRIVADA DE LA CLASE LEON POR ESO NO LA PUEDE UTILIZAR, NO ES VISIBLE
							//POR OTRA CLASE
		otroLeon.edad = 7;
//		otroLeon.numero = 3; NUMERO ES UNA VARIABLE ESTATICA FINAL QUE NO PUEDE MODIFICARSE

	}

}
