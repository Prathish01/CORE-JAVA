package linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class listtoarray1 
{
public static void main(String [] args)
{
	System.out.println("creating list");
	List<String> list = new LinkedList<String>();
	list.add("mbappe");
	list.add("thuram");
	list.add("dueu");
	list.add("konate");
	
	System.out.println(list);
	System.out.println("converting linkedlist to array");
	
	String[] str = list.toArray(new String[0]);
	System.out.println(Arrays.toString(str));
	
}
}
