package sample;

public class Main {

    public static void main(String[] args) {
               String a = "sample";
               String b = "sample";
               System.out.print(a == b);
               System.out.print(", ");
              System.out.println(a.equals(b));
              //true, true
              //a と b は、物理的に同じメモリ上のオブジェクトを指している
              //だから、住所を比較する == でも true になる

    }
}
