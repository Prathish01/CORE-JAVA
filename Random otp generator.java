package abs;

import java.util.Random;

public class randomotp 
{
public static void main(String [] args)
{
Random rand = new Random();
String otp = " ";
for(int i = 1;i<=5;i++)
{
int generate = rand.nextInt(10);
otp += generate;
}
System.out.println(otp);
}
}
