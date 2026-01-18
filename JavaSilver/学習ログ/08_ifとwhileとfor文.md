# 下のコードでコンパイルエラーとなる理由

<details><summary>java</summary>

```
package sample;

public class ControlStructures3 {
  public static void main(String[] args) {⭐️
    for(int i = 1, long j = 2; i < 5; i++){
      System.out.println(i + j);
    }

  }
}
```

</details>



> [!TIP]
> forの初期化文では同じ型の変数宣言ならできる。int と long という2つの異なる型を同時に宣言しようとしてる。 for 文において、これは文法違反（Syntax Error）

## ひっかけ
> [!WARNING]
> ループが終わった後にカウンタ変数を使おうとする。ループの外で i を使っている選択肢があれば、即座に「コンパイルエラー」
 <details><summary>java</summary>

```
package sample;

public class ControlStructures3 {
  public static void main(String[] args) {⭐️
for (int i = 0; i < 3; i++) {
    System.out.print(i);
}
System.out.println(i); // ここでコンパイルエラー！

  }
}
```

</details>


> [!WARNING]
>「到達不能コード」のひっかけ
> 絶対に実行されないコードを書いてはいけない」というルールがある
> while(false) や for(;false;) の中に何かを書くとコンパイルエラーになりますが、if(false) はエラーになります
 <details><summary>java</summary>

```
package sample;

public class ControlStructures3 {
  public static void main(String[] args) {
// パターンA: while
while (false) {
    System.out.println("A"); // コンパイルエラー！ (到達不能)
}

// パターンB: if
if (false) {
    System.out.println("B"); // エラーにならない！（Javaの仕様上の例外）
}
  }
}
```

</details>
