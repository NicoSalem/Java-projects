package study_new;

public class MyStack //last in first out
{ 

	static MyArrayList al = new MyArrayList();
	static LL ll = new LL();

	public static void ALStackAdd(Object o) 
	{
		al.add(o);	
	}

	public static void ALPop()
	{
		al.deleteAtIndex(al.getSize()-1);
	}

	public static void printS()
	{
		al.print();
	}
	
	public static void LLStackAdd(Object o) 
	{
		ll.add(o);	
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
