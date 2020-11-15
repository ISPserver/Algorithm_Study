package study1115.stage3;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.println(N+" * "+ i +" = " +i*N);
		}
	}
}
