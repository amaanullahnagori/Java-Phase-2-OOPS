
public class InheritanceConstructorP1 {
    public static void main(String[] args) {
Child Chintu  =new Child();
System.out.println();

GrandChild Rohan =new GrandChild();
    }
}
class Parent
{
    public Parent ()
    {
        System.out.println("Parent here ");
    }
}
class Child extends Parent
{
    public Child()
    {
        System.out.println("Child here ");
    }
}
class GrandChild extends Child
{
    public GrandChild ()
    {
        System.out.println("Grand Child here ");
    }
}