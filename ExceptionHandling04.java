

public class ExceptionHandling04 {
    public static void main(String[] args) {
        try
        {
            throw new Exception("hello");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println(e.getStackTrace());
        }
    }
}
