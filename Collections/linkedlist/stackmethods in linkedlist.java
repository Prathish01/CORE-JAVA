package linkedlist;

import java.util.LinkedList;

public class stackinlinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();

     
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        
        System.out.println("Top element: " + stack.peek());

        
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Stack after pop: " + stack);
    }
}
