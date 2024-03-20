

import java.util.Scanner;

public class ExceptionHandling03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the amount");
        int balance =s.nextInt();
      try{
          if (balance<3000)
        {
            System.out.println("money is less then 3000 you cannot withdraw ");
            throw new MyException("this is not a joke ");// this make no sense b/c it is written in try block
            // anonymous obj is made of MyException
        // 'throw' call the MyException catch block
        }
            else
        {
            System.out.println("your can take money from the Account");
        }

        }
   catch (MyException f) {
        System.out.println(f.toString());
            System.out.println(f.tessage());

        }
        System.out.println("finish");
    }
}
class MyException extends Exception
{
    public MyException(String s ) {
        System.out.println(s);
    }

    public String toString()
    {
        return "this is Demo for own exception";
    }
    public String tessage()
    {
        return "get message";
    }
}
