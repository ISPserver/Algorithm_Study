package no_2;

import java.util.Scanner;

public class No_2884 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		if(b < 45) {
			--a;
			b = (b-45)+60; 
			if(a < 0) {
				a = 23;
			}
						
		}else {
			b -= 45;
		}
		
		System.out.print(a + " " + b);
		
	}//main
}
