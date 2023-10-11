/*Create an application that calculates your daily driving cost, so that you can estimate how much
money could be saved by car pooling, which also has other advantages such as reducing carbon
emissions and reducing traffic congestion. The application should input the following information
and display the user’s cost per day of driving to work:
a) Total miles driven per day.
b) Cost per gallon of gasoline.
c) Average miles per gallon.
d) Parking fees per day.
e) Tolls per day.*/

package java_Assignment_3;

import java.util.Scanner;

public class DailyDrivingCost {
	double totalMilesDriven;
	double costPerGasoline;
	double avgMilesPerGallons;
	double parkingFees;
	double tollPerDay;
	
	Scanner sc=new Scanner(System.in);
	
	public void costPerDay()
	{
		double totalCost=(((totalMilesDriven/avgMilesPerGallons)*costPerGasoline)+parkingFees+tollPerDay);
		System.out.println("The total per day cost is Rs."+totalCost);
	}

		public void acceptInfo()
		{
			System.out.println("Enter total Miles driven per day ");
			this.totalMilesDriven=sc.nextDouble();
			System.out.println("Enter the cost per gasoline in your area");
			this.costPerGasoline=sc.nextDouble();
			System.out.println("Enter the milege  of the vehicle");
			this.avgMilesPerGallons=sc.nextDouble();
			System.out.println("Enter daily parking charge");
			this.parkingFees=sc.nextDouble();
			System.out.println("Enter daily toll price");
			this.tollPerDay=sc.nextDouble();
			
		}
	public static void main(String[] args) {
			DailyDrivingCost c1=new DailyDrivingCost();
			c1.acceptInfo();
			c1.costPerDay();

	}

}
