public class MethodOverloadingExample {

   
    public void display(int num) {
        System.out.println("Display method with integer: " + num);
    }

    public void display(String text) {
        System.out.println("Display method with string: " + text);
    }

    public void display(int num, String text) {
        System.out.println("Display method with integer and string: " + num + ", " + text);
    }

    public void display(String text, int num) {
        System.out.println("Display method with string and integer: " + text + ", " + num);
    }

    public static void main(String[] args) {
        MethodOverloadingExample example = new MethodOverloadingExample();
        example.display(10);                    
        example.display("Hello");               
        example.display(20, "World");           
        example.display("Java", 30);            
    }
}
