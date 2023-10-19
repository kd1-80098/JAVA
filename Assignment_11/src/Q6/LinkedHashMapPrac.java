package Q6;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


//Store Students in LinkedHashMap<> so that, for given roll, Student can be searched in fastest possible time. Do we need to write equals() and
//hashCode() in Student class? Follow menu-driven approach. Hint:
//Answer:=  In this example we didn't require to write equals() and hashcode() methods. We have just overrided the toString method.




public class LinkedHashMapPrac {

	public static int menu() {
		int choice;
		System.out.println("**************************");
		System.out.println("Enter from below choice");
		System.out.println("1. Insert in MAP");
		System.out.println("2. Find in MAP");
		choice = new Scanner(System.in).nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Map<Integer, Students> map = new LinkedHashMap<>();
		int choice;

		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1: {
				System.out.println("Enter Student");
				Students s1 = new Students();
				s1.accept();
				map.put(s1.getRollNo(), s1);
			}
				break;
			case 2: {
				System.out.println("Enter roll no to find the student");
				int rollNo = new Scanner(System.in).nextInt();
				Students s2 = map.get(rollNo);
				System.out.println(s2);
			}
				break;
			default: {
				System.out.println("Invalid Input!");
			}
			}
		}

	}
}
