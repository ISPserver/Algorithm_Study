package codePlus3935;

import java.util.Scanner;

public class N1934 {
	//최소공배수
	public static int gcd(int a,int b) {
		while(b>0) {
			int temp= b;
			b = a%b;
			a = temp;			
		}
		return a;
	}
	
	//최대공약수
	public static int lcm(int a,int b) {
		return (a*b) / gcd(a,b);
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);		
		int T= sc.nextInt();
		for(int i=0; i<T; i++) {
			int n1= sc.nextInt();
			int n2= sc.nextInt();
			System.out.println(lcm(n1,n2));			
		}
		
	}
}
