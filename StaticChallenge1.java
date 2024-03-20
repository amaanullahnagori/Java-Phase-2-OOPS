import java .util.*; // class date is present in it 
class Main1
{
    public static void main(String[] args) {
      
        RollNumber Aditya =new RollNumber ();
        System.out.println("the roll is  "+Aditya.getRollNumber());
        RollNumber Ali  =new RollNumber ();
        System.out.println("the roll is  "+Ali.getRollNumber());
        RollNumber Amaan  =new RollNumber ();
        System.out.println("the roll is  "+Amaan.getRollNumber());
        // 1---->2
        //  System.out.println(Aditya.getCount());
       //System.out.println(Ali.getCount());//2--->3 
      // Date d=new Date();
       // System.out.println(d);
}    
}
class RollNumber
{
    String  rollNumber;
    private  static  int count =1;
    public RollNumber()
            {
             rollNumber =rollNumber();
            }
   public String rollNumber()
   {
       Date d=new Date ();
       String s="LNCT"+-+(d.getYear()+1900)+"-"+count ;       //1
       count ++;            //2   
       return s;
   }
   public String getRollNumber()
   {
       return rollNumber;
   }
 /*  public int getCount ()
   {    
       return count;
}*/
}
