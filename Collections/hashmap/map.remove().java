package hashmap;

import java.util.HashMap;
import java.util.Map;

public class creation 
{
public static void main(String [] args)
{
System.out.println("creation of hasmap");	
Map map = new HashMap<>();
map.put(1, 10);
map.put('a', 'v');
map.put("hi", "hello");
map.put(null, 3);
map.remove(null);
map.remove('a');
System.out.println(map);



}

}
