package OPPS.Basics.Constructor;

public class Student {
    String name;
    int rollno;
    Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    Student(Student s1){  //copy constructor
        this.name=name;
        this.rollno=rollno;
    }
    public static void main(String[]args){
        Student s1=new Student("ashank",12);
        Student s2=new Student(s1);
        System.out.println(s1==s2);
        s2.name="Arpitha";
        s2.rollno=15;
        System.out.println(s2.name);
        System.out.println(s2.rollno);

    }
}
