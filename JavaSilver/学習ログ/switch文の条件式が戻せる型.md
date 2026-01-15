# switch文の条件式が戻せる型

- if文とswitch文使い分けは扱える型の種類
- if 文はどんな条件でも書けますが、switch 文は「使える型」が決まっている


基本データ型 (4つ)	byte, short, char, int	⭐️int とそれより小さい整数
ラッパークラス (4つ)	Byte, Short, Character, Integer	上記に対応する型
文字列 (1つ)	String	文字列
列挙型 (1つ)	enum	列挙型

# switch文で使えないもの
long
理由: データサイズが大きすぎて、昔のJavaでは処理が大変だったため。
試験対策: 「大は小を兼ねる」と言いますが、switch文ではlongはデカすぎてN

boolean
理由: true か false しかないなら、if-else 文を使うべきだから

float, double
理由: 小数は「誤差」が出るため、厳密な一致判定（==）をするswitch文には向いていないから

```
public class SwitchTest {
    public static void main(String[] args) {
        long l = 10L;
        double d = 3.14;
        boolean b = true;

        // コンパイルエラー
        // switch(l) { ... }

        // コンパイルエラー！
        // switch(d) { ... }

        // コンパイルエラー！
        // switch(b) { ... }
        
        // OKな例
        String s = "Java";
        switch(s) {
            case "Java":
                System.out.println("Good!");
                break;
        }
    }
}
```
