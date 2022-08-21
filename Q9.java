import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        int num1,num2,sum,dif,product,distance,max,min;
        double average;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1= input.nextInt();
        System.out.println("Enter second number: ");
        num2= input.nextInt();
        sum=num1+num2;
        dif=num1-num2;
        product=num1*num2;
        average=sum/2;
        distance=dif;
        System.out.println("sum= "+sum);
        System.out.println("difference= "+dif);
        System.out.println("product= "+product);
        System.out.println("average= "+average);
        if (distance>0) System.out.println("distance= "+dif);
        else if (distance<0) System.out.println("distance= "+(-1*dif));

        max=Math.max(num1,num2);
        min=Math.min(num1,num2);
        System.out.println("Max= "+max);
        System.out.println("min= "+min);



    }
}
