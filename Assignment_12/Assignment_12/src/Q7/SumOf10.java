package Q7;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOf10 {

	public static void main(String[] args) {
		Random r=new Random();
		Stream<Integer> strm=Stream.generate(()->r.nextInt(100)).limit(10);
		strm.forEach(ele->System.out.println(ele));
		List<Integer> list=strm.collect(Collectors.toList());
		System.out.println(list);
//		list.stream()
		
		Integer sum=list.stream().reduce(0, (a,e)->a+e);
		System.out.println(sum);

	}

}
