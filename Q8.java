import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        int num;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number : ");

        num= input.nextInt();
        System.out.println("The square : "+(num*num));
        System.out.println("The cube: "+(num*num*num));
        System.out.println("The power 4: "+Math.pow(num,4));

    }
}
