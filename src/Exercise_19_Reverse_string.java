public class Exercise_19_Reverse_string {
    public static void main(String[] args) {
        String s = "i love india";
        String reversed = " ";
        for (int i = s.length() - 1; i >= 0; i--){
        reversed = reversed + s.charAt(i);
        }

        System.out.println(reversed);
    }





    }

