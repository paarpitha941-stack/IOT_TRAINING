package OPPS.Basics.withAttribute;

public class Car {
    String brand;
    int manuDate;

    Car(String brand, int manuDate) {
        this.brand = brand;
        this.manuDate = manuDate;
    }

    void printdetails() {
        System.out.println("car brand" + brand);
        System.out.println("manudate" + manuDate);
    }

    public static void main(String[] args) {
        Car c1 = new Car("BMW", 2000);
        Car c2=new Car("audi",3000);
        c1.printdetails();
        c2.printdetails();

    }
}

//without using the this keyword
//public class Car {
//    String brand;
//    int manuDate;
//
//    Car(String b, int m) {
//        brand = b;
//        manuDate = m;
//    }
//
//    void printdetails() {
//        System.out.println("car brand" + brand);
//        System.out.println("manudate" + manuDate);
//    }
//
//    public static void main(String[] args) {
//        Car c1 = new Car("BMW", 2000);
//        Car c2=new Car("audi",3000);
//        c1.printdetails();
//        c2.printdetails();
//
//    }
//}
//
