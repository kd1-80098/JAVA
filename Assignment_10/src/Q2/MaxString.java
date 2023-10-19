package Q2;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
public class MaxString {

	
	
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("MANAS");
		list.add("ANIKET");
		list.add("ATISH");
		list.add("PRATHAMESH");
		list.add("ANIL");
		list.add("KUNAL");
		list.add("VIRAJ");
		
		//String s=Collections.max(list);
		//System.out.println(s);
		
		class MaxLengthComparator implements Comparator<String>
		{
			@Override
			public int compare(String s1, String s2) {
			
				int diff= Integer.compare(s1.length(), s2.length());
				
				return diff;
			}
		}
		
		MaxLengthComparator mlc=new MaxLengthComparator();
		
		String maxLength=Collections.max(list,mlc);
		System.out.println(maxLength);

		
//		String MaxLength = Collections.max(list, new Comparator<String>() {
//
//			@Override
//			public int compare(String e1, String e2) {
//				
//				return Integer.compare(e1.length(), e2.length());
//			}
//		});
//		System.out.println("Max Length:"+MaxLength);

	}
	}
	

