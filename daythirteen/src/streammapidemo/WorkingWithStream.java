package streammapidemo;
//program to demonstrate on Basic Stream
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WorkingWithStream {

	public static void main(String[] args) {
		
		Stream<String> obj = Stream.of("Pratik","Manoj","Sahil");
		obj.forEach(i->System.out.println(i+" "));
		
		System.out.println();
		
		List<Integer> obj1 = Arrays.asList(new Integer[] {11,55,44,22,88});
		obj1.forEach(i->System.out.println(i+" "));

	}

}
