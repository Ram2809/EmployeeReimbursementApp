import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ers.dao.LoginDAO;
import com.ers.dao.LoginDAOImpl;
import com.ers.entity.LoginCredentialsEntity;

public class LoginDAOImplTest {
	LoginDAO loginDAOImpl;
	@Before
	public void setUp() throws Exception {
		loginDAOImpl=new LoginDAOImpl();
	}

	@After
	public void tearDown() throws Exception {
		loginDAOImpl=null;
	}

	@Test
	public void testValidateUser() {
		List<LoginCredentialsEntity> loginList = loginDAOImpl.validateUser();
		assertNotNull(loginList);
	}

	/*@Test
	public void testUpdateForgotPassword() {
		fail("Not yet implemented");
	}

	@Test
	public void testResetForgotPassword() {
		fail("Not yet implemented");
	}*/

}
