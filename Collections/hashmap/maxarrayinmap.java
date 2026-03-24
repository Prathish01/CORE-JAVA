package linkedhashmap2;

import java.util.LinkedHashMap;
import java.util.Map;

public class arrayfind {

public static void main(String [] args)
{
int[] ar1 = {10,20,30,40,10,20,30,50,10};

Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

for(int numb : ar1)
{
map.put(numb, map.getOrDefault(numb, 0)+1);


}
int max = 0;
int maxarr = ' ';
for(Map.Entry<Integer, Integer> entry : map.entrySet() )
{
if(entry.getValue() > max)
{
max = entry.getValue();
maxarr = entry.getKey();
}
}
  
System.out.println(max);
System.out.println(maxarr);

}
}
