public class Main2 {
    // Instance variables
    int a = 24;
    int b = 23;
    int c = 43;

    // Method 1: Sum of three numbers
    public int sum() {
        return a + b + c;
    }

    // Method 2: Difference of two numbers
    public int difference() {
        return a - b;
    }

    // Method 3: Product of three numbers
    public int product() {
        return a * b * c;
    }

    // Method 4: Maximum of three numbers
    public int max() {
        return Math.max(a, Math.max(b, c));
    }

    // Method 5: Minimum of three numbers
    public int min() {
        return Math.min(a, Math.min(b, c));
    }

    // Method 6: Average of three numbers
    public double average() {
        return (a + b + c) / 3.0;
    }

    // Method 7: Check if a number is even
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method 8: Calculate the square of a number
    public int square(int num) {
        return num * num;
    }

    // Method 9: Print a custom message
    public void printMessage(String message) {
        System.out.println(message);
    }

    // Method 10: Concatenate two strings
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        // Create an object of Main1 class
        Main2 obj = new Main2();

        // Call the methods and print their results
        System.out.println("Sum: " + obj.sum());
        System.out.println("Difference: " + obj.difference());
        System.out.println("Product: " + obj.product());
        System.out.println("Max: " + obj.max());
        System.out.println("Min: " + obj.min());
        System.out.println("Average: " + obj.average());
        System.out.println("Is a even? " + obj.isEven(obj.a));
        System.out.println("Square of b: " + obj.square(obj.b));

        obj.printMessage("This is a custom message from Method 9!");
        System.out.println("Concatenation: " + obj.concatenate("Hello", " World"));
    }
}
