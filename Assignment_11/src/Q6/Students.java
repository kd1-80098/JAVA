package Q6;

import java.util.Objects;
import java.util.Scanner;

public class Students {

	int rollNo;
	String Name;
	
	
	
	public Students(int rollNo, String name) {
		
		this.rollNo = rollNo;
		Name = name;
	}



	public Students() {
		
	}



	public int getRollNo() {
		return rollNo;
	}



	public String getName() {
		return Name;
	}



	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}



	public void setName(String name) {
		Name = name;
	}



	public void accept()
	{
		System.out.println("Enter student id");
		this.rollNo=new Scanner(System.in).nextInt();
		System.out.println("Enter student name");
		this.Name=new Scanner(System.in).next();
	}



	@Override
	public String toString() {
		return "Students [rollNo=" + rollNo + ", Name=" + Name + "]";
	}
//
//
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(Name, rollNo);
//	}
//
//
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (!(obj instanceof Students))
//			return false;
//		Students other = (Students) obj;
//		return Objects.equals(Name, other.Name) && (rollNo == other.rollNo);
//	}
	
	
	
}
