package hashset;

import java.util.HashSet;
import java.util.Set;

public class arraytohasset 
{
public static void main(String [] args)
{
System.out.println("creating array");
Integer[] arr = {10,20,30,40,50};


System.out.println("creating set");
Set<Integer> set = new HashSet();

for(Integer as : arr)
{
set.add(as);	
}
System.out.println(set);
}
}
