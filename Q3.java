import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        double area, perimeter , lenth , width;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lenth : ");
        lenth = input.nextDouble();

        System.out.println("Enter the width :");
        width = input.nextDouble();

        area =lenth*width;
        perimeter =2*(lenth+width);

        System.out.println("The area of rectangle= "+area);
        System.out.println("The perimeter of rectangle= "+perimeter);

    }


}
