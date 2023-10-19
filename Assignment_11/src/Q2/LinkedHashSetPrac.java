package Q2;

import java.util.Iterator;

//2. In above assignment use LinkedHashSet instead of HashSet. If any book with duplicate isbn is added, what will happen? Books are stored in which order?
//if we try to add any book with duplicate isbn, then it is getting added. for solving the problem of duplicates we need to write equals() method and hashCode() method. 
//Books are getting added in insert order.
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetPrac {

	public static void main(String[] args)
	{
		Set<BookDetails> set=new LinkedHashSet<>();
		
		set.add(new BookDetails("bhukkl",1216,"jljhlj",555));
		set.add(new BookDetails("uyguyiy",4486,"jljhlj",587));
		set.add(new BookDetails("bhhuhbk",47545,"jljhlj",21354));
		set.add(new BookDetails("sfhghii",4.687,"jljhlj",8975));
		set.add(new BookDetails("gytnjni",486,"jljhlj",145));
		set.add(new BookDetails("gytnjni",486,"jljhlj",145));
		
		Iterator <BookDetails>itr=set.iterator();
		while(itr.hasNext())
		{
			BookDetails b1=itr.next();
			System.out.println(b1);
		}
		
	}
}
