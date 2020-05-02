package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);
    
    Greeter greeter1 = new Greeter();
    System.out.println(greeter1.sayHello());
	System.out.println("completred the class..");
  }
}
