package Tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static int menu()
	{	Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("1. Display details of perticular point");
		System.out.println("2. Display X,Y coordinates of all point");
		System.out.println("3.Distance between two points");
		
		choice=sc.nextInt();
	
		return choice;	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many points you want to enter");
		int point = sc.nextInt();
		Point2D[] p1 = new Point2D[point];
		for (int i = 0; i < point; i++) {
			p1[i] = new Point2D();
			p1[i].acceptPoint();
		}

		int choice;
		while ((choice=menu()) != 0)		
			switch (choice) {
			case 1: {
				System.out.println("Enter the number of which point you want to get the details for");
				int index = sc.nextInt();
				System.out.println("X : Y = " + p1[index - 1].getX() + ":" + p1[index - 1].getY());
			}
				break;

			case 2: {
				System.out.println("The X and Y coordinates of all points are");
				for (int i = 0; i < p1.length; i++) {
					System.out.println("X : Y =" + p1[i].getX() + " : " + p1[i].getY());
				}
			}
			break;

			case 3: {
				int a1;
				int a2;
				System.out.println("Enter the serial no of first point between which you want to get the distance");
				a1 = sc.nextInt();
				System.out.println("Enter the serial no of second point between which you want to get the distance");
				a2 = sc.nextInt();
				if (p1[a1-1].getX() == p1[a2-1].getX() && p1[a1-1].getY() == p1[a2-1].getY()) 
				{
					System.out.println("Numbers are on same location");
				} 
				else {
					double dx = p1[a1-1].getX() - p1[a2-1].getX();
					double dy = p1[a1-1].getY() - p1[a2-1].getY();
					double distance = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));

					System.out.println("The distance between two points is: " + distance);
				}

			}
			break;
			
			default :
			{
				System.out.println("Please enter valid data");
			}
			}

	}


}
