package Q1;

public class Manager implements Emp{
	double basicSalary;
	double dearnessAllowance;
	
	public Manager(double basicSalary, double dearnessAllowance) {
		super();
		this.basicSalary = basicSalary;
		this.dearnessAllowance = dearnessAllowance;
	}
	@Override
	public double getSal() {
		
		return this.basicSalary+this.dearnessAllowance;
	}
	@Override
	public double calcIncentives()
	{
		return basicSalary*0.2;
		
	}
	
	
}
