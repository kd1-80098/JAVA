package Tester;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		Point2D p1=new Point2D();
		Point2D p2=new Point2D();
		
		p1.acceptPoint();
		p2.acceptPoint();
		if(p1.isEqual(p2))
		{
			System.out.println("The points are on same location!");
		}
		else
		{
		p1.calculateDistance(p2);
		}
		p1.getDetails();
		p2.getDetails();
	
		
		
		

	}

}
