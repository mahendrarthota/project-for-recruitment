package ourproject;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class EmployeeDAO {

		public void insert(Employee s) {
			String sqlQuery = "insert into EmployeeData values(?,?,?,?,?,?,?,?)";
			try (Connection con = Dbutils.buildConnection(); 
				PreparedStatement pstmt = con.prepareStatement(sqlQuery)) {
				int id = s.getId();
				String name = s.getName();
				String username=s.getUserName();
				String password = s.getPassword();
				String Email = s.getEmail();
				String mobileNumber = s.getPhone();
				String address = s.getAddress();
				int roleid=s.getRoleid();
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setString(3, username);
				pstmt.setString(4, password);
				pstmt.setString(5, Email);
				pstmt.setString(6, mobileNumber);
				pstmt.setString(7, address);
				pstmt.setInt(8, roleid);
				int cout = pstmt.executeUpdate();
				System.out.println(cout + "record inserted");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		public Collection<Employee> getAll() {
			// TODO Auto-generated method stub
			String sqlQuery = "select * from EmployeeData";
			Collection<Employee> Employees = new ArrayList<Employee>();
			try (Connection con = Dbutils.buildConnection();
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery(sqlQuery)) {
				while (rs.next()) {
					int id = rs.getInt(1);
					String name = rs.getString(2);
					String username = rs.getString(3);
					String password = rs.getString(4);
					String email= rs.getString(5);
					String phone = rs.getString(6);
					String address = rs.getString(7);
					int roleid = rs.getInt(8);
					Employee s = new Employee(id, name, username, password, email, phone,address,roleid);
					Employees.add(s);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return Employees;
		}
		public Collection<Application> getAllApply() {
			// TODO Auto-generated method stub
			String sqlQuery = "select * from Applicationtable2";
			Collection<Application> Employees = new ArrayList<Application>();
			try (Connection con = Dbutils.buildConnection();
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery(sqlQuery)) {
				while (rs.next()) {
					String id = rs.getString(1);
					String firstname = rs.getString(2);
					String middlename = rs.getString(3);
					String lastname = rs.getString(4);
					String email= rs.getString(5);
					String phone = rs.getString(6);
					String degree = rs.getString(7);
					String degreemarks = rs.getString(8);
					String inter = rs.getString(9);
					String intermarks= rs.getString(10);
					String tenth= rs.getString(11);
					String tenthmarks = rs.getString(12);
					String availdate = rs.getString(13);
					String jobslevel= rs.getString(14);
					String jobstatus= rs.getString(15);
					Application s = new Application(id, firstname, middlename,lastname , email, phone,degree,degreemarks,inter,intermarks,tenth,tenthmarks,availdate,jobslevel,jobstatus);
					Employees.add(s);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return Employees;
		}

		public Collection<AdminStatus> getAllStatus() {
			// TODO Auto-generated method stub
			String sqlQuery = "select * from adminstatus";
			Collection<AdminStatus> Admin = new ArrayList<AdminStatus>();
			try (Connection con = Dbutils.buildConnection();
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery(sqlQuery)) {
				while (rs.next()) {
					String id = rs.getString(1);
					String status = rs.getString(2);
					String review = rs.getString(3);
					AdminStatus s = new AdminStatus(id,status,review);
					Admin.add(s);
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			return Admin;
		}
		
				
		public Employee getByIdentity(String email) {
			// TODO Auto-generated method stub
			String sqlQuery = "select * from EmployeeData where email = ?";
			Employee s = null;
			try (Connection con = Dbutils.buildConnection(); PreparedStatement pstmt = con.prepareStatement(sqlQuery)) {
				pstmt.setString(1, email);
				ResultSet rs = pstmt.executeQuery();
				if (rs.next()) {
					int sid = rs.getInt(1);
					String name = rs.getString(2);
					String username = rs.getString(3);
					String password = rs.getString(4);
					String semail = rs.getString(5);
					String mobileNumber = rs.getString(6);
					String address = rs.getString(7);
					int roleid = rs.getInt(8);
					s = new Employee(sid, name, username, password,semail,mobileNumber, address,roleid);

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return s;
		}
		public Employee getByUserName(String username) {
			// TODO Auto-generated method stub
			String sqlQuery = "select * from EmployeeData where username = ?";
			Employee s = null;
			try (Connection con = Dbutils.buildConnection(); PreparedStatement pstmt = con.prepareStatement(sqlQuery)) {
				pstmt.setString(1, username);
				ResultSet rs = pstmt.executeQuery();
				if (rs.next()) {
					int sid = rs.getInt(1);
					String name = rs.getString(2);
					String susername1 = rs.getString(3);
					String password = rs.getString(4);
					String semail = rs.getString(5);
					String mobileNumber = rs.getString(6);
					String address = rs.getString(7);
					int roleid = rs.getInt(8);
					s = new Employee(sid, name, susername1, password,semail,mobileNumber, address,roleid);

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return s;
		}
		public Employee getByNumber(String phone) {
			// TODO Auto-generated method stub
			String sqlQuery = "select * from EmployeeData where phone = ?";
			Employee s = null;
			try (Connection con = Dbutils.buildConnection(); PreparedStatement pstmt = con.prepareStatement(sqlQuery)) {
				pstmt.setString(1, phone);
				ResultSet rs = pstmt.executeQuery();
				if (rs.next()) {
					int sid = rs.getInt(1);
					String name = rs.getString(2);
					String username = rs.getString(3);
					String password = rs.getString(4);
					String semail = rs.getString(5);
					String mobileNumber = rs.getString(6);
					String address = rs.getString(7);
					int roleid = rs.getInt(8);
					s = new Employee(sid, name, username, password,semail,mobileNumber, address,roleid);

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return s;
		}
		public Employee getByName(String Name) {
			// TODO Auto-generated method stub
			String sqlQuery = "select * from EmployeeData where name = ?";
			Employee s = null;
			try (Connection con = Dbutils.buildConnection(); PreparedStatement pstmt = con.prepareStatement(sqlQuery)) {
				pstmt.setString(1, Name);
				ResultSet rs = pstmt.executeQuery();
				if (rs.next()) {
					int sid = rs.getInt(1);
					String name = rs.getString(2);
					String username = rs.getString(3);
					String password = rs.getString(4);
					String semail = rs.getString(5);
					String mobileNumber = rs.getString(6);
					String address = rs.getString(7);
					int roleid = rs.getInt(8);
					s = new Employee(sid, name, username, password,semail,mobileNumber, address,roleid);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return s;
		}

		public boolean deleteByIdentity(int id) {
			String sqlQuery = "delete from EmployeeData where id = ?";
			boolean flag=false;
			try (Connection con = Dbutils.buildConnection(); PreparedStatement pstmt = con.prepareStatement(sqlQuery)) {
				pstmt.setInt(1, id);
				int count = pstmt.executeUpdate();
				System.out.println(count + "record deleted");
				if(count!=0) {
					flag=true;
				}
					
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return flag;
		}
		public boolean deleteByNumber(String id) {
			String sqlQuery = "delete from applicationtable2 where employeeid= ?";
			boolean flag=false;
			try (Connection con = Dbutils.buildConnection(); 
				PreparedStatement pstmt = con.prepareStatement(sqlQuery)) {
				pstmt.setString(1, id);
				int count = pstmt.executeUpdate();
				System.out.println(count + "record deleted");
				if(count!=0) {
					flag=true;
				}
					
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return flag;
		}


		public void update(Employee s) {
			String sqlQuery = "update EmployeeData set name=?,phone=?,roleid=? where username=?";
			try (Connection con = Dbutils.buildConnection(); 
				 PreparedStatement pstmt = con.prepareStatement(sqlQuery)) {
				int id = s.getId();
				String name = s.getName();
				String mobilenumber = s.getPhone();
				int roleid=s.getRoleid();
				pstmt.setString(1, name);
				pstmt.setString(2, mobilenumber);
				pstmt.setInt(3, roleid);
				int count = pstmt.executeUpdate();
				System.out.println(count + "record update");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
			public void update1(AdminStatus s) {
				String sqlQuery = "update adminstatus set status=?,review=? where employeeid=?";
				try (Connection con = Dbutils.buildConnection(); 
					 PreparedStatement pstmt = con.prepareStatement(sqlQuery)) {
					String id = s.getEmployeeid();
					String name = s.getStatus();
					String review = s.getReview();
					pstmt.setString(1, name);
					pstmt.setString(2, review);
					pstmt.setString(3, id);
					int count = pstmt.executeUpdate();
					System.out.println(count + "record update");
				} catch (Exception e) {
					e.printStackTrace();
				}

		}
	}



