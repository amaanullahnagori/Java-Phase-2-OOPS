
import java.lang.*;
import java.util.Scanner;

public class ExceptionHandling05 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the radius");
        int radius = sc.nextInt();
        try {
            if(radius <0)
            {
                throw new ArithmeticException("radius should not be negative");
            }
            else
          {
                double area =area(radius);
            System.out.println("the area is "+area);
          }
        }
        catch (ArithmeticException e )
        {
       System.out.println(e.getMessage());
       System.out.println(e);
        }
    }
    public static double area(int radius) throws ArithmeticException {
        double area = Math.PI * radius*radius ;
        return area;
    }
}

