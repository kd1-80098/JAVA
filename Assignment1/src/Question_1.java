
import java.util.Scanner;
public class Question_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number :");
		int num1 = sc.nextInt();
//		Integer int1 = Integer.valueOf(num1);
		System.out.println("Given Number :"+ num1);
		System.out.println("Binary equivalent :"+ Integer.toBinaryString(num1));
		System.out.println("Octal equivalent :"+ Integer.toOctalString(num1));
		System.out.println("Hexadecimal equivalent :"+ Integer.toHexString(num1));
	
	}

}
