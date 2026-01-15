package sample;

public class Main {
  public static void main(String[] args) {
    Object a = new Object();
    Object b = null;
//    これはfalse。理由はnull と比較したら必ず false を返さなければならない
    System.out.println(a.equals(b));

    //逆だったら？
    //System.out.println(a.equals(b));
    //これは無いもんに対して比較しようとしているので、NullPointerException発生
  }
}
