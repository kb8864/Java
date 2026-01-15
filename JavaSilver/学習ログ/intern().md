# intern()メソッドについて

```
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

```

## intern() のルール:

- プールの中に、自分と同じ文字列（"abc"）があるか確認する。

- あれば: プール内のそのオブジェクトのアドレスを返す。

- なければ: プールに新しく登録してから、そのアドレスを返す


```String a = "abc";          // ① プールに "abc" が作られ、a はそこを指す
String b = new String(a);  // ② new なので、ヒープ領域（プールの外）にコピーが作られる。
```

a == "abc" は true
b == "abc" は false

```
if(a.intern() == "abc") { count++; }
a.intern() は、「プールの住所を教えて」と言ってる
右側の "abc" もプールの "abc"
「プールの "abc"」 == 「プールの "abc"」 なので True。

count = 1
```


```
if(b.intern() == "abc") { count++; }

b はヒープ
⭐️しかし、b.intern() を呼び出すと、Javaはプールを見に行く
プールにはすでに作られているa= "abc"があるのでこれを使い回す
b 自身の住所ではなく、プールの "abc" の住所を返す
結果、「プールの "abc"」 == 「プールの "abc"」 となり True。

count = 2
```

```
if(a.intern() == b.intern()) { count++; }
a.intern() → プールの "abc" の住所

b.intern() → プールの "abc" の住所

両方とも同じ場所を指すことになるので、当然 True。

count = 3
```
