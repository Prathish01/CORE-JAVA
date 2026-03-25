package hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class linkedlisttoset 
{
public static void main(String [] args)
{
Stack<Integer> list = new Stack<Integer>();
list.add(10);
list.add(20);	
list.add(30);	
list.add(40);	
list.add(50);	
list.add(60);	
list.add(70);	
list.add(80);	
list.add(90);	
list.add(100);	
list.push(200);

System.out.println(list);

System.out.println("converting this arraylist into set");
Set<Integer> set = new HashSet<Integer>(list);
System.out.println(set);
}
}
