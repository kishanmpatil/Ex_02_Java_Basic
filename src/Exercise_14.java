
    import java.util.Scanner;

    public class Exercise_14 {

        public static void main(String[] args) {
            // Step 1: Create a Scanner object to read input
            Scanner scanner = new Scanner(System.in);

            // Step 2: Ask the user to enter a positive integer
            System.out.print("Enter a positive integer: ");
            int n = scanner.nextInt(); // Read the user's input

            // Step 3: Initialize a variable to store the sum
            int sum = 0;

            // Step 4: Use a loop to calculate the sum of integers from 1 to n
            for (int i = 1; i <= n; i++) {
                sum += i; // Add the current number to the sum
            }

            // Step 5: Display the result
            System.out.println("The sum of integers from 1 to " + n + " is: " + sum);
        }
    }


