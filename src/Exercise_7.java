import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise_7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input a radius :");

        //Float R= 7.5F;
        double R = in.nextDouble();
        Float P= (float)(2* 3.14*R);
        Float A = (float) (3.14*R*R);
        System.out.println("PERIMETER:" + " = " + P);
        System.out.println("AREA:" + "=" + A);


    }
}
