package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);
    System.out.println("peinting current local time..");
    Greeter greeter2 = new Greeter();
    System.out.println(greeter2.sayHello());
  }
}
