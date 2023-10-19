package Q4;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPrac {

	public static void main(String[] args) {
	
		
//		local class
		class PriceComparator implements Comparator<BookDetails>
		{

			@Override
			public int compare(BookDetails b1, BookDetails b2) {
				int diff=-Double.compare(b1.getPrice(), b2.getPrice());
				return diff;
			}
			
		}
		
		PriceComparator pc=new PriceComparator();
		
		TreeSet<BookDetails> set=new TreeSet<BookDetails>();
		set.add(new BookDetails("bhukkl",1216,"jljhlj",555));
		set.add(new BookDetails("uyguyiy",4486,"jljhlj",587));
		set.add(new BookDetails("bhhuhbk",47545,"jljhlj",21354));
		set.add(new BookDetails("sfhghii",4.687,"jljhlj",8975));
		set.add(new BookDetails("gytnjni",486,"jljhlj",145));
		set.add(new BookDetails("gytnjni",486,"jljhlj",145));
		
//		Iterator<BookDetails>itr=set.iterator();
		Iterator<BookDetails> itr=set.descendingIterator(); 		
		while(itr.hasNext())
		{
			BookDetails b1=itr.next();
			System.out.println(b1);
		}
		
		
		
		
		
		

}
}
