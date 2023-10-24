package Q2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil{
	public static final String DB_Driver="com.mysql.cj.jdbc.Driver";
	public static final String DB_URL="jdbc:mysql://localhost:3306/JavaJDBC";
	public static final String DB_USER="KD1_80098_ManasKelkar";
	public static final String DB_PASSWD="manager";
	
	 static {
		 try {
			 Class.forName(DB_Driver);
		 }
		 catch(ClassNotFoundException e)
		 {
			 e.printStackTrace();
			 System.exit(1);
		 }
	 }
	 
	 public static Connection getConnection() throws SQLException{
		 Connection con=DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
		 return con;
	 }
	
}

