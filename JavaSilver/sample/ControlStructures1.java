package sample;

public class ControlStructures1 {
  public static void main(String[] args) {
    int a = 11;
    int b = 0;

    while (b< 5){///問いはここに何が入るか？ということ
      if (5 < a){
        System.out.println(b);
        //出力値はb＝０〜４
      }
      a--;
      b++;
    }

  }
}
