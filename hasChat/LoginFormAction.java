package hashChat;

//Business Logic
import java.awt.event.*;
class LoginFormAction implements ActionListener
{
	LoginForm lf;
	LoginFormAction(LoginForm lf)
	{
		this.lf=lf;
	}
	@Override 
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equalsIgnoreCase("Login"))
		{
			User user=UserDAO.selectUserByUsernameAndPassword(lf.userNameTf.getText(),lf.passwordTf.getText());
			if(user!=null)
			{
				System.out.println(user.getHc_fname());
			}
			else
			{
				System.out.println("Username/password invalid");
			}
		}
		else if(e.getActionCommand().equalsIgnoreCase("Register"))
		{
				
		}
	}
	
}