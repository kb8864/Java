package example;

import java.util.*;

public class CombatSimulation {
  public static void main(String[] args) {

//    最初に与えられる $N（戦闘回数）と $L（初期レベル）を読み込み
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();// 戦闘回数 N
    int myLevel = sc.nextInt();//初回のレベル

    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();//今の相手のレベル

      if (myLevel > x) {
        myLevel = myLevel + (x / 2);
      } else if (myLevel < x) {
        myLevel = myLevel / 2;
      } else{}
    }
    System.out.println(myLevel);

  }
}