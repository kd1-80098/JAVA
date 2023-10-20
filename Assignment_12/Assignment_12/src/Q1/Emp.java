package Q1;

public interface Emp {
	double getSal();

public default double calcIncentives()
{
	
	return 0.0;	
}

static double calcTotalIncome(Emp arr[])
{
	double total=0;
	for (Emp emp : arr) {
		 total+=emp.getSal()+emp.calcIncentives();
	}
	
	return total;
	
}
}
