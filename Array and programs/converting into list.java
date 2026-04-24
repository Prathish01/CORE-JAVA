package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class intarraytolist 
{
public static void main(String [] args)
{
	System.out.println("creating arrays");
	int[] arr = {10,20,30,40,50};
	System.out.println(Arrays.toString(arr));
	List li = new ArrayList<>();
	System.out.println("converting into list");
	for(int m1 :arr) 
	{
		li.add(m1);
		
	}
	System.out.println(li);
}
}
