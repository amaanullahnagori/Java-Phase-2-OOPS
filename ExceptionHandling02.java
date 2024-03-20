// nested try catch
public class ExceptionHandling02 {
    public static void main(String[] args) {
        try
        {
int ar[]={8,9};  // nested try catch is used when you definitely want the condition or anything to be correcte
            System.out.println(ar[0]);// so that rest of the thing can be executed
            try {
                int a = 78;
                int b = 5;
                int c = a / b;
                System.out.println(c);
            } catch (ArithmeticException e) {
                System.out.println("exception");
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("index is not correct");
        }
        System.out.println("thanks :)");
    }
}
