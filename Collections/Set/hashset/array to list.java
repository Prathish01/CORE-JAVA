package hashset;

import java.util.HashSet;
import java.util.Set;

public class arraytoset 
{
public static void main(String [] args)
{
System.out.println("creating array");
int[] arr = {10,20,30,40,50,60,30,50,10,20};
System.out.println("creating a set");
Set st = new HashSet();
for(Integer a : arr)
{
st.add(a);	
}
System.out.println(st);
}
}


here we are converting an array to list to remove the duplicate
