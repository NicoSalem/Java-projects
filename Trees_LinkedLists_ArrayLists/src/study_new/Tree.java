package study_new;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.lang.Comparable;

public class Tree<T> 
{

	
	static Tree_node head;
	static Tree_node current;
	static Tree_node right;
	static Tree_node left;
	static Tree_node prev;
	static LL ll = new LL();
	static int count = 0;
	static ArrayList<Tree_node> array = new ArrayList<Tree_node>();
	

	public static void main(String[] args)
	{			
		//Queue<Object> qe = new Queue<Object>();
		Stack<Object> q = new Stack<Object>();
		arrayAdd(array, new Tree_node("head"));
		arrayAdd(array, new Tree_node("left child"));
		arrayAdd(array, new Tree_node("right child"));
		arrayAdd(array, new Tree_node("index 3 so it should be the same as head.left.left"));
		makeTree(array);

		System.out.println("hand made");
		System.out.println(head.left.left.data);
		System.out.println(head.left.data);
		System.out.println(head.data);
		System.out.println(head.right.data);
		
		System.out.println(head.left==null);
		System.out.println("\ncheck inorder traversal");
		inOrder(array, head);

//		System.out.println(array.get(0).data);
//		System.out.println(array.get(1).data);
//		System.out.println(array.get(2).data);
//		System.out.println(array.get(3).data);
		
//		System.out.println(current.data);
//		System.out.println(current.right.data);

	}

	public static <T extends Comparable <? super T>> void llbstree(Tree_node start, Tree_node element)
	{
		current = start;

		if (start==null) {start.data = element;}		
		else
		{
			if (element.data > current.data)
			{
				if(current.left!=null) {;}
				else {llbstree(current.left, element);}
			}

			else if(element.data > current.data)
			{
				if(current.right!=null) {;}
				else {llbstree(current.right, element);}
			}

		}
	}

	public static void arrayAdd(ArrayList<Tree_node> arrayy, Tree_node element)
	{

		if(array.isEmpty()) { arrayy.add(count, element); count++;}//add to the head if head is empty
		else 
		{
			for(int i=0; i<10; i++)
			{
				try 
				{
					if (arrayy.get(((count-1)/2)+1)==null) {;} // if it is empty, it will generate an error and execute catch. if it is not empty nothing will happen
				}
				catch(IndexOutOfBoundsException e)
				{
					{arrayy.add(((count-1)/2)+1, element); count++; break;}
				}

				try 
				{
					if (arrayy.get(((count-1)/2)+2)==null) {;} // if it is empty, it will generate an error and execute catch. if it is not empty nothing will happen
				}
				catch(IndexOutOfBoundsException e)
				{
					{arrayy.add(((count-1)/2)+2, element); count++; break;}
				}
			}
		}

	}

	public static void makeTree(ArrayList<Tree_node> arrayy)
	{
		head = arrayy.get(0);

		for(int c = 0; c<arrayy.size()-2; c++) 
		{
			current = arrayy.get(c);
			System.out.println(c+"\n" +current.data);

			try 
			{
				current.left = arrayy.get((2*c)+1);
				System.out.println(current.left.data);
			}
			catch(IndexOutOfBoundsException e)
			{System.out.println("null");}


			try 
			{
				current.right = arrayy.get(2*arrayy.indexOf(current)+2);
				System.out.println(current.right.data);
			}
			catch(IndexOutOfBoundsException e)
			{System.out.println("null");}

		}
	}

	public static void inOrder(ArrayList<Tree_node> arrayy, Tree_node start)
	{
		if (start.left!=null) {inOrder(arrayy, start.left);}
		System.out.println(start.data); 
		if (start.right!=null)inOrder(arrayy, start.right);

		
	}
	
	public static  void heapify(ArrayList<Tree_node> arrayy, Tree_node start)
	{
		int count = 0;
		start = arrayy.get(count);
		start.left = arrayy.get(count+1);
		if (start.left.data > start.data) {/*switch*/;}
		if (start.right.data > start.data) {/*switch*/;}
		heapify(arrayy, start.left);
		heapify(arrayy, start.right);
		
	}

}