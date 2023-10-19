package Q5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMapPrac {
	
	public static int menu()
	{
		int choice;
		System.out.println("**************************");
		System.out.println("Enter from below choice");
		System.out.println("1. Insert in MAP");
		System.out.println("2. Find in MAP");
		choice=new Scanner(System.in).nextInt();
		return choice;
	}

	public static void main(String[] args)
	{
		Map<String,BookDetails> map=new HashMap();
		
		int choice;
		while((choice=menu())!=0)
		{
			switch(choice)
			{
			case 1:
			{
				BookDetails b=new BookDetails();
				b.accept();
				map.put(b.getIsbn(), b);
			}
			break;
			
			case 2:
			{
				System.out.println("Enter isbn number to find in");
				String a=new Scanner(System.in).next();
				BookDetails b1=map.get(a);
				System.out.println(b1);
			}
			break;
			default:
			{
				System.out.println("Invalid Input!");
			}
			
			}
		}
		
		
	}
}
