

public class MethodOverriding3 {
    public static void main (String args[])
    {
        Car Maruti800=new Car();
        Maruti800.gear();
        Maruti800.paddle();
        Maruti800.start();
        System.out.println();
        System.out.println();

        LuxuryCar Breeza=new LuxuryCar();
        Breeza.gear();
        Breeza.paddle();
        Breeza.start();
        Breeza.roof();
        System.out.println();
         Car c2=new LuxuryCar();
         c2.gear();
         c2.paddle();
        // c2.roof();// this cannot be called because this is not available in Super class
        //by DMD we are assuming that we can only use that feature of luxury class 
        //that we know in our older class 



    }
}
class Car
{
    void start()
    {
        System.out.println("CAR start");
    }
    void gear ()
    {
        System.out.println("mannual shift gear system");
    }
    void paddle()
    {
        System.out.println("the car have three paddles");
    }
}
class LuxuryCar extends Car
{
    @Override
    void gear()
    {
        System.out.println("the gear in this car is automatic");
    }
    void roof()
    {
        System.out.println("the car is having sun roof");
    }
}
