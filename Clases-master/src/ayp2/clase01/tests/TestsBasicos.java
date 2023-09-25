package ayp2.clase01.tests;

import org.junit.Test;
import org.junit.Assert;

public class TestsBasicos {

	@Test
	public void sumaTests() {

		int suma1 = 1 + 2;
		// Assert.assertEquals(esperado, real);
		Assert.assertEquals(3, suma1);

		double suma2 = 1.0 + 2.0;
		Assert.assertEquals(3.0, suma2, 0.0);
	}
}
