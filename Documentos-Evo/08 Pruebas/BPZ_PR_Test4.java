package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import pe.edu.bpz.model.entity.Factura;

public class FacturaTest {

	@Test
	public void test() {
		double esperado=420.00;
		Factura f=new Factura();
		
		assertEquals(f.getSubtotal(),esperado);
	}

}
