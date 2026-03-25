package hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class arraytoset 
{
public static void main(String [] args)
{
System.out.println("creating array");
int[] arr = {10,20,30,40,50,60,30,50,10,20};
System.out.println("creating a set");
Set st = new HashSet();
for(int a : arr)
{
st.add(a);	
}

Iterator itr = st.iterator();
while(itr.hasNext())
{
System.out.println(itr.next() + " ");	
}

System.out.println(st);
}
}
