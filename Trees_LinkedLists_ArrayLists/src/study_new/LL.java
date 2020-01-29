package study_new;

public class LL<T>
{
	
	LinkedListNode head = null;
	LinkedListNode current = null;
	LinkedListNode save = null;
	
	public void append(T a)
	{
		save = head;
		current = new LinkedListNode();
		current.data = a;
		head = current;
		current.next = save;
		
	}
	
	public void add(T a)
	{
		if (head == null)
		{
			head = new LinkedListNode();
			head.data = a;
		}
		else
		{
			current = head; 
			while(current.next!=null)
			{
				current = current.next;
			}
			current.next = new LinkedListNode();
			current.next.data = a;
		}
		
	}
	
	public void insertAtIndex(int index, T data) 
	{
		current = head; 
		int count = 1;
		
		while(count!= index)
		{
			current = current.next;
			count++;
		}
		save = current.next;
		current.next = new LinkedListNode();
		current.next.data = data;
		current.next.next = save;
		
	}
	
	public void deleteAtIndex(int index) 
	{
		current = head; 
		int count = 1;
		
		while(count!= index)
		{
			current = current.next;
			count++;
		}
		current.next=current.next.next;
	}
	
	public <T> void delete1()
	{
		current = head;
		while(current.next.next!=null)
		{
			current=current.next;					
		}
		current.next=null;
	}
	
	public void print()
	{
		current = head;
		System.out.println(head.data);
		while(current.next != null)
		{
			current = current.next;
			System.out.println(current.data);
		}
	}
	
	public <T> void printPos(int index) 
	{
		current = head; 
		int count = 1;
		
		while(count!= index)
		{
			current = current.next;
			count++;
		}
		System.out.println();
	}
	
	

}
