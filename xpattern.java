package patternproblems;

public class xpattern 
{
public static void main(String [] args)
{
int n=5;
for(int i =1;i<=n;i++)
{
for(int j=1;j<=n*2;j++)
{
	if(j == i || j==n*2-1-i+1)
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
for(int q=2;q<=n;q++)
{
for(int w=1;w<=n*2;w++)
{
if(w == n-q+1 || w == n+q-1)
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
*       * 
 *     *  
  *   *   
   * *    
    *     
   * *    
  *   *   
 *     *  
*       * 
