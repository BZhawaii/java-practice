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
  
}  //closes Person class
