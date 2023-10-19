package Q4;

import java.util.Objects;
import java.util.Scanner;

public class BookDetails implements Comparable<BookDetails> {
	
	String isbn;
	double price;
	String authorName;
	int quantity;

	public BookDetails(String isbn, double price, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public BookDetails() {
	
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(isbn);
//	}



//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (!(obj instanceof BookDetails))
//			return false;
//		BookDetails other = (BookDetails) obj;
//		return Objects.equals(isbn, other.isbn);
//	}

	@Override
	public String toString() {
		return "BookDetails [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity="
				+ quantity + "]";
	}
	
	public void accept()
	{
		System.out.println("Enter isbn");
		this.isbn=new Scanner(System.in).next();
		System.out.println("Enter price");
		this.price=new Scanner(System.in).nextDouble();
		System.out.println("Enter author name");
		this.authorName=new Scanner(System.in).next();
		System.out.println("Enter quantity");
		this.quantity=new Scanner(System.in).nextInt();
	}
	
	public boolean equals(Object obj)
	{	
		if(obj==null)
			return false;
		if(this==obj)
			return false;
		if(obj instanceof BookDetails)
		{
			BookDetails other=(BookDetails)obj;
					if(this.isbn==other.isbn)
						return true;
		}	
		return false;
	}
	
	public int hashCode()
	{
		int hash=Objects.hash(this.isbn);
		return hash;
		
	}

	@Override
	public int compareTo(BookDetails other) {
		int diff=this.isbn.compareTo(other.isbn);
		return diff;
	}
	
	

}
