package stack;

import java.util.Stack;

public class stackcreation 
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
	sta.addAll(sta);
	System.out.println(sta);
	
}
}
