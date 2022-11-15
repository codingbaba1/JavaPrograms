package userLogin;

//Business Logic
import java.awt.event.*;
class UserLoginService implements ActionListener
{
	UserLogin ul;
	UserLoginService(UserLogin ul)
	{
		this.ul=ul;
	}
	@Override
	public void actionPerformed(ActionEvent ev)
	{
		if(ev.getSource()==ul.login)
		{
			User user=DAO.selectUser(ul.uname.getText(),ul.password.getText());
			if(user!=null)
			{
				System.out.println("Hello, "+user.getName());
			}
			else
			{
				System.out.println("Error while login");
			}
			ul.uname.setText("");
			ul.password.setText("");
		}
	}
}