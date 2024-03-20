
// An example for interface in polymorphism

public class InterfaceP2 { 
    public static void main(String[] args) {
        CellPhone1 c;
        c=new SmartPhone1(); //dynamic method dispatch
        /* you have a smartphone but you can only use those feature of
         it which you know in a common nokia cell phone */
        c.calling(986532147);
        c.sendSMS(789632100);
        Gps g=new SmartPhone1();
        g.location();
        g.map();
       Camera nikon=new SmartPhone1();
       nikon.snap();
       nikon.video4K();
       SmartPhone1 Vivo142 =new SmartPhone1();
       Vivo142.location();
       Vivo142.video4K();
       Vivo142.snap();
       Vivo142.map();
       Vivo142.wifi1();
       Vivo142.sendSMS(98563247);
        }
}
class CellPhone1
{
    void calling (long number)
    {
        System.out.println("calling to : "+number);
    }
    void sendSMS(long number)
    {
        System.out.println("sending sms to : "+number);
    }
}
interface Camera
{
    void recording();
    void snap();
    void video4K();
}
interface Gps
{
    void location();
    void map ();
}
interface Wifi
{
    void wifi1();
}
class SmartPhone1 extends CellPhone1 implements Wifi,Gps,Camera
{
     public void recording()
    {
        System.out.println("recording");
    }
    public void snap()
    {
        System.out.println("snap");
    }
    public void video4K()
    {
        System.out.println("recording in 4k");
    }
    public void wifi1()
    {
        System.out.println("using wifi");
    }
    public void location()
    {
        System.out.println("using gps for location");
    }
    public void map ()
    {
        System.out.println("using gmap to find location");
    }

}
