package sample;

public class Prc1 {

  // mainメソッドは「実行の司令塔」として使います
  public static void main(String[] args) {
    System.out.println("=== 問題1 ===");
    solveQ1();

    System.out.println("\n=== 問題2 ===");
    solveQ2();

    System.out.println("\n=== 問題3 ===");
    solveQ3();

    //間違えた問題
    System.out.println("\n=== 問題4 ===");
    solveQ4();


  }
  public static void solveQ1() {
    int a = 10;
    int b = a++ + a + a-- - a-- + ++a;
    System.out.println("b = " + b);
  }
  public static void solveQ2() {
    int c = 10;
    int d = c++ + ++c;
    System.out.println("c = " + c + ", d = " + d);
  }
  public static  void solveQ3() {
    int x = 0;
    while (x++ < 3) {
      System.out.print(x + " ");
    }
  }
  public static  void solveQ4() {
    int a = 10;
    int b = 10;
    if (a++ > 10 && ++b > 10) {
      System.out.println("True");
    }
    System.out.println(a + ", " + b);
  }

}