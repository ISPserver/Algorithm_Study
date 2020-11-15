package codePlus3935;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1978 {
	int n=2;	
	public static boolean isPrime(int n) {
		boolean result = true;
		int end = (int)Math.sqrt(n);		
		
		if(n==1) return false;
		
		for(int i=2; i<=end; i++) {			
			if(n%i==0) {
				result = false;
				break;
			}else {
				result = true;
			}
		}				
		return result;		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int n = Integer.parseInt(br.readLine());		
		int arr[] = new int[n];
		String[] arrStr = br.readLine().split(" ");		
		int cnt=0;
		//입력 숫자 split 후, arr배열에 저장
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(arrStr[i]);
			if(isPrime(arr[i])) {
				cnt++;
			}
		}
				
		System.out.println(cnt);
	}
	
}
