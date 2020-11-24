package no_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No_10818 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n]; 
	
		StringTokenizer str = new StringTokenizer(br.readLine()," ");
		
		int max = -1000000;	
		int min = 1000000;
		
		for(int i = 0; i < n; i++) {
			
			arr[i] = Integer.parseInt(str.nextToken());
				
				if(arr[i] > max) {
					max = arr[i];					
				}
				
				if(arr[i] < min) {
					min = arr[i];
				}
				
		}//outer

		bw.write(min + " " + max); 
		 		
		bw.close();
		br.close();
		
	}//main
}
