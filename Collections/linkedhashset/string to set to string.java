package linkedhashset;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class stringtosettoset 
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


System.out.println("converting set into string");
String s3 = String.join(" ", set);
System.out.println(s3);
}
}
