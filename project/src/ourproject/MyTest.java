	package ourproject;

	import static org.junit.Assert.*;

	import javax.servlet.RequestDispatcher;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;

	import org.junit.After;
	import org.junit.AfterClass;
	import org.junit.Before;
	import org.junit.BeforeClass;
	import org.junit.Test;
	import org.mockito.Mock;
	import org.mockito.MockitoAnnotations;
	import org.mockito.stubbing.OngoingStubbing;

	import static org.mockito.Mockito.*;

	import java.io.PrintWriter;

	public class MyTest {
		LoginServlet add;
		@Mock
		HttpServletRequest req;
		@Mock
		HttpServletResponse res;
		 @Mock
		 HttpSession session;

		 @Mock
		 RequestDispatcher rd;
		 @Mock
		 PrintWriter pw;
		  
		

		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
			
		}

		@AfterClass
		public static void tearDownAfterClass() throws Exception {
		}

		@Before
		public void setUp() throws Exception {
			MockitoAnnotations.initMocks(this);
		}

		@After
		public void tearDown() throws Exception {
		}

		@Test
		public void testDoPost() {
			//req=mock(HttpServletRequest.class);
			//res=mock(HttpServletResponse.class);
			when(req.getParameter("uname")).thenReturn("nandini");
			  when(req.getParameter("pwd")).thenReturn("password");
			  when(req.getParameter("checkbox")).thenReturn("Yes");
			  when(req.getSession(false)).thenReturn(session);
			  when(req.getRequestDispatcher("masterAdminHomePage.jsp")).thenReturn(rd);
			  when(((OngoingStubbing<String>) session.getAttribute("madmin")).thenReturn("yes"));
			 
			  when(res.PrintWriter()).thenReturn(pw);
			  new AddAdmin().doPost(req,res);
			
			
			
			
			
		
		}

	}
