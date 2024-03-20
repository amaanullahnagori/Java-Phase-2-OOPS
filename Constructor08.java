//package com.company;
class Test
{
    public static void main(String[] args) {
//        Subject0 s=new Subject0 ("maths ","M-897",(short)96,(short)100);
//        System.out.println(s);
        Subject0 sub[] = new Subject0[3];
        sub[0] = new Subject0("maths ", "M-897", (short) 96, (short) 100);
        sub[1] = new Subject0("maths ", "M-897", (short) 98, (short) 100);
        sub[2] = new Subject0("maths ", "M-897", (short) 99, (short) 100);
        for (int i = 0; i < sub.length; i++) {
            System.out.println(sub[i]);//or sout(sub[i]) same hi he
            System.out.println();
        }
    }
}
class Subject0
{
    private int marks;
    private int maxMarks;
    private String subName;
    private String subId;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    public int getMaxMarks()
    {
        return maxMarks;
    }
    public String getSubName()
    {
        return subName;
    }
    public String getSubId()
    {
        return subId;
    }
    @Override
    public String toString()
    {
        return "Subject name : "+subName+"\n"+"Subject Id : "+subId+" \n"+"marks scored : " +marks+"\n"+"total marks : "+maxMarks;
    }
     public Subject0 (String subName,String subId,int marks,int maxMarks)
     {
         this.maxMarks=maxMarks;
                 this.marks=marks;
                         this.subId=subId;
                                 this.subName=subName;
     }
//    public String toString() {
//        return super.toString();
//    }
}