
package patternproblems;

public class pattern9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j) {
                    System.out.print("*");  // print star only at diagonal
                } else {
                    System.out.print(" ");  // spaces elsewhere
                }
            }
            System.out.println(); // new line after each row
        }
        
        for(int e=1;e<=5;e++)
        {
        	for(int r=5;r>=e;r--)
        	{
        		if(e==r)
        		{
        			System.out.print("*");
        		}
        		else
        		{
        			System.out.print(" ");
        		}
        		
        	}
        	System.out.println();
        }
    }
}

output
*
 *
  *
   *
    *
    *
   *
  *
 *
*
