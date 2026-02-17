
# for 文の変数の型と変数の「二重宣言」のミス
[コミットID](055d3918abda588cc8b0cf7d3ca689f8b1f9e71a)

<details>
<summary>間違い</summary>

  ```
package example;

import java.util.Scanner;

public class Q3 {
  //	長さ N の数列Aが与えられます。Aの中に 0 が含まれていない場合はYESを、 0 が含まれている場合はNOを出力してください。
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

//		まず数列の長さ N を受け取る
    int n = sc.nextInt();
//    長さ N の整数配列を準備する
    int[] a = new int[n];

    boolean hasZero = false;
    for (i = 0; i < n ; i++){‼️Javaでは i が整数であることを教えるために int i と書く
      a[i] = sc.nextInt();

      if(a[i] == 0){
        boolean hasZero = true;‼️ループの中で boolean hasZero = true; と書いてしまうと、新しく別の変数を作ろうとしてしまう、変数の２重宣言はやめる
        System.out.println("YES");‼️「判定」と「出力」のタイミングがおかしい。今のままだと、数字を確認するたびに「YES」や「NO」を出力してしまうので、ープで全員を確認し終わった 後 に、一回だけ結果を出力させる
      }else(a[i] != 0){‼️else の後ろに条件は書けない
        boolean hasZero = false;
        System.out.println("NO");
      }


    }

    sc.close();

  }
}
```

</details>

<details>
<summary>正解</summary>
```

  package example;

import java.util.Scanner;

public class Q3 {
  //	長さ N の数列Aが与えられます。Aの中に 0 が含まれていない場合はYESを、 0 が含まれている場合はNOを出力してください。
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

//		まず数列の長さ N を受け取る
    int n = sc.nextInt();
//    長さ N の整数配列を準備する
    int[] a = new int[n];

    boolean hasZero = false;

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();

      if (a[i] == 0) {
        hasZero = true;
        break;

      }

      if(hasZero){
        System.out.println("NO");
      }else{
        System.out.println("YES");
      }
    }
    sc.close();
  }
}

  ```
</details>




