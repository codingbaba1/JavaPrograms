package hashChat;

//View
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class LoginForm extends JFrame
{
	JLabel		userNameLb,passwordLb;
	JPasswordField	passwordTf;
	JTextField 	userNameTf;
	JButton		register,login;
	LoginForm(String name)
	{
		super(name);
		userNameLb=new JLabel("User Name");
		passwordLb=new JLabel("Password");
		userNameTf=new JTextField();
		passwordTf=new JPasswordField();
		register=new JButton("Register");
		login=new JButton("Login");
		register.addActionListener(new LoginFormAction(this));
		login.addActionListener(new LoginFormAction(this));
		setLayout(new GridLayout(3,2,20,30));
		add(userNameLb);
		add(userNameTf);
		add(passwordLb);
		add(passwordTf);
		add(register);
		add(login);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,200);
		setVisible(true);		
	}
	public static void main(String...s)
	{
		new LoginForm("Login to Hashchat");
	}
}