class college {
 public void move() {
  System.out.println("College is open");
 }
}
class univ extends college {
 public void move() {
super.move();
  System.out.println("University is open too");
 }
}
public class stud {
 public static void main(String args[]) {
  //college a = new college();
  //college b = new univ();
 //college c = new dept();
 college d = new univ();

  //a.move();
  //b.move();
//c.move();
d.move();
 }
}
class dept extends college{
public void move() {
//super.move();
  System.out.println("My Department is EEE");
 }
}
class sec extends college{
public void move() {
//super.move();
  System.out.println("My section is EEE");
 }
}
