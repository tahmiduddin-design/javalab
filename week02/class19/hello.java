import java.util.Scanner;

public class hello {
    
    static int add(int x, int y) {
        return x + y;
    }

    static int subtract(int x, int y) {
        return x - y;
    }

    static int multiply(int x, int y) {
        return x * y;
    }

    static int divide(int x, int y) {
        return x / y;
    }
        
    public static void main(String[] args) {
        System.out.println("Please enter the value of x and y:");
        
        
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int sum = add(x, y);
            System.out.println("Addition Output: " + sum);

            int diff = subtract(x, y);
            System.out.println("Subtraction Output: " + diff);

            int prod = multiply(x, y);
            System.out.println("Multiplication Output: " + prod);

            if (y != 0) {
                int quot = divide(x, y);
                System.out.println("Division Output: " + quot);
            } else {
                System.out.println("Cannot divide by zero.");
            }
        }
    }
}