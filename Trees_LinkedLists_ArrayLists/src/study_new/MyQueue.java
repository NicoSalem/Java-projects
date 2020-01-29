package study_new;

public class MyQueue //last in first out
{ 

	static MyArrayList al = new MyArrayList();
	static LL ll = new LL();

	public static void ALQAdd(Object o) 
	{
		al.add(o);	
	}

	public static void ALPop()
	{
		al.deleteAtIndex(0);
	}

	public static void printS()
	{
		al.print();
	}
	
	public static void LLQAdd(Object o) 
	{
		ll.append(o);
	}
	
	public static void LLPop()
	{
		ll.delete1();
	}
	
	public static void printLL()
	{
		ll.print();
	}

}
