//package com.company;

public class AbstractP2 {
    public static void main(String[] args) {
        AHospital MyHospital =new AHospital();
        System.out.println("doctors :- "+MyHospital.min_doctor);
        System.out.println("nurses :-"+MyHospital.min_nurses);
        MyHospital.facilities24_7();
        MyHospital.cleanliness();
        MyHospital.emergency();
        MyHospital.oxygenPlant();
        MyHospital.functioning_ICU();
        MyHospital.emergency();
    }
}
abstract class Hospital  //you have to follow these guidelines by gov. to open your hospital
{
    int min_rooms =20;
    int min_doctor=10;
    int min_nurses=15;
    abstract public void emergency();
    abstract public void admit();
    abstract public void functioning_ICU ();
    abstract public void oxygenPlant();
    abstract public void cleanliness();
    abstract public void facilities24_7();
}
class AHospital extends Hospital
{
    public void emergency()
    {
        System.out.println("emergency ward");
    }
     public void admit()
     {
         System.out.println("pateint admitted");
     }

     public void functioning_ICU ()
     {
         System.out.println("ICU in proper working");
     }

    public void oxygenPlant() {
        System.out.println("Properly set up OXygen plant ");
    }

    public void cleanliness()
    {
        System.out.println("cleanliness at its peak ");}

    public void facilities24_7()
    {
        System.out.println("24*7 facilities are available");
}


}