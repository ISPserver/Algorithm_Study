package codePlus3935;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N9613 {
	public static int gcd(int a,int b) {
		if(b==0) {
			return a;
		}else {
			return gcd(b, a%b);
		}
	}
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			String[] arrStr=br.readLine().split(" ");
			int[] arr=new int[arrStr.length-1];
			
			for(int j=1; j<arrStr.length; j++) {
				arr[j-1]=Integer.parseInt(arrStr[j]);				
			}
			
			int answer=0;
			
			for(int k=0; k<arr.length; k++) {
				
				int index=k+1;
				
				while(index<arr.length) {
					answer+=gcd(arr[k],arr[index]);
					index++;
				}
			}
			System.out.println(answer);
		}
	
	}
}
