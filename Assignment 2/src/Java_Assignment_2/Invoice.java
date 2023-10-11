package Java_Assignment_2;

import java.util.Scanner;

public class Invoice {

	String partNo;
	String partDescription;
	int quantity;
	double price;

	public Invoice() {

	}

	public Invoice(String partNo, String partDescription, int quantity, double price) {

		this.partNo = partNo;
		this.partDescription = partDescription;

		if (this.quantity != 0)
			this.quantity = quantity;
		else
			this.quantity = 0;

		if (this.price != 0)
			this.price = price;
		else
			this.price = 0;
	}

	Scanner sc = new Scanner(System.in);

	public String getPartNo() {
		return partNo;
	}

	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity != 0)
			this.quantity = quantity;
		else
			this.quantity = 0;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (this.price != 0)
			this.price = price;
		else
			this.price = 0;
	}

	public void calculateAmount() {
		double Amount = this.quantity * this.price;
		System.out.println("The total Bill Amount is Rs." + Amount);
	}

	public void acceptPartDetails() {
		System.out.println("Enter the Part Number");
		this.partNo = sc.nextLine();
		System.out.println("Enter the Part Description");
		this.partDescription = sc.nextLine();
		System.out.println("Enter the quantity you want to purchase");
		this.quantity = sc.nextInt();
		System.out.println("Enter the price of the item");
		this.price = sc.nextDouble();
	}

}
