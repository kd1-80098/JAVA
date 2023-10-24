package Q2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDao implements AutoCloseable {
	private Connection con;

	public UserDao() throws SQLException {
		con = DbUtil.getConnection();
	}

	@Override
	public void close() throws Exception {
		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int insertUser(User u) throws SQLException, ParseException {

		String str = "insert into users values(default,?,?,?,?,?,0,'user');";
		try (PreparedStatement stmt = con.prepareStatement(str)) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date udate = sdf.parse(u.getDate());
			java.sql.Date sdate = new java.sql.Date(udate.getTime());

			stmt.setString(1, u.getFirstName());
			stmt.setString(2, u.getLastName());
			stmt.setString(3, u.getEmail());
			stmt.setString(4, u.getPassword());
			stmt.setDate(5, sdate);

			int cnt = stmt.executeUpdate();
			return cnt;

		}

	}

	public List<User> displayAllUsers() throws SQLException {
		List<User> list = new ArrayList<>();
		String str = "select * from users";
		try (PreparedStatement stmt = con.prepareStatement(str)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String fname = rs.getString("first_name");
					String lname = rs.getString("last_name");
					String email = rs.getString("email");
					String password = rs.getString("password");
					java.sql.Date sDate = rs.getDate("dob");
//				java.util.Date udate=new java.util.Date (sDate.getTime());
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					String sdate = sdf.format(sDate);
					int status = rs.getInt("status");
					String role = rs.getString("role");
					User u1 = new User(id, fname, lname, email, password, sdate, status, role);
					list.add(u1);
				}
			}

		}
		return list;
	}

	public int updateUser(User u) throws SQLException, ParseException {
//		List<User> list = new ArrayList<>();
		String str = "update users set first_name=?,last_name=?,email=?,password=?,dob=? where id=?;";
		try (PreparedStatement stmt = con.prepareStatement(str)) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date udate = sdf.parse(u.getDate());
			java.sql.Date sdate = new java.sql.Date(udate.getTime());
			stmt.setString(1,u.getFirstName());
			stmt.setString(2,u.getLastName());
			stmt.setString(3,u.getEmail());
			stmt.setString(4, u.getPassword());
			stmt.setDate(5,sdate);
			stmt.setInt(6,u.getId());
			int cnt=stmt.executeUpdate();
			return cnt;
		}
	}
	
	public int deleteUser(int id) throws SQLException {
		User u=new User();
		int cnt;
		String str="delete from users where id=?";
		try(PreparedStatement stmt=con.prepareStatement(str)){
			stmt.setInt(1, id);
			 cnt=stmt.executeUpdate();
			
		}
		return cnt;
		
	}
	
	
}
