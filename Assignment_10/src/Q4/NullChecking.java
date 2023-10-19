package Q4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

//in ArrayList multiple null values are allowed. and values get stored as per insertion order.
//in HashSet only single null value is allowed and values get stored as per alphabetical order.Null value gets stored in the first index
//in LinkedHashSet only one null value is allowed and values get stored in the insertion order. Null values gets stored in the last index.
//no null value is allowed. we get NullPointerException.


public class NullChecking {

	public static void main(String[] args) {
//		Collection<String> c = new ArrayList<>();
//		Collection<String> c = new HashSet<>();
//		Collection<String> c = new LinkedHashSet<>();
		Collection<String> c = new TreeSet<>();
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
		c.add(null);
		c.add(null);
		c.add(null);
		System.out.println(c.toString());

	}

}
