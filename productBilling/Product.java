package productBilling;

public class Product
{
	private int id;
	private String name;
	private double price,total;
	private int qty=1;
	
	@Override	
	public String toString()
	{
		return id+"\t"+name+"\t"+price+"\t"+qty+"\t"+total;
	}
	
	public int getId()
	{
		return id;	
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;	
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public double getPrice()
	{		
		return price;	
	}
	public void setPrice(double price)
	{			
		this.price=price;
		total=price*qty;
	}
	public int getQty()
	{		
		return qty;	
	}
	public void setQty(int qty)
	{			
		this.qty=qty;
		total=price*qty;
	}
	public double getTotal()
	{
		return total;		
	}
}