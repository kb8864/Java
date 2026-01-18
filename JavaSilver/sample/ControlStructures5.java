package sample;

public class ControlStructures5 {
  public static void main(String[] args) {
    for (int i = 0, j = 0; i < 3 && j < 5; i++) {
      System.out.println(i++);
      j += i;
    }

  }
}
