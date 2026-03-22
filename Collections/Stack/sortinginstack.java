package stack;

import java.util.Collections;
import java.util.Stack;

public class sort 
{
public static void main(String [] args)
{
	Stack sta = new Stack();
	sta.add(10);
	sta.add(4545);
	sta.add(7);
	sta.add(454);
	sta.add(66);
	sta.add(1);
	Collections.sort(sta);
	System.out.println(sta);
	System.out.println();
	System.out.println("descending order");
	Collections.reverse(sta);
	System.out.println(sta);
	}
}
