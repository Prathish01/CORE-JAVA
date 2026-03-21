package linkedhashset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class settostring 
{
public static void main(String [] args)
{
System.out.println("creating linked hashset");

Set<Integer> set = new LinkedHashSet<Integer> ();
set.add(1);
set.add(20);
set.add(30);
set.add(465);
set.add(4);
set.add(6);
set.add(999);

List<Integer> li = new  ArrayList<Integer>(set);
Collections.sort(li, Collections.reverseOrder());
System.out.println(li);

System.out.println("ascending order");
Collections.sort(li);
System.out.println(li);
//System.out.println("converting set into obj array");

//Object[]obj = set.toArray();
//System.out.println((Arrays.toString(obj)));
System.out.println("its ascending and descsnding order");
}
}


we cant use collections directly into hashset 
if we want to use we need to firdt change the set into list and then only we can make use of collections special methods like sort and reverse()
