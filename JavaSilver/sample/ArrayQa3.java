package sample;

//public class ArrayQa3 {
//  public class Item{
//    String name;
//    int price = 100;
//  }
//
//  public static void main(String[] args) {
//      Item[] items = new Item [3];
//      int total = 0;
//      for (int i = 0; i < items.length; i++){
//        total += items[i].price;
//      }
//    System.out.println(total);
//  }
//}


// Itemクラス（
class Item {
  String name;
  int price = 100; // 価格は100円で固定
}

public class ArrayQa3 {
  public static void main(String[] args) {
    // 1. まず「枠」を3つ作る（中身はまだ null）
    Item[] items = new Item[3];

    // 【ここが修正ポイント！】
    // 2. 中身（実体）を作って、一つずつ箱に入れる
    items[0] = new Item(); // 0番目にItemを入れる
    items[1] = new Item(); // 1番目にItemを入れる
    items[2] = new Item(); // 2番目にItemを入れる

    // 3. 計算用の変数
    int total = 0;

    // 4. ループで合計を計算
    for (int i = 0; i < items.length; i++) {
      // items[i]には実体が入っているのでエラーにならない！
      // items[i].price は常に 100 です
      total += items[i].price;

      // トレース用に出力してみましょう
      System.out.println(i + "番目の値段: " + items[i].price);
    }

    // 5. 結果表示
    System.out.println("合計: " + total);
  }
}