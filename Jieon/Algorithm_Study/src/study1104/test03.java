package study1104;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		
		for(int i =0; i<count; i++ ) {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		System.out.println(a*b/gcd(a,b));
		}
	}
	
	public static int gcd(int a, int b) {
		while(b !=0) {
			int r=a%b;
			a=b;
			b=r;
		}
		return a;
	}
	
}
