package stack;

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
	sta.remove(5);
	
	System.out.println(sta);
	
}
}
