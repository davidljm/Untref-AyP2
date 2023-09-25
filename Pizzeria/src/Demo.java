public class Demo {

	public static void main(String[] args) {
		Producto pizza = new Pizza("Muzarrella", 1000);
		Producto porcion = new PorcionDePizza("Porcion de muzza", 250);
		Producto gaseosa = new Gaseosa("coca", 150);
		Combo comboMuzza = new Combo("Combo muzza + manaos");
		Combo comboFamiliar = new Combo ("Combo Familiar");

		comboMuzza.addProducto(porcion);
		comboMuzza.addProducto(porcion);
		comboMuzza.addProducto(gaseosa);
		
		comboFamiliar.addProducto(pizza);
		comboFamiliar.addProducto(pizza);
		comboFamiliar.addProducto(gaseosa);

//		System.out.println(comboMuzza.getPrecio());
//		System.out.println(comboFamiliar.getPrecio());
		System.out.println(comboFamiliar);

	}

}
