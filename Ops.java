//define a class named ops
public class Ops {
  //define a method called sum
  //method returns an int
  //parameter named x that is of type int
  //paramater named y thatis of type int
  public static int sum(int x, int y) {
    return x + y;
  }  //closes sum

  //main gets executed when we run this class with the java command
  public static void main(String [] args) {
    //invoke sum, passing in 1 and 2 as arguments and print the result
    System.out.println(sum(1,2));
    System.out.println(multiply(1,2,3));
    System.out.println(power(2));
  }  //closes main

  public static int multiply(int a, int b, int c) {
    return a*b*c;
  }  //closes multiply

  public static int power(int x) {
    int y = 2;
    for(int i =0; i<y; i++) {
      x = x*x;
    }
    return x;
  }  //closes power

}  //closes Ops
