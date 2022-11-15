package onlineCart;

public class GenericLinkedList<E> {
	class Node
	{
		E data;
		Node next;
	}
	Node start,curr,prv;
	public boolean isEmpty()
	{
		return start==null;
	}
	public void add(E data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(isEmpty())
		{
			start=node;
		}
		else
		{
			curr=start;
			while(curr.next!=null)
			{
				curr=curr.next;
			}
			curr.next=node;
		}
	}
	public void remove(int pos)
	{
		if(isEmpty())
		{
			System.out.println("List Empty");
		}
		else
		{
			curr=start;
			int i=1;
			while(curr!=null && pos!=i)
			{
				prv=curr;
				curr=curr.next;
				i++;
			}
			if(pos==i)
			{
				if(start==curr)
				{
					start=curr.next;
				}
				else
				{
					prv.next=curr.next;
				}
			}
			else
			{
				System.out.println("Node not found...");
			}
		}
	}
	public void traverse()
	{
		if(isEmpty())
		{
			System.out.println("List Empty....");
		}
		else
		{
			curr=start;
			int i=1;
			while(curr!=null)
			{
				System.out.println("Data at position "+i+" = "+curr.data);
				curr=curr.next;
				i++;
			}
		}
	}
}


