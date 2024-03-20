//package com.company;

 class constructor06 {
    public static void main(String[] args) {
Subject sc=new Subject ("Maths","MT-561",(short)95,(short)100);
        System.out.println("Subject name : "+sc.getSub_name());
        System.out.println("Subject id : "+sc.getSub_id());
        System.out.println("Marks obtain : "+sc.getMarksObtain());
        System.out.println("Total marks from which marks are obtain : "+sc.getMaxMarks());

        Subject s=new Subject ((short)97,(short)100);
        System.out.println("Marks obtain : "+sc.getMarksObtain());
        System.out.println("Total marks from which marks are obtain : "+sc.getMaxMarks());

        Subject c=new Subject ("Maths",(short)99,(short)100);
        System.out.println("Subject name : "+sc.getSub_name());
        System.out.println("Marks obtain : "+sc.getMarksObtain());
        System.out.println("Total marks from which marks are obtain : "+sc.getMaxMarks());

    }
}
class Subject
{
   private String Sub_id;
    private short maxMarks;
    private short marksObtain;
    private String Sub_name;
    public void setMarksObtain(short marksObtain )
    {this.marksObtain=marksObtain;}

    public short getMaxMarks() {
        return maxMarks;
    }
    public String getSub_id()
    {
        return Sub_id;

    }
    public short getMarksObtain()
    {
        return marksObtain;
    }
    public String getSub_name()
    {return Sub_name;}
    public Subject  (String name ,String sub_id,short marksObtain,short  maxMarks)
    {
        Sub_name=name;
        this.Sub_id=sub_id;
        this.marksObtain=marksObtain;
        this.maxMarks=maxMarks;
    }
    public Subject  (short marksObtain,short  maxMarks)
    {

        this.marksObtain=marksObtain;
        this.maxMarks=maxMarks;
    }
    public Subject (String name ,short marksObtain,short  maxMarks)
    {

        this.Sub_name=name;
        this.marksObtain=marksObtain;
        this.maxMarks=maxMarks;
    }
}