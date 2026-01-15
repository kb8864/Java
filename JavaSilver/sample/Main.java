package sample;

public class Main {

    public static void main(String[] args) {
      String a = "abc";
      String b = new String(a);

      int count = 0;
      //intern()は「コンスタントプールの中にある『本物の在庫』の場所を返すと言う意味
//      つまり、intern() を通すと、元のオブジェクトがヒープにあろうがどこにあろうが、必ず「プールの住所」が返ってくる
      if(a.intern() == "abc"){
        count++;
      }
      if(b.intern() == "abc"){
        count++;

      }
      if(a.intern() == b.intern()){
        count++;
      }
      System.out.println(count);

    }
}
