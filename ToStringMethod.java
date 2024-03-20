class Subject {                            //1

private String subid;

private String name;

private int maxMarks;

private int marksObt;

public Subject(String id, String name, int maxMarks) {

subid=id;

this.name=name;

this.maxMarks=maxMarks;

}

public Subject(String id, String name, int maxMarks, int marks) {

subid=id;

this.name=name;

this.maxMarks=maxMarks;

setMarksObt(marks);

}

public String getSubID () {

return subid;

}

public String getName() {

return name;

}

public int getMaxMarks() {

return maxMarks;

}

public int getMarksObt() {

return marksObt;

}

public void setMarksObt(int marks) {

marksObt = marks;

}

boolean isQualified() {

return marksObt>=maxMarks*0.4;

}

public String toString() {

System.out.println("Subject:");

return "SubjectId:"+subid+"\nName:"+name+"\nMax Marks:"

+maxMarks+"\nMarks obtained:"+marksObt+"\n";

}

}



class Student {                    //2

private int rollNo;

private String name;

private String dept;

private Subject[] subjects;

public Student(int roll, String name, String dept) {

this.rollNo = roll;

this.name = name;

this.dept = dept;

subjects = new Subject[0];

}

public Student(int roll, String name, String dept, Subject[] subs) {

rollNo = roll;

this.name = name;

this.dept = dept;

setSubjects(subs);

}

public int getRollNo() {

return rollNo;

}

public String getName() {

return name;

}

public String getDept() {

return dept;

}

public Subject[] getSubjects() {

return subjects;

}

public void setSubjects(Subject ...s) {

subjects = new Subject[s.length];

for(int i=0;i<s.length;i++)

{

subjects[i]=s[i];

}

}

public String toString() {

System.out.println("Student Details");

System.out.println("RollNo:"+rollNo+"\nName:"+name+"\nDept:"+dept);

if (subjects.length==0) System.out.println("No Subjects");

else {

for(Subject s:subjects) {

System.out.println(s);

}

}

return "";

}

}



  class Students {  //3

public static void main(String args[]) {

// TODO Auto-generated method stub

Subject s[] = new Subject[2];

s[0] = new Subject("s101","DS",100);

s[1] = new Subject("s102","Algos",100);

for(Subject ss: s) System.out.println(ss);//sout(ss.toString);

Student stud1 = new Student(1,"Jack", "CS");

Student stud2 = new Student(1,"Ben", "IT", s);

System.out.println(stud1);

System.out.println(stud2);

}

}