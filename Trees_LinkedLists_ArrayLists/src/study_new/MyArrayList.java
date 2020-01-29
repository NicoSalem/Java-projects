package study_new;

public class MyArrayList<T> 
{
	static int a = 1;
	static Object[] array = new Object[a];
	static Object[] array2;
	
	public void add(T data)
	{
		if(array[0]==null)
		{
			array[0] = data;
		}

		else {
			a++;
			array2 = new Object[a];

			for (int i = 0; i<array.length; i++)
			{
				array2[i] = array[i];
			}
			array2[array.length] = data;
			
			array=new Object[a];
			for (int i = 0; i<a; i++)
			{
				array[i] = array2[i];
			}
		}
	}
	
	public static void deleteAtIndex(int index)
	{
		for (int i=0; i<array.length; i++)
		{
			if(i==index) {continue;}
			System.out.println(array[i]);
		}
	}
	
	public void print() 
	{
		for (int i = 0; i<array2.length; i++)
		{
			System.out.println(array2[i]);
		}
	}
	
	public int getSize()
	{
		return array.length;
	}
} 


