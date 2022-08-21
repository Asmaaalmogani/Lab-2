import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        double area, perimeter , radius;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        radius = input.nextDouble();


        area =radius*radius*3.14;
        perimeter =2*radius*3.14;

        System.out.println("The area= "+area);
        System.out.println("The perimeter= "+perimeter);

    }


}
