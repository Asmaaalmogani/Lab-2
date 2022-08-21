
public class Q10 {
    public static void main(String[] args) {
        int num1=20,num2=25,sum,dif,product,distance,max,min;
        double average;
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
