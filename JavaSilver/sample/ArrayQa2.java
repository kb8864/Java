package sample;

public class ArrayQa2 {
  public static void main(String[] args) {

//    int [3] a;これは[3] と数字が入っている。Javaにとって型は int[] 。int[3] という型は存在しない
      int [] a = new int[3];

//    int b[2];変数名の後ろに [] を置く書き方は認められていますが、数字を入れてはいけません。
    int [] b  = new int[2];

//    int[2] c[];数字をは入れてはいけない
    int [] c[] = new int[2][];

//    int d[3][];数字をは入れてはいけない
    int [][] d = new int[3][];

  }
}
