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
