package OPPS.Basics.pillars.inheritance.Super;

public class Person {
    String Fname;
    String Lname;

    Person(String Fname, String Lname) {
        this.Fname = Fname;
        this.Lname = Lname;
    }
    void ppt(){
        System.out.println(Fname);
    }
}

class student extends Person{

    int rollno;
    student(int rollno,String Fname,String Lname){
        super(Fname,Lname);
        this.rollno=rollno;
    }
}
class Drivercode{
    public static void main(String[] args){
        Person p1=new Person("Arpitha","PA");
        student s1=new student(15,"Sridevi","t");
        System.out.println(p1.Fname);
        System.out.println(s1.Fname);
        System.out.println(p1.Lname);
        System.out.println(s1.rollno);
        System.out.println(p1.Lname);
        p1.ppt();
        s1.ppt();


    }
}

