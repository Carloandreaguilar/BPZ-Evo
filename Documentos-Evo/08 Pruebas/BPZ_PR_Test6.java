package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import pe.edu.bpz.model.entity.Empleado;
import pe.edu.bpz.model.entity.Role;

public class RoleTest {

	@Test
	public void test() {
		long id=1;
		Role r=new Role(id,"Admin");
		
		assertEquals("",r, r.crear(id, "Emplado"));
	}

}
