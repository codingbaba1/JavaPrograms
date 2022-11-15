package productBilling;

import java.util.*;
public class Shop
{
	public static void main(String...ar)
	{
		Scanner scan=new Scanner(System.in);
		Counter counter1=new Counter();
		while(true)
		{
			System.out.println("1. Add Product");
			System.out.println("2. Show Bill");
			System.out.println("3. Remove Product");
			System.out.println("4. Update Qty");
			System.out.println("5. Payment");
			System.out.println("6.Exit");
			System.out.print("Enter choice :");
			switch(scan.nextInt())
			{
				case 1:
					System.out.print("Enter ID : ");
					int id=scan.nextInt();
					System.out.print("Enter Name : ");
					String name=scan.next();
					System.out.print("Enter Price : ");
					double price=scan.nextDouble();
					System.out.print("Enter Qty : ");
					int qty=scan.nextInt();
					counter1.add(id,name,price,qty);
					break;
				case 2:
					counter1.list();
					break;
				case 3:
					System.out.print("Enter ID : ");
					id=scan.nextInt();
					counter1.remove(id);
					break;
				case 4:
					System.out.print("Enter ID : ");
					id=scan.nextInt();
					System.out.print("Enter new qty : ");
					int newqty=scan.nextInt();
					counter1.update(id,newqty);
					break;
				case 5:
					counter1.payment();
					break;
				case 6:
					return;
				default:	
					System.out.println("Invalid Option selected");
					break;
			}
		}
	}
}
