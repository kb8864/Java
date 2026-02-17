package example;

import java.util.Scanner;

public class Q2 {
//	整数 A, B, C が与えられます。式 A × B ≦ C が成立している場合はYESを、そうではない場合はNOを出力してください。
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();


		if (A * B < C) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		sc.close();

	}
}
