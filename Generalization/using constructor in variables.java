package animal;

 public class animal 
{
String sound;
int legs;
public animal(String sound,int legs)
{
this.sound = sound;
this.legs= legs;
}
}

package animal;

public class dog extends animal
{
public dog(String sound,int legs)
{
super(sound,legs);
}
}


package animal;

public class fish extends animal
{
public fish(String sound,int legs)
{
	super(sound,legs);
}
}

package animal;

public class help 
{
public void getanimal(animal a)
{
if(a instanceof dog)
{
	dog d = (dog) a;
	System.out.println(d.sound + "has" + d.legs + "kals");
}
else
{
	fish c = (fish) a;
System.out.println(c.sound + "has" + c.legs + "kals");	
}

}
}
package animal;

public class mainmethod 
{
public static void main(String [] args)
{
help h = new help();
h.getanimal(new dog("bow bow",4));
}
}
