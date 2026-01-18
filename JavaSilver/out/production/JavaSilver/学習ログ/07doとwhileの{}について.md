## doとwhileの{}について
下のようなコードはコンパイルエラーとなる
```package sample;

public class ControlStructures2 {
  public static void main(String[] args) {
    int a = 0;
    while (a < 5)
      do
        a++;
        System.out.println(a);
        while(true);

  }
}

```
理由はdo 文が支配する範囲に2つの文を入れようとしたが、{} がないため構文が崩れてしまったから。
側の while (a < 5)
{} がないので、直後の1つの文だけを繰り返し対象となる、コンパイラは次に「1つの文」が来るのを待つ
do-while 文は全体で「1つの文」とみなされる。しかし、do 自体にも {} がありません

do-while 文で{}なしの2行なら1行のみ繰り返される


