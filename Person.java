//filename: Person.java
public class Person {
  //instance level variables can be used anywhere in class
  public String first;
  public String last;

  //Constructor Method.
  //We invoke this using the new keyword to instantiate an object.
  //It does not need a return type.
  public Person(String first, String last) {
    //since the instance variable 'first'
    //'shadows' shadows parameter 'first', use 'this.first'
    this.first = first;
    this.last = last;
  }//closes Person method

  //the 'fullName' method is added inside the class definition
  public String fullName() {
    return this.first + " " + this.last;
  }//closes fullName

  //we can use the main method to test our class
  public static void main(String[] args) {
    //create a variable of type Person
    //invoke the contructor to instantiate / create a new Person object
    Person rambo = new Person("Sylvester", "Stallone");
    //invoke the method on rambo
    System.out.println(rambo.fullName());
  }//closes main

}  //closes Person class
