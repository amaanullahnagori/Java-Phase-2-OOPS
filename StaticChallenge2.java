import java.util.*;
public class StaticChallenge2
{
    public static void main(String[] args) {
       Account Shyam =new Account ();
        System.out.println(Shyam.accNo);
        Account Divya =new Account ();
        System.out.println(Divya.accNo);
        Account Irfan  =new Account ();
        System.out.println(Irfan.accNo);
         Account Imra  =new Account ();
        System.out.println(Imra.accNo);
             Account Rahul  =new Account ();
        System.out.println(Rahul.accNo);
        
    }
}
class Account 
{
   private static long count=2096102801;
           
  String accNo;
  public Account()
  {
      accNo=getAccountNo();
  }
   public String getAccountNo()
  {
      Date d=new Date ();
      return "The account is open on-- "+(d)+"\n"
              +"Account number is--"+count++ ;}}