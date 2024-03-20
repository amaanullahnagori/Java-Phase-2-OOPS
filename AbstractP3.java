package com.company;

public class AbstractP3 {
    public static void main(String[] args) {
        AKFC aanKFC=new AKFC();
        aanKFC.building();
        aanKFC.offer();
        aanKFC.sittingArea();
        aanKFC.recipe();
        aanKFC.offer();
        KFC r;  // reference is created but not object
        r=new AKFC();
        r.recipe();
        r.offer();
     // Domi d=new KFC(); not possible
    }
}
class Domi
{

}
 abstract class KFC
 {
     void recipe ()
     {
         System.out.println("the recipe of food is given by KFC to the franchies");
     }
     abstract public void building();
     abstract public void offer();
 }
 class AKFC extends  KFC
 {
     @Override
      public void building()
     {
         System.out.println(" land area is decided by franchies");
     }
     @Override
      public void offer()
     {
         System.out.println("offer decided by franchies only ");
     }
     public void sittingArea()
     {
         System.out.println("sitting area given by franchies is dependable");
     }
     public void Parking ()
     {
         System.out.println("parking area depend ");
     } 
 }
