package ayp2.clase01.tests.calculadora;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
	Calculadora c = new Calculadora();

	@After
	public void setup() {
		c.borrarMemoria();
	}

	@Test
	public void queSumaCero() {
		c.sumar(0);
		Assert.assertEquals(0, c.obtenerResultado());
	}

	@Test
	public void queSumaUno() {
		c.sumar(1);
		Assert.assertEquals(1, c.obtenerResultado());
	}

	@Test
	public void queSumaMiles() {
		c.sumar(1000);
		Assert.assertEquals(1000, c.obtenerResultado());
		c.sumar(2000);
		Assert.assertEquals(3000, c.obtenerResultado());
	}
}
