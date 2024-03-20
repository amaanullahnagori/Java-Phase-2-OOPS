

import java.util.Scanner;

 class ExceptionHandling01 {
    public static void main(String[] args) {
        Scanner Amaan =new Scanner (System.in);
        System.out.println("enter two number ");
        int a =Amaan.nextInt();
        int b=Amaan.nextInt();
        System.out.println("enter the elements of array");
        int[] ary =new int[5];
        int  n=0;
        while (n< ary.length)
        {
            ary[n]=Amaan.nextInt();
            n++;
        }

        try {
            int c = a / b;  // exception can occur

            System.out.println("the division is " + c);
            System.out.println(ary[7]); // exception can occur
        }
        catch (ArithmeticException e)  // for every try block catch block is required
        {
            System.out.println("you are dividing the number by 0");
        }
        catch (ArrayIndexOutOfBoundsException e )
        {
            System.out.println("pls provide a valid index number ");
        }

        System.out.println("thanks");
    }
}
