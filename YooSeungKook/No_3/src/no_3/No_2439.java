package no_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No_2439 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++ ) {
			for(int j = 0; j < n; j++) {
				
				if(i+j <= n-2) {
					bw.write(" ");
				}else {
					bw.write("*");
				}				
			}
			bw.write("\n");
		}
		
		bw.close();
		br.close();
	
	}//main
}

