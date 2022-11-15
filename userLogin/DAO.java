package userLogin;

//Controller
import java.sql.*;
public class DAO
{
	/**************SERVER CREDENCIAL*****************/
	private final static String DBPATH="jdbc:mysql://localhost:3306/cebs";
	private final static String USER="root";
	private final static String PASSWORD="";
	/***********************************************/
	private static Connection con=null;
	private static PreparedStatement pstmt=null;
	private static ResultSet rs=null;
	static
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(DBPATH,USER,PASSWORD);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static User selectUser(String username,String password)
	{
		User user=null;
		try
		{
			String sql="select * from user where username=? and password=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,username);
			pstmt.setString(2,password);
			rs=pstmt.executeQuery();
			if(rs.next())
			{
				user=new User();
				user.setUid(rs.getInt("uid"));
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setPhone(rs.getString("phone"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setActive(rs.getInt("active"));
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return user;
	}
}














