class RestangleTest
{
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.length=45;
        r.breath=89;
        System.out.println("the area of rectangle is :"+r.area());
        System.out.println("the perimeter of rectangle is :"+r.perimeter());
    }
}
class Rectangle
{
    int length;
    int breath;
    double area()
    {
        return length*breath;
    }
    double perimeter()
    {
        return (2*length+2*breath);
    }
}