package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class stacksearch 
{
public static void main(String [] args)
{
	
	List<String> list = new ArrayList<>();

    
    list.add("Apple");
    list.add("Banana");
    list.add("Cherry");
    list.add("Date");
    
	Stack sta = new Stack();
	sta.add(10);
	sta.add("Apple");
	sta.add("Cherry");
	sta.add("Banana");
	sta.add(66);
	sta.add("Date");
	
	System.out.println(sta.containsAll(list));
	

}
}
