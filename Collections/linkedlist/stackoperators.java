package collections;

import java.util.LinkedList;

import com.sun.jdi.Value;

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
num.add(5);

num.push(12);
int peek = num.peek();
System.out.println("while peek :" +peek);
System.out.println("after peek" +num);
int pop = num.pop();
System.out.println("while pop :" +pop);
System.out.println("after peek" +num);
}
}


linkedlist implements deque it supports stack 
  so the stack methods are also used in linkedlist
