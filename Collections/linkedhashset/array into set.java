package linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class arraytoset 
{
public static void main(String [] args)
{
Integer[] i = {10,20,30,40,50};

System.out.println("convertig array into set");

Set<Integer> set = new LinkedHashSet<Integer>();
for(Integer u :i)
{
set.add(u);	
}
System.out.println(set);
}
}
