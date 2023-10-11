package Java_Assignment_2;

import java.util.Scanner;

public class Employee {
	
		Scanner sc=new Scanner(System.in);
		String first_name;
		String last_name;
		double monthly_salary;
		public Employee() {
			
		}

	
		public String getFirst_name() {
			return first_name;
		}
		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}
		public String getLast_name() {
			return last_name;
		}
		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}
		public double getMonthly_salary() {
			return monthly_salary;
		}
		public void setMonthly_salary(double monthly_salary) {
			this.monthly_salary = monthly_salary;
		}
		public Employee(String first_name, String last_name, double monthly_salary) {
			
			this.first_name = first_name;
			this.last_name = last_name;
			this.monthly_salary = monthly_salary;
		}
		
		public void acceptEmployee()
		{
			System.out.println("Enter first name of the employee");
			first_name=sc.next();
			System.out.println("Enter last name of the employee");
			last_name=sc.next();
			System.out.println("Enter monthly salary of the employee");
			monthly_salary=sc.nextDouble();
			if(monthly_salary>=0)
			{
				
			}
			else
			{	
				monthly_salary=0;	
				System.out.println("Please enter valid Salary value!");
			}
		}
		
		public void yearlySalary()
		{
			System.out.println("The yearly Salary of the employee is: "+getMonthly_salary()*12);
		}
		
		public void incrementBy10()
		{
			double yearlySalary=((getMonthly_salary()*12)+(0.10*getMonthly_salary()*12));
			System.out.println("Early salary of the employee is: "+yearlySalary);
		}
	
		public void displayEmployee()
		{
			System.out.println("The name of the employee is: "+getFirst_name()+" "+getLast_name());
			System.out.println("Monthly Salary of the employee is: "+monthly_salary);
			//System.out.println("Yearly salary of the Employee is: "+ yearlySalary());
			yearlySalary();
			
		}
};
