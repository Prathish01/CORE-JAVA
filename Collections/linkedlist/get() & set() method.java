package list;

import java.util.LinkedList;




public class arraylist 
{
public static void main(String [] args)
{
LinkedList<Integer> ll = new LinkedList<Integer>();
ll.add(00);
ll.add(10);
ll.add(20);
ll.add(30);
ll.add(40);
ll.add(50);
ll.add(2,30);
System.out.println(ll.get(6));
//System.out.println(ll);

}
}


package list;

import java.util.LinkedList;




public class arraylist 
{
public static void main(String [] args)
{
LinkedList<Integer> ll = new LinkedList<Integer>();
ll.add(00);
ll.add(10);
ll.add(20);
ll.add(30);
ll.add(40);
ll.add(50);
ll.add(2,30);
ll.set(6,60);
System.out.println(ll.get(6));
