package productBilling;

import java.util.*;
public class Counter
{
	private static List <Product>cart=new LinkedList<>();
	public void add(int id,String name,double price,int qty)
	{
		Product p=new Product();
		p.setId(id);
		p.setName(name);
		p.setPrice(price);
		p.setQty(qty);
		cart.add(p);
	}
	public void remove(int id)
	{
		Iterator<Product> itr=cart.iterator();
		while(itr.hasNext())
		{
			Product p=itr.next();
			if(p.getId()==id)
				itr.remove();
		}
	}
	public void update(int id,int newqty)
	{
		Iterator<Product> itr=cart.iterator();
		while(itr.hasNext())
		{
			Product p=itr.next();
			if(p.getId()==id)
			{
				p.setQty(newqty);
			}
		}
	}
	public void payment()
	{
		System.out.println("Thank you for shopping...\n\n Please visit again!");
		cart.clear();
	}
	public void list()
	{
		Iterator<Product> itr=cart.iterator();
		double gt=0;
		System.out.println("ID\tName\tPrice\tQty\tTotal\n---------------------------------------------------");
		while(itr.hasNext())
		{
			Product p=itr.next();
			gt=gt+p.getTotal();
			System.out.println(p);
		}
		System.out.println("---------------------------------------------------");
		System.out.println("\t\t\tGrand Total : "+gt);
	}	
}
