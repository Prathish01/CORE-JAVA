package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class stackdelete 
{
public static void main(String [] args)
{
	Stack sta = new Stack();
	sta.add(10);
	sta.add("messi");
	sta.add(7);
	sta.add("ronaldo");
	sta.add(66);
	sta.add("arnold");
	//sta.clear();
	
	List<String> list1 = new ArrayList<>();
	list1.add("messi");
	list1.add("B");
	list1.add("C");
	list1.removeAll(sta);
	System.out.println(list1);
	System.out.println(sta);
	
}
}


removeall() is used to remove the content which is present in subclass
