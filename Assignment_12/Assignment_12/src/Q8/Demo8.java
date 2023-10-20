package Q8;

import java.util.stream.IntStream;

public class Demo8 {
	
	public static void main(String[] args) {
	IntStream strm1=IntStream.range(1, 10);
	System.out.println(strm1.sum());
	
	IntStream strm2=IntStream.range(0, 100);
	System.out.println(strm2.summaryStatistics());
}
}