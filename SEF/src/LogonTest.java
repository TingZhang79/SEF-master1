import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LogonTest {
	HashMap<String,User> map = new HashMap<String,User>();
	@BeforeEach
	void setUp() throws Exception {
		Admin admin = new Admin();
	    admin.setUserName("admin");
	    admin.setUserPassword("123456");
	   map.put(admin.userName, admin);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void logontestPositive() {
		
		assertEquals(true, Logon.logon(map, "admin", "123456"));
	}
	@Test
    void logontestNegative() {
		
		assertFalse(Logon.logon(map, "admin", "1234567"));
	}

}
