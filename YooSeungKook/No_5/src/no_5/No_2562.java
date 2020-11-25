package no_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No_2562 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[9];

		int n = 0;
		int max = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());
		} 

		for(int i = 0; i < arr.length; i++ ) {

			if(arr[i] > max) {
				max = arr[i];
				n = (i+1);
			}

		}
		bw.write(max+"\n"+n);

		br.close();
		bw.close();
		
	}//main
}
