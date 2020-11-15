package codePlus3935;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N6588 {	
	public static void main(String[] args) throws NumberFormatException, IOException {
		final int MAX= 1000000;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] result = new boolean[MAX+1];
		
		//에라스토테네스의 채
		for(int i=2; i<=MAX; i++) {
			if(!result[i]) {
				for(int j=i*2; j<=MAX; j+=i) {
					result[j]=true;
				}
			}			
		}
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			boolean isExists = false;
			
			if(n==0) break;
			
			for(int i=0; i<=n; i+=2) {
				if(!result[i] && !result[n-i]) {
					System.out.println(n+" = "+i+" + "+(n-i));
					isExists=true;
					break;
				}
			}
			
			if(!isExists) System.out.println("Call is rejected ");
			
			
		}
		 
	}
}

/* 
 * 숫자 n 입력시, 에라스토테네스의 채(함수)를 이용해 2~n까지의 소수를 구한다. But 소수%2==1 일때 해당 소수를 소수배열에 저장한다.
 * 
 */
