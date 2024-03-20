//package com.company;


class Main3
{
    public static void main(String[] args) {
        Customer12 Amaan =new Customer12 ("Amaan");
        Customer12 Kothari  =new Customer12 ("Kothari");
        Customer12 Aditya  =new Customer12 ("Aditya");
        Customer12 Divya  =new Customer12 ("Divya");
        System.out.println(Amaan.getCustomer ());
        System.out.println();
        System.out.println(Kothari.getCustomer ());
        System.out.println();
        System.out.println(Aditya.getCustomer ());
        System.out.println();
        System.out.println(Divya.getCustomer ());


    }
}
class Customer12
{
public  static int count ;
    String cn;
    static
    {
        count =11201001; 
    }
    String custId;
    public  Customer12 (String cn)
    {
        this.cn=cn;
        custId=getCustomerId();
    }
    public String getCustomerId()
    {
        return "custumerName " +cn+"\n"+"Customer Id " +count++ ;
    }
    public String getCustomer ()
    {
        return custId;
    }

}
