package OPPS.Basics.Encapsulation;

 public class Employee {
     private String empName;
    private int empId;
    Employee(String empName,int empId){
        this.empName=empName;
        this.empId=empId;
    }
    String getEmpName(){
        return empName;
    }
    int getEmpId(){
        return empId;
    }
    void setEmpName(String empName){
        this.empName = empName;
    }
    void setEmpId(int eid){
        empId=eid;//without this keyword we have useing
    }
      void printDetails(){
        System.out.println("Employee Name:"+this.empName);
        System.out.println("Employee Id:"+this.empId);
    }
}
class Drivercode{
    public static void main(String[]args){
        Employee emp=new Employee("Arpitha",15);
        System.out.println(emp.getEmpName());
        System.out.println(emp.getEmpId());
        emp.setEmpName("Sridevi");
        System.out.println(emp.getEmpName());

    }
}
