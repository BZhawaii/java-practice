//filename: Rect.java
public class Rect {
  //set width and length
  public int width;
  public int length;

  //have function sets new Rect
  //bring in width and length
  public Rect(int width, int length) {
    this.width = width;
    this.length =length;
  } //closes Rect method

  //have function do the math
  public int answer() {
    return this.width * this.length;
  }//closes method answer

  public static void main(String[] args) {
    Rect square = new Rect(5,5);
    //console.log the answer
    System.out.println(square.answer());

  }//closes main


}  //closes class Rect
