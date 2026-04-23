package java8;

public interface thetre 
{
 void show();
}


package java8;

public class adf implements thetre {

    public static void main(String[] args) {

        thetre th = () -> {
            System.out.println("Mankatha is playing in Rohini");
        };

        th.show(); // calling the lambda
    }
}
