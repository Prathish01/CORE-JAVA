package linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class settostring 
{
public static void main(String [] args)
{
System.out.println("creating linked hashset");

Set set = new LinkedHashSet();
//set.add(1);
set.add("hello");
set.add("world");
//set.add(1.2);
//set.add(4);
//set.add(6);
set.add("rono");
System.out.println("converting set into string");

String s1 = String.join(" ",set);
System.out.println(s1);
}
}
