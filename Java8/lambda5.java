package java8;

public interface thetre 
{
int view (int i,int j);
}

package java8;

public class adf implements thetre {

    public static void main(String[] args) {

    	thetre th =(i,j) ->
    	{
    		return i-j;
			
    		
    	};
    	

    	   
       
       
      int reut = th.view(10,5);
      System.out.println(reut);
      
    }
}
