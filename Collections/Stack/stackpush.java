package stackreal;

import java.util.Stack;

public class pushstack 
{
public static void main(String [] args)
{
System.out.println("creation of stack");
Stack st= new Stack();
st.push("hello");
st.push("world");
st.push(10);
st.push(7);
System.out.println(st);
}
}
