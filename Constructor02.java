class Constructor2
{
    public static void main(String[] args) 
    {
        Rectangle rec=new Rectangle();
        Rectangle re=new Rectangle(15,21);
        System.out.println("Thanks ::)");
    }
} 
class Rectangle 
{
    int length=10;
    int breath=13;
  public Rectangle(int c,int d)
  {
      double r=c*d;
      System.out.println(r);
  }
  public Rectangle()
  {
      double f= length*breath;
      System.out.println(f);
  }
}