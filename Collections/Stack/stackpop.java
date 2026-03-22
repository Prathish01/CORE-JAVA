package stackreal;

import java.util.Stack;

public class popstack 
{
public static void main(String [] args)
{
System.out.println("creation of stack");
Stack st= new Stack();
st.push("hello");
st.push("world");
st.push(10);
st.push(7);
st.set(3,"prathish");
System.out.println(st.pop());
System.out.println(st);
}
}


it removes the element which we stored at last
