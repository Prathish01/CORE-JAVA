package linkedhashset;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class settostring 
{
public static void main(String [] args)
{
System.out.println("creating linked hashset");

Set set = new LinkedHashSet();
set.add(1);
set.add("hello");
set.add("world");
set.add(1.2);
set.add(4);
set.add(6);
set.add("rono");
System.out.println("converting set into obj array");

Object[]obj = set.toArray();
System.out.println((Arrays.toString(obj)));


}
}
