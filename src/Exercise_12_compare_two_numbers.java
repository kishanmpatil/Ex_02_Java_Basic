
import java.util.Scanner;// import the scanner class
public class Exercise_12_compare_two_numbers {

    public static void main(String[] args) {

        //step :2 create scanner object to read input from user
        Scanner scanner = new Scanner(System.in);
        // step:3 ask user to input first number
        System.out.println("input first number: ");
        int number1 = scanner.nextInt();
        //step:4 ask user to input second number
        System.out.println("input second number: ");
        int number2 = scanner.nextInt();
        // step:5 compare the numbers and display the result
        if (number1 > number2) {
            System.out.println("first number is grater");
        } else if (number1 < number2) {
            System.out.println("second number is  greater");
        } else{
            System.out.println("both numbers are same ");


        }


    }


}
