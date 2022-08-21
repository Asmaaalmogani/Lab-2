import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        String s="ABCDE";
        System.out.println(s);
        System.out.println("Print the first char:");
        System.out.println(s.charAt(0));

        System.out.println("Print the finuly char:");
        System.out.println(s.charAt(4));

        System.out.println("Delete the first char:");
        System.out.println(s.substring(1));

        System.out.println("Delete the finuly char:");
        System.out.println(s.replaceAll("e",""));

    }
}
