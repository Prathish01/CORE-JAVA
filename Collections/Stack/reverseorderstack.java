package stack;

import java.util.Collections;
import java.util.Stack;

public class stackcreation 
{
public static void main(String [] args)
{
	Stack sta = new Stack();
	sta.add(10);
	sta.add(22);
	sta.add(7);
	sta.add(444);
	sta.add(66);
	sta.add(565);
	Collections.sort(sta,Collections.reverseOrder());
	System.out.println(sta);
	
}
}
