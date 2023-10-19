package Q1;

/*Store few books (hardcoded values with the Book class in previous assignment) in a HashSet and display them using iterator. If any book with duplicate
isbn is added, what will happen? Books are stored in which order? Solve duplicate ISBN problem.*/
//Duplicate records are getting added.
//Books are getting stored on the basis of hash code getting generated internally.
//so here we need to write equals() method and hashCode() method inside BookDetails class to solve the problem of duplicates
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetPrac {

	public static void main(String[] args)
	{
		Set<BookDetails> set=new HashSet<>();
		set.add(new BookDetails("bhukkl",1216,"jljhlj",555));
		set.add(new BookDetails("uyguyiy",4486,"jljhlj",587));
		set.add(new BookDetails("bhhuhbk",47545,"jljhlj",21354));
		set.add(new BookDetails("sfhghii",4.687,"jljhlj",8975));
		set.add(new BookDetails("gytnjni",486,"jljhlj",145));
		set.add(new BookDetails("gytnjni",486,"jljhlj",145));
		
		Iterator<BookDetails> itr= set.iterator();
		while(itr.hasNext())
		{
			BookDetails b1=itr.next();
			System.out.println(b1);
		}
		
		
	}
	
}
