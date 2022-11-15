package userLogin;

//View
import java.awt.*;
import javax.swing.*;
class UserLogin extends JFrame
{
	JTextField uname;
	JPasswordField password;
	JButton login;
	JLabel unameLb,passwordLb;
	UserLogin(String name)
	{
		super(name);
		uname=new JTextField();
		password=new JPasswordField();
		login=new JButton("Login");
		login.addActionListener(new UserLoginService(this));
		unameLb=new JLabel("User Name");
		passwordLb=new JLabel("Password");
		setLayout(new GridLayout(3,2,10,10));
		add(unameLb);
		add(uname);
		add(passwordLb);
		add(password);
		add(login);
		setSize(400,150);
		setLocation(400,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String...s)
	{
		new UserLogin("CEBS User Login");
	}
}




