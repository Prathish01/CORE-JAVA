package linkedhashset;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class stringtosettoarray 
{
public static void main(String [] args)
{
System.out.println("creation of String");

String str = "java is a programming language";

System.out.println("convering string into linkedhashset");

String[] word = str.split(" ");

Set<String> set = new LinkedHashSet<String>();

for(String s1 : word)
{
set.add(s1);	
}
System.out.println(set);


System.out.println("converting set into array");
String[] s2 = set.toArray(new String[0]);
System.out.println(Arrays.toString(s2));

}
}
