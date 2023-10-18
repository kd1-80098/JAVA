import java.util.Arrays;
import java.util.Comparator;
public class Q2_Assignment9 {

	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		Double[]arr1= {11.5,15.75,55.36,17.31,558.335,215.456};
		
		//local class
		class CompareDouble implements Comparator<Double>
		{

			@Override
			public int compare(Double c1, Double c2) {
				int diff= Double.compare(c1,c2);
				return diff;
			}
//			public int compare(Double c1,Double c2)
//			{
//				int diff= Double.compare(c1,c2);
//				return diff;
//			}
		}
		
		//Before sort
		System.out.println("Before sort");
		for(Double ele:arr1)
		{
			System.out.println(ele);
			
		}
		
		CompareDouble cd=new CompareDouble();
		selectionSort(arr1,cd);
		
		//After sort
		System.out.println("After sort");
		for(Double ele:arr1)
		{
			System.out.println(ele);
			
		}
		
		
		
	}

}
