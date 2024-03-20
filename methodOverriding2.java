
 class MethodOverriding2 {


    public static void main(String[] args)
    {
        Tv Sansui=new Tv(3,1,35);
        Sansui.Watching();
        Sansui.volumeDown();
        Sansui.volumeUp();
        System.out.println();
        System.out.println();
        System.out.println(Sansui);
        System.out.println();
        System.out.println();

// SMART TV KE LIYE
        SmartTV MI=new SmartTV(10,1,48,1);
        System.out.println(MI);
        System.out.println();
        System.out.println();
        MI.Watching();
        MI.volumeUp();
        MI.volumeDown();
        MI.browsing();
        MI.playing();
        MI.OTT();

        System.out.println();
        System.out.println();

     // Dynamic Method Dispatch
        Tv LG=new SmartTV(11,1,50,1);// here the smart tv will also act as a tv
        System.out.println(LG);
        System.out.println();
        System.out.println();
        SmartTV T=new SmartTV(10);
    }

}
class Tv {
    int button;
    int remote;
    int dimentions;
    public Tv()
    {
        System.out.println("non param of tv");
    }
public Tv(int button ,int remote,int dimension )
{
  this. button=button;
  this.dimentions=dimension;
  this.remote=remote;
}
  @Override
 public String toString()
{
    return "no.of button\n"+button+"\ndimention of tv in inches\n"+dimentions
            +"\nno. of remote of tv\n"+remote;
}
    void Watching()
    {
        System.out.println("Watching tv ");
    }

    void volumeUp()
    {
        System.out.println("increasing the volume of tv ");
    }

    void volumeDown()
    {
        System.out.println("decreasing the volume of tv ");
    }
}
class SmartTV extends Tv
{
    int touchPad;
    public SmartTV()
    {
        System.out.println("non param of smart tv ");
    }
    public SmartTV(int button ,int remote,int dimension,int touchpad)
    {
        super(button ,remote,dimension);
        this.touchPad=touchpad;
    }
    public SmartTV(int a)
    {
        System.out.println("your tv cost is 50000");
    }
    @Override
    public String toString()
    {
        return "no.of button\n"+button+"\ndimention of tv in inches\n"+dimentions+
                "\nno. of remote of tv\n"+remote;
    }

    void browsing ()
    {
        System.out.println("browsing on internet");
    }
    void OTT()
    {
        System.out.println("watching netflix");
    }
    void playing ()
    {
        System.out.println("playing play Station");
    }

    @Override
        void Watching ()
    {
        System.out.println("Watching Smart tv ");
    }
    @Override
        void volumeUp ()
    {
        System.out.println("increasing the volume of Smart tv ");
    }
    @Override
        void volumeDown ()
        {
            System.out.println("decreasing the volume of Smart tv ");
        }

}

