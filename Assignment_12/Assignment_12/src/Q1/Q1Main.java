package Q1;

public class Q1Main {

	public static void main(String[] args) {
		Emp[] arr=new Emp[3];
		arr[0]=new Manager(100,100);
		arr[1]=new Labour(230,500);
		arr[2]=new Clerk(5000);
		
		double totalIncome=Emp.calcTotalIncome(arr);
		System.out.println(totalIncome);

	}

}
