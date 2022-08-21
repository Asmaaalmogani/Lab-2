import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input =new Scanner (System.in);
        System .out.println("Entthe first number : ");
        a=input.nextInt();
        System .out.println("Enter the second number : ");
        b=input.nextInt();
        c=a;
        a=b;
        b=c;

        System.out.println("The swap: ");
        System.out.println("The first number = "+a);
        System.out.println("The second number = "+b);



    }
}
