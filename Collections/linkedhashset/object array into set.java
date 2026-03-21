package linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class arraytoset 
{
public static void main(String [] args)
{
Object[] i = {10,20,30,40,50,"mesi",10.34};

System.out.println("convertig array into set");

Set  set = new LinkedHashSet();
for(Object u :i)
{
set.add(u);	
}
System.out.println(set);
}
}
