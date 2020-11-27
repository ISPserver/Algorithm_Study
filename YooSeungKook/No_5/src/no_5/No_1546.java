package work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No_1546_1 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer str = new StringTokenizer(br.readLine(), " ");
		
		int m = 0;
		float sum = 0;
		int[] arr = new int[n]; 
		float[] result = new float[n];	
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = Integer.parseInt(str.nextToken()); 
			
			if(arr[i] > m) {
				m = arr[i];
			}			
		}
		for(int i = 0; i < arr.length; i++) {
			 result[i] = arr[i] / (float)m * 100;
			 sum+=result[i];
		}
			bw.write(String.valueOf(sum/n));
				
		br.close();
		bw.close();
		
	}//main
}
