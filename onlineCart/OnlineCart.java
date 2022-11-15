package onlineCart;

class OnlineCart
{
	static int cnt;
	static GenericLinkedList<Product> cart;
	static java.util.Scanner scan;
	static 
	{
		cnt=1;
		scan=new java.util.Scanner(System.in);
		cart=new GenericLinkedList<Product>();
	}
	static private boolean addToCart()
	{
		Product product=new Product();
		product.setId(cnt);
		scan.nextLine();
		System.out.print("Enter Name         : ");
		product.setName(scan.nextLine());
		System.out.print("Enter Description  : ");
		product.setDescription(scan.nextLine());
		System.out.print("Enter Price        : ");
		product.setPrice(scan.nextDouble());
		cart.add(product);
		cnt++;
		return true;
	}
	static public boolean removeFromCart()
	{
		int pos;
		cart.traverse();
		System.out.print("\n\nEnter Position of product : ");
		pos=scan.nextInt();
		cart.remove(pos);
		return true;
	}
	public static void main(String...s)
	{
		
		while(true)
		{
			System.out.println("1. Add Product to Cart");
			System.out.println("2. Remove Product from Cart");
			System.out.println("3. View Cart");
			System.out.println("4. Search Product");
			System.out.println("0. Exit");
			System.out.print("Enter Choice : ");
			switch(scan.nextInt())
			{
				case 1:
					if(addToCart())
					{
						System.out.println("****************************");
						System.out.println("       Product Added");
						System.out.println("****************************");
						
					}
					break;
				case 2:
					if(removeFromCart())
					{
						System.out.println("****************************");
						System.out.println("       Product Removed");
						System.out.println("****************************");
						
					}
					
					break;
				case 3:
					System.out.println("\n***********   CART    **************");
					cart.traverse();
					break;
				case 4:
					break;
				case 0:
					System.out.println("Bye Bye");
					break;
				default:
					System.out.println("Wrong input");
					break;
				
			}
		}		
	}
}