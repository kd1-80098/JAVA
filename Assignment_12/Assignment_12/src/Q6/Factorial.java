package Q6;

import java.util.stream.Stream;

public class Factorial {

	public static void main(String[] args) {
		int num=6;
		Stream<Integer> str=Stream.iterate(1,i->i+1).limit(num);
		
		Integer fact=str.reduce(1,(x,y)->x*y);
		System.out.println(fact);

	}

}
