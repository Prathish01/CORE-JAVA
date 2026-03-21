package treeset;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class settoaray 
{


public static void main(String [] args)
{
System.out.println("creation of treeset");

Set<Integer> set = new TreeSet<Integer>();
set.add(10);
set.add(20);
set.add(30);
set.add(40);
set.add(50);
set.add(60);
set.add(70);
set.add(80);
set.add(90);
set.add(100);
set.add(110);
set.add(100);
System.out.println("convert set into array");

Integer[] arr = set.toArray(new Integer[0]);

System.out.println(Arrays.toString(arr));
//Integer[] arr = set.toArray(new Integer[0]);
//System.out.println(Arrays.toString(arr));
}
}
