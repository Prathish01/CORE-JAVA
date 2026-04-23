package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stram 
{
public static void main(String [] args)
{
List <Integer> li = Arrays.asList(8,4,5,6,7,3,4); 
Stream<Integer> data = li.stream();


Stream<Integer> data2 = data.sorted();
package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stram 
{
public static void main(String [] args)
{
List <Integer> li = Arrays.asList(8,4,5,6,7,3,4); 

Stream<Integer> data = li.stream();


Stream<Integer> data2 = data.sorted();
data2.forEach(n -> System.out.println(n * 2));


//Stream<Inte ger> str = li.stream();
//
//
//
//long count = str.count();
//System.out.println(count);

//str.forEach(n ->  System.out.println(n));
}
}



//Stream<Integer> str = li.stream();
//
//
//
//long count = str.count();
//System.out.println(count);
//str.forEach(n ->  System.out.println(n));
}
}
