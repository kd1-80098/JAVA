package Q5;

@FunctionalInterface
interface Check<T>
{
	boolean compare(T x, T y);
}
public class CheckArrayDoubleClass {
	
	public static <T> int countIf(T[] arr, T key, Check<T> c)
	{
		int cnt=0;
		for (T ele :arr)
			{if (c.compare(ele, key))
				{cnt++;}
			}
		return cnt;
	}
	
	public static void main(String[] args)
	{
		Double [] arr= {44.00,77.23,50.00,99.31,22.45,55.00,50.00,66.00};
		double key=50.00;
		int count=countIf(arr,key,(x,y)->x.equals(y));
		System.out.println("Count: "+count);
		}
	}

