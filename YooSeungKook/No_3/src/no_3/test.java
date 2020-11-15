package no_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class test {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		StringTokenizer token;
		
		for(int i = 0; i < n; i++) {
			
			token = new StringTokenizer(br.readLine(), " ");
				
			bw.write(Integer.parseInt(token.nextToken()) + 
					Integer.parseInt(token.nextToken()));
			
		}
		
		bw.close();
		br.close();
		
	}//main
}
