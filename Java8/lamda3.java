package java8;

public interface thetre 
{
 int add(int i,int j);
}



package java8;

public class adf implements thetre {

    public static void main(String[] args) {

    	thetre th = (i, j) -> i * j;

    	   
       
       
       int result =th.add(10, 7);
       System.out.println(result);
    }
}
