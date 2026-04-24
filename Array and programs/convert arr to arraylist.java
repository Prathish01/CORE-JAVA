package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arraytoarraylist 
{
public static void main(String [] args)
{
Integer[] arr = {10,40,30,20,45,50};	
List<Integer> list = new ArrayList<>(Arrays.asList(arr));

Collections.sort(list);

System.out.println(list);
}
}

if we are using ASLIST WE CAN ONLY CONVERT object class INteger array only 
  if we use intclass the aslist doent work
