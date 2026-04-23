package java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stram 
{
public static void main(String [] args)
{
List <Integer> li = Arrays.asList(8,4,5,6,7,3,4);
Integer hi = li.stream().reduce(0,(c,e) -> c+e);
System.out.println(hi);
