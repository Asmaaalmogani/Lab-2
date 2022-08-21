import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        double a,b,c,average;
        Scanner input =new Scanner (System.in);
        System .out.println("Enter the first number : ");
        a=input.nextDouble();
        System .out.println("Enter the second number : ");
        b=input.nextDouble();
        System .out.println("Enter the third number : ");
        c=input.nextDouble();
        average=(a+b+c)/3;
        System .out.println("The average of numbers : "+average);



    }
}
