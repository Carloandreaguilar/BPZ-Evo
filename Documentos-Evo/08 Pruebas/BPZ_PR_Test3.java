package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import pe.edu.bpz.model.entity.Empleado;

public class EmpleadoTest {

	
	@Test
	public void test() {
		long id=1;
		long codigo=75131971;
		long celular=990430079;
		Empleado e= new Empleado(id,"Kenzo","Van W.A",codigo,celular);
		
		assertEquals("",e, e.crear(id,"Diego","Linares",codigo,celular));
	
	}

}
