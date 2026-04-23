package java8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class frch 
{
public static void main(String [] main)
{
List<Integer> lis = Arrays.asList(1,2,3,4,5);
	Consumer<Integer> con = (Integer t) -> {
			System.out.println(t);
		};
	
	 lis.forEach(con);
}
}
