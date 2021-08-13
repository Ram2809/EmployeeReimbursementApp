import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ers.dao.ReimbursementRequestDAO;
import com.ers.dao.ReimbursementRequestDAOImpl;
import com.ers.entity.ReimbursementRequestEntity;
import com.ers.entity.SignupEntity;
import com.ers.model.ReimbursementRequest;
import com.ers.model.Signup;
import com.ers.util.HibernateUtil;

public class ReimbursementRequestDAOImplTest {
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	ReimbursementRequestDAO reimbursementRequestDAOImpl;
	@Before
	public void setUp() throws Exception {
		reimbursementRequestDAOImpl=new ReimbursementRequestDAOImpl();
	}

	@After
	public void tearDown() throws Exception {
		reimbursementRequestDAOImpl=null;
	}

	/*@Test
	public void testAddReimbursementRequestDetails() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Long beforeInsertcount = 0l;
		Long afterInsertcount = 0l;
		Query beforeQuery = session.createQuery("SELECT count(*) from ReimbursementRequestEntity r");
		beforeInsertcount = (Long) beforeQuery.uniqueResult();
		ReimbursementRequest reimbursementRequest=new ReimbursementRequest("F101","Food",20000.25,"01/08/2021","Team outing","Pending","00/00/0000","null");
		reimbursementRequestDAOImpl.addReimbursementRequestDetails(reimbursementRequest, "zara.v@revature.com");
		Query afterQuery = session.createQuery("SELECT count(*) from SignupEntity s");
		afterInsertcount = (Long) beforeQuery.uniqueResult();
		assertNotEquals(beforeInsertcount, afterInsertcount);
	}*/

	@Test
	public void testGetParticularUser() throws IOException {
		System.out.println("Enter your email:");
		String email=br.readLine();
		List<SignupEntity> employeeList = reimbursementRequestDAOImpl.getParticularUser(email);
		assertNotNull(employeeList);
	}

	@Test
	public void testGetParticularUserPendingRequests() throws IOException {
		System.out.println("Enter the username");
		String userName=br.readLine();
		List<ReimbursementRequestEntity> particularUserPendingList = reimbursementRequestDAOImpl.getParticularUserPendingRequests(userName);
		assertNotNull(particularUserPendingList);
	}

	@Test
	public void testGetParticularUserApprovedRequests() throws IOException {
		System.out.println("Enter the username");
		String userName=br.readLine();
		List<ReimbursementRequestEntity> particularUserApprovedList = reimbursementRequestDAOImpl.getParticularUserApprovedRequests(userName);
		assertNotNull(particularUserApprovedList);
	}

	@Test
	public void testGetParticularUserDeniedRequests() throws IOException {
		System.out.println("Enter the username");
		String userName=br.readLine();
		List<ReimbursementRequestEntity> allRequestList = reimbursementRequestDAOImpl.getParticularUserDeniedRequests(userName);
		assertNotNull(allRequestList);
	}

	@Test
	public void testGetParticularUserAllRequests() throws IOException {
		System.out.println("Enter the username");
		String userName=br.readLine();
		List<ReimbursementRequestEntity> allRequestList = reimbursementRequestDAOImpl.getParticularUserAllRequests(userName);
		assertNotNull(allRequestList);
	}

	@Test
	public void testGetAllPendingRequests() {
		List<ReimbursementRequestEntity> allPendingRequestList = reimbursementRequestDAOImpl.getAllPendingRequests();
		assertNotNull(allPendingRequestList);
	}

	@Test
	public void testGetAllApprovedRequests() {
		List<ReimbursementRequestEntity> allApprovedRequestList = reimbursementRequestDAOImpl.getAllApprovedRequests();
		assertNotNull(allApprovedRequestList);
	}

	@Test
	public void testGetAllDeniedRequests() {
		List<ReimbursementRequestEntity> allDeniedRequestList = reimbursementRequestDAOImpl.getAllDeniedRequests();
		assertNotNull(allDeniedRequestList);
		
	}

	@Test
	public void testGetRequestIds() {
		List<String> allRequestIdList = reimbursementRequestDAOImpl.getRequestIds();
		assertNotNull(allRequestIdList);
	}

	@Test
	public void testGetDetailsById() throws IOException {
		System.out.println("Enter the request id:");
		String requestId=br.readLine();
		List<ReimbursementRequestEntity> RequestDetailsList = reimbursementRequestDAOImpl.getDetailsById(requestId);
		assertNotNull(RequestDetailsList);
	}

	/*@Test
	public void testUpdateRequestStatus() {
		fail("Not yet implemented");
	}*/

}
