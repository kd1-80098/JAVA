package com.app.geometry;

import java.util.Scanner;

public class Point2D {

	double x;
	double y;
	
	public Point2D()
	{
		
	}
	public Point2D(double x, double y) 
	{
	
		this.x = x;
		this.y = y;
	}
	Scanner sc=new Scanner(System.in);
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public boolean isEqual(Point2D p2)
	{
		if((this.x==p2.x) && (this.y==p2.y))
		{
		return true;	
		}
		else 
		{
		return false;
		}	
	}
	
	public void getDetails()
	{
		System.out.println("The value of x is: "+x);
		System.out.println("The value of y is: "+y);
	}
	
	public void calculateDistance(Point2D p1)
	{
		
		double dx= this.x-p1.x;
		double dy=this.y-p1.y;
		
		double distance = Math.sqrt(Math.pow(dx,2)+Math.pow(dy, 2)); 
		System.out.println("The distance between two points is: "+distance);
	}
	
	
	public void acceptPoint()
	{
		System.out.println("Enter the value for x");
		x=sc.nextDouble();
		System.out.println("Enter the value for y");
		y=sc.nextDouble();
	}
	
}


