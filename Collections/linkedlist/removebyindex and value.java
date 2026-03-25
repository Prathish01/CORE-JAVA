package collections;

import java.util.LinkedList;

import company.intern;

public class linkedlist 
{
public static void main(String [] args)
{
LinkedList<Integer> num = new LinkedList<>();
num.add(1);
num.add(2);
num.add(3);
num.add(4);
num.remove(Integer.valueOf(1));
num.remove(2);
System.out.println(num);
}
}
