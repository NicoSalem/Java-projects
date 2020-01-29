package study_new;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Formatter;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class S_One<T>
{

	static ArrayList<Integer> al = new ArrayList<Integer>();
	LinkedList<Object> ll = new LinkedList<Object>();
	static Stack<Object> stack = new Stack<Object>();
	static int[] array = {1,2,3};
	static ArrayList<Integer> a = new ArrayList<Integer>();

	public static void main(String[] args) throws Exception
	{				
		Double x = 9.9;
		int xx = (int) 9.9;
		System.out.println(xx);
		
		File filexz = new File("C:\\Users\\Nico\\Documents\\SEMESTER 3\\CSC 172\\proj2 huffman\\FreqFile99.txt");
		//Scanner scannerrr = new Scanner(filexz);
		
		int bine = Integer.parseInt("01100001", 2);
		
		System.out.println("bin = "+bine);
		
		char a = (char)bine;
		System.out.println(a);
		
		String d = "97";
		int w = Integer.parseInt(d);
		System.out.println(w+9);

//		while(scannerrr.hasNext())
//		{
//			String[] split = scannerrr.nextLine().trim().split(":");
//			System.out.println("split: "+split[0]);
//			System.out.println("split: "+split[1]);
//		
//			String s = split[0];
//			
//			
//			break;
//		}
//		
		
		
//		char c = 'a';
//		String s = "A";
//		int in = (int)c;
//		System.out.println("this is it:" + in);
//		String binary = Integer.toBinaryString(in);
//		System.out.println(binary);
//		byte[] bytes = binary.getBytes();
//		for(byte element:bytes)
//		System.out.println("byte[0] "+bytes[0]);
//		
//		
//		
//		final Formatter fgg = new Formatter("C:\\Users\\Nico\\Documents\\SEMESTER 3\\CSC 172\\FreqFile.txt");
//		fgg.format("%s%s%s", "hello", " : ", "world");
//		fgg.close();
//		
//		PriorityQueue<LinkedListNode> q = new PriorityQueue<LinkedListNode>(new Comparator<LinkedListNode>()
//		{	
//			public int compare(LinkedListNode n1, LinkedListNode n2) 
//			{
//				if(n1.data>n2.data)
//				{
//					return 1;
//				}
//				else if(n1.data>n2.data)
//				{
//					return -1;
//				}
//				else {return 0;}
//			}
//		});
//		
//		q.add(new LinkedListNode(1));
//		q.add(new LinkedListNode(5));
//		q.add(new LinkedListNode(99));
//		int tempp = q.poll().data;
//		System.out.println(tempp);
//		//System.out.println(q.peek());
//		
//		
//		File file = new File("C:\\Users\\Nico\\Documents\\SEMESTER 3"
//				+ "\\social implications of computing\\example1.txt");
//		File file2 = new File("C:\\Users\\Nico\\Documents\\SEMESTER 3\\CSC 172\\example2.txt");
//
//		if(file.exists())
//		{
//			System.out.println("this file exists");
//		}
//		else System.out.println("nope");
//		//this accesses a file 
//
//		try 
//		{
//			final Formatter f = new Formatter("C:\\Users\\Nico\\Documents\\SEMESTER 3\\CSC 172\\example2.txt");
//			System.out.println("created a file named example2 in csc172 folder");
//			// if you have a file with the path you put as an argument for the formatter
//			//if you dont, then it creates one for you.
//			
//			f.format("%s%s%s", "nicholas salem", "21","28/27");
//			f.format("%s", "\neduardo salem");
//			f.format("%s", "hellohelo");
//			f.close();
//			System.out.println("should have printed nicholas salem etc");
//		} 
//		catch (FileNotFoundException e) 
//		{
//			e.printStackTrace();
//		}
//
//		Scanner sc = new Scanner(file2);			
//		
//		while(sc.hasNextLine())
//		{
//			String[] split = sc.nextLine().trim().split("\\s+");
//			
//			for(int i=0; i<split.length; i++)
//			{
//				if(split[i].equals("nicholas")) System.out.println(split[i]+" is wonderful");
//				System.out.print(split[i] + " ");
//			}
//			System.out.println();
//		}
		
	}

	
}
