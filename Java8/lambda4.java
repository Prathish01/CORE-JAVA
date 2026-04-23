package java8;

public interface thetre 
{
void view (int i);
}


package java8;

public class adf implements thetre {

    public static void main(String[] args) {

    	thetre th =(int i) ->
    	{
    		System.out.println("you selected" + i);
			
    		
    	};
    	

    	   
       
       
      th.view(10);
      
    }
}
