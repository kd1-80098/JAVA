package Java_Assignment_2;

import java.util.Scanner;

public class Date {
		public int month;
		public int day;
		public int year;
		
		Scanner sc=new Scanner(System.in);
		
		public int getMonth() {
			return month;
		}
		public void setMonth(int month) {
			this.month = month;
		}
		public int getDay() {
			return day;
		}
		public void setDay(int day) {
			this.day = day;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		Date()
		{
			
		}
		public Date(int day, int month, int year) {
			
			this.month = month;
			this.day = day;
			this.year = year;
		}

		public void displayDate()
		{
			System.out.println("The date is "+day+"/"+month+"/"+year);
		}
		
		public void acceptDate()
		{
			System.out.println("Enter values for day,month and year");
			day=sc.nextInt();
			month=sc.nextInt();
			year=sc.nextInt();
		}
		
		
		
	

}
