＃ equalsメソッドの契約（間違えた問題)

## [コード](https://github.com/kb8864/Java/commit/6bb1e978b610f31b00dd29b7bad258f540abf63f)

## 上のコードの答えは`false`。
なぜ false になるのか、そしてなぜエラー（例外）にはならないのか

- Javaの equals メソッドには、「どんなオブジェクトであっても、null と比較したら必ず false を返さなければならない」 という厳格なルールがあるから
- 「存在する何か（Object）」と「無（null）」は絶対に等しくならないから
```
  public static void main(String[] args) {
    Object a = new Object();
    Object b = null;
//    これはfalse。理由はnull と比較したら必ず false を返さなければならない
    System.out.println(a.equals(b));
```


  ### よくある勘違い
  `// 逆にした場合 System.out.println(b.equals(a));` 
この場合は false ではなく、実行時エラー（NullPointerException） が発生
→ 無に対する命令はできない。→ 例外発生（NullPointerException）。

  
