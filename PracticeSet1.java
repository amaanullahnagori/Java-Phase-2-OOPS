

 class PractiseCwh1 {
    public static void main(String[] args) {
FountainPen Fp =new FountainPen();
Fp.Mrp();
Fp.changeNib();
Fp.refile();
Fp.write();
    }
}
abstract class Pen
{
    abstract public void refile ();
    abstract public void write ();
    public void Mrp()  // this method is not declared as abstract because this is fixed by an companhy
    {
        System.out.println("Mrp should be less than Rs. 500");
    }

}
class FountainPen extends Pen{

    @Override
    public void refile() {
        System.out.println("an ink bottle is available to refile ink reusable product");
        System.out.println("you can use different colour of ink ");

    }

    @Override
    public void write() {
        System.out.println("comfort of smooth writing ");
    }
    public void changeNib()
    {
        System.out.println("you can change the nib ");

    }
}
