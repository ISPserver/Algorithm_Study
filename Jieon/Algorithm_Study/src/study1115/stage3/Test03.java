package study1115.stage3;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		//3 --> 1+2+3  = (3-0) + (3-1)+ (3-2)
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		for (int i = 0; i <= n; i++) {
			a+=i ;
		}
		System.out.println(a);
	}
}
