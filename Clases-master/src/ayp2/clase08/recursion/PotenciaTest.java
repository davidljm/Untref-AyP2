package ayp2.clase08.recursion;

import org.junit.Assert;
import org.junit.Test;

public class PotenciaTest {
		/********************************* Tests para potencia_v1  ********************************/
		@Test
		public void xaLaCero_v1() {
			Potencia p = new Potencia();
			Assert.assertEquals(1, p.potencia_v1(12, 0), 0);		
		}

		@Test
		public void xaLaUno_v1() {
			Potencia p = new Potencia();
			Assert.assertEquals(Math.PI, p.potencia_v1(Math.PI, 1), 0);	
		}
		
		@Test
		public void xaNPar_v1() {
			Potencia p = new Potencia();
			Assert.assertEquals(Math.pow(Math.PI, 800), p.potencia_v1(Math.PI, 800), 1E-3);	
		}
		
		@Test
		public void xaNImpar_v1() {
			Potencia p = new Potencia();
			Assert.assertEquals(Math.pow(Math.PI, 999), p.potencia_v1(Math.PI, 999), 1E-3);	
		}
		
		/********************************* Tests para potencia_v2  ********************************/
		@Test
		public void xaLaCero_v2() {
			Potencia p = new Potencia();
			Assert.assertEquals(1, p.potencia_v2(12, 0), 0);		
		}

		@Test
		public void xaLaUno_v2() {
			Potencia p = new Potencia();
			Assert.assertEquals(Math.PI, p.potencia_v2(Math.PI, 1), 0);	
		}
		
		@Test
		public void xaNPar_v2() {
			Potencia p = new Potencia();
			Assert.assertEquals(Math.pow(Math.PI, 800), p.potencia_v2(Math.PI, 800), 1E-3);	
		}
		
		@Test
		public void xaNImpar_v2() {
			Potencia p = new Potencia();
			Assert.assertEquals(Math.pow(Math.PI, 999), p.potencia_v2(Math.PI, 999), 1E-3);	
		}

}
