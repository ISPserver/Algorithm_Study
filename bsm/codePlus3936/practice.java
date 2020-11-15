package codePlus3936;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(0<=n && n<=99) {
			if(n<10) {
				String c = "0"+n; "08"
				n = Integer.parseInt(c);
			}
			int a = n/10;
			int b = n%10; 
			int sum = a+b;
		}
				
		String a1 = Integer.toString(b)+Integer.toString(sum);		
		int num = Integer.parseInt(a1);
		
		
		
		
		
		
		
	}
}

//재사용성 
