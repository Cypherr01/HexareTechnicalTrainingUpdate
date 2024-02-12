package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class EmployeeDAOTest {
	
	@BeforeAll
	static void setUpBeforeClass() throws Exceptioin{
		dao = new EmployeeDAO();
	}

	@Test
	void testInsertEmployee() {
		Employee emp = new Employee(109, "Sai", 80000);
		int actual = dao.insertEmployee(emp);
		assertEquals(1, actual);
	}

	@Test
	void testGetEmployeeById() {
		Employee el = dao.getEmployeeById(102);
		assertNotnull(e1);
		assertEquals(10000, e1.getSalary());
	}

	@Test
	void testGetAllEmployees() {
		fail("Not yet implemented");
	}

}
