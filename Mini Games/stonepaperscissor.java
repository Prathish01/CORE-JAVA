package games;
import java.util.Scanner;
import java.util.Random;
public class stonepaperscissor 
{
public static void main(String [] args)
{
Scanner scn = new Scanner(System.in);
Random rand = new Random();
String[] choice = {"stone","paper","scissor"};
System.out.println("enter choice");

String my = scn.next() .toLowerCase();
String comp = choice[rand.nextInt(3)];
boolean play = false;

if(my.equals(comp))
{
	System.out.println("tie"+my);
}
else if(my.equals("scissor")&& comp.equals("paper")||
		(my.equals("paper")&& comp.equals("stone"))||
		(my.equals("stone")&& comp.equals("scissor"))) 
		{
			System.out.println("you won");
		}
else
{
System.out.println("you lost to comp");	
}
}


}
