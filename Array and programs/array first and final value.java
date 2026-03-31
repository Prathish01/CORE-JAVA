import java.util.Scanner;
class we12
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = scn.nextInt();

        int[] ar1 = new int[size];
		//int max = ar1[1];

        System.out.println("enter values");
       for(int i = 0; i < ar1.length; i++)
         {
			ar1[i] = scn.nextInt();	
			}
       
            System.out.println("-------------------");
			//int index = scn.nextInt();
		System.out.println(ar1[0]);

	}
}
