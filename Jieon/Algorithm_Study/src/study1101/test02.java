//최소 공배수 = 최대 공약수 * (a / 최대 공약수) * (b / 최대 공약수)
	//A를 B로 나눈 나머지가 C일 때, (A와 B의 최대 공약수) = (B와 C의 최대 공약수)
	
	//유클리드 호제법
	//최대공약수
	//여기서 기억할 공식은 큰 수 A를 작은수 B로 나누었을때 나누어 떨어진다면 최대공약수는 B가 된다.
	//1) 입력 받은 두 수중 큰 수를 A, 작은수를 B로 정한다.
	//2) A 를 B 로 나눈값의 나머지를 R로 지칭한다
	//3) R 이 0이라면 A는 B로 나누어 지기 때문에 최대 공약수는 B가 된다.
	//4) 만약 R이 0이 아니라면 A값은 B로, B 값은 R로 변경한뒤 3번 과정을 반복한다. 
	
	//최소공배수 
	//1) 두 수의 최대 공약수를 유클리드 호제법을 통하여 구한다.
	//2) 두 수 A, B를 곱한뒤 최대 공약수로 나눈 값을 최소 공배수로 출력한다.
package study1101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test02 {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int d=gcd(a,b);
		int e=lcm(a,b);
		
		System.out.println(d);
		System.out.println(e);
	}
	
	// 최대공약수 (Greatest Common Divisor)
	public static int gcd(int a, int b) {
		while(b != 0) {
			int r= a % b;
			a = b;
			b = r;
		}
		return a;
	}
	// 최소공배수 (Least Common Multiple)
	public static int lcm(int a, int b) {
		return a*b /gcd(a,b);
	}
}
