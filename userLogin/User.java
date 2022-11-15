package userLogin;

//Model
class User
{
	private int uid;
	private String name;
	private String email;
	private String phone;
	private String username;
	private String password;
	private int active;
	//public getter and Setter
	public void setUid(int uid)
	{
		this.uid=uid;
	}
	public int getUid()
	{
		return uid;
	}
	//public getter and Setter
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	//public getter and Setter
	public void setEmail(String email)
	{
		this.email=email;
	}
	public String getEmail()
	{
		return email;
	}
	//public getter and Setter
	public void setPhone(String phone)
	{
		this.phone=phone;
	}
	public String getPhone()
	{
		return phone;
	}
	//public getter and Setter
	public void setUsername(String username)
	{
		this.username=username;
	}
	public String getUsername()
	{
		return username;
	}
	//public getter and Setter
	public void setPassword(String password)
	{
		this.password=password;
	}
	public String getPassword()
	{
		return password;
	}
	//public getter and Setter
	public void setActive(int active)
	{
		this.active=active;
	}
	public int getActive()
	{
		return active;
	}	
}