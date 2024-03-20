class StudentTest
{
    public static void main(String[] args) {
        Student s=new Student();
        s.age=18;
        s.roll_number=6;
        s.name="Amaan";
        s.m1=98.23;
        s.m2=90;
        s.m3=95.32;
        s.course="Information Technology";
        System.out.println(s.name());
        System.out.println(s.roll_number);
        System.out.println(s.age());
        System.out.println(s.stream());
        System.out.println(s.total());
        System.out.printf("%.2f",s.avg());
        System.out.println("");
    
}
}
class Student 
{
    int age;
    int roll_number;
    double m1,m2,m3,avg,total ;
    String name ,course;
    double avg()
    {
        return (m1+m2+m3)/3;
    }
    double total ()
    {
        return m1+m2+m3;
    }
    String name ()
    {
        return name ;
    }
    int age()
    {
        return age;
    }
    String stream ()
    {
        return course;
    }
}