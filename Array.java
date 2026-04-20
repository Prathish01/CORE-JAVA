import java.util.Scanner;
class exampletest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the value to find: ");
        int target = scanner.nextInt();
        boolean found = false;
        System.out.println("Value found at position(s): ");
        for (int i = 0; i < n; i++) {
            if (array[i] == target) {
                System.out.println((i + 1) + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Value not found in the array.");
        }
    }
}
