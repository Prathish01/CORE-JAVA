package hashset;

import java.util.HashSet;
import java.util.Set;

public class creatinghashset 
{
public static void main(String [] args)
{
System.out.println("creating set");	
Set set = new HashSet();
set.add(1);
set.add(2);
set.add(3);
set.add(4);
set.add(5);
set.add(null);
set.add("messi");
set.addAll(set);
System.out.println(set.contains("messi"));
System.out.println(set);
}
}
