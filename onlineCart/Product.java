package onlineCart;

class Product
{
	private int id;
	private String name;
	private String description;
	private double price;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setDescription(String description)
	{
		this.description=description;
	}
	public String getDescription()
	{
		return description;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public double getPrice()
	{
		return price;
	}	
	@Override
	public String toString()
	{
		return id+"\t"+name+"\t"+description+"\t"+price;
	}
}