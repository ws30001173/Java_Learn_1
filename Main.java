import java.util.*;

public class Main {
  // This is a comment
  /*
   * String stores text, int intgers, float floating point numbers
   * char stores single characters, boolean stores values with two states
   * for no changes use final keyword
   * Numbers are added, Strings concatenated
   * 
   * if (condition) {
   * // code to be executed if condition is true
   * } else {
   * // code to be executed if condition is false
   * }
   */
  // Java Methods
  static void myMethod(String fname) {
    System.out.println(fname + " Hello World");
  }

  static int myReturnMethod(int x, int y) {
    return x + y;
  }

  int x; // attributes
  String z;

  // public, access modifier
  public void myPublicMethod() {
    System.out.println("Public methods called by objects");
  }

  // Java Construtor, initial value for object attributes
  public Main(int y) {
    x = y;
  }

  // private, get and set ? set => get
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String newName) {
    this.name = newName;
  }

  public static void main(String[] args) {

    String name = "John";
    System.out.println(name + " " + "Hello World!");

    int time = 20;
    String result = (time < 18) ? "Good day." : "Good evening.";
    System.out.println(result);

    // Statement 1 executed before execution of the code block
    // Statement 2 defines the condition for executing the code block
    // Statement 3 executed after code block execution
    for (int i = 0; i < 3; i++) {
      if (i == 2) {
        break;
      }
      System.out.println(i);
    }

    // for each loop of the array
    String[] cars = { "BMW", "Audi", "Mercedes" };
    for (String car : cars) {
      System.out.println(car);
    }

    // method call
    myMethod("Jenny");
    int z = myReturnMethod(5, 6);
    System.out.println(z);

    // OOP
    Main myObj1 = new Main(5);
    myObj1.x = 25; // x is now 25 for myObj1
    Main myObj2 = new Main(6);
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);

    myObj1.myPublicMethod();

    /*
     * Access Modifiers:
     * For classes,
     * public accessible by any other class
     * default only for the classes in the same package
     * 
     * For attributes, methods and constructors
     * public: accessible by all classes
     * private: accessible only within declared class
     * default: accessible only within the same package
     * protected: accessible same package and subclasses
     * 
     * Non-Access Modifiers:
     * For classes,
     * final: cannot be extended
     * abstract: cannot be instantiated
     * 
     * For attributes, methods
     * final: cannot be overridden
     * static: accessible only by the class
     * abstract: only used in abstract class and used on methods
     * transient: not serialized
     * synchronized: accessed by only one thread at a time
     * volatile: value of the attribute is not cached in thread
     */

    Main myObj3 = new Main(z);
    myObj3.setName("John");
    System.out.println(myObj3.getName());

    // Scanner package
    try (Scanner myObj4 = new Scanner(System.in)) {
      System.out.println("Enter ur lucky number");

      int lucky_number = myObj4.nextInt();
      System.out.println("Number is: " + lucky_number); // sigle quotes not allowed
    }

    // Animal classes
    Dog myDog = new Dog();
    Cat myCat = new Cat();
    myDog.animalSound();
    myCat.animalSound();
    myCat.sleep();
    // Interface method
    wolf myWolf = new wolf();
    myWolf.animalWalk();
    myWolf.animalEat();
    // Enum
    for (Level myFinal : Level.values()) {
      System.out.println(myFinal);
    }

    OuterClass outerObj = new OuterClass();
    OuterClass.InnerClass innerObj = outerObj.new InnerClass();
    System.out.println(outerObj.x + innerObj.y);
    System.out.println(innerObj.myInnerMethod());
    // static class InnerClass,
    // OuterClass.InnerClass innerObj = new OuterClass.InnerClass();
  }
}

// Inheritance
class Vehicle {
  protected String brand = "Ford";

  public void honk() {
    System.out.println("Beep");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";

  public static void main(String[] args) {

    // Create a myCar object
    Car myCar = new Car();

    myCar.honk();
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}

// nest classes
class OuterClass {
  int x = 10;

  class InnerClass {
    int y = 5;

    public int myInnerMethod() {
      return x - y;
    }
  }
}

// Wrapper classes
class MyWrapperClass {
  public static void main(String[] args) {
    Integer myInt = 5;
    Double myDouble = 5.99;
    Character myChar = 'a';
    String myString = myInt.toString();
    System.out.println(myString.length());
    System.out.println(myDouble.doubleValue());
    System.out.println(myChar.charValue());
  }
}
