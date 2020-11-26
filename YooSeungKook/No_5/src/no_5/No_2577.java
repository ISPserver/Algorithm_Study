package work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No_2577 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[10];

		int var  = (Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine()));

		String str = String.valueOf(var);
		
			for(int i = 0; i < str.length(); i++) {

				int n = var%10;
				
				arr[n]++;
				
				var/=10;				
			}
						
		for(int i = 0; i < arr.length; i++) {
			
			bw.write(arr[i]+"\n");
		}

		bw.close();
		br.close();

	}//main

}

