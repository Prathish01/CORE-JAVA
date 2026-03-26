package hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class stringtolisttoarray 
{
public static void main(String [] args)
{
System.out.println("creating a String");
String s1 = "java is a programming language";
String[] word = s1.split(" ");
Set<String> set = new HashSet<String>();
for(String w :word)	
{
	set.add(w);
}
//System.out.println(set);
System.out.println("converting set into array");

String[] str = set.toArray(new String[0]);
System.out.println(Arrays.toString(str));
}
}
