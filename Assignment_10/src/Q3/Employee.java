package Q3;
import java.util.Objects;
import java.util.Scanner;

 public class Employee implements Comparable {

	int id;
	double salary;

	public void accept() {
		System.out.println("Enter Employee id : ");
		this.id = new Scanner(System.in).nextInt();
		System.out.println("Enter salary : ");
		this.salary = new Scanner(System.in).nextDouble();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println(" Employee ID : " + this.id);
		System.out.println(" Salary : " + this.salary);
	}



	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

//	abstract double calculateSalary();
}