/*
Develop a Java application that determines whether any of several department-store customers has
exceeded the credit limit on a charge account.
For each customer,the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.
The program should input all these facts as integers, calculate the new balance (= beginning
balance+ charges – credits), display the new balance and determine whether the new balance
exceeds the customer’s credit limit. For those customers whose credit limit is exceeded, the
program should display the message "Credit limit exceeded".*/

package java_Assignment_3;

import java.util.Scanner;

public class CustomerCredit {
	int accno;
	int balance;
	int totalCharge;
	int totalCredits;
	int creditLimit;
	double newBalance;
	
	Scanner sc=new Scanner(System.in);
	
	public void calculateBalance()
	{
		newBalance= balance+totalCharge-totalCredits;
		System.out.println("Your total balance is Rs."+this.newBalance);

		if(creditLimit>newBalance)
		{
			System.out.println("The credit limit is exceeded");
			
		}
		else
		{
			System.out.println("credit limit is within the range");
		}
	}
	
	
	public void acceptCustomer()
	{
		System.out.println("Enter the accno of the customer");
		this.accno=sc.nextInt();
		System.out.println("Enter Balance");
		this.balance=sc.nextInt();
		System.out.println("Enter total charge");
		this.totalCharge=sc.nextInt();
		System.out.println("Enter total credits");
		this.totalCredits=sc.nextInt();
		System.out.println("Enter credit limit of the customer");
		this.creditLimit=sc.nextInt();
		
	}
	
	public static void main(String[] args) 
	{
		
		CustomerCredit c1=new CustomerCredit();
		c1.acceptCustomer();
		c1.calculateBalance();
	}

}
