import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.query.Query;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ers.dao.SignupDAO;
import com.ers.dao.SignupDAOImpl;
import com.ers.entity.SignupEntity;
import com.ers.model.Signup;
import com.ers.util.HibernateUtil;

public class SingupDAOImplTest {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	SignupDAO signupDAOImpl;

	@Before
	public void setUp() throws Exception {
		signupDAOImpl = new SignupDAOImpl();
	}

	@After
	public void tearDown() throws Exception {
		signupDAOImpl = null;
	}

	@Test
	public void testAddEmployeeDetails() throws IOException {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Long beforeInsertcount = 0l;
		Long afterInsertcount = 0l;
		Query beforeQuery = session.createQuery("SELECT count(*) from SignupEntity s");
		beforeInsertcount = (Long) beforeQuery.uniqueResult();
		Signup signup = new Signup("Sagar", "Howji", "12/09/1999", 21, "Male", "sagar.howji@revature.com", "9123456780",
				"Telungana", "Employee");
		signupDAOImpl.addEmployeeDetails(signup);
		Query afterQuery = session.createQuery("SELECT count(*) from SignupEntity s");
		afterInsertcount = (Long) beforeQuery.uniqueResult();
		assertNotEquals(beforeInsertcount, afterInsertcount);

	}

	@Test
	public void testGetEmployeeDetails() {
		List<SignupEntity> employeeList = new ArrayList<>();
		employeeList = signupDAOImpl.getAllEmployees();
		assertNotNull(employeeList);
	}

	/*
	 * @Test public void testUpdateEmployeeDetails() { fail("Not yet implemented");
	 * }
	 */

	@Test
	public void testGetEmployeeType() throws IOException {
		System.out.println("Enter the username");
		String userName = br.readLine();
		String empType = signupDAOImpl.getEmployeeType(userName);
		assertNotNull(empType);
	}

	@Test
	public void testGetAllEmployees() {
		List<SignupEntity> allEmployeeList = new ArrayList<>();
		allEmployeeList = signupDAOImpl.getAllEmployees();
		assertNotNull(allEmployeeList);
	}

	@Test
	public void testGetUserNames() {
		List<String> userNameList = signupDAOImpl.getUserNames();
		assertNotNull(userNameList);
	}

	@Test
	public void testDeleteEmployeeDetails() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query beforeQuery = session.createQuery("select count(*) from SignupEntity s");
		Long countBeforeDelete = (Long) beforeQuery.uniqueResult();
		Signup signup = new Signup("Sagar", "Howji", "12/09/1999", 21, "Male", "sagar.howji@revature.com", "9123456780",
				"Telungana", "Employee");
		signupDAOImpl.deleteEmployeeDetails(signup);
		Query afterQuery = session.createQuery("select count(*) from SignupEntity s");
		long countAfterDelete = (long) afterQuery.uniqueResult();
		assertNotSame(countBeforeDelete, countAfterDelete);
	}

}
