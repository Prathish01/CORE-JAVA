package linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class iterator {
	public static void main(String [] args)
	{
	Set rt = new LinkedHashSet();
	rt.add("hello");
	rt.add("world");
	rt.add("long ball");
	rt.add("kio");
	rt.add("hiio");
	rt.add("messi");
	System.out.println(rt);
	
	for(Object s : rt)
	{
		System.out.println(s);
	}
	}
		

}
