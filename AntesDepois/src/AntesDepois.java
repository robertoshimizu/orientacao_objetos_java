
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AntesDepois {
	
	@BeforeEach
	public void testbefore() {
		System.out.println("@Before");
	}

	@AfterEach
	public void testafter() {
		System.out.println("@After");
	}
	
	@BeforeAll
	public static void testbeforeclass() {
		System.out.println("@BeforeClass");
	}
	
	@AfterAll
	public static void testafterclass() {
		System.out.println("@AfterClass");
	}

	@Test
	public void test1() {
		System.out.println("Teste 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Teste 2");
	}
	
	@Test
	public void test3() {
		System.out.println("Teste 3");
	}

}
