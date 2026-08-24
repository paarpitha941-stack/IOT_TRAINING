package ExceptionHandling;

public  class InvalidAgeException extends Exception {
    InvalidAgeException(String msg){
        super(msg);
    }

}
class Drivercode{


    public static void main(String[] args) throws InvalidAgeException {

        int age=2;
          if(age<18){
              throw new InvalidAgeException("age must be over 18");

          }
          System.out.println("you can vote");
      }


    }

