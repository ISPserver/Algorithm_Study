package codePlus3936;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N10972 {
	static int n;
	static int[] arr; 	
	
	// 354 
	public static boolean next_number(int[] a) {		
		while(n>0 && arr[n-1] >= arr[n]) {			
			n--;
		}
		
		if(n<0) return false;
		
		
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {					
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());			
		}			
	
	}
	
	
}
/*
 * 테스트케이스 N 입력 받고, arr배열에 숫자 삽입
 * */

/* 이해용 Example */
//int a[]=new int[5];
//int n = a.length-1;
//
//a[0] = 1; 
//a[1] = 2; // while문 탐색하면서 반환 index 발견 시, 변수에 저장		
//a[2] = 8; 
//a[3] = 7; 
//a[4] = 5;
//while(n > 0 && a[n-1] >= a[n]) {
//	System.out.println(a[n]);
//	n--;
//	
//}System.out.println(n-1);