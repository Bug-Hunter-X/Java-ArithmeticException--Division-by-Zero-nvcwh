public class MyClass {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        int z = 0;
        try {
            z = x / y; 
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
            // Handle the exception appropriately, e.g., log the error, use a default value.
            z = Integer.MAX_VALUE; //or any other default value
        }
        System.out.println(z);
    }
}