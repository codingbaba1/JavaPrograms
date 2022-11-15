package hashChat;

//Controller
import java.sql.*;
public class UserDAO
{
	private static Connection con=null;
	private static PreparedStatement pstmt=null;
	private static ResultSet rs=null;
	//***********************************
	private static final String DB_PATH="jdbc:mysql://localhost:3306/hashchat29";
	private static final String USER="root";
	private static final String PASSWORD="";
	//**********************************
	static
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(DB_PATH,USER,PASSWORD);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public static User selectUserByUsernameAndPassword(String uname,String password)
	{
		User user=null;
		try
		{
			String sql="select * from user where hc_username=? and hc_password=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,uname);
			pstmt.setString(2,password);
			rs=pstmt.executeQuery();
			if(rs.next())
			{
				user=new User();
				user.setHc_uid(rs.getInt("hc_uid"));
				user.setHc_fname(rs.getString("hc_fname"));
				user.setHc_lname(rs.getString("hc_lname"));
				user.setHc_email(rs.getString("hc_email"));
				user.setHc_phone(rs.getString("hc_phone"));
				user.setHc_username(rs.getString("hc_username"));
				user.setHc_password(rs.getString("hc_password"));
				user.setHc_dob(rs.getString("hc_dob"));
				user.setHc_profilepic(rs.getString("hc_profilepic"));
				user.setHc_designation(rs.getString("hc_designation"));
				user.setHc_usertype(rs.getString("hc_usertype"));
				user.setHc_active(rs.getString("hc_active"));		
				return user;
			}	
		}
		catch(Exception ex)
		{
			System.out.println("Error in UserDAO : ");
			ex.printStackTrace();
		}
		return user;
	}
}














