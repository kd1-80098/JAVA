package Q3;

//n above assignment use TreeSet instead of LinkedHashSet. Use natural ordering for the Book. If any book with duplicate isbn is added, what will happen?
//Books are stored in which order?
//in this example we have used comparable interface. because of which duplicate values are not getting added.
//Books are getting stored in alphabetical order.

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPrac {

	public static void main(String[] args) {
		Set<BookDetails> set=new TreeSet<BookDetails>();
		
		set.add(new BookDetails("bhukkl",1216,"jljhlj",555));
		set.add(new BookDetails("uyguyiy",4486,"jljhlj",587));
		set.add(new BookDetails("bhhuhbk",47545,"jljhlj",21354));
		set.add(new BookDetails("sfhghii",4.687,"jljhlj",8975));
		set.add(new BookDetails("gytnjni",486,"jljhlj",145));
		set.add(new BookDetails("gytnjni",486,"jljhlj",145));
		
		Iterator<BookDetails>itr=set.iterator();
		while(itr.hasNext())
		{
			BookDetails b1=itr.next();
			System.out.println(b1);
		}

}
}
