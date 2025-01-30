import java.util.Scanner;
public class eXERCISE_15_reverse_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a string");
        char[] letters = scanner.nextLine().toCharArray();
        System.out.println("Reverse string: ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.println(letters[i]);
        }

        System.out.println("\n");

    }
}
