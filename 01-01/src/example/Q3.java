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
