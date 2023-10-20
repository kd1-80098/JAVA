package Q1;

public class Labour implements Emp{
	int hours;
	double rate;
	
	public Labour(int hours, double rate) {
		super();
		this.hours = hours;
		this.rate = rate;
	}
	@Override
	public double getSal() {
		// TODO Auto-generated method stub
		return this.rate*this.hours;
	}
	@Override
	public double calcIncentives()
	{
		if (this.hours>300)
			{
				return 0.5*this.rate; 
			}
		else
		{
			return 0.0;
		}
	}
	
}
