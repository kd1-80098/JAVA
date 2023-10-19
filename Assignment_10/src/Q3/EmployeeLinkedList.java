package Q3;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;


public class EmployeeLinkedList {

	public static int menu()
	{
		int choice;
		System.out.println("Enter from below choices");
		System.out.println("1 Add Employee");
		System.out.println("2 Delete Employee");
		System.out.println("3 Find Employee");
		System.out.println("4 Sort Employee");
		System.out.println("5 Edit Employee");
		choice=new Scanner(System.in).nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
		List<Employee> list=new CopyOnWriteArrayList<Employee>();
//		List<Employee> list=new LinkedList<Employee>(); ----> received concurrentModification exception while deleting the employee object so using CopyOnWriteArrayList class
		int choice;
		Employee e;
		while((choice=menu())!=0)
		{
			switch(choice)
			{
			case 1:
			{
				System.out.println("Adding Employee");
				e=new Employee();
				e.accept();
				list.add(e);
			}
			break;
			case 2:
			{
				System.out.println("Deleting Employee");
				System.out.println("Enter Employee id you want to delete");
				int a=new Scanner(System.in).nextInt();
				Employee e0=new Employee();
				e0.setId(a);
				
				ListIterator<Employee> li=list.listIterator();
				if(list.contains(e0))
					while(li.hasNext())
					{
						Employee obj=li.next();
						if(obj.equals(e0))
						{
							list.remove(obj);
							System.err.println("Employee Removed!");
						}
						else {
							System.err.println("Cant delete employee. as its not present");
						}
					}
			}
			break;
			case 3:
			{
				System.out.println("Enter employee number to find");
				int id=new Scanner(System.in).nextInt();
				Employee e1=new Employee();
				e1.setId(id);
				int num=list.indexOf(e1);
				if(num==-1)
				{
					System.out.println("Employee not found");
				}
				else {
					System.out.println("Employee Found!");
					System.out.println("Employee found at index: "+num);
				}	
			}
			break;
			case 4:
			{
				System.out.println("Sorting the list");
				Collections.sort(list);
				for(Employee ele:list)
				{
					System.out.println(list);
				}
			}
			break;
			case 5:
			{
				System.out.println("Enter emp id to be modified: ");
				int id = new Scanner(System.in).nextInt();
				Employee key = new Employee();
				key.setId(id);
				int index = list.indexOf(key);
				if(index == -1)
				System.out.println("Employee not found.");
				else {
				Employee oldEmp = list.get(index);
				System.out.println("Employee Found: " + oldEmp);
				System.out.println("Enter new information for the Employee");
				Employee newEmp = new Employee();
				newEmp.accept();
				list.set(index, newEmp);
			}
			}
		}
		

	}

}
}
