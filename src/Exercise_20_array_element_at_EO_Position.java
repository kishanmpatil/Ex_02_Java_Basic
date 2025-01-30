public class Exercise_20_array_element_at_EO_Position {
    public static void main(String[] args) {
        int [] a = {10,20,30,50,15,25,45};
        System.out.println("even position element are ");
        for ( int i = 1; i <a.length; i+=2)
        {
            System.out.println(a[i] +" ");
        }

        System.out.println("Odd position element are ");
        for ( int i = 0; i < a.length; i+=2)
        {
            System.out.println(a[i]+ " ");
        }

    }
}
