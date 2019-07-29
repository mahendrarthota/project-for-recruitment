package ourproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbutils {
	public static Connection buildConnection() throws SQLException , ClassNotFoundException{
		String driverclassname="oracle.jdbc.OracleDriver";
		String URL="jdbc:oracle:thin:@localhost:1521:XE";
		String UID="system";
		String PWD="virtusa";
		  Class.forName(driverclassname);
	    Connection con=DriverManager.getConnection(URL,UID,PWD);
	  return con;

}
}