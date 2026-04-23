package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stram 
{
public static void main(String [] args)
{
List <Integer> li = Arrays.asList(1,2,3,4,5,6); 

Stream<Integer> str = li.stream();


str.forEach(n ->  System.out.println(n)); 
}
}


we use stream in java to control the flow of data one by one
